/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_hectorsabillon;

import java.util.ArrayList;

/**
 *
 * @author hdann
 */
public abstract class Transporte {

    protected double tanque;
    protected int galones;
    protected int distancia;
    protected ArrayList<Primates> primates;
    protected int galonesPostViaje;

    public Transporte() {
    }

    public Transporte(double tanque, int galones, int distancia, int galonesPostViaje) {
        this.tanque = tanque;
        this.galones = galones;
        this.distancia = distancia;
        this.galonesPostViaje = galonesPostViaje;
    }

    
    public Transporte(double tanque, int distancia, ArrayList<Primates> primates, int galones) {
        this.tanque = tanque;
        this.distancia = distancia;
        this.primates = primates;
        this.galones = galones;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public ArrayList<Primates> getPrimates() {
        return primates;
    }

    public void setPrimates(ArrayList<Primates> primates) {
        this.primates = primates;
    }

    public int getGalones() {
        return galones;
    }

    public void setGalones(int galones) {
        this.galones = galones;
    }

    public int getGalonesPostViaje() {
        return galonesPostViaje;
    }

    public void setGalonesPostViaje(int galonesPostViaje) {
        this.galonesPostViaje = galonesPostViaje;
    }

    
    
    @Override
    public String toString() {
        return "Tanque: " + tanque + "%\nDistancia: " + distancia+"\nGalones: "+galones;
    }

    public abstract boolean viajar();

}
