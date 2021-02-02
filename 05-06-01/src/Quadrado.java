public class Quadrado 
{
    private double lado;

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado; //atribui à esse lado recebido o valor do atributo lado
        validarLado(lado);        
    }
    //set :: void; get :: valor de retorno do atributo

    private void validarLado(double valor)
    {
        if (lado <= 0.00)
        {
            throw new IllegalArgumentException("O lado deve ser maior que zero");
        }
    }

    public double calcularArea()
    {
        return lado * lado;
    }

    public double calcularPerimetro()
    {
        return 4 * lado;
    }

    public boolean podeConter(Quadrado q)
    {
        if (lado >= q.lado)
        {
            return true;
        }
        else
        {
            return false;
        }        
    }
}