interface Conducible {
    void conducir();
}

interface Cargable {
    void cargarMercancia(double peso);
}

class Moto implements Conducible {
    @Override
    public void conducir() {
        System.out.println("Conduciendo la motocicleta.");
    }
}

class Furgoneta Reparte implements Conducible, Cargable {
    @Override
    public void conducir() {
        System.out.println("Conduciendo la furgoneta de reparto.");
    }

    @Override
    public void cargarMercancia(double peso) {
        System.out.println("Cargando " + peso + " kg en el espacio trasero de la furgoneta.");
    }
}

public class PruebaVehiculos {
    public static void main(String[] args) {
        Conducible miMoto = new Moto();
        Furgoneta repartidor = new Furgoneta();

        miMoto.conducir();

        repartidor.cargarMercancia(450.5);
        repartidor.conducir();
    }
}