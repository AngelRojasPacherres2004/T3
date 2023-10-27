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
public class Pantalon extends Ropa
        implements Vestidor {

    private String diseño;

    private String precio;

    @Override
    public String getNombre() {
        return "Pantalon Modelo: " + diseño + " |  Precio: " + precio;
    }

    /**
     * @return the diseño
     */
    public String getDiseño() {
        return diseño;
    }

    /**
     * @param diseño the diseño to set
     */
    public void setDiseño(String diseño) {
        this.diseño = diseño;
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
