public class CuentaBancaria {

    private String iban;
    private String titular;
    private double saldo;
    private Movimiento[] movimientos;
    private int numMovimientos;

    public CuentaBancaria(String iban, String titular){
        this.iban = iban;
        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new Movimiento[100];
        this.numMovimientos = 0;

    }
    public String getIban(){
        return iban;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    private void registrarMovimiento(Movimiento m){
        if (numMovimientos < 100){
            movimientos[numMovimientos++] = m;
        }
    }
    public void mostrarMovimientos(){
        if (numMovimientos == 0){
            System.out.println("No hay movimientos.");
            return;
        }
        for (int i = 0; i < numMovimientos; i++){
            movimientos[i].mostrarInfoMovimiento();
        }
    }
    public void ingresar(double cantidad, String fecha){
        if (cantidad <= 0){
            System.out.println("Cantidad invalida");
            return;
        }
        saldo +=cantidad;
        registrarMovimiento(new Movimiento(fecha, "Ingreso", cantidad));
        if (cantidad >= 3000){
            System.out.println("AVISO: Notificar a hacienda");
        }
    }
    public void retirar (double cantidad, String fecha){
        if (cantidad <= 0){
            System.out.println("Cantidad invalida");
            return;
        }
        if (saldo - cantidad < -50){
            System.out.println("AVISO: Saldo negativo. Operacion no permitida");
            return;
        }
        saldo -= cantidad;
        registrarMovimiento(new Movimiento(fecha, "Retirada", cantidad));
        if (saldo < 0){
            System.out.println("AVISO: Saldo negativo");
        }
        if (cantidad > 3000){
            System.out.println("AVISO: Notificar a hacienda");
        }
    }
}
