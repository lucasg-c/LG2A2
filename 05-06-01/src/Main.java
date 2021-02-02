public class Main {
    public static void main(String[] args) 
    {
        System.out.println("QUADRADO");
        Quadrado q1 = new Quadrado();
        q1.setLado(10.00);

        Quadrado q2 = new Quadrado();
        q2.setLado(15.5);

        System.out.println("Area do quadrado 1: " + q1.calcularArea());
        System.out.println("Perimetro do quadrado 1" + q1.calcularPerimetro());

        System.out.println("Area do quadrado 2: " + q2.calcularArea());
        System.out.println("Perimetro do quadrado 2: " + q2.calcularPerimetro());

        System.out.println("'O quadrado 1 pode conter o quadrado 2'? " + q1.podeConter(q2));
        System.out.println("'O quadrado 2 pode conter o quadrado 1'? " + q2.podeConter(q1));
        
        System.out.println("");
        System.out.println("RETANGULO");
        Retangulo r1 = new Retangulo();        
        r1.setBase(10.0);        
        r1.setAltura(5.0);
        
        Retangulo r2 = new Retangulo();        
        r2.setBase(10.0);
        r2.setAltura(37.9);

        System.out.println("Area do retangulo 1: " + r1.calcularArea());
        System.out.println("Perimetro do retangulo 1: " + r1.calcularPerimetro());

        System.out.println("'O retangulo 1 pode conter o retangulo 2'. " + r1.podeConter(r2));
        System.out.println("'O retangulo 1 pode conter o retangulo 2'. " + r2.podeConter(r1));

        System.out.println("");
        System.out.println("CIRCULO");
        Circulo c1 = new Circulo();        
        c1.setRaio(20.5);

        Circulo c2 = new Circulo();
        c2.setRaio(15.0);

        System.out.println("Area do circulo 1: " + c1.calcularArea());
        System.out.println("Perimetro do circulo 1: " + c1.calcularPerimetro());

        System.out.println("Area do circulo 2: " + c2.calcularArea());
        System.out.println("Perimetro do circulo 2: " + c2.calcularPerimetro());
        
        System.out.println("");
        System.out.println("CONTA");
        Conta acc1 = new Conta(); //criação do objeto conta
        acc1.setNumero(1123);
        acc1.setSaldo(1500.00);
        acc1.setLimite(1000.00);

        Conta acc2 = new Conta(); //criação do objeto conta c2
        acc2.setNumero(3213);
        acc2.setSaldo(450.20);
        acc2.setLimite(600.0);

        acc1.sacar(300.00);
        System.out.println(acc1.getSaldo());

        acc1.depositar(150.00);
        System.out.println(acc1.getSaldo());

        acc1.transferir(351.00, acc2);
        System.out.println(acc1.getSaldo());
        System.out.println(acc2.getSaldo());

        acc1.sacar(100.00);
        System.out.println(acc1.getSaldo());

        
        
        System.out.println("");
        Conta acc6 = new Conta();//(0001, 500.00, 1000.0);
        acc6.setNumero(0001);
        acc6.setSaldo(500.00);
        acc6.setLimite(1000.0);
        System.out.println("Conta: " + acc6.getNumero());
        System.out.println("Saldo: " + acc6.getSaldo());
        System.out.println("Limite: " + acc6.getLimite());
        acc6.sacar(600);
        System.out.println("Saldo (apos -600): " + acc6.getSaldo());
        System.out.println("Limite: " + acc6.getLimite());
        acc6.sacar(900);
        System.out.println("Saldo (apos -900): " + acc6.getSaldo());
        System.out.println("Limite: " + acc6.getLimite());
        acc6.sacar(100);
        System.out.println("Saldo (apos -100): " + acc6.getSaldo());
        System.out.println("Limite: " + acc6.getLimite());
        
        
        //programacao procedural
        /*
        double ladoQuadrado1 = 10.0;
        double ladoQuadrado2 = 15.5;
        
        double areaQuadrado1 = calcularArea(ladoQuadrado1);
        double areaQuadrado2 = calcularArea(ladoQuadrado2);

        double perimetroQuadrado1 = calcularPerimetro(ladoQuadrado1);
        double perimetroQuadrado2 = calcularPerimetro(ladoQuadrado2);

        System.out.println(areaQuadrado1);
        System.out.println(perimetroQuadrado1);
        System.out.println(areaQuadrado2);
        System.out.println(perimetroQuadrado2);        
        */
    }

    //programacao procedural
    /*
    public static double calcularArea(double lado)
    {
        return lado * lado;
    }

    public static double calcularPerimetro(double lado)
    {
        return 4 * lado;
    }
    */
}