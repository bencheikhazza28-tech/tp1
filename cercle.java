package tp2java;

public class cercle {
    final double pi = 3.14;
    double r;

    public cercle(double a) {
        this.r = a;
    }

    public double calculerSurface() {
        return 2 * pi * r;
    }

    public cercle() {
    }
}
