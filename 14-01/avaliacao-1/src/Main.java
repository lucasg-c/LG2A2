public class Main {
    public static void main(String[] args) throws Exception {

    Sessao s1 = new Sessao();
    Ingresso i1 = new Ingresso(true, 15.0);
    Ingresso i2 = new Ingresso(false, 30.0);
    Ingresso i3 = new Ingresso(true, 15.0);
    Ingresso i4 = new Ingresso(false, 30.0);
    Ingresso i5 = new Ingresso(false, 30.0);
    Ingresso i6 = new Ingresso(true, 15.0);
    Ingresso i7 = new Ingresso(true, 15.0);
    Ingresso i8 = new Ingresso(false, 30.0);
    Ingresso i9 = new Ingresso(true, 15.0);
    Ingresso i10 = new Ingresso(true, 15.0);
    
    s1.adicionar(i1);
    s1.adicionar(i2);
    s1.adicionar(i3);
    s1.adicionar(i4);
    s1.adicionar(i5);
    s1.adicionar(i6);
    s1.adicionar(i7);
    s1.adicionar(i9);
    s1.adicionar(i8);
    s1.adicionar(i10);

    System.out.println("Total de ingressos vendidos: " + s1.qtIngressos());
    System.out.println("Total de meia entradas vendidas: " + s1.qtMeiaEntradas());
    System.out.println("Total faturado: " + s1.totalFaturado());

    }
}
