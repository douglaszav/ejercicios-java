package object_oriented;

public class Bottom2 extends Top {
    public Bottom2(String s) {
        super(s); //Se agrega la expresión "super" ya que esta clase extiende de Top
        System.out.println(s); // Se imprime el valor de "s" asignado en el método Main
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}