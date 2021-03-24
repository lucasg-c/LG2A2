import java.math.BigDecimal;

public class Item {
    private String nome;
    private BigDecimal valorUnidade;
    private int unidades;
    private BigDecimal valorItem;

    public Item (Produto produto, int unidades)
    {
        this.setNome(produto);
        this.setValorUnidade(produto);
        this.setUnidades(unidades);
        this.setValorItem(produto, unidades);
    }

    public void setNome (Produto produto)
    {
        this.nome = produto.getNome();
    }
    
    public String getNome()
    {
        return nome;
    }

    public void setValorUnidade (Produto produto)
    {
        this.valorUnidade = produto.getValor();
    }

    public BigDecimal getValorUnidade()
    {
        return valorUnidade;
    }

    public void setUnidades (int unidades)
    {
        this.unidades = unidades;
    }

    public int getUnidades()
    {
        return unidades;
    }

    public void setValorItem (Produto produto, int unidades)
    {
        this.valorItem = produto.getValor().multiply(new BigDecimal(this.unidades));
    }

    public BigDecimal getValorItem()
    {
        return valorItem;
    }

    @Override
    public String toString()
    {
        return this.getNome() + ", valor unitário R$" + this.getValorUnidade() + ", " + this.getUnidades() + " unidades, valor total R$" + this.getValorItem();
    }
}
