package controller;

import DAO.DaoProdutos;
import java.util.ArrayList;
import modelo.ModelProdutos;

public class ControllerProdutos {
    
    private DaoProdutos daoProdutos = new DaoProdutos();
    /**
     * Salvar produto no frm_Controller
     * @param pModelProdutos
     * @return 
     */
    public int salvarProdutoController(ModelProdutos pModelProdutos){
       return this.daoProdutos.salvarProdutosDAO(pModelProdutos);        
    }
    /**
     * Excluir um produto pelo codigo.
     * @param pCodigo
     * @return 
     */
    public boolean excluirProdutoController(int pCodigo){
       return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    /**
     * Altera um produto
     * @param pModelProdutos
     * @return 
     */    
    public boolean alterarProdutoController(ModelProdutos pModelProdutos){
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    /**
     * Retorna 
     * @param pCodigo
     * @return 
     */
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    /**
     * retornar Lista de Produtos
     * @return pModelProdutos
     */
    public ArrayList<ModelProdutos> retornarListaProdutoController(){
        return this.daoProdutos.retornarListaProdutosDAO();
        
        
    } 
    
}
