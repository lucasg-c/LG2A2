public class Retangulo 
{
    private double base;
    private double altura;

    public Retangulo(double base, double altura)
    {
        //this.base = base;
        //this.altura = altura;
        this.setBase(base);
        this.setAltura(altura);
    }

    public Retangulo(double basealtura)
    {
        this.setBase(basealtura);
        this.setAltura(basealtura);
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {        
        validarBase(base);
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        validarAltura(altura);
        this.altura = altura;
    }

    private void validarBase(double base)
    {
        if (base <= 0.00)
        {
            throw new IllegalArgumentException("A base deve ser maior que zero");
        }
    }

    private void validarAltura(double altura)
    {
        if (altura <= 0.00)
        {
            throw new IllegalArgumentException("A altura deve ser maior que zero");
        }
    }

    public double calcularArea()
    {
        return base * altura;
    }

    public double calcularPerimetro()
    {
        return 2 * (base + altura);
    }

    public boolean podeConter(Retangulo r)
    {
        if (base >= r.base && altura >= r.altura)
        {
            return true;
        }
        else
        {
            return false;
        }        
    }
}
