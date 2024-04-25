package operadorescomparacion;
import java.util.Scanner;

public class OperadoresComparacion{ 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inserte primer Numero: ");
        int variableUno = scanner.nextInt();
        
        System.out.println("Inserte segundo Numero: ");
        int variableDos = scanner.nextInt();
        
        if (variableUno < variableDos){
            System.out.println("LA VARIABLE MAYOR ES: " + variableDos);
        }
        else if (variableUno > variableDos){
            System.out.println("LA VARIABLE MAYOR ES: " + variableUno);
        }
        else {
            System.out.println("LAS VARIABLES SON IGUALES");
        }
    }
}
