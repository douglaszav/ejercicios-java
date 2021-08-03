package flow_control;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //obtiene el valor de la tabla de multiplicar, ej. 1*x, 2*x, 3*x, etc.
            for (int j = 1; j <= 10; j++) { //obtiene el segundo valor de la tabla de multiplicar, ej. x*1, x*2, x*3, etc.
                System.out.print("\t" + i * j); //imprime el resultado de la multiplicación
            }
          System.out.println("\n");
        }
    }
}
