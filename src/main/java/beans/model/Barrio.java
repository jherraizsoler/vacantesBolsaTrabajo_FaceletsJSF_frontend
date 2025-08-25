/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.model;

/**
 *
 * @author herra
 */
public class Barrio {
    private int barrioId;
    private String nombreBarrio;
    private int codigoPostal;

    public Barrio() {
    }

    public Barrio(int barrioId, String nombreBarrio, int codigoPostal) {
        this.barrioId = barrioId;
        this.nombreBarrio = nombreBarrio;
        this.codigoPostal = codigoPostal;
    }

    public int getBarrioId() {
        return barrioId;
    }

    public void setBarrioId(int barrioId) {
        this.barrioId = barrioId;
    }

    public String getNombreBarrio() {
        return nombreBarrio;
    }

    public void setNombreBarrio(String nombreBarrio) {
        this.nombreBarrio = nombreBarrio;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
}
