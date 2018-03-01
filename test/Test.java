import com.Circle;

public class Test {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        c1.describe();
        c2.describe();

        System.out.println("Distance: "+c1.distanceBetweenCircles(c2));
        System.out.println(c1.iscollised(c2));
    }
}
