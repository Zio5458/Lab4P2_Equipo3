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
public class Espacial extends Transporte {

    static Random random = new Random();
    
    private String combustible;
    private boolean combate;

    public Espacial(String combustible, boolean combate, double tanque, int galones, int distancia, int galonesPostViaje) {
        super(tanque, galones, distancia, galonesPostViaje);
        this.combustible = combustible;
        this.combate = combate;
    }

    
    public Espacial(String combustible, boolean combate, double tanque, int distancia, ArrayList<Primates> primates, int galones) {
        super(tanque, distancia, primates, galones);
        this.combustible = combustible;
        this.combate = combate;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public boolean isCombate() {
        return combate;
    }

    public void setCombate(boolean combate) {
        this.combate = combate;
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
        return "Aereo Espacial\n\n"+super.toString() + "\nCombustible: " + combustible + "\nTipo de nave: " + combate;
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
    public boolean viajar() {
        double consumo = ((this.distancia * 0.32) + ((random.nextInt(10) + 25)) + 3) * (3/2);
        int hambrientos = 0;
        for (int i = 0; i < primates.size(); i++) {
            if (primates.get(i).getCant_comida() < (primates.get(i).getCom_pkm()) * distancia){
                hambrientos++;
            }
        }
        
        if (consumo > (galones * tanque) || hambrientos > 0 || primates.isEmpty()){
            return false;
        } else {
            this.galonesPostViaje = (int) ((galones * tanque) - consumo);
            return true;
        }
    }
    
    
    
}
