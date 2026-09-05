class Search {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int search = 30;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Number found at index " + i);
            }
        }
    }
}