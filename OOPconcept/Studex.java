class Studex {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Studex s1 = new Studex();

        s1.name = "Ishu";
        s1.age = 19;

        s1.display();
    }
}
