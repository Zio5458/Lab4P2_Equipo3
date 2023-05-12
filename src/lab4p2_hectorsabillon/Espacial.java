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

    public Espacial(String combustible, boolean combate, double tanque, int distancia, ArrayList<Primates> primates) {
        super(tanque, distancia, primates);
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
        return "Espacial{" + "combustible=" + combustible + ", combate=" + combate + '}';
    }
    
    
    
    @Override
    public boolean viajar() {
        double consumo = ((this.distancia * 0.32) + ((random.nextInt(10) + 25)) + 3) * (3/2);
        int comidatotal = 0;
        int comidanecesaria = 0;
        for (int i = 0; i < primates.size(); i++){
            comidatotal += primates.get(i).getCant_comida();
        }//for comida total disponible
        
        for (int i = 0; i < primates.size(); i++){
            comidanecesaria += primates.get(i).getCom_pkm();
        }//for comida necesaria para el viaje
        
        if (consumo > tanque || comidanecesaria > comidatotal || primates.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
    
    
    
}
