/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2semana13;

/**
 *
 * @author TChaves
 */
public class Habitaciones {

    /*Se inicializan las variables solicitadas*/
    public String estado;
    public int numero;
    public String tipo;
    public int precio;

    /*Se crea el constructor*/
    public Habitaciones(String estado, int numero, String tipo, int precio) {
        this.estado = estado;
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    /*Se generan los setters y getters*/
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
