package exe3;

public class EstacaoClimatica {
    private String nome;
    private int num_sensores;
    private static final int max_sensores = 10;
    private Sensor[] lista = new Sensor[max_sensores];

    public EstacaoClimatica(String nome){
        this.nome = nome;
        this.num_sensores = 0;
    }

    public class Sensor{
        private int tipo;
        private double leitura;

        public Sensor(int tipo){
            this.tipo = tipo;
        }

        public void setValor(double novo_valor){
            this.leitura = novo_valor;
        }

        public double getValor(){
            return this.leitura;
        }

        public int getTipo(){
            return this.tipo;
        }
    }

    public static class Alerta{
        public boolean verificar(Sensor s){
            int tipo = s.getTipo();

            if (tipo == 0){
                if (s.getValor() < 20){
                    return true;
                }
            }
            if (tipo == 1){
                if (s.getValor() > 40){
                    return true;
                }
            }
            return false;
        }
    }

    public void adicionarSensor(int opcao){
        if (num_sensores == max_sensores){
            return;
        }

        // opcao 0 é sensor de umidade
        // opcao 1 é sensor de temperatura

        Sensor novo;
        if ((opcao == 0) || (opcao == 1)){
            novo = new Sensor(opcao);
        } else{
            return;
        }

        lista[num_sensores] = novo;
        num_sensores++;
    }

    public Sensor getSensor(int index){
        if (index < num_sensores){
            return this.lista[index];
        }
        return null;
    }

    public int getNumSensores(){
        return this.num_sensores;
    }

    public String getNome(){
        return this.nome;
    }
}