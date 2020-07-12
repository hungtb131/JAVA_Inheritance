package JAVA_inheritance.Shape;

public class testShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red",false);
        System.out.println(shape);
        shape = new Shape("blue",true);
        System.out.println(shape);
        shape = new Shape("velvet",true);
        System.out.println(shape);
        shape = new Shape("violet",false);
        System.out.println(shape);
    }
}
