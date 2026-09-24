public interface Shape {
    double area();

    double perimeter();

    // Default method: implementing classes get this for free
    default void describe() {
        System.out.printf("%s -> area: %.2f, perimeter: %.2f%n",
                getClass().getSimpleName(), area(), perimeter());
    }
}