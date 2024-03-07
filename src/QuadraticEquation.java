public class QuadraticEquation {
    private double heSoA;
    private double heSoB;
    private double heSoC;
    public QuadraticEquation() {}

    public QuadraticEquation(double heSoA, double heSoB, double heSoC) {
        this.heSoA = heSoA;
        this.heSoB = heSoB;
        this.heSoC = heSoC;
    }

    public double getHeSoA() {
        return heSoA;
    }

    public double getHeSoB() {
        return heSoB;
    }

    public double getHeSoC() {
        return heSoC;
    }

    public void setHeSoA(double heSoA) {
        this.heSoA = heSoA;
    }

    public void setHeSoB(double heSoB) {
        this.heSoB = heSoB;
    }

    public void setHeSoC(double heSoC) {
        this.heSoC = heSoC;
    }
    public double getDiscriminant(){
        double delta = heSoB*heSoB-4*heSoA*heSoC;
        return delta;
    }
    public double  getRoot1(){
        double delta = heSoB*heSoB-4*heSoA*heSoC;
        if (delta<0) {return 0;}
        else {
        double x1 = (-heSoB+Math.pow(delta,0.5))/(2*heSoA);
        return x1;}
    }
    public double  getRoot2(){
        double delta = heSoB*heSoB-4*heSoA*heSoC;
        if (delta<0) {return 0;}
        else {
            double x2 = (-heSoB-Math.pow(delta,0.5))/(2*heSoA);
            return x2;}
    }
}
