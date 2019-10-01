package Ulu;

public class PublicModifier {
    public int a = 2;
    public int b = 5;
    public int c = 9;

    public void kali() {
        int d = a * b * c;
        System.out.println("Hasil kali = " + d);
    }

    public void add() {
        int e = a + b + c;
        System.out.println("Hasil tambah = " + e);
    }

    public void minus() {
        if (a > b && a > c) {
            int f = a - b - c;
            System.out.println("Hasil pengurangan = " + f);
        } else if (b > a && b > c) {
            int f = a - b - c;
            System.out.println("Hasil pengurangan = " + f);
        } else {
            int f = c - a - b;
            System.out.println("Hasil pengurangan = " + f);
        }
    }

    public void devided() {
        float g = (float) c / a;
        float h = (float) c / b;
        float i = (float) b / a;
        float j = (float) b / c;
        float k = (float) a / b;
        float l = (float) a / c;
        System.out.println("Hasil bagi " + c + " dengan " + a + " = " + g);
        System.out.println("Hasil bagi " + c + " dengan " + b + " = " + h);
        System.out.println("Hasil bagi " + b + " dengan " + a + " = " + i);
        System.out.println("Hasil bagi " + b + " dengan " + c + " = " + String.format("%.2f", l));
        System.out.println("Hasil bagi " + a + " dengan " + b + " = " + k);
        System.out.println("Hasil bagi " + a + " dengan " + c + " = " + String.format("%.2f", l));
    }

    public void average() {
        float m = (float) (a + b + c) / 3;
        System.out.println("Hasil rata-rata = " + String.format("%.2f", m));
    }

}