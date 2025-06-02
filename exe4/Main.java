package exe4;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("");
        SistemaTransporte s = new SistemaTransporte();

        // criar linhas
        s.adicionarLinha("Centro");
        s.adicionarLinha("Zona sul");

        // adicionar viagens
        s.getLinha("Centro").adicionarViagem("Lucas");
        s.getLinha("Centro").adicionarViagem("Pedro");

        s.getLinha("Zona sul").adicionarViagem("Francisco");
        s.getLinha("Zona sul").adicionarViagem("João");

        // brincar com status das viagens
        s.getLinha("Centro").getViagens()[0].setStatus(0);
        s.getLinha("Centro").getViagens()[1].setStatus(1);

        s.getLinha("Zona sul").getViagens()[0].setStatus(-1);
        s.getLinha("Zona sul").getViagens()[1].setStatus(-1);

        for (int i = 0; i < s.getNumLinhas(); i++) {
            for (int j = 0; j < s.getLinhas()[i].getNumViagens(); j++) {
                SistemaTransporte.EventoSistema.detectar(
                        s.getLinhas()[i].getViagens()[j], new Callback() {
                            public void notificar(Viagem v) {
                                System.out.println("A viagem do motorista " + v.getMotorista() + " na linha "
                                        + v.getLinhaPertencente()
                                        + " esta atrasada! pedimos desculpas pelo transtorno");
                            }
                        });
            }
        }
    }
}
