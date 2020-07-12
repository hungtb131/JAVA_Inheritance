package JAVA_inheritance.Circle_Cylinder;

public class circle_cylinder_test {
    public static void main(String[] args) {
        circle_cylinder circle = new circle_cylinder(5.0, "red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(10.0, "blue", 10);
        System.out.println(cylinder);
        System.out.println("Volume of cylinder is " + cylinder.getVolume());
    }
}
