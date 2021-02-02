public class Main {
    public static void main(String[] args) 
    {
        Quadrado q1 = new Quadrado();
        q1.lado = 10.0;

        Quadrado q2 = new Quadrado();
        q2.lado = 15.5;

        System.out.println("Area do quadrado 1: " + q1.calcularArea());
        System.out.println("Perimetro do quadrado 1" + q1.calcularPerimetro());

        System.out.println("Area do quadrado 2: " + q2.calcularArea());
        System.out.println("Perimetro do quadrado 2: " + q2.calcularPerimetro());

        System.out.println("'O quadrado 1 pode conter o quadrado 2'? " + q1.podeConter(q2));
        System.out.println("'O quadrado 2 pode conter o quadrado 1'? " + q2.podeConter(q1));
        

        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 5.0;
        
        Retangulo r2 = new Retangulo();
        r2.base = 10.0;
        r2.altura = 37.9;

        System.out.println("Area do retangulo 1: " + r1.calcularArea());
        System.out.println("Perimetro do retangulo 1: " + r1.calcularPerimetro());

        System.out.println("'O retangulo 1 pode conter o retangulo 2'? " + r1.podeConter(r2));
        System.out.println("'O retangulo 1 pode conter o retangulo 2'? " + r2.podeConter(r1));

        Circulo c1 = new Circulo();
        c1.raio = 20.5;

        Circulo c2 = new Circulo();
        c2.raio = 15.0;

        System.out.println("Area do circulo 1: " + c1.calcularArea());
        System.out.println("Perimetro do circulo 1: " + c1.calcularPerimetro());

        System.out.println("Area do circulo 2: " + c2.calcularArea());
        System.out.println("Perimetro do circulo 2: " + c2.calcularPerimetro());



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
