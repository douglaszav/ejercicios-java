package assignments;

public class TestCast {
    public static void main(String[] args) {
        byte b1 = 2;
        //b1 = b1 + 10; *Aparece un error de casteo
        b1 += 10;

        byte b2 = 2;
        b2 += 10;

        System.out.println(b1 + " " + b2); //esto va a imprimir un "12 12"
    }
}
