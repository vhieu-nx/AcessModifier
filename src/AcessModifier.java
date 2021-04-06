public class AcessModifier {
    final static  double PI =  3.14;
    private double radius = 1.0;
    private String color = "red";

    public AcessModifier() {
    }

    public AcessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius * radius * PI;
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

    public static void main(String[] args) {
        AcessModifier circle = new AcessModifier(1.1,"yellow");
        System.out.println(circle);
        System.out.println(circle.getRadius());
        circle.setColor("blue");
        circle.setRadius(4.4);
        System.out.println(circle);
        System.out.println("The radius is: " + circle.getRadius());
        System.out.println("The color is: " + circle.getColor());
        System.out.println("The area is: " + circle.getArea());

    }

}
