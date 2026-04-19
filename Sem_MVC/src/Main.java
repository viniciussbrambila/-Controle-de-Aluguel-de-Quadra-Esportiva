public class Main {
    public static void main(String[] args) {
        try {

            Cliente cliente1 = new Cliente("Leon S. Kennedy", "4440028922");

            Horario h1 = new Horario("20/10/2026 18:00", 150.0);
            Horario h2 = new Horario("20/10/2026 19:00", 150.0);

            Aluguel aluguel = new Aluguel(cliente1, "20/10/2026");
            aluguel.adicionarHorario(h1);
            aluguel.adicionarHorario(h2);

            aluguel.exibirResumo();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}