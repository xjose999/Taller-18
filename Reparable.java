interface Reparable {
    void reparar();
}

interface Limpiable {
    void limpiar();
}

class TecnicoMecanico implements Reparable {
    @Override
    public void reparar() {
        System.out.println("Técnico reparando el motor.");
    }
}

class PersonalLimpieza implements Limpiable {
    @Override
    public void limpiar() {
        System.out.println("Personal limpiando las instalaciones.");
    }
}

class OperarioMultitarea implements Reparable, Limpiable {
    @Override
    public void reparar() {
        System.out.println("Operario reparando herramientas.");
    }

    @Override
    public void limpiar() {
        System.out.println("Operario limpiando el área de trabajo.");
    }
}

public class PruebaMantenimiento {
    public static void main(String[] args) {
        Reparable mecanico = new TecnicoMecanico();
        Limpiable conserje = new PersonalLimpieza();
        OperarioMultitarea operario = new OperarioMultitarea();

        mecanico.reparar();
        conserje.clean();
        conserje.limpiar();

        operario.reparar();
        operario.limpiar();
    }
}
