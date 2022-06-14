
package cwiczenia_11;

class Geometria {
    protected double[] strona;
    protected int[] stopien;
    private final double PI = Math.PI;

    public Geometria() {}
    public Geometria(double[] strona, int[] stopien) {
        if(strona.length != stopien.length) {
            throw new Error("Blad");
        }
        this.strona = strona;
        this.stopien = stopien;
    }

    protected double pobPi() {
        return PI;
    }
}

class Kolko extends Geometria {
    private int R;
    public Kolko(int R) {
        this.R = R;
    }

    public double S() {
        return super.pobPi() * Math.pow(R, 2);
    }
}

class Trojkat extends Geometria {
    public Trojkat() {}
    public Trojkat(double[] strony, int[] stopnieStron) {
        super(strony, stopnieStron);
        if(strony.length != 3) {throw new Error("Blad");}
        int sum = 0;
        for(int stopien : stopien) {
            sum += stopien;
        }
        if (sum != 180) {
            throw new Error("Blad");
        }
    }

    public double S() {
        return 0.5 * strona[0] * strona[1] * Math.sin( Math.toRadians((double) stopien[0]) );
    }
}

public class Zad1 {
    public static void main(String[] args) {
    	Kolko kol = new Kolko(4);
        System.out.println("S = " + kol.S());
        Trojkat t = new Trojkat(new double[]{5.0,2.0,4.0},new int[] {30,60,90});
        System.out.println("S = " + t.S());
        System.out.print("Modyfikacja pliku");
    }
}