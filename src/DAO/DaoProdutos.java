/*
 SiSVendas
 */
package DAO;

import conexao.ConexaoMySql;
import java.util.ArrayList;
import modelo.ModelProdutos;

/*
@author Andre Franklin
 */
public class DaoProdutos extends ConexaoMySql {

    /**
     * Cadastrar produtos no banco
     *
     * @param pModelProdutos
     * @return
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto("
                    + "nome_prod,"
                    + " valor_prod,"
                    + " estoque_prod"
                    + ")VALUES ("
                    + "'" + pModelProdutos.getNome_prod() + "',"                            
                    + "'" + pModelProdutos.getValor_prod() + "',"
                    + "'" + pModelProdutos.getEstoque_prod() + "')");
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Excluir produtos do banco
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_prod = '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    /**
     * Alterar dados do produtos
     *
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
             return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET "
                    + "nome_prod = '" + pModelProdutos.getNome_prod()+ "',"
                    + "valor_prod = '" + pModelProdutos.getValor_prod() + "',"
                    + "estoque_prod = '" + pModelProdutos.getEstoque_prod()+ "'"
                    + " WHERE pk_id_prod = '" + pModelProdutos.getId_produtos()+ "'"
            );
        } catch (Exception e) {
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Metodo vai retornar o produto pelo código
     * @param pIdProduto
     * @return
     */
    public ModelProdutos retornarProdutoDAO(int pIdProduto) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL("SELECT pk_id_prod, nome_prod, valor_prod, estoque_prod FROM tbl_produto WHERE pk_id_prod = '" + pIdProduto + "'");

            while (this.getResultSet().next()) {
                modelProdutos.setId_produtos(getResultSet().getInt(1));
                modelProdutos.setNome_prod(getResultSet().getString(2));
                modelProdutos.setValor_prod(getResultSet().getDouble(3));
                modelProdutos.setEstoque_prod(getResultSet().getInt(4));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
    
    /**
     * Metodo para retornar lista completa de Produto
     * @return 
     */
    public ArrayList<ModelProdutos> retornarListaProdutosDAO(){
        ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
        ModelProdutos modelProdutos = new ModelProdutos();
        
       try {
            this.conectar();
            this.executarSQL("SELECT pk_id_prod, nome_prod, valor_prod, estoque_prod FROM tbl_produto");
        
            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setId_produtos(getResultSet().getInt(1));
                modelProdutos.setNome_prod(getResultSet().getString(2));
                modelProdutos.setValor_prod(getResultSet().getDouble(3));
                modelProdutos.setEstoque_prod(getResultSet().getInt(4));
                listaModelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
           this.fecharConexao();
        }
        return listaModelProdutos;
    }    
}    