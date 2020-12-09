import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double resultado = 0;
        double num1 = 0;
        double num2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual operacao voce deseja realizar?");
        String operacao = scanner.next();
        System.out.println("Entre com o primeiro numero:");
        num1 = scanner.nextDouble();
        System.out.println("Entre com o segundo numero:");
        num2 = scanner.nextDouble();

        if (operacao.equals("soma") || operacao.equals("Soma"))
        {
            resultado = soma(num1, num2);
        }
        else if (operacao.equals("subtracao") || operacao.equals("Subtracao"))
        {
            resultado = subtracao(num1, num2);
        }
        else if (operacao.equals("multiplicacao") || operacao.equals("Multiplicacao"))
        {
            resultado = multiplicacao(num1, num2);
        }
        else if (operacao.equals("divisao") || operacao.equals("Divisao"))
        {
            resultado = divisao(num1, num2);
        }
        System.out.println(resultado);
    }

    public static double soma(double num1, double num2)
    {
        return num1 + num2;        
    }

    public static double subtracao(double num1, double num2)
    {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2)
    {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2)
    {
        return num1 / num2;
    }
}
