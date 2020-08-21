package examen1lab_carlosdiaz;

import java.awt.Color;

public class Articulo {
    private String nombre;
    private Color color;
    private String desc;
    private String editorial;
    private double tamañi;
    private int puntuacion;
    private Persona p_ingreso;

    public Articulo() {
    }

    public Articulo(String nombre, Color color, String desc, String editorial, double tamañi, int puntuacion, Persona p_ingreso) {
        this.nombre = nombre;
        this.color = color;
        this.desc = desc;
        this.editorial = editorial;
        this.tamañi = tamañi;
        this.puntuacion = puntuacion;
        this.p_ingreso = p_ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getTamañi() {
        return tamañi;
    }

    public void setTamañi(double tamañi) {
        this.tamañi = tamañi;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Persona getP_ingreso() {
        return p_ingreso;
    }

    public void setP_ingreso(Persona p_ingreso) {
        this.p_ingreso = p_ingreso;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", color=" + color + ", desc=" + desc + ", editorial=" + editorial + ", tama\u00f1i=" + tamañi + ", puntuacion=" + puntuacion + ", p_ingreso=" + p_ingreso + '}';
    }
    
}
