package Controller;

import Model.Aluguel;
import Model.Cliente;
import Model.Horario;

import java.util.ArrayList;
import java.util.List;

public class AluguelController {
    private List<Aluguel> bancoDeAlugueis = new ArrayList<>();

    public Aluguel registrarAluguel(Cliente cliente, String data, List<Horario> horariosDesejados) {
        Aluguel novoAluguel = new Aluguel(cliente, data);

        for (Horario h : horariosDesejados) {
            novoAluguel.adicionarHorario(h);
        }

        bancoDeAlugueis.add(novoAluguel);
        return novoAluguel;
    }

    public List<Aluguel> consultarAlugueisPorData(String dataConsulta) {
        List<Aluguel> filtrados = new ArrayList<>();
        for (Aluguel a : bancoDeAlugueis) {
            if (a.getDataAluguel().equals(dataConsulta)) {
                filtrados.add(a);
            }
        }
        return filtrados;
    }
}