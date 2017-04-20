import java.util.Arrays;

/**
 * Created by вано on 13.04.2017.
 */

public class Polynom {
    private int[] coef;  // Коэффициенты
    private int deg;     // Степень полинома
    private int[] deg2;

    public Polynom(int a, int b) {  // a * x^b
        coef = new int[b + 1];
        coef[b] = a;
        deg = degree();
//        deg2[a] = b;
    }

    public int degree() {  // Возвращает степень этого многочлена
        int d = 0;
        for (int i = 0; i < coef.length; i++) {
            if (coef[i] != 0) d = i;
        }
        return d;
    }

    public Polynom plus(Polynom b) { //c = a + b
        Polynom a = this;
        Polynom c = new Polynom(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) c.coef[i] += a.coef[i];
        for (int i = 0; i <= b.deg; i++) c.coef[i] += b.coef[i];
        c.deg = c.degree();
        return c;
    }

    public Polynom minus(Polynom b) { //c = a - b
        Polynom a = this;
        Polynom c = new Polynom(0, Math.max(a.deg, b.deg));
        for (int i = 0; i <= a.deg; i++) c.coef[i] += a.coef[i];
        for (int i = 0; i <= b.deg; i++) c.coef[i] -= b.coef[i];
        c.deg = c.degree();
        return c;
    }

    public Polynom times(Polynom b) { // c = a * b
        Polynom a = this;
        Polynom c = new Polynom(0, a.deg + b.deg);
        for (int i = 0; i <= a.deg; i++)
            for (int j = 0; j <= b.deg; j++)
                c.coef[i + j] += (a.coef[i] * b.coef[j]);
        c.deg = c.degree();
        return c;
    }

    public boolean equality(Polynom b) { // проверка на равенство a и b
        Polynom a = this;
        if (a.deg != b.deg) return false;
        for (int i = a.deg; i >= 0; i--)
            if (a.coef[i] != b.coef[i]) return false;
        return true;
    }

    public int qwer(int x) { //расчитать значение при данном х
        Polynom a = this;
        int c = 0;
        for (int i = 0; i < a.deg + 1; i++) {
            c += a.coef[i] * Math.pow(x, i);
        }
        return c;
    }

    public Polynom dif(Polynom b) { // c = a / b
        Polynom a = this;
        Polynom c = new Polynom(0, a.deg);
        if (b.deg == 0) throw new IllegalArgumentException("Деление на 0");
        int x = a.deg,y = b.deg;
        for(int i = 0; i>x;i++)
            c.coef[i]=0;
        while (x >= y) {
            int d = a.coef[x] / b.coef[y];
            c.coef[x] = a.coef[x] - b.coef[y]*d;
            a.coef[x] = 0;
            for(int i = x-1; i >= x-y; i--){
                a.coef[i]=a.coef[i]-b.coef[y-1]*d;
            }
            x = x-1;
        }
        return c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polynom)) return false;

        Polynom polynom = (Polynom) o;

        if (deg != polynom.deg) return false;
        return Arrays.equals(coef, polynom.coef);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(coef);
        result = 31 * result + deg;
        return result;
    }

    @Override
    public String toString() {
        if (deg == 0) return "" + coef[0];
        if (deg == 1) return coef[1] + "x+" + coef[0];
        String s = coef[deg] + "x^" + deg;
        for (int i = deg - 1; i >= 0; i--) {
            if (coef[i] == 0) continue;
            else if (coef[i] > 0) s = s + "+" + (coef[i]);
            else if (coef[i] < 0) s = s + "-" + (-coef[i]);
            if (i == 1) s = s + "x";
            else if (i > 1) s = s + "x^" + i;
        }
        return s;
    }

    public static void main(String[] args) {
        Polynom zero = new Polynom(0, 0); // 0

        Polynom p1 = new Polynom(4, 3);
        Polynom p2 = new Polynom(3, 2);
        Polynom p3 = new Polynom(1, 0);
        Polynom p4 = new Polynom(2, 1);
        Polynom p = p1.plus(p2).plus(p3).plus(p4);   // 4x^3 + 3x^2 + 1

        Polynom q1 = new Polynom(3, 2);
        Polynom q2 = new Polynom(5, 0);
        Polynom q = q1.plus(q2);                     // 3x^2 + 5


        Polynom r = p.plus(q);
        Polynom s = p.times(q);

        System.out.println("zero(x) =     " + zero);
        System.out.println("p(x) =        " + p);
        System.out.println("q(x) =        " + q);
        System.out.println("p(x) + q(x) = " + r);
        System.out.println("p(x) * q(x) = " + s);
        System.out.println("0 - p(x)    = " + zero.minus(p));
    }
}