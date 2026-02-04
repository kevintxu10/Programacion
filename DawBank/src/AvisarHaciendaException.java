public class AvisarHaciendaException extends Exception {
    private String iban;
    private String titular;
    private double cantidad;

    public AvisarHaciendaException(String titular, String iban, double cantidad) {
        super("Aviso a Hacienda");
        this.titular = titular;
        this.iban = iban;
        this.cantidad = cantidad;
    }
}

