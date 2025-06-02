package exe10;

public class FundoEmpresarial {
    private int reserva;

    public FundoEmpresarial(int reserva) {
        this.reserva = reserva;
    }

    public boolean pagar(int valor) {
        if (this.reserva - valor < 0) {
            return false;
        }
        this.reserva -= valor;
        return true;
    }
}
