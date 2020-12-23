public class App {
    public static void main(String[] args) 
    {        
        double[] numeros = new double[6];
        for (int i = 0; i < 6; i++)
        {
            numeros[i] = Double.parseDouble(args[i]);
        }
        System.out.println("Conjunto: " + conjunto(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Maior valor: " + maior(numeros));
        System.out.println("Menor valor: " + menor(numeros));
    }

    public static String conjunto (double[] numeros)
    {
        String formatacaoConjunto = "";
        for (int i = 0; i < 6; i++)
        {
            if (i != 5)
            {
                formatacaoConjunto += numeros[i] + ", ";
            }
            else
            {
                formatacaoConjunto += numeros[i];
            }
        }
        return formatacaoConjunto;        
    }

    public static double media (double[] numeros)
    {
        Double formatacaoMedia = 0.0;
        for (int i = 0; i < 6; i++)
        {
            formatacaoMedia += numeros[i];
        }
        formatacaoMedia /= 6;
        return formatacaoMedia;        
    }

    public static double maior (double[] numeros)
    {
        Double formatacaoMaior = Double.MIN_VALUE;
        for (int i = 0; i < 6; i++)
        {
            if (numeros[i] > formatacaoMaior)
            {
                formatacaoMaior = numeros[i];
            }
        }
        return formatacaoMaior;        
    }

    public static double menor (double[] numeros)
    {
        Double formatacaoMenor = Double.MAX_VALUE;
        for (int i = 0; i < 6; i++)
        {
            if (numeros[i] < formatacaoMenor)
            {
                formatacaoMenor = numeros[i];
            }
        }
        return formatacaoMenor;
    }
}
