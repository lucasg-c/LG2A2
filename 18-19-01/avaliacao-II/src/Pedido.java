import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private String cliente;
    private List<Item> itens;

    public Pedido (int numero, String cliente)
    {
        this.setNumero(numero);
        this.setCliente(cliente);
        this.itens = new ArrayList<>();
    }

    public void setNumero (int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setCliente (String cliente)
    {
        this.cliente = cliente;
    }

    public String getCliente()
    {
        return cliente;
    }

    public void addItem (Produto produto, int unidades)
    {
        Item item = new Item (produto, unidades);
        this.itens.add(item);
    }

    public BigDecimal getValorPedido()
    {
        BigDecimal valorPedido = new BigDecimal (0);
        
        for (int i = 0; i < itens.size(); i++)
        {
            valorPedido = valorPedido.add(itens.get(i).getValorItem());
        }

        return valorPedido;
    }

    public String getListaPedido()
    {
        String listaPedido = "";

        for (int i = 0; i < itens.size(); i++)
        {
            listaPedido += "- " +  itens.get(i) + "\n";
        }

        return listaPedido;
    }

    @Override
    public String toString()
    {
        return "Pedido " + numero + "\nCliente " + cliente + "\nItens \n" + this.getListaPedido() + "Valor total do pedido: R$" + this.getValorPedido();
    }
}
