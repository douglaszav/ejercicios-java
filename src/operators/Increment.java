package operators;

public class Increment {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;
        x *= x;
        y *= y;
        y *= y;
        x -= y;
        System.out.println(x);
    }
}
