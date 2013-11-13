/**
 * Created with IntelliJ IDEA.
 * User: Terence
 * Date: 13.11.13
 * Time: 14:13
 * To change this template use File | Settings | File Templates.
 */
public class Zeile {
    private double o;
    private double h;
    private double l;
    private double c;
    private String zeit;



    public String getZeit() {
        return zeit;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }



    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    public double getO() {
        return o;
    }

    public void setO(double o) {
        this.o = o;
    }

    public Zeile(String zeit, double o, double h,double l, double c ) {
        this.zeit=zeit;
        this.o=h;
        this.h=h;
        this.l=l;
        this.c=c;
    }
}
