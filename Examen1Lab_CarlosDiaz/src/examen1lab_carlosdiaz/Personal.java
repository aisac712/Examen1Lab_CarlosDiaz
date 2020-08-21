package examen1lab_carlosdiaz;

public class Personal extends Persona{
    private String ocupacion;
    private String horario;
    private int semanas;
    private int sueldo;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, String horario, int semanas, int sueldo, int id, String nombre, int edad, String sexo, String estadoCiv, double altura, double peso) {
        super(id, nombre, edad, sexo, estadoCiv, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", semanas=" + semanas + ", sueldo=" + sueldo + '}';
    }
    
}
