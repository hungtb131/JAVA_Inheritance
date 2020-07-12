package JAVA_inheritance.Circle_Cylinder;

public class circle_cylinder {
    private double radius;
    private String color;

    public circle_cylinder(){

    }

    public circle_cylinder(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return  this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle has radius is " + this.radius + " and color is " + this.color;
    }
}

class Cylinder extends circle_cylinder{

    private double height;


    public Cylinder(){

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString(){
        return "A Cylinder has radius is " + super.getRadius() + " , color is " + super.getColor()
                + " and height is " + this.height;
    }
}
