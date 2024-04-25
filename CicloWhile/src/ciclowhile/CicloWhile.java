package ciclowhile;

import java.util.Scanner;

public class CicloWhile {

    public static void main(String[] args) {

        boolean Salir = false;

        while (!Salir) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Bienvenido a Chills Beef");
            System.out.println("1. Saludar");
            System.out.println("2. Despedir");
            System.out.println("3. Cobrar");
            System.out.println("4. Escapar");
            System.out.println("5. Salir");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.print("Escoge una Opcion: ");

            Scanner scanner = new Scanner(System.in);
            int Opcion = scanner.nextInt();
            switch (Opcion) {
                case 1:
                    System.out.println("###########");
                    System.out.println("Buenos Dias.");
                    System.out.println("############");
                    break;

                case 2:
                    int[] numeros = {1, 2, 3, 4, 5};

                    for (int i = 0; i < numeros.length; i++) {
                        if (numeros[i] == 2) {
                            System.out.println("El numero es: " + numeros[i]);
                            System.out.println("Se a encontrado el numeros numero: " + numeros[i]);
                        } else {
                            System.out.println("El numero es: " + numeros[i]);
                            System.out.println("El numero no es 2");
                        }
                    }

                    /*Object[] NumerosLetras = {12, "Miqueas", 123.23, true, "Dan"};
                    
                    for(int i = 0 ; i < NumerosLetras.length ; i++){
                    System.out.println(NumerosLetras[i]);
                     }
                    /*for(Object nl: NumerosLetras){
                        System.out.println(nl);
                    }*/
                    System.out.println("###############");
                    System.out.println("Regrese Pronto.");
                    System.out.println("###############");

                    Salir = true;
                    break;

                /*case 3: System.out.println("#####################"); 
                System.out.println("Quiero que me pagues.");
                System.out.println("#####################"); 
            break;
            
            case 4: System.out.println("#############"); 
            System.out.println("Se escapo...");
            System.out.println("#############"); 
            break;

            case 5: System.out.println("##############################"); 
                    System.out.println("Gracias por usar nuestro menu.");
                    System.out.println("##############################"); 
                    System.out.println("##############################"); 
                    Salir = true;

            default:System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
                System.out.println("Ingrese una opcion Valida.");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
                break;*/
            }
        }
    }
}
