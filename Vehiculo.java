interface Vehiculo {
    void conducir();
    void cargarMercancia(double peso);
}

class CamionCompleto implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("Conduciendo el camión.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg de mercancía en el camión.");
    }
}
