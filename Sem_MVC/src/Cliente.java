public class Cliente {
        private String nome;
        private String telefone;

        public Cliente(String nome, String telefone) {
            setNome(nome);
            this.telefone = telefone;
        }

        public void setNome(String nome) {
            if (nome == null || nome.trim().isEmpty()) {
                throw new IllegalArgumentException("Erro: O nome do cliente não pode ser vazio.");
            }
            this.nome = nome;
        }

        public String getNome() { return nome; }
        public String getTelefone() { return telefone; }
    }

