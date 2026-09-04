package practico2;

public abstract class Funcionario implements Comparable<Funcionario> {
    private String nombre;
    private String ci;

    public Funcionario(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public abstract double calcularSueldo();

    // Mensual m1 = new Mensual(...);
    // Mensual m2 = new Mensual(...);
    // m1.equals(m2)
    @Override
    public boolean equals(Object obj) {
        Funcionario f = (Funcionario) obj;
        return this.ci.equals(f.ci);
    }
    
    // f1.ganaMas(f2);
    public boolean ganaMas(Funcionario f){
        return this.calcularSueldo() > f.calcularSueldo();
    }

    @Override
    public int compareTo(Funcionario o) {
        return (int)(this.calcularSueldo() - o.calcularSueldo());
    }
    // f1.compareTo(f2);
    // 0 si son iguales
    // 1 (es mayor)
    // -1 (es menor)
}
