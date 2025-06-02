package exe3;

public class Main {
    public static void main(String[] args) {
        EstacaoClimatica est = new EstacaoClimatica("Estação de veneza");
        est.adicionarSensor(0); // adiciona sensor de umidade
        est.getSensor(0).setValor(35);

        est.adicionarSensor(0);
        est.getSensor(1).setValor(19); // isso é pra emitir alerta de umidade!

        est.adicionarSensor(1); // adiciona sensor de temperatura
        est.getSensor(2).setValor(27);

        est.adicionarSensor(1);
        est.getSensor(3).setValor(41); // isso é pra emitir alerta de temperatura!

        EstacaoClimatica.Alerta a = new EstacaoClimatica.Alerta();

        for (int i = 0; i < est.getNumSensores(); i++) {
            EstacaoClimatica.Sensor atual = est.getSensor(i);

            if (a.verificar(atual)) {
                String tipoSensor;
                if (atual.getTipo() == 0) {
                    tipoSensor = "umidade";
                } else if (atual.getTipo() == 1) {
                    tipoSensor = "temperatura";
                } else {
                    tipoSensor = "null"; // nunca vai acontecer
                }
                CallbackDeAlerta c = new CallbackDeAlerta() {
                    @Override
                    public void notifica(String tipoSensor, double valor) {
                        System.out.println("ATENÇÃO! O sensor de " + tipoSensor + " detectou uma " + tipoSensor + " de "
                                + valor + " cautela é necessaria!");
                    }
                };
                c.notifica(tipoSensor, atual.getValor());
            }
        }
    }
}
