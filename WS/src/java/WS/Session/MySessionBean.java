/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WS.Session;

import WS.JSF.CorreosController;
import WS.JSF.PersonasController;
import WS.JSF.TelefonosController;
import WS.JSF.util.PaginationHelper;
import WS.entities.Correos;
import WS.entities.Personas;
import WS.entities.Telefonos;
import javax.ejb.Stateless;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;

/**
 *
 * @author einstein pc
 */
@Stateless
public class MySessionBean implements MySessionBeanLocal {
    private CorreosController corController;
    private TelefonosController telController;
    private PersonasController perController;

    //Correo
    @Override
    public CorreosController correosInstancia() {
        corController = new CorreosController();
        return corController;
    }

    @Override
    public Correos correosGetSelected() {
      return  corController.getSelected();
    }

    @Override
    public PaginationHelper correosgetPagination() {
        return corController.getPagination();
    }

    @Override
    public String correosPrepareList() {
        return corController.prepareList();
    }

    @Override
    public String correosPrepareView() {
        return corController.prepareView();
    }

    @Override
    public String correosPrepareCreate() {
        return corController.prepareCreate();
    }

    @Override
    public String correosCreate() {
        return corController.create();
    }

    @Override
    public String correosPrepareEdit() {
        return corController.prepareEdit();
    }

    @Override
    public String correosUpdate() {
        return corController.update();
    }

    @Override
    public String correosDestroy() {
        return corController.destroy();
    }

    @Override
    public String correosDestroyAndView() {
        return corController.destroyAndView();
    }

    @Override
    public DataModel correosGetItems() {
        return corController.getItems();
    }

    @Override
    public String correosNext() {
        return corController.next();
    }

    @Override
    public String correosPrevious() {
        return corController.previous();
    }

    @Override
    public SelectItem[] correosGetItemsAvailableSelectMany() {
        return corController.getItemsAvailableSelectMany();
    }

    @Override
    public SelectItem[] correosGetItemsAvailableSelectOne() {
        return corController.getItemsAvailableSelectOne();
    }

    //Telefono
    @Override
    public TelefonosController telInstancia() {
       return telController = new TelefonosController();
    }

    @Override
    public Telefonos telGetSelected() {
       return telController.getSelected();
    }

    @Override
    public PaginationHelper telGetPagination() {
        return telController.getPagination();
    }

    @Override
    public String telPrepareList() {
        return telController.prepareList();
    }

    @Override
    public String telPrepareView() {
        return telController.prepareView();
    }

    @Override
    public String telPrepareCreate() {
        return telController.prepareCreate();
    }

    @Override
    public String telCreate() {
        return telController.create();
    }

    @Override
    public String telPrepareEdit() {
        return telController.prepareEdit();
    }

    @Override
    public String telUpdate() {
        return telController.update();
    }

    @Override
    public String telDestroy() {
        return telController.destroy();
    }

    @Override
    public String telDestroyAndView() {
        return telController.destroyAndView();
    }

    @Override
    public DataModel telGetItems() {
        return telController.getItems();
    }

    @Override
    public String telNext() {
        return telController.next();
    }

    @Override
    public String telPrevious() {
        return telController.previous();
    }

    @Override
    public SelectItem[] telGetItemsAvailableSelectMany() {
        return telController.getItemsAvailableSelectMany();
    }

    @Override
    public SelectItem[] telGetItemsAvailableSelectOne() {
        return telController.getItemsAvailableSelectOne();
    }

    //Persona
    @Override
    public PersonasController perInstancia() {
        perController = new PersonasController();
        return perController;
    }

    @Override
    public Personas perGetSelected() {
        return perController.getSelected();
    }

    @Override
    public PaginationHelper perGetPagination() {
        return perController.getPagination();
    }

    @Override
    public String perPrepareList() {
        return perController.prepareList();
    }

    @Override
    public String perPrepareView() {
        return perController.prepareView();
    }

    @Override
    public String perPrepareCreate() {
        return perController.prepareCreate();
    }

    @Override
    public String perCreate() {
        return perController.create();
    }

    @Override
    public String perPrepareEdit() {
        return perController.prepareEdit();
    }

    @Override
    public String perUpdate() {
        return perController.update();
    }

    @Override
    public String perDestroy() {
        return perController.destroy();
    }

    @Override
    public String perDestroyAndView() {
        return perController.destroyAndView();
    }

    @Override
    public DataModel perGetItems() {
        return perController.getItems();
    }

    @Override
    public String perNext() {
        return perController.next();
    }

    @Override
    public String perPrevious() {
        return perController.previous();
    }

    @Override
    public SelectItem[] perGetItemsAvailableSelectMany() {
        return perController.getItemsAvailableSelectMany();
    }

    @Override
    public SelectItem[] perGetItemsAvailableSelectOne() {
        return perController.getItemsAvailableSelectOne();
    }

    
    public CorreosController getCorreosInstancia(){
        return corController;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
