import java.util.List;

public class Main {
    public static void main(String[] args) {
        // The list type is the interface, so any Shape implementation fits
        List<Shape> shapes = List.of(
                new Circle(5),
                new Rectangle(4, 6)
        );

        for (Shape shape : shapes) {
            shape.describe();
        }

        double totalArea = shapes.stream().mapToDouble(Shape::area).sum();
        System.out.printf("Total area: %.2f%n", totalArea);
    }
}
