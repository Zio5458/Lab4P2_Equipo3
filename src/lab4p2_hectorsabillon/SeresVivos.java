/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_hectorsabillon;

public class SeresVivos {
    
    protected String nombre;
    protected String grupo_sanguineo;
    protected String sexo;
    protected int altura;
    protected int peso;

    public SeresVivos() {
    }
    
    
    public SeresVivos(String nombre, String grupo_sanguineo, String sexo, int altura, int peso) {
        this.nombre = nombre;
        this.grupo_sanguineo = grupo_sanguineo;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo_sanguineo() {
        return grupo_sanguineo;
    }

    public void setGrupo_sanguineo(String grupo_sanguineo) {
        this.grupo_sanguineo = grupo_sanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nGrupo Sanguineo: " + grupo_sanguineo + "\nSexo: " + sexo + "\nAltura: " + altura + "\nPeso:" + peso+"\n";
    }
    
    
    
}
