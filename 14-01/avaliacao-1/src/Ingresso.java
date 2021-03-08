public class Ingresso 
{
    private boolean meia;
    private double valor;

    public Ingresso (boolean meia, double valor)
    {
        this.setMeia(meia);
        this.setValor(valor);
    }

    public void setMeia (boolean meia)
    {
        this.meia = meia;
    }

    public void setValor (double valor)
    {
        this.valor = valor;
    }

    public boolean getMeia()
    {
        return meia;
    }

    public double getValor()
    {
        return valor;
    }
}
