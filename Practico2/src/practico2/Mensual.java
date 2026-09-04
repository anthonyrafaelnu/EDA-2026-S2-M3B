package practico2;

public class Mensual extends Funcionario {
    
    private double sueldoMensual;

    public Mensual(double sueldoMensual, String nombre, String ci) {
        super(nombre, ci);
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public void setSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public double calcularSueldo() {
        return this.sueldoMensual;
    }
    
}
