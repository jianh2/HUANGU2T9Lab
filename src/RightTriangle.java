public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base2, double height2)
    {
        base = base2;
        height = height2;
    }

    public double hypotenuse()
    {
        double result = Math.sqrt(Math.pow (base, 2) + Math.pow(height, 2));

        return (result);
    }
}
