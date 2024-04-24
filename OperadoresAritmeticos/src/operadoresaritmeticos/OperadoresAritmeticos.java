package operadoresaritmeticos;
public class OperadoresAritmeticos { 
    public static void main(String[] args) {
        int variableUno = 50;
        int variableDos = 20;
        int variableSuma;
        int variableResta;
        int variableMultiplicacion;
        int variableDivision;
        int variablePotenciacion;
        int variableModulo;
        
        //Ingcremento
        //variableUno = variableUno + 1;
        /*variableUno ++;
        System.out.println(variableUno);
        
        //Decremento
        variableDos = variableDos -1;
        variableDos --;
        System.out.println("Decremento: " + variableDos);*/
        
        //Suma
        
        variableSuma = variableUno + variableDos;
        System.out.println("La Suma es: " + variableSuma);
        //Resta
        
        variableResta = variableUno - variableDos;
        System.out.println("La Resta es: " + variableResta);
        //Multiplicacion
        
        variableMultiplicacion = variableUno * variableDos;
        System.out.println("La Multiplicacion es: " + variableMultiplicacion);        
        //Division
        
        variableDivision = variableUno / variableDos;
        System.out.println("La Division es: " + variableDivision);
        //Potenciacion
        
        variablePotenciacion = variableUno * variableUno * variableUno;
        System.out.println("La Potenciacion al Cubo es: " + variablePotenciacion);
        //Modulo
        
        variableModulo = variableUno % variableDos;
        System.out.println("El Modulo es: " + variableModulo);
    }
}