/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_hectorsabillon;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author hdann
 */
public class Normal extends Transporte {

    static Random random = new Random();

    private int pasajeros;
    private int longitud;
    private int motores;
    private int galonesPostViaje;

    public Normal(int pasajeros, int longitud, int motores, double tanque, int distancia, ArrayList<Primates> primates, int galones) {
        super(tanque, distancia, primates, galones);
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
        return "Normal{" + "pasajeros=" + pasajeros + ", longitud=" + longitud + ", motores=" + motores + super.toString() + '}';
    }

    @Override
    public boolean viajar() {
        double consumo = (this.distancia * 0.15) + ((random.nextInt(75) + 25));
        int comidatotal = 0;
        int comidanecesaria = 0;
        for (int i = 0; i < primates.size(); i++) {
            comidatotal += primates.get(i).getCant_comida();
        }

        for (int i = 0; i < primates.size(); i++) {
            comidanecesaria += primates.get(i).getCom_pkm();
        }
        
        if (primates.isEmpty() || consumo > (galones * tanque) || comidanecesaria > comidatotal) {
            return false;
        } else {
            this.galonesPostViaje = 0;
            return true;
        }

    }

}
