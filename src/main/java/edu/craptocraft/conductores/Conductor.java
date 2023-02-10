package edu.craptocraft.conductores;

import java.util.ArrayList;

public class Conductor {
    private String nombre = "";



    private String modeloCoche = "";
    private String matricula = "";
    private ArrayList<Integer> valoraciones = new ArrayList<>();
    private double valoracionMedia = 0d;

    private boolean ocupado = false;

    public Conductor() {}

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public void setValoracion(byte valoracion){
        Integer valoracionInt = Integer.valueOf(valoracion);
        valoraciones.add(valoracionInt);
        double media = valoraciones.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(Double.NaN);
        valoracionMedia = media;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public boolean isOcupado(){
        return this.ocupado;
    }
    public void setOcupado(boolean ocupado){
        this.ocupado = ocupado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modeloCoche;
    }
    public void setModelo(String modelo){
        this.modeloCoche = modelo;

    }

    public String getMatricula() {
        return matricula;
    }

    public ArrayList<Integer> getValoraciones() {
        return valoraciones;
    }

    public double getValoracion() {
        return valoracionMedia;
    }
}
