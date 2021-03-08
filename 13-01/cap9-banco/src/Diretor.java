public class Diretor extends Funcionario implements Autenticavel
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
}
