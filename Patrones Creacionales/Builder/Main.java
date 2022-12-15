package builderhamburguesa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Director director = new Director();
        Scanner sc = new Scanner(System.in);
        System.out.print("Hamburguesas disponibles:\n1)Sencilla\n2)Pollo\n3)Vegetariana\nIngrese la opcion deseada:");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                director.setBuilder(new SencillaBuilder());
                break;
            case 2: 
                director.setBuilder(new PolloBuilder());
                break;
            case 3:
                director.setBuilder(new VegetarianaBuilder());
                break;
        }
        director.buildHamburguesa();
        System.out.println("Descripcion: "+director.getHamburguesa().getDetalles()); 
      
    }
}
