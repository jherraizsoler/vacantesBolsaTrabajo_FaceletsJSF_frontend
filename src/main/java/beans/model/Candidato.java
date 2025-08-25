/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.model;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author herra
 */
@Named("candidato")
@SessionScoped
public class Candidato implements Serializable{
    
    private static final Logger log = LoggerFactory.getLogger(Candidato.class);
    
    private String nombre;
    private String apellido;
    private int SalarioDeseado;
    private Date fechaNacimiento;
    private String codigoPostal;
    private int barrioId;
    private String ciudad;
    private String comentario;
    

    public Candidato() {
        log.info("Creando el objeto Candidato");
        //this.nombre = "Introduce tu nombre";
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        log.info("Actualizando nombre: " + nombre);
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        log.info("Actualizando apellido: " + apellido);
        this.apellido = apellido;
    }

    public int getSalarioDeseado() {
        return SalarioDeseado;
    }

    public void setSalarioDeseado(int SalarioDeseado) {
         log.info("Actualizando salario: " + SalarioDeseado);
        this.SalarioDeseado = SalarioDeseado;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public int getBarrioId() {
        return barrioId;
    }

    public void setBarrioId(int barrioId) {
        this.barrioId = barrioId;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
    
    
    
    
}
