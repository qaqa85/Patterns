package Patterns.Structural.Adapter;

class SquarePeg {
    private double width;

    SquarePeg(double width) {
        this.width = width;
    }

    double getWidth() {
        return width;
    }

    double getSquareField() {
        return Math.pow(width, 2);
    }
}
