class Box {
    double width, height, depth;

    Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

public class exampleCOL {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5.0);
        Box b3 = new Box(1.0, 2.0, 3.0);
        System.out.println("the volume one is " + (b1.volume()));
        System.out.println("the volume is " + (b2.volume()));
        System.out.println("the volume 3 is " + (b3.volume()));

    }

}
