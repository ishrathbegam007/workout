public class looping {
    public static void main(String[] args) {

        // 1. FOR LOOP
        System.out.println("For Loop:");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2. WHILE LOOP
        System.out.println("While Loop:");

        int j = 1;

        while (j <= 5) {
            System.out.println(j);
            j++;
        }


        // 3. DO-WHILE LOOP
        System.out.println("Do-While Loop:");

        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 5);
    }
}
