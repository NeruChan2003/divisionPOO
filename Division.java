public class Division {
    private int a, b, r;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void dividir() {
        r = a / b;
    }

    @Override
    public String toString() {
        return "Dividir [a=" + a + ", b=" + b + ", r=" + r + "]";
    }
}