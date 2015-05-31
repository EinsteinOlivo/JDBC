/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WS.Session;

import WS.JSF.CorreosController;
import WS.JSF.PersonasController;
import WS.JSF.TelefonosController;
import WS.JSF.util.JsfUtil;
import WS.JSF.util.PaginationHelper;
import WS.entities.Correos;
import WS.entities.Personas;
import WS.entities.Telefonos;
import java.util.ResourceBundle;
import javax.ejb.Local;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

/**
 *
 * @author einstein pc
 */
@Local
public interface MySessionBeanLocal {
    //Correo
    public CorreosController correosInstancia();
    public Correos correosGetSelected();
    public PaginationHelper correosgetPagination(); 
    public String correosPrepareList();
    public String correosPrepareView();
    public String correosPrepareCreate();
    public String correosCreate();
    public String correosPrepareEdit();
    public String correosUpdate();
    public String correosDestroy();
    public String correosDestroyAndView();
    public DataModel correosGetItems();
    public String correosNext();
    public String correosPrevious();
    public SelectItem[] correosGetItemsAvailableSelectMany();
    public SelectItem[] correosGetItemsAvailableSelectOne();

    //Telefono
    public TelefonosController telInstancia();
    public Telefonos telGetSelected();
    public PaginationHelper telGetPagination();
    public String telPrepareList();
    public String telPrepareView();
    public String telPrepareCreate();
    public String telCreate();
    public String telPrepareEdit();
    public String telUpdate();
    public String telDestroy();
    public String telDestroyAndView();
    public DataModel telGetItems();
    public String telNext();
    public String telPrevious();
    public SelectItem[] telGetItemsAvailableSelectMany();
    public SelectItem[] telGetItemsAvailableSelectOne();
    
    //Persona
    public PersonasController perInstancia();
    public Personas perGetSelected();
    public PaginationHelper perGetPagination();
    public String perPrepareList();
    public String perPrepareView();
    public String perPrepareCreate();
    public String perCreate();
    public String perPrepareEdit();
    public String perUpdate();
    public String perDestroy();
    public String perDestroyAndView();
    public DataModel perGetItems();
    public String perNext();
    public String perPrevious();
    public SelectItem[] perGetItemsAvailableSelectMany();
    public SelectItem[] perGetItemsAvailableSelectOne();

}
