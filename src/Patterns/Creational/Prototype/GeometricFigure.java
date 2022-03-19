package Patterns.Creational.Prototype;

class GeometricFigure implements Cloneable{
    //Packet privilege
    int x;
    int y;
    String color;

    @Override
    public String toString() {
        return "GeometricFigure{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public GeometricFigure clone() {
        try {
            GeometricFigure clone = (GeometricFigure) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
