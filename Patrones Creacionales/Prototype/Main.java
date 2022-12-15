package prototipo;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Prototipo> menus = new ArrayList<Prototipo>();
        Prototipo prototipoMenu = new Menu();
        
        System.out.println("Ingrese la cantidad de menus a producir");
        int num = sc.nextInt();
        for(int i  = 0; i < num; i++){
            menus.add(prototipoMenu.clonar());
        }
        System.out.println(menus.size()+" menus producidos");
    } 
}
