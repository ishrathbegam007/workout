class Encapsulation {

    private String name;
    private int age;

    void setData(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Encapsulation s1 = new Encapsulation();

        s1.setData("Ishu", 19);
        s1.display();
    }
}