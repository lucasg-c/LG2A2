import java.math.BigDecimal;

public class Produto {
    private String nome;
    private BigDecimal valor;

    public Produto (String nome, BigDecimal valor)
    {
        this.setNome(nome);
        this.setValor(valor);
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setValor (BigDecimal valor)
    {
        this.valor = valor;
    }

    public BigDecimal getValor()
    {
        return valor;
    }

    @Override
    public String toString()
    {
        return this.getNome() + ", valor unitário R$" + this.getValor();
    }
}
