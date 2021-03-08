import java.util.ArrayList;

public class Sessao implements SessaoInterface
{
    private ArrayList<Ingresso> ingressos;
    
    public Sessao ()
    {
        this.ingressos = new ArrayList<>();
    }
    
    @Override
    public void adicionar (Ingresso ingresso)
    {
        this.ingressos.add(ingresso);
    }

    @Override
    public int qtIngressos()
    {
        return ingressos.size();
    }

    @Override
    public int qtMeiaEntradas()
    {
        int qtMeiaEntradas = 0;
        for (int i = 0; i < ingressos.size(); i++)
        {
            if (ingressos.get(i).getMeia() == true)
            {
                qtMeiaEntradas++;
            }
        }
        return qtMeiaEntradas;
    }

    @Override
    public double totalFaturado()
    {
        double totalFaturado = 0;
        for (int i = 0; i < ingressos.size(); i++)
        {
            totalFaturado += ingressos.get(i).getValor();
        }
        return totalFaturado;
    }
}
