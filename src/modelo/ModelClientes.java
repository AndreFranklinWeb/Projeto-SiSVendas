package modelo;
/**
*
* @author Andre Franklin
*/
public class ModelClientes {

    private int id_cliente;
    private String nome_cli;
    private String endereco_cli;
    private String bairro_cli;
    private String cidade_cli;
    private String uf_cli;
    private String cep_cli;
    private String telefone_cli;

    /**
    * Construtor
    */
    public ModelClientes(){}

    /**
    * seta o valor de id_cliente
    * @param pId_cliente
    */
    public void setId_cliente(int pId_cliente){
        this.id_cliente = pId_cliente;
    }
    /**
    * return id_cliente
    */
    public int getId_cliente(){
        return this.id_cliente;
    }

    /**
    * seta o valor de nome_cli
    * @param pNome_cli
    */
    public void setNome_cli(String pNome_cli){
        this.nome_cli = pNome_cli;
    }
    /**
    * return nome_cli
    */
    public String getNome_cli(){
        return this.nome_cli;
    }

    /**
    * seta o valor de endereco_cli
    * @param pEndereco_cli
    */
    public void setEndereco_cli(String pEndereco_cli){
        this.endereco_cli = pEndereco_cli;
    }
    /**
    * return endereco_cli
    */
    public String getEndereco_cli(){
        return this.endereco_cli;
    }

    /**
    * seta o valor de bairro_cli
    * @param pBairro_cli
    */
    public void setBairro_cli(String pBairro_cli){
        this.bairro_cli = pBairro_cli;
    }
    /**
    * return bairro_cli
    */
    public String getBairro_cli(){
        return this.bairro_cli;
    }

    /**
    * seta o valor de cidade_cli
    * @param pCidade_cli
    */
    public void setCidade_cli(String pCidade_cli){
        this.cidade_cli = pCidade_cli;
    }
    /**
    * return cidade_cli
    */
    public String getCidade_cli(){
        return this.cidade_cli;
    }

    /**
    * seta o valor de uf_cli
    * @param pUf_cli
    */
    public void setUf_cli(String pUf_cli){
        this.uf_cli = pUf_cli;
    }
    /**
    * return uf_cli
    */
    public String getUf_cli(){
        return this.uf_cli;
    }

    /**
    * seta o valor de cep_cli
    * @param pCep_cli
    */
    public void setCep_cli(String pCep_cli){
        this.cep_cli = pCep_cli;
    }
    /**
    * return cep_cli
    */
    public String getCep_cli(){
        return this.cep_cli;
    }

    /**
    * seta o valor de telefone_cli
    * @param pTelefone_cli
    */
    public void setTelefone_cli(String pTelefone_cli){
        this.telefone_cli = pTelefone_cli;
    }
    /**
    * return telefone_cli
    */
    public String getTelefone_cli(){
        return this.telefone_cli;
    }

    @Override
    public String toString(){
        return "Modelcliente {" + "::id_cliente = " + this.id_cliente + "::nome_cli = " + this.nome_cli + "::endereco_cli = " + this.endereco_cli + "::bairro_cli = " + this.bairro_cli + "::cidade_cli = " + this.cidade_cli + "::uf_cli = " + this.uf_cli + "::cep_cli = " + this.cep_cli + "::telefone_cli = " + this.telefone_cli +  "}";
    }
}