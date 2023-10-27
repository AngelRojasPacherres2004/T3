/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class Polo extends Ropa
        implements Vestidor {

    private String model;
    private String precio;

    @Override
    public String getNombre() {
        return "Polo Modelo: " + model + " |  Precio: " + precio;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return model;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.model = color;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public void vestir() {

    }
}
