package View;

import Model.Aluguel;

import java.util.List;

public class AluguelView {

    public void mostrarMensagem(String msg) {
        System.out.println(">> " + msg);
    }

    public void mostrarErro(String erro) {
        System.err.println("[ERRO] " + erro);
    }

    public void exibirAlugueisDoDia(String data, List<Aluguel> alugueis) {
        System.out.println("=== Aluguéis do dia " + data + " ===");
        if(alugueis.isEmpty()) {
            System.out.println("Nenhum aluguel encontrado.");
            return;
        }

        for (Aluguel a : alugueis) {
            a.exibirResumo();
        }
    }
}