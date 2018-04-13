/*
 SiSVendas
 */
package DAO;

import Conexao.ConexaoMySql;
import modelo.ModelProdutos;

/*
@author Andre Franklin
 */
public class DaoProdutos extends ConexaoMySql {

    /**
     * Cadastrar produtos no banco    
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
                    + "'" + pModelProdutos.getEstoque_prod() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }

    }

    /**     
     *Excluir produtos do banco
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_produto WHERE pk_id_produto = '" + pIdProduto + "'"
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
     * @param pModelProdutos
     * @return boolean
     */
    public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_produto SET"
                    + "nome_prod = '" + pModelProdutos.getNome_prod() + "',"
                    + " valor_prod = '" + pModelProdutos.getValor_prod() + "',"
                    + " estoque_prod= '" + pModelProdutos.getEstoque_prod() + "',"
                    + "WHERE pk_id_produto = '" + pModelProdutos.getId_produtos() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
