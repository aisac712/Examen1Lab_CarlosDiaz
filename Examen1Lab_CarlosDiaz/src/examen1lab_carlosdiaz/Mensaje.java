package examen1lab_carlosdiaz;

public class Mensaje {
    private Persona emisor;
    private Persona receptor;
    private String msj;

    public Mensaje() {
    }

    public Mensaje(Persona emisor, Persona receptor, String msj) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.msj = msj;
    }

    public Persona getEmisor() {
        return emisor;
    }

    public void setEmisor(Persona emisor) {
        this.emisor = emisor;
    }

    public Persona getReceptor() {
        return receptor;
    }

    public void setReceptor(Persona receptor) {
        this.receptor = receptor;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "emisor=" + emisor + ", receptor=" + receptor + ", msj=" + msj + '}';
    }
    
}
