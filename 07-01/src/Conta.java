public class Conta 
{
    private int numero;
    private double saldo;
    private double limite;

    public Conta(int numero, double saldo, double limite)
    {
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(limite);
    }

    public Conta(int numero)
    {
        this.setNumero(numero);
        this.setSaldo(0.0);
        this.setLimite(0.0);
    }

    public Conta(int numero, double saldo)
    {
        this.setNumero(numero);
        this.setSaldo(saldo);
        this.setLimite(0.0);
    }

    public void sacar (double valor)
    {
        validarValor(valor);
        validarSaque(valor);

        /*if (valor <= saldo)
        {*/
            saldo = saldo - valor;
        //}        
    }

    public void depositar (double valor)
    {
        validarValor(valor);
        saldo = saldo + valor;
    }

    public void transferir (double valor, Conta conta)
    {
        if (valor <= saldo)
        {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
        }
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setLimite(double limite)
    {
        this.limite = limite;
    }

    public double getLimite()
    {
        return limite;
    }

    private void validarValor(double valor) //private pois é um método que só essa classe tem interesse em validar valores, logo, nao sera disponivel no main, quadrado, etc
    {
        if (valor <= 0.00)
        {
            throw new IllegalArgumentException("O valor deve ser maior que zero");
        }
    }

    private void validarSaque(double valor)
    {        
        if (limite != 0 && (valor - saldo) > limite)
        {
            throw new IllegalArgumentException("O valor não deve exceder o limite");
        }
    }
}
