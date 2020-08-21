package examen1lab_carlosdiaz;

import java.awt.Color;

public class Figuras extends Articulo{
    private String descF;
    private String instrucciones;
    private int tiempoGar;

    public Figuras() {
        super();
    }

    public Figuras(String descF, String instrucciones, int tiempoGar, String nombre, Color color, String desc, String editorial, double tamañi, int puntuacion, Persona p_ingreso) {
        super(nombre, color, desc, editorial, tamañi, puntuacion, p_ingreso);
        this.descF = descF;
        this.instrucciones = instrucciones;
        this.tiempoGar = tiempoGar;
    }
    
}
