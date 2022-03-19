package Patterns.Creational.Prototype;

class demo {
    public static void main(String[] args) {
        GeometricFigure geometricFigure = new GeometricFigure();
        geometricFigure.x = 10;
        geometricFigure.y = 25;
        geometricFigure.color = "purple";

        GeometricFigure clone = geometricFigure.clone();

        System.out.println(clone);

        clone.y = 100;

        System.out.println(geometricFigure);

        GeometricFigure clone2 = clone.clone();

        System.out.println(clone2);
    }
}
