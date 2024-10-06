package hw13;

public class triangle extends method{
    double leg1 ;
    double leg2;
    public triangle(double leg1, double leg2){
        this.leg1 = leg1;
        this.leg2 = leg2;
    }
    @Override
    public double getArea(){
        return leg1 * leg2 / 2;
    }
}