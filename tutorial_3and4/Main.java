public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Messi", "P001");
        Person p2 = new Student("Neymar", "S001");
        Person p3 = new Lecturer("Suarez", "L001");

        p1.introduce();
        p2.introduce();
        p3.introduce();
    }
}