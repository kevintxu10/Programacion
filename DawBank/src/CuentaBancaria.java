import java.util.ArrayList;

public class CuentaBancaria {

    private String iban;
    private double saldo;
    private Cliente cliente;
    private ArrayList<Movimiento> movimientos;

    public CuentaBancaria(String iban, Cliente cliente) {
        this.iban = iban;
        this.cliente = cliente;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void ingresar(double cantidad)
            throws CuentaException, AvisarHaciendaException {

        if (cantidad <= 0) {
            throw new CuentaException("Cantidad de ingreso inválida");
        }

        saldo += cantidad;
        movimientos.add(new Movimiento("Ingreso", cantidad));

        if (cantidad >= 3000) {
            throw new AvisarHaciendaException(
                    cliente.nombre, iban, cantidad
            );
        }
    }

    public void retirar(double cantidad)
            throws CuentaException, AvisarHaciendaException {

        if (cantidad <= 0) {
            throw new CuentaException("Cantidad de retirada inválida");
        }

        if (saldo - cantidad < -50) {
            throw new CuentaException("No se permite saldo inferior a -50€");
        }

        saldo -= cantidad;
        movimientos.add(new Movimiento("Retirada", cantidad));

        if (cantidad >= 3000) {
            throw new AvisarHaciendaException(
                    cliente.nombre, iban, cantidad
            );
        }
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }
}

