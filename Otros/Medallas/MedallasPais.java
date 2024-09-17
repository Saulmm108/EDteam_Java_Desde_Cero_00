package Otros.Medallas;

import java.util.ArrayList;



public class MedallasPais {
    private String nombre;
    private int oro, plata, bronce;


    public MedallasPais(String nombre, int oro, int plata, int bronce) {
        this.nombre = nombre;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    public MedallasPais (String nombre){
        this.nombre = nombre;
        this.oro = 0;
        this.plata = 0;
        this.bronce = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    @Override
    public String toString() {
        return "MedallasPais [nombre=" + nombre + ", oro=" + oro + ", plata=" + plata + ", bronce=" + bronce + "]";
    }
    
    public void ganoMedallaOro(){
        this.oro++;
    }

    public void ganoMedallaPlata(){
        this.plata++;
    }

    public void ganoMedallaBronce(){
        this.bronce++;
    }

    public int totalMedallas(){
        return this.oro + this.plata + this.bronce;
    }

    static int totalMedallasJJOO(ArrayList<MedallasPais> medallero) {
        int suma = 0;
        for (MedallasPais mp: medallero){
            suma += mp.totalMedallas();
        }
        return suma;
    }

    static String paisMedallas(ArrayList<MedallasPais> medallero) {
        int mayor = 0; 
        MedallasPais aux = null;
        for (MedallasPais mp: medallero){
            if(mp.totalMedallas()>mayor){
                mayor = mp.totalMedallas();
                aux = mp;
            }
        }
        return aux.getNombre();
    }
    
}
