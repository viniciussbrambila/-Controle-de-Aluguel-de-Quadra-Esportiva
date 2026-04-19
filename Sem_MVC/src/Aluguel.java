import java.util.ArrayList;
import java.util.List;

public class Aluguel {
    private Cliente cliente;
    private List<Horario> horariosSelecionados;
    private double valorTotal;
    private String dataAluguel;

    public Aluguel(Cliente cliente, String dataAluguel) {
        this.cliente = cliente;
        this.dataAluguel = dataAluguel;
        this.horariosSelecionados = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarHorario(Horario horario) {
        horario.reservar();
        this.horariosSelecionados.add(horario);
        this.valorTotal += horario.getValor();
    }

    public void exibirResumo() {
        System.out.println("--- Resumo do Aluguel ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data: " + dataAluguel);
        for (Horario h : horariosSelecionados) {
            System.out.println("- Horário: " + h.getDataHora() + " | Valor: R$" + h.getValor());
        }
        System.out.println("Valor Total: R$" + valorTotal);
        System.out.println("-------------------------");
    }
}