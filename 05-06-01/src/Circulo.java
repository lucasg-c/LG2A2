public class Circulo 
{
    private double raio;
    
    public double calcularArea()
    {
        return Math.PI * (raio * raio);
    }

    public double calcularPerimetro()
    {
        return 2 * Math.PI * raio;
    }

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        validarRaio(raio);
        this.raio = raio;
    }

    private void validarRaio(double raio)
    {
        if (raio <= 0.0)
        {
            throw new IllegalArgumentException("O raio deve ser maior que zero");
        }
    }
}