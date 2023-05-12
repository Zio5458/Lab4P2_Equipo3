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
public class Normal extends Transporte{

    private int pasajeros;
    private int longitud;
    private int motores;

    public Normal(int pasajeros, int longitud, int motores, double tanque, int distancia, ArrayList<Primates> primates) {
        super(tanque, distancia, primates);
        this.pasajeros = pasajeros;
        this.longitud = longitud;
        this.motores = motores;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getMotores() {
        return motores;
    }

    public void setMotores(int motores) {
        this.motores = motores;
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
        return "Normal{" + "pasajeros=" + pasajeros + ", longitud=" + longitud + ", motores=" + motores + super.toString() + '}';
    }
    
    
    
    @Override
    public void viajar() {
        
    }
    
}
