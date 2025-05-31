package exe2;

public class Aluno {
    private String nome;
    private Disciplina[] lista = new Disciplina[5];


    public Aluno(String nome, int[] notas){
        this.nome = nome;
        lista[0] = new Disciplina("Matematica", notas[0]);
        lista[1] = new Disciplina("Portugues", notas[1]);
        lista[2] = new Disciplina("Quimica", notas[2]);
        lista[3] = new Disciplina("Biologia", notas[3]);
        lista[4] = new Disciplina("Historia", notas[4]);
    }


    public class Disciplina {
        private String nome_da_displina;
        private int nota;

        public Disciplina(String nome_da_disciplina, int nota){
            this.nome_da_displina = nome_da_disciplina;
            this.nota = nota;
        }

        public int getNota(){
            return this.nota;
        }

        public void setNota(int nota){
            this.nota = nota;
        }

        public String getNome(){
            return this.nome_da_displina;
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getNotaDisplina(int index){
        return lista[index].getNota();
    }

}
