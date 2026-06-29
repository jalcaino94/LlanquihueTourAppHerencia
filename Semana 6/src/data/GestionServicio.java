/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import model.*;

public class GestionServicio {
    
    public void mostrarServicios() {
        System.out.println("=== CATÁLOGO DE SERVICIOS TURÍSTICOS ===");
        
        
        RutaGastronomica ruta = new RutaGastronomica(4, " Sabores de Puerto Montt", 5);
        
    
        PaseoLacustre paseo = new PaseoLacustre(" Catamaran", "Paseo por el Lago Llanquihue", 3);
        
     
        ExcursionCultural excursion = new ExcursionCultural(" Iglesias de Chiloe", " Ruta de Mitos y Leyendas", 4);
        
        
        System.out.println(ruta.toString());
        System.out.println(paseo.toString());
        System.out.println(excursion.toString());
    }
}