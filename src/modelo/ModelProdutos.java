/*
 SISTEMAS DE VENDAS COM CONTROLE DE ESTOQUE - SiS VENDAS
 */
package modelo;
/*
  @author Andre Franklin
 */
public class ModelProdutos {
    
    private int id_produtos;
    private String nome_prod;
    private Double valor_prod;
    private int estoque_prod; 

    /**
     * @return the id_produtos
     */
    public int getId_produtos() {
        return id_produtos;
    }

    /**
     * @param id_produtos the id_produtos to set
     */
    public void setId_produtos(int id_produtos) {
        this.id_produtos = id_produtos;
    }

    /**
     * @return the nome_prod
     */
    public String getNome_prod() {
        return nome_prod;
    }

    /**
     * @param nome_prod the nome_prod to set
     */
    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    /**
     * @return the valor_prod
     */
    public Double getValor_prod() {
        return valor_prod;
    }

    /**
     * @param valor_prod the valor_prod to set
     */
    public void setValor_prod(Double valor_prod) {
        this.valor_prod = valor_prod;
    }

    /**
     * @return the estoque_prod
     */
    public int getEstoque_prod() {
        return estoque_prod;
    }

    /**
     * @param estoque_prod the estoque_prod to set
     */
    public void setEstoque_prod(int estoque_prod) {
        this.estoque_prod = estoque_prod;
    }
    
}
