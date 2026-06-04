interface Mantenimiento {
    void reparar();
    void limpiar();
}

class RobotMantenimiento implements Mantenimiento {
    @Override
    public void reparar() {
        System.out.println("Robot realizando reparaciones mecánicas.");
    }

    @Override
    public void limpiar() {
        System.out.println("Robot ejecutando ciclo de limpieza.");
    }
}