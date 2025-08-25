/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans.backing;

import beans.helper.BarrioHelper;
import beans.model.Candidato;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.component.UIInput;
import jakarta.faces.component.UIViewRoot;
import jakarta.faces.context.FacesContext;
import jakarta.faces.event.ActionEvent;
import jakarta.faces.event.ValueChangeEvent;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author herra
 */
@Named("vacanteForm")
@RequestScoped
public class VacanteForm {
    private static final Logger log = LoggerFactory.getLogger(VacanteForm.class);
    @Inject
    private Candidato candidato;
    
    @Inject
    private BarrioHelper barrioHelper;
    
    private boolean comentarioEnviado;
    

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar(){
        log.info("Procesando solicitud para: " + this.candidato.getNombre());
        if( "Jorge".equals(this.candidato.getNombre()) 
            && 
            "Herraiz".equals(this.candidato.getApellido())
          )
        {
            String msg = "Gracias " + this.candidato.getNombre() + " " +  this.candidato.getApellido() + ", te has registrado correctamente";
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, msg, null);
            FacesContext.getCurrentInstance().addMessage(null, facesMessage);
            log.info("Usuario registrado correctamente");
            
            //return "exito?faces-redirect=true";  // exito.xhtml
            return "index";
        }else{
            log.info("Datos de usuario invalidos");
            return "fallo?faces-redirect=true"; // fallo.xhtml
        }
    }
    
    public void codigoPostalListener(ValueChangeEvent valueChangeEvent){
        FacesContext facesContext = FacesContext.getCurrentInstance();
        UIViewRoot uiviewroot = facesContext.getViewRoot();
        int  nuevoCodigoPostal = ((Long)valueChangeEvent.getNewValue()).intValue();
       
        UIInput barrioInputText = (UIInput) uiviewroot.findComponent("vacanteForm:barrioId");
        int barrioId = this.barrioHelper.getBarrioIdPorCP(nuevoCodigoPostal);
        barrioInputText.setValue(barrioId);
        barrioInputText.setSubmittedValue(barrioId);

        UIInput ciudadInputText = (UIInput) uiviewroot.findComponent("vacanteForm:ciudad");
        String nuevaCiudad = "Zaragoza";
        ciudadInputText.setValue(nuevaCiudad);
        ciudadInputText.setSubmittedValue(nuevaCiudad);

        facesContext.renderResponse();       
        
    }
    
    public void ocultarComentario(ActionEvent actionEvent){
        this.comentarioEnviado = !this.comentarioEnviado;
    }

    public boolean isComentarioEnviado() {
        return comentarioEnviado;
    }

    public void setComentarioEnviado(boolean comentarioEnviado) {
        this.comentarioEnviado = comentarioEnviado;
    }

    public BarrioHelper getBarrioHelper() {
        return barrioHelper;
    }

    public void setBarrioHelper(BarrioHelper barrioHelper) {
        this.barrioHelper = barrioHelper;
    }
    
    
}
