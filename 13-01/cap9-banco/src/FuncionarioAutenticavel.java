public class FuncionarioAutenticavel extends Funcionario
{
    int senha;
    
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

    @Override
    public double getBonificacao() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getSenha()
    {
        return senha;
    }
}
