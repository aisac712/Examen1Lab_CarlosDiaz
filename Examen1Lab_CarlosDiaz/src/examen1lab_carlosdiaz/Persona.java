package examen1lab_carlosdiaz;

import java.util.ArrayList;

public class Persona {
    private int id;
    private String nombre;
    private int edad;
    private String sexo;
    private String estadoCiv;
    private double altura;
    private double peso;
    private ArrayList<Mensaje> mensajes = new ArrayList();

    public Persona() {
    }

    public Persona(int id, String nombre, int edad, String sexo, String estadoCiv, double altura, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCiv = estadoCiv;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCiv() {
        return estadoCiv;
    }

    public void setEstadoCiv(String estadoCiv) {
        this.estadoCiv = estadoCiv;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
