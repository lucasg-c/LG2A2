public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    //extends: sempre que um objeto Gerente for criado, ele
    //  possuirá, também, os atributos de um objeto Funcionario
    //  definidos na classe Funcionario.

    public boolean autentica (int senha)
    {
        if (this.senha == senha)
        {
            System.out.println("Acesso permitido!");
            return true;
        }
        else
        {
            System.out.println("Acesso negado!");
            return false;
        }
    }

    public void setSenha (int senha)
    {
        this.senha = senha;
    }

    //overriding methods
    //getBonificacao() da classe Gerente está sobrescrevendo
    //  o método getBonificacao() da classe Funcionario
    @Override 
    public double getBonificacao()
    {
        //return super.getBonificacao() + 1000;
        return this.salario * 1.4 + 1000;
    }
    //Override é usado p indicar/explicitar que um método da subclasse
    //  está reescrevendo um método da superclasse
    //Super é usado p, em uma subclasse,
    //  chamar métodos de uma superclasse
}
