


public class Produto {
    
    public int id;
    public String nome;
    public double preco;
    public String descricao;

    public Produto(int id, String nome, double preco, String descricao)
    {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
    }

    //Set's
    public void setNome(String nome)
    {   
        this.nome = nome;
    }
    public void setDescricao(String descricao)
    {   
        this.descricao = descricao;
    }
    public void setPreco(double preco)
    {   
        this.preco = preco;
    }

    //Get's
    
    public String getNome()
    {
        return nome;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public int getId()
    {
        return id;
    }

    public double getPreco()
    {
        return preco;
    }
}


