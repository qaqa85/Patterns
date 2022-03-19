package Patterns.Structural.Adapter;

class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(10d);
        RoundPeg roundPeg = new RoundPeg(8d);
        RoundPeg roundPeg1 = new RoundPeg(12d);

        if (hole.fits(roundPeg)) System.out.println("First round peg fitted");
        if (hole.fits(roundPeg1)) System.out.println("Second round peg fitted");

        SquarePeg squarePeg = new SquarePeg(10d);
        SquarePeg squarePeg1 = new SquarePeg(14.5d);

//        we need to use adapters to check if pegs will fit into hole
        if (hole.fits(new SquarePegAdapter(squarePeg))) System.out.println("First square peg fitted");
        if (hole.fits(new SquarePegAdapter(squarePeg1))) System.out.println("Second square peg fitted");


    }
}
