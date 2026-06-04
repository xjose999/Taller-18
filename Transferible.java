interface Transferible {
    void transferir(double monto, String cuentaDestino);
}

interface Retirable {
    void retirar(double monto);
}

interface Pagable {
    void pagarFactura(double monto, String referencia);
}

class CajeroRetiros implements Retirable {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro rápido de $" + monto + " dispensado.");
    }
}

class TerminalPagos implements Pagable {
    @Override
    public void pagarFactura(double monto, String referencia) {
        System.out.println("Factura " + referencia + " pagada en terminal por $" + monto);
    }
}

class BancaMovil implements Transferible, Retirable, Pagable {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transferencia móvil de $" + monto + " enviada a " + cuentaDestino);
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Token de retiro sin tarjeta generado por $" + monto);
    }

    @Override
    public void pagarFactura(double monto, String referencia) {
        System.out.println("Servicio " + referencia + " pagado desde la app por $" + monto);
    }
}

public class PruebaInterfacesBancarias {
    public static void main(String[] args) {
        Retirable cajero = new CajeroRetiros();
        Pagable terminal = new TerminalPagos();
        BancaMovil app = new BancaMovil();

        cajero.retirar(50000);
        terminal.pagarFactura(120000, "Ref-9921");

        app.transferir(450000, "Cuenta-7712");
        app.retirar(20000);
        app.pagarFactura(85000, "Ref-4412");
    }
}
