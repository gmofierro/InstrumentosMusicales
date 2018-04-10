/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentosmusicales;

/**
 *
 * @author gfier
 */
public abstract class Instrumento
{
    private String descripcion;
    public Instrumento()
    {
        descripcion="abstracto";
    }
    public abstract void reproducir();

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}