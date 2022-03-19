package Patterns.Structural.Adapter;

class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    double getRadius() {
        return ((peg.getWidth() / 2) * Math.sqrt(2));
    }
}
