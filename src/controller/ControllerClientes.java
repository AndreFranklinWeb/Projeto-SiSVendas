package controller;

import model.ModelClientes;
import DAO.DaoClientes;
import java.util.ArrayList;

/**
*
* @author Andre Franklin
*/
public class ControllerClientes {

    private DaoClientes daocliente = new DaoClientes();

    /**
    * grava cliente
    * @param pModelcliente
    * return int
    */
    public int salvarclienteController(ModelClientes pModelcliente){
        return this.daocliente.salvarclienteDAO(pModelcliente);
    }

    /**
    * recupera cliente
    * @param pId_cliente
    * return ModelClientes
    */
    public ModelClientes getClienteController(int pId_cliente){
        return this.daocliente.getclienteDAO(pId_cliente);
    }

    /**
    * recupera uma lista decliente
    * @param pId_cliente
    * return ArrayList
    */
    public ArrayList<ModelClientes> getListaclienteController(){
        return this.daocliente.getListaclienteDAO();
    }

    /**
    * atualiza cliente
    * @param pModelcliente
    * return boolean
    */
    public boolean atualizarclienteController(ModelClientes pModelcliente){
        return this.daocliente.atualizarclienteDAO(pModelcliente);
    }

    /**
    * exclui cliente
    * @param pId_cliente
    * return boolean
    */
    public boolean excluirclienteController(int pId_cliente){
        return this.daocliente.excluirclienteDAO(pId_cliente);
    }
}