package switchcase;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Chills Beef");
        System.out.println("1. Saludar");
        System.out.println("2. Despedir");
        System.out.println("3. Cobrar");
        System.out.println("4. Escapar");
        System.out.println("5. Salir");
        System.out.println("%%%%%%%%%%%%");
        System.out.print("Escoge una Opcion: ");
        
        Scanner scanner = new Scanner(System.in);
        int Opcion = scanner.nextInt();
            switch(Opcion){
            case 1: System.out.println("Buenos Dias.");
            break;
            
            case 2: System.out.println("Regrese Pronto.");
            break;
            
            case 3: System.out.println("Quiero que me pagues.");
            break;
            
            case 4: System.out.println("Se escapo...");
            break;
            
            case 5: System.out.println("Gracias por usar nuestro menu.");
            break;
            
            default:
                System.out.println("Ingrese una opcion Valida.");
                break;
        }
        scanner.close();
      }
    }
    

