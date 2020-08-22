package examen1lab_carlosdiaz;

import java.awt.Color;

public class Juegos extends Articulo{
    private int edicion;
    private String casaElab;
    private String pais;

    public Juegos() {
        super();
    }

    public Juegos(int edicion, String casaElab, String pais, String nombre, Color color, String desc, String editorial, double tamañi, int puntuacion, Persona p_ingreso) {
        super(nombre, color, desc, editorial, tamañi, puntuacion, p_ingreso);
        this.edicion = edicion;
        this.casaElab = casaElab;
        this.pais = pais;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getCasaElab() {
        return casaElab;
    }

    public void setCasaElab(String casaElab) {
        this.casaElab = casaElab;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
    
}
