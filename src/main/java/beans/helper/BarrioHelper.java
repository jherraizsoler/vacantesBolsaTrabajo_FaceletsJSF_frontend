/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.helper;

import beans.model.Barrio;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.model.SelectItem;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author herra
 * 
 */

@RequestScoped
@Named
public class BarrioHelper {
  
    public List<Barrio> getBarrios(){
        List<Barrio> barrios = new ArrayList<>();
        
        int barrioId = 1;
        Barrio barrio = new Barrio(barrioId++, "Montecanal", 50012);
        barrios.add(barrio);
        
        barrio = new Barrio(barrioId++, "Las Fuentes", 50013);
        barrios.add(barrio);
        
        barrio = new Barrio(barrioId++, "Alagon", 50010);
        barrios.add(barrio);
        
        barrio = new Barrio(barrioId++, "La Magdalena", 50002);
        barrios.add(barrio);
        
        barrio = new Barrio(barrioId++, "Centro", 50004);
        barrios.add(barrio);
        
        return barrios;
    }
    
    
    public int getBarrioIdPorNombre(String nombreBarrio){
        int barrioId = 0;
        List<Barrio> barrios = this.getBarrios();
        
        for (Barrio barrio : barrios) {
            if(barrio.getNombreBarrio().equals(nombreBarrio)){
                barrioId = barrio.getBarrioId();
                break;
            }
        }
        return barrioId;
    }
    
    
     public int getBarrioIdPorCP(int codigoPostal){
        int barrioId = 0;
        List<Barrio> barrios = this.getBarrios();
        
        for (Barrio barrio : barrios) {
            if(barrio.getCodigoPostal() == codigoPostal){
                barrioId = barrio.getBarrioId();
                break;
            }
        }
        return barrioId;
    }
    
     
    public List<SelectItem> getSelectItems(){
        List<SelectItem> selectItems = new ArrayList<>();
        List<Barrio> barrios = this.getBarrios();
        for (Barrio barrio : barrios) {
            SelectItem selectItem = new SelectItem(barrio.getBarrioId(),barrio.getNombreBarrio());
            selectItems.add(selectItem);
        }
        return selectItems;       
    }
    
}
