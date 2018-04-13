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
    
    public int salvarProdutosDao(ModelProdutos pModelProdutos){
        try{
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_produto("
                    + "nome_prod,"
                    + " valor_prod,"
                    + " estoque_prod"
                    + ")VALUES ("
                    + "'" + pModelProdutos.getNome_prod()+ "',"
                    + "'" + pModelProdutos.getValor_prod()+ "',"
                    + "'" + pModelProdutos.getEstoque_prod()+ "'"
                    );            
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
        
    }    
    
}
