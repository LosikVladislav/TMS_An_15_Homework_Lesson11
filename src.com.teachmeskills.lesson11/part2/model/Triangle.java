package part2.model;

public class Triangle extends Figure{
    //fields
    private double sideFirst, sideSecond, sideThird;
    //constructors
    public Triangle(double sideFirst, double sideSecond, double sideThird){
        this.sideFirst = sideFirst;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }
    //methods
    public double getPerimeter(){
        return sideFirst + sideSecond + sideThird;
    }
    public double getArea(){
        double semiPerimeter = (sideFirst + sideSecond + sideThird)/2;
        return Math.round(Math.sqrt(semiPerimeter * (semiPerimeter - sideFirst) * (semiPerimeter - sideSecond) * (semiPerimeter - sideThird)));
    }
}
