public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public void setNome (String nome)
    {
        this.nome = nome;
    }
    
    public void setCpf (String cpf)
    {
        this.cpf = cpf;
    }
    
    public void setSalario (double salario)
    {
        this.salario = salario;
    }

    public double getBonificacao()
    {
        return this.salario * 0.10;
    }
}
