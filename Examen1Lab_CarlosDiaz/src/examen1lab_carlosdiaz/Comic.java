package examen1lab_carlosdiaz;

import java.awt.Color;

public class Comic extends Articulo{
    private int vol;
    private String descC;
    private int estado;     //*1-10

    public Comic() {
        super();
    }

    public Comic(int vol, String descC, int estado, String nombre, Color color, String desc, String editorial, double tamañi, int puntuacion, Persona p_ingreso) {
        super(nombre, color, desc, editorial, tamañi, puntuacion, p_ingreso);
        this.vol = vol;
        this.descC = descC;
        this.estado = estado;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public String getDescC() {
        return descC;
    }

    public void setDescC(String descC) {
        this.descC = descC;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
