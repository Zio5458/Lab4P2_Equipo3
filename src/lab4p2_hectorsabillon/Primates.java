/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_hectorsabillon;

/**
 *
 * @author hdann
 */
public class Primates extends SeresVivos{
    
    private int cant_comida;
    private int com_pkm;
    private String nacimiento;
    private Transporte transporte;

    public Primates(int cant_comida, int com_pkm, String nacimiento, String nombre, String grupo_sanguineo, String sexo, int altura, int peso, Transporte transporte) {
        super(nombre, grupo_sanguineo, sexo, altura, peso);
        this.cant_comida = cant_comida;
        this.com_pkm = com_pkm;
        this.nacimiento = nacimiento;
        this.transporte = transporte;
    }

    public int getCant_comida() {
        return cant_comida;
    }

    public void setCant_comida(int cant_comida) {
        this.cant_comida = cant_comida;
    }

    public int getCom_pkm() {
        return com_pkm;
    }

    public void setCom_pkm(int com_pkm) {
        this.com_pkm = com_pkm;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
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
        return "Primates{" + "cant_comida=" + cant_comida + ", com_pkm=" + com_pkm + ", nacimiento=" + nacimiento + super.toString() + '}';
    }
    
    
    
}
