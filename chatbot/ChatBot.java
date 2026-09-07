import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🤖 Bot: Hello! I am JavaBot.");
        System.out.println("🤖 Bot: What is your name?");

        String name = sc.nextLine();

        System.out.println("🤖 Bot: Nice to meet you, " + name + "!");
        System.out.println("🤖 Bot: How can I help you?");

        while (true) {

            String message = sc.nextLine().toLowerCase();

            if (message.equals("hello") || message.equals("hi")) {
                System.out.println("🤖 Bot: Hello " + name + "! 😊");
            }

            else if (message.equals("how are you")) {
                System.out.println("🤖 Bot: I am doing great! How about you?");
            }

            else if (message.equals("what is java")) {
                System.out.println("🤖 Bot: Java is a popular object-oriented programming language.");
            }

            else if (message.equals("bye")) {
                System.out.println("🤖 Bot: Bye " + name + "! Have a nice day! 👋");
                break;
            }

            else {
                System.out.println("🤖 Bot: Sorry, I don't understand that.");
            }
        }

        sc.close();
    }
}