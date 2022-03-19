package Patterns.Structural.Adapter;

class RoundHole {
    private double radius;

    RoundHole(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

    boolean fits(RoundPeg peg) {
        return (this.getRadius() >= peg.getRadius());
    }
}
