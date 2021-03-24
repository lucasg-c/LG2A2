import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("");
                
        Produto pro1 = new Produto("X-Salada Max", BigDecimal.valueOf(20D));
        Produto pro2 = new Produto("Refrigerante Cola", BigDecimal.valueOf(10D));

        System.out.println("Menu:");
        System.out.println(pro1);
        System.out.println(pro2);
        System.out.println("");
        
        Pedido ped1 = new Pedido(1123, "324.125.358-55");
        ped1.addItem(pro1, 2);
        ped1.addItem(pro2, 1);
        System.out.println(ped1);
    }
}
