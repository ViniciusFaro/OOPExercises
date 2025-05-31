package exe2;

public class Boletim {
    private final static int num_disciplinas = 5;

    static class Relatorio {
        public static void gerarRelatorio(Aluno a, GeradorDeRelatorio gerador){
            int media = 0;
            for (int i = 0; i < num_disciplinas; i++){
                media += a.getNotaDisplina(i);
            }
            gerador.gerar(a.getNome(), media);
        }
    }
}
