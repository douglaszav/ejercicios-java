package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
    public static void main(String[] args) {

        Set<Integer> conjunto1 = new HashSet<Integer>();
        conjunto1.add(20);
        conjunto1.add(10);
        conjunto1.add(1);
        conjunto1.add(5);
        conjunto1.add(20);

        for (int elemento : conjunto1)
            System.out.println(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto2 = new TreeSet<Integer>();
        conjunto2.add(20);
        conjunto2.add(10);
        conjunto2.add(1);
        conjunto2.add(5);
        conjunto2.add(20);

        //Elementos se muestran de menor a mayor.
        for (int elemento : conjunto2)
            System.out.println(elemento + " - ");
        System.out.println();

        Set<Integer> conjunto3 = new LinkedHashSet<Integer>();
        conjunto3.add(20);
        conjunto3.add(10);
        conjunto3.add(1);
        conjunto3.add(5);
        conjunto3.add(20);

        //Elementos se muestran en el orden que se insertaron.
        for (int elemento : conjunto3)
            System.out.println(elemento + " - ");
        System.out.println();
    }
}

