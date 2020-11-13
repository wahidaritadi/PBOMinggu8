package com.pboreg;
abstract  class HitungLuas{
    protected double s1;
    protected double s2;
    public void setSisi(double s1){

    }
    public void setSisi(double s1, double s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    public double getS1(){
        return s1;
    }
    public double gets2(){
        return s2;
    }
    public abstract double getLuas();

}
class Segitiga extends HitungLuas {
    public double getLuas() {
        double luas = 0.5 * this.s1 * this.s2;
        return luas;
    }
}
class Lingkaran extends HitungLuas {
    public double getLuas(){
        double r = this.s1/2;
        double luas = 3.14 * r * r;
        return luas;
    }
}

public class RunLuas {
    public static void main (String[] args){
        Segitiga oSegitiga = new Segitiga();
        oSegitiga.setSisi(1,1);
        System.out.println("Luas Segitiga = 0.5 x " +
                oSegitiga.getS1() + " x " +
                oSegitiga.gets2() + " = " + oSegitiga.getLuas());

        Lingkaran oLing = new Lingkaran();
        oLing.setSisi(10);
        System.out.println("Luas Lingkaran = " + oLing.getLuas());
    }
}
