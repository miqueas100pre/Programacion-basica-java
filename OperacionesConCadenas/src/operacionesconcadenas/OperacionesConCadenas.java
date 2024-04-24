package operacionesconcadenas;
public class OperacionesConCadenas {
    public static void main(String[] args) {
        String Nombres = "Miqueas Dan";
        String Apellidos = "Vilcatoma Ochoa";
        
        //Concatenar
        String nombreCompleto = Nombres + " " + Apellidos;
        System.out.println(nombreCompleto);
        System.out.println("Nombre completo: " + Nombres + " " + Apellidos);
        
        //Mayusculas
        System.out.println("Nombre completo Mayusculas: " + nombreCompleto.toUpperCase());
        
        //Minusculas
        System.out.println("Nombre completo Minusculas: " + nombreCompleto.toLowerCase());
        
        //Contar una cadena
        System.out.println("Nombre completo Cantidad de Caracteres: " + nombreCompleto.length());
        
        //Cortar una cadena
        String[] nombreCortado = nombreCompleto.split(" ");
        //["Miqueas","Dan","Vilcatoma","Ochoa"]
        //For con iteraciones e Indices
        for(int i = 0 ; i < nombreCortado.length ; i++){
            System.out.println(nombreCortado[i]);
        }
        
        //El for Easy
        for(String nombre : nombreCortado){
            System.out.println(nombre);
        }
        //System.out.println("Nombre completo Cortado: " + nombreCortado); (Este esta mal)
        
        //Equals
        boolean comparacionNombre = Nombres.equals(Apellidos);
        //boolean comparacionNombre = Nombres == Apellidos;(Es lo mismo)
        System.out.println("Comparacion de nombres es: " + comparacionNombre);
        
        //Interpolacion de Variables
        
        String n = "Miqueas";
        String a = "Vilcatoma";
        int e = 50;
        
        String mensaje = String.format("Mi nombre es %s, mi apellido es %s y tengo %d anios",n ,a, e);
        System.out.println(mensaje);
        
    }   
}
