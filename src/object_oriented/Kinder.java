package object_oriented;

public class Kinder extends AgedP {

    public Kinder(int x) {
        super(x);  //Se añade el super, ya que la clase Kinder extiende de AgedP
    }

    /** A gregué el método main para comprobar que el fujo del sistema estuviera funcionando
     * correctamente.
     */
    public static void main(String[] args) {
        new Kinder(17);
        System.out.println("El programa funciona correctamente.");

    }
}