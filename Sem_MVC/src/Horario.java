public class Horario {
        private String dataHora;
        private double valor;
        private boolean ocupado;

        public Horario(String dataHora, double valor) {
            this.dataHora = dataHora;
            setValor(valor);
            this.ocupado = false;
        }

        public void setValor(double valor) {
            if (valor < 0) {
                throw new IllegalArgumentException("Erro: O valor do horário não pode ser negativo.");
            }
            this.valor = valor;
        }

        public void reservar() {
            if (this.ocupado) {
                throw new IllegalStateException("Erro: O horário " + dataHora + " já está ocupado.");
            }
            this.ocupado = true;
        }

        public String getDataHora() { return dataHora; }
        public double getValor() { return valor; }
        public boolean isOcupado() { return ocupado; }
    }

