/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author jagui
 */
public class PaseoLacustre extends ServicioTuristico{
    
    private String tipoEmbarcacion;

    public PaseoLacustre() {
    }

    public PaseoLacustre(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // AQUI AGREGAMOS EL CONSTRUCTOR CON SUPER
    public PaseoLacustre(String tipoEmbarcacion, String nombre, int duracionHoras) {
        super(nombre, duracionHoras);
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }
    
    @Override
    public String toString() {
       
        return super.toString() + " - PaseoLacustre{" + " tipoEmbarcacion=" + tipoEmbarcacion + '}';
    }
}