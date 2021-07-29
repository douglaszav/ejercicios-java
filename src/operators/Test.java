package operators;

class Person { }

class Student {
    int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student){
            Student identificador =(Student) obj;
            if(this.id == identificador.id){
                return true;
            }
        }
        return false;
    }
}

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Student s1 = new Student(1001);
        Student s2 = new Student(1001);
        System.out.println(s1.equals(p));
        System.out.println(s1.equals(s2));
    }
}