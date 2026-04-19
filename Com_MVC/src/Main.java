import Controller.AluguelController;
import Model.Cliente;
import Model.Horario;
import View.AluguelView;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AluguelView view = new AluguelView();
        AluguelController controller = new AluguelController();

        try {
            view.mostrarMensagem("Iniciando sistema de quadras...");

            Cliente cliente1 = new Cliente("Carlos", "4488888888");
            Horario h1 = new Horario("21/10/2026 20:00", 200.0);
            Horario h2 = new Horario("21/10/2026 21:00", 200.0);

            controller.registrarAluguel(cliente1, "21/10/2026", Arrays.asList(h1, h2));
            view.mostrarMensagem("Aluguel registrado com sucesso!\n");

            var alugueisHoje = controller.consultarAlugueisPorData("21/10/2026");
            view.exibirAlugueisDoDia("21/10/2026", alugueisHoje);

        } catch (Exception e) {
            view.mostrarErro(e.getMessage());
        }
    }
}
