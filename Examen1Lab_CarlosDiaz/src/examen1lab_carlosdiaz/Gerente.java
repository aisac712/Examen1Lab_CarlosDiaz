package examen1lab_carlosdiaz;

public class Gerente extends Persona{
    private String user;
    private String pw;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String user, String pw, String cargo, int id, String nombre, int edad, String sexo, String estadoCiv, double altura, double peso) {
        super(id, nombre, edad, sexo, estadoCiv, altura, peso);
        this.user = user;
        this.pw = pw;
        this.cargo = cargo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "user=" + user + ", pw=" + pw + ", cargo=" + cargo + '}';
    }
    
}
