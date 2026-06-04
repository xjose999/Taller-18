interface OperacionBancaria {
    void transferir(double monto, String cuentaDestino);
    void retirar(double monto);
    void pagarFactura(double monto, String referencia);
}

class CajeroAutomaticoCompleto implements OperacionBancaria {
    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Transferencia de $" + monto + " a la cuenta " + cuentaDestino + " procesada.");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de $" + monto + " realizado.");
    }

    @Override
    public void pagarFactura(double monto, String referencia) {
        System.out.println("Pago de factura con referencia " + referencia + " por $" + monto + " exitoso.");
    }
}