package fabrica;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Fabrica fabrica = new FabricaHamb();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hamburguesas disponibles:\n1)Sencilla\n2)Vegetariana\nIngrese la opcion deseada:");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                System.out.println(""+fabrica.getHamb("sencilla").getDetalles());
                break;
            case 2: 
                System.out.println(""+fabrica.getHamb("vegetariana").getDetalles());
                break;
        }
    }
}
