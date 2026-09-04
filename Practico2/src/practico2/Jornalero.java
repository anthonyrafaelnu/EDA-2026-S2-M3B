package practico2;

public class Jornalero extends Funcionario {
    
    private int horasTrabajadas;
    private double valorHora;

    public Jornalero(int horasTrabajadas, double valorHora, String nombre, String ci) {
        super(nombre, ci);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSueldo() {
        return this.horasTrabajadas * this.valorHora;
    }
    
}
