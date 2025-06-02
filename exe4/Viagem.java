package exe4;

public class Viagem {
    private String motorista;
    private String linha_pertencente;
    private int status; // 0 para em andamento, -1 para atrasada, 1 para finalizada

    public Viagem(String motorista, String linha_pertencente){
        this.motorista = motorista;
        this.linha_pertencente = linha_pertencente;
    }

    public void setStatus(int status){
        this.status = status;
    }

    public int getStatus(){
        return this.status;
    }

    public String getMotorista(){
        return this.motorista;
    }

    public String getLinhaPertencente(){
        return this.linha_pertencente;
    }
}
