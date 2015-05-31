/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WS;

import WS.JSF.CorreosController;
import WS.JSF.PersonasController;
import WS.JSF.TelefonosController;
import WS.JSF.util.PaginationHelper;
import WS.Session.MySessionBeanLocal;
import WS.entities.Correos;
import WS.entities.Personas;
import WS.entities.Telefonos;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;
import javax.jws.WebMethod;

/**
 *
 * @author einstein pc
 */
@WebService(serviceName = "WSWebService")
@Stateless()
public class WSWebService {
    @EJB
    private MySessionBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "correosInstancia")
    public CorreosController correosInstancia() {
        return ejbRef.correosInstancia();
    }

    @WebMethod(operationName = "correosGetSelected")
    public Correos correosGetSelected() {
        return ejbRef.correosGetSelected();
    }

    @WebMethod(operationName = "correosgetPagination")
    public PaginationHelper correosgetPagination() {
        return ejbRef.correosgetPagination();
    }

    @WebMethod(operationName = "correosPrepareList")
    public String correosPrepareList() {
        return ejbRef.correosPrepareList();
    }

    @WebMethod(operationName = "correosPrepareView")
    public String correosPrepareView() {
        return ejbRef.correosPrepareView();
    }

    @WebMethod(operationName = "correosPrepareCreate")
    public String correosPrepareCreate() {
        return ejbRef.correosPrepareCreate();
    }

    @WebMethod(operationName = "correosCreate")
    public String correosCreate() {
        return ejbRef.correosCreate();
    }

    @WebMethod(operationName = "correosPrepareEdit")
    public String correosPrepareEdit() {
        return ejbRef.correosPrepareEdit();
    }

    @WebMethod(operationName = "correosUpdate")
    public String correosUpdate() {
        return ejbRef.correosUpdate();
    }

    @WebMethod(operationName = "correosDestroy")
    public String correosDestroy() {
        return ejbRef.correosDestroy();
    }

    @WebMethod(operationName = "correosDestroyAndView")
    public String correosDestroyAndView() {
        return ejbRef.correosDestroyAndView();
    }

    @WebMethod(operationName = "correosGetItems")
    public DataModel correosGetItems() {
        return ejbRef.correosGetItems();
    }

    @WebMethod(operationName = "correosNext")
    public String correosNext() {
        return ejbRef.correosNext();
    }

    @WebMethod(operationName = "correosPrevious")
    public String correosPrevious() {
        return ejbRef.correosPrevious();
    }

    @WebMethod(operationName = "correosGetItemsAvailableSelectMany")
    public SelectItem[] correosGetItemsAvailableSelectMany() {
        return ejbRef.correosGetItemsAvailableSelectMany();
    }

    @WebMethod(operationName = "correosGetItemsAvailableSelectOne")
    public SelectItem[] correosGetItemsAvailableSelectOne() {
        return ejbRef.correosGetItemsAvailableSelectOne();
    }

    @WebMethod(operationName = "telInstancia")
    public TelefonosController telInstancia() {
        return ejbRef.telInstancia();
    }

    @WebMethod(operationName = "telGetSelected")
    public Telefonos telGetSelected() {
        return ejbRef.telGetSelected();
    }

    @WebMethod(operationName = "telGetPagination")
    public PaginationHelper telGetPagination() {
        return ejbRef.telGetPagination();
    }

    @WebMethod(operationName = "telPrepareList")
    public String telPrepareList() {
        return ejbRef.telPrepareList();
    }

    @WebMethod(operationName = "telPrepareView")
    public String telPrepareView() {
        return ejbRef.telPrepareView();
    }

    @WebMethod(operationName = "telPrepareCreate")
    public String telPrepareCreate() {
        return ejbRef.telPrepareCreate();
    }

    @WebMethod(operationName = "telCreate")
    public String telCreate() {
        return ejbRef.telCreate();
    }

    @WebMethod(operationName = "telPrepareEdit")
    public String telPrepareEdit() {
        return ejbRef.telPrepareEdit();
    }

    @WebMethod(operationName = "telUpdate")
    public String telUpdate() {
        return ejbRef.telUpdate();
    }

    @WebMethod(operationName = "telDestroy")
    public String telDestroy() {
        return ejbRef.telDestroy();
    }

    @WebMethod(operationName = "telDestroyAndView")
    public String telDestroyAndView() {
        return ejbRef.telDestroyAndView();
    }

    @WebMethod(operationName = "telGetItems")
    public DataModel telGetItems() {
        return ejbRef.telGetItems();
    }

    @WebMethod(operationName = "telNext")
    public String telNext() {
        return ejbRef.telNext();
    }

    @WebMethod(operationName = "telPrevious")
    public String telPrevious() {
        return ejbRef.telPrevious();
    }

    @WebMethod(operationName = "telGetItemsAvailableSelectMany")
    public SelectItem[] telGetItemsAvailableSelectMany() {
        return ejbRef.telGetItemsAvailableSelectMany();
    }

    @WebMethod(operationName = "telGetItemsAvailableSelectOne")
    public SelectItem[] telGetItemsAvailableSelectOne() {
        return ejbRef.telGetItemsAvailableSelectOne();
    }

    @WebMethod(operationName = "perInstancia")
    public PersonasController perInstancia() {
        return ejbRef.perInstancia();
    }

    @WebMethod(operationName = "perGetSelected")
    public Personas perGetSelected() {
        return ejbRef.perGetSelected();
    }

    @WebMethod(operationName = "perGetPagination")
    public PaginationHelper perGetPagination() {
        return ejbRef.perGetPagination();
    }

    @WebMethod(operationName = "perPrepareList")
    public String perPrepareList() {
        return ejbRef.perPrepareList();
    }

    @WebMethod(operationName = "perPrepareView")
    public String perPrepareView() {
        return ejbRef.perPrepareView();
    }

    @WebMethod(operationName = "perPrepareCreate")
    public String perPrepareCreate() {
        return ejbRef.perPrepareCreate();
    }

    @WebMethod(operationName = "perCreate")
    public String perCreate() {
        return ejbRef.perCreate();
    }

    @WebMethod(operationName = "perPrepareEdit")
    public String perPrepareEdit() {
        return ejbRef.perPrepareEdit();
    }

    @WebMethod(operationName = "perUpdate")
    public String perUpdate() {
        return ejbRef.perUpdate();
    }

    @WebMethod(operationName = "perDestroy")
    public String perDestroy() {
        return ejbRef.perDestroy();
    }

    @WebMethod(operationName = "perDestroyAndView")
    public String perDestroyAndView() {
        return ejbRef.perDestroyAndView();
    }

    @WebMethod(operationName = "perGetItems")
    public DataModel perGetItems() {
        return ejbRef.perGetItems();
    }

    @WebMethod(operationName = "perNext")
    public String perNext() {
        return ejbRef.perNext();
    }

    @WebMethod(operationName = "perPrevious")
    public String perPrevious() {
        return ejbRef.perPrevious();
    }

    @WebMethod(operationName = "perGetItemsAvailableSelectMany")
    public SelectItem[] perGetItemsAvailableSelectMany() {
        return ejbRef.perGetItemsAvailableSelectMany();
    }

    @WebMethod(operationName = "perGetItemsAvailableSelectOne")
    public SelectItem[] perGetItemsAvailableSelectOne() {
        return ejbRef.perGetItemsAvailableSelectOne();
    }
    
}
