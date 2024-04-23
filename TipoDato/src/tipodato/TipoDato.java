package TipoDato;
public class TipoDato {
    public static void main(String[] args) {
        //Cadena o Stings
        //Declarando
        String Nombre;
        int Edad;
        double Saldo;
        Object TodoTipoDato;
        /**boolean Estado;
           String nombre = "";  */      
       
        Nombre = "Miqueas Dan Vilcatoma Ochoa";
        Edad = 20;
        Saldo = 1000.34;
        TodoTipoDato = "Cadena";
        TodoTipoDato = 2;
        TodoTipoDato = true;
        TodoTipoDato = 23.23;
        //Imprimiendo
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
        System.out.println("Saldo: " + Saldo);
        System.out.println("Todo Tipo De Dato(Ultimo): " + TodoTipoDato);
    }
}