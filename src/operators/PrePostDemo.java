package operators;

public class PrePostDemo {
    public static void main(String[] args){
        int i = 3;

        i++;
        System.out.println(i);    // "4"

        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6" *Se imprime 6 por que primero toma el valor de la "i" y después la incrementa*
        System.out.println(i);    // "7"

    }
}
