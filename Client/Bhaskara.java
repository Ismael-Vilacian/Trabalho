package Client;

public class Bhaskara {
    
    private double delta;
    private double x1;
    private double x2;
    private double a;
    private double B;
    private double C;
    private boolean menorOuIgualZero;
    private boolean fim;

    public boolean isMenorOuIgualZero() {
        return menorOuIgualZero;
    }

    public void setMenorOuIgualZero(boolean menorOuIgualZero) {
        this.menorOuIgualZero = menorOuIgualZero;
    }

    public boolean isFim() {
        return fim;
    }

    public void setFim(boolean fim) {
        this.fim = fim;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        this.C = c;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        this.B = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
