public class Jumping {
    public static void main(String[] args) {

        // 1. BREAK
        System.out.println("BREAK:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }


        // 2. CONTINUE
        System.out.println("\nCONTINUE:");

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }


        // 3. RETURN
        System.out.println("\nRETURN:");

        showMessage();
    }

    static void showMessage() {
        System.out.println("Hello Java!");
        return;
    }
}
