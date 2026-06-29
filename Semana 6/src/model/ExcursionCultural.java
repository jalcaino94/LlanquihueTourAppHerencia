/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jagui
 */
public class ExcursionCultural extends ServicioTuristico{
    
    private String lugarHistoricos;

    public ExcursionCultural() {
    }

    public ExcursionCultural(String lugarHistoricos) {
        this.lugarHistoricos = lugarHistoricos;
    }

    // AQUI AGREGAMOS EL CONSTRUCTOR CON SUPER
    public ExcursionCultural(String lugarHistoricos, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.lugarHistoricos = lugarHistoricos;
    }

    public String getLugarHistoricos() {
        return lugarHistoricos;
    }

    public void setLugarHistoricos(String lugarHistoricos) {
        this.lugarHistoricos = lugarHistoricos;
    }

    
    @Override
    public String toString() {
        
        return super.toString() + " - ExcursionCultural{" + " lugarHistoricos=" + lugarHistoricos + '}';
    }
}