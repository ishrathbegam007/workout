import java.util.Scanner;
class Usernamelength {
    public static void main(String[] args) {
        String name;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
        }

        System.out.println("Length = " + name.length());
    }
}