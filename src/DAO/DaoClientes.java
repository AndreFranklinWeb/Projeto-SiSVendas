package DAO;

import model.ModelClientes;
import conexao.ConexaoMySql;
import java.util.ArrayList;
/**
*
* @author Andre Franklin
*/
public class DaoClientes extends ConexaoMySql {

    /**
    * grava cliente
    * @param pModelcliente
    * return int
    */
    public int salvarclienteDAO(ModelClientes pModelcliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                    + "nome_cli,"
                    + "endereco_cli,"
                    + "bairro_cli,"
                    + "cidade_cli,"
                    + "uf_cli,"
                    + "cep_cli,"
                    + "telefone_cli"
                + ") VALUES ("
                    + "'" + pModelcliente.getNome_cli() + "',"
                    + "'" + pModelcliente.getEndereco_cli() + "',"
                    + "'" + pModelcliente.getBairro_cli() + "',"
                    + "'" + pModelcliente.getCidade_cli() + "',"
                    + "'" + pModelcliente.getUf_cli() + "',"
                    + "'" + pModelcliente.getCep_cli() + "',"
                    + "'" + pModelcliente.getTelefone_cli() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera cliente
    * @param pId_cliente
    * return ModelClientes
    */
    public ModelClientes getclienteDAO(int pId_cliente){
        ModelClientes modelcliente = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "nome_cli,"
                    + "endereco_cli,"
                    + "bairro_cli,"
                    + "cidade_cli,"
                    + "uf_cli,"
                    + "cep_cli,"
                    + "telefone_cli"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pId_cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcliente.setId_cliente(this.getResultSet().getInt(1));
                modelcliente.setNome_cli(this.getResultSet().getString(2));
                modelcliente.setEndereco_cli(this.getResultSet().getString(3));
                modelcliente.setBairro_cli(this.getResultSet().getString(4));
                modelcliente.setCidade_cli(this.getResultSet().getString(5));
                modelcliente.setUf_cli(this.getResultSet().getString(6));
                modelcliente.setCep_cli(this.getResultSet().getString(7));
                modelcliente.setTelefone_cli(this.getResultSet().getString(8));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelcliente;
    }

    /**
    * recupera uma lista de cliente
        * return ArrayList
    */
    public ArrayList<ModelClientes> getListaclienteDAO(){
        ArrayList<ModelClientes> listamodelcliente = new ArrayList();
        ModelClientes modelcliente = new ModelClientes();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "nome_cli,"
                    + "endereco_cli,"
                    + "bairro_cli,"
                    + "cidade_cli,"
                    + "uf_cli,"
                    + "cep_cli,"
                    + "telefone_cli"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelcliente = new ModelClientes();
                modelcliente.setId_cliente(this.getResultSet().getInt(1));
                modelcliente.setNome_cli(this.getResultSet().getString(2));
                modelcliente.setEndereco_cli(this.getResultSet().getString(3));
                modelcliente.setBairro_cli(this.getResultSet().getString(4));
                modelcliente.setCidade_cli(this.getResultSet().getString(5));
                modelcliente.setUf_cli(this.getResultSet().getString(6));
                modelcliente.setCep_cli(this.getResultSet().getString(7));
                modelcliente.setTelefone_cli(this.getResultSet().getString(8));
                listamodelcliente.add(modelcliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelcliente;
    }

    /**
    * atualiza cliente
    * @param pModelcliente
    * return boolean
    */
    public boolean atualizarclienteDAO(ModelClientes pModelcliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelcliente.getId_cliente() + "',"
                    + "nome_cli = '" + pModelcliente.getNome_cli() + "',"
                    + "endereco_cli = '" + pModelcliente.getEndereco_cli() + "',"
                    + "bairro_cli = '" + pModelcliente.getBairro_cli() + "',"
                    + "cidade_cli = '" + pModelcliente.getCidade_cli() + "',"
                    + "uf_cli = '" + pModelcliente.getUf_cli() + "',"
                    + "cep_cli = '" + pModelcliente.getCep_cli() + "',"
                    + "telefone_cli = '" + pModelcliente.getTelefone_cli() + "'"
                + " WHERE "
                    + "pk_id_cliente = '" + pModelcliente.getId_cliente() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui cliente
    * @param pId_cliente
    * return boolean
    */
    public boolean excluirclienteDAO(int pId_cliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_cliente WHERE pk_id_cliente = '" + pId_cliente + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}