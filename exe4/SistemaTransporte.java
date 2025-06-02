package exe4;

public class SistemaTransporte {
    private static final int max_linhas = 10;
    private int num_linhas;
    private Linha[] linhas = new Linha[max_linhas];

    public SistemaTransporte(){
        this.num_linhas = 0;
    }

    public static class EventoSistema{
        public static void detectar(Viagem v, Callback c){
            if (v.getStatus() == -1){
                c.notificar(v);
            }
        }
    }

    public class Linha{
        private String nome_linha;
        private static final int max_viagens = 10;
        private int num_viagens = 0;
        Viagem[] viagens = new Viagem[max_viagens];

        public Linha(String nome_linha){
            this.nome_linha = nome_linha;
        }

        public void adicionarViagem(String motorista){
            if (num_viagens >= max_viagens){
                return;
            }
            viagens[num_viagens] = new Viagem(motorista, this.nome_linha);
            num_viagens++;
        }

        public Viagem[] getViagens(){
            return this.viagens;
        }

        public int getNumViagens(){
            return this.num_viagens;
        }

        public String getNomeLinha(){
            return this.nome_linha;
        }
    }

    public void adicionarLinha(String nome){
        if (num_linhas >= max_linhas){
            return;
        }
        linhas[num_linhas] = new Linha(nome);
        num_linhas++;
    }

    public Linha getLinha(String nome){
        // procurar linha
        for (int i = 0; i < num_linhas; i++){
            if (linhas[i].getNomeLinha() == nome){
                return linhas[i];
            }
        }
        System.out.println("Linha " + nome + " não foi encontrada :(");
        return null;
    }

    public Linha[] getLinhas(){
        return this.linhas;
    }

    public int getNumLinhas(){
        return this.num_linhas;
    }
}
