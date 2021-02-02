public class Quadrado 
{
    private double lado;

    public Quadrado(double lado)
    {
        this.setLado(lado);
    }
    //pros: pode garantir a validade do estado do objeto; valida parametros;
    //boa pratica/padrao: ter o mesmo nome do atributo e usar o this. para indicar que se trata do atributo;
    //                    construtor vir entre declaracao de variaveis e parametros;
    //                    usar setter no construtor para garantir validacoes;
    //para objeto imutavel: configurar o setter como private, assim, apenas a propria classe pode chamar esse parametro;

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado; //atribui à esse lado recebido o valor do atributo lado
        validarLado(lado);        
    }
    //set :: void; get :: tipo de retorno do atributo

    private void validarLado(double valor)
    {
        if (lado <= 0.0)
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
