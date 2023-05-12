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
    protected int distancia;
    protected ArrayList<Primates> primates;

    public Transporte(double tanque, int distancia, ArrayList<Primates> primates) {
        this.tanque = tanque;
        this.distancia = distancia;
        this.primates = primates;
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

    @Override
    public String toString() {
        return "Transporte{" + "tanque=" + tanque + ", distancia=" + distancia + ", primates=" + primates + '}';
    }
    
    
    
    public abstract void viajar();
    
}
