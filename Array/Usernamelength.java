import java.util.Scanner;

class Usernamelength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Length = " + name.length());
    }
}