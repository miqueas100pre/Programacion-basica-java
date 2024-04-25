package estructuradatos;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class EstructuraDatos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Salir = false;
        while(!Salir){
            System.out.println("Estructura de datos.");
            System.out.println("1. Array");
            System.out.println("2. ArrayList");
            System.out.println("3. HasMap");
            System.out.println("4. Salir");
            
            System.out.print("Ingrese una Opcion: ");
            int Opcion = scanner.nextInt();
            
            switch(Opcion){
                
                case 1:
                    System.out.println("Bienvenido a la Estructura de Datos(ED) Array");
                    int[] Edades = {12, 40, 30, 50, 7, 5, 60, 70, 100};
                    String[] Nombres = {"Daniel", "Marcos", "Diego", "Ariel"};
                    
                    //Longitud del Array
                    
                    System.out.println("Longitud Edades: " + Edades.length);
                    System.out.println("Longitud Edades: " + Nombres.length);
                                        
                    //Cambiar un Valor
                    
                    Edades[1] = 38;
                    Nombres[3] = "David";
                    
                    System.out.println("Nuevo Dato de Edades: " + Edades[1]);
                    System.out.println("Nuevo Dato de Nombres: " + Nombres[3]);
                    
                    
                    //Combertir un Array a String
                    
                    System.out.println(Arrays.toString(Edades));
                    System.out.println(Arrays.toString(Nombres));
                    
                    //Clonar
                    
                    int[] EdadesClon = Edades.clone();                    
                    System.out.println("Array Edades Clonado: " + Arrays.toString(EdadesClon));
                    
                    Salir = true;
                    break;
                   
                case 2:
                    System.out.println("Bienvenido a ArrayList");
                    
                    ArrayList<String> ListaNombres = new ArrayList<>();
                    
                     //Agreagar datos a la Lista
                    
                    ListaNombres.add("David");
                    ListaNombres.add("Marco");
                    ListaNombres.add("Julio");
                    
                    //Longitud de la Lista
                    
                    System.out.println("Tamanio de la Lista: " + ListaNombres.size());
                    
                    //Remober un elemento de la lista
                    
                    ListaNombres.remove(2);
                    
                    //Obtener un elemento de la Lista
                    
                    ListaNombres.get(1);
                    System.out.println("Elemento eliminado?: " + ListaNombres.get(1));
                    
                    //Comprobas si mi lista esta Vacia
                    
                    System.out.println("Lista esta Vacia?: " + ListaNombres.isEmpty());
                    
                    //Comprobar si un Elemento existe7
                    
                    System.out.println("Existen elementos?: " + ListaNombres.contains("David"));
                    System.out.println("Existen elementos?: " + ListaNombres.contains("Marco"));
                    System.out.println("Existen elementos?: " + ListaNombres.contains("Julio"));
                    
                    
                    Salir = true;
                    break;
                    
            default:
                
                break;
                    
            
            }
            
            
        }
        scanner.close();
    }
    
    
}
