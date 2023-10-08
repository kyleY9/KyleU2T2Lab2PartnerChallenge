public class Triangle {

    // instance variables
    private int length;
    private int width;
    // constructors (these create objects)
    public Triangle(int len, int wid) {
        length = len;
        width = wid;
    }
    // methods
    public double returnArea() {
        return 0.5*(length*width);
    }
}
