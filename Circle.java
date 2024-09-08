/*+------------------------------------+
|               Circle               |
+------------------------------------+
| - radius: double                  |
+------------------------------------+
| + Circle()                        |
| + Circle(radius: double)          |
| + Circle(radius: double,          |
|   color: String, filled: boolean) |
| + getRadius(): double             |
| + setRadius(radius: double): void |
| + getArea(): double               |
| + getDiameter(): double           |
| + getPerimeter(): double          |
| + printCircle(): void             |
| + compareTo(other: Circle): int   |
| + equals(obj: Object): boolean    |
| + hashCode(): int                 |
+------------------------------------+
 */
public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    // Default constructor
    public Circle() {
        super(); 
    }

    // Constructor with radius
    public Circle(double radius) {
        super(); 
        this.radius = radius;
    }

    // Constructor with radius, color, and filled status
    public Circle(double radius, String color, boolean filled) {
        super(); 
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return the radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return the area of the circle */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return the diameter of the circle */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return the perimeter (circumference) of the circle */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle's information */
    public void printCircle() {
        System.out.println("The circle was created on " + getDateCreated() +
            " and has a radius of " + radius);
    }

    @Override
    public int compareTo(Circle other) {
        return Double.compare(this.radius, other.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return Double.compare(this.radius, other.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Double.hashCode(radius);
    }
}
