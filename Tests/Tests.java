import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    void plus(){
        Polynom a1 = new Polynom(4, 3);
        Polynom a2 = new Polynom(3, 2);
        Polynom a3 = new Polynom(2, 1);
        Polynom a4 = new Polynom(1, 0);
        Polynom a = a1.plus(a2).plus(a3).plus(a4);   // 4x^3 + 3x^2 + 2x + 1

        Polynom b1 = new Polynom(3, 2);
        Polynom b2 = new Polynom(5, 0);
        Polynom b = b1.plus(b2);                     // 3x^2 + 5

        Polynom c1 = new Polynom(4, 3);
        Polynom c2 = new Polynom(6, 2);
        Polynom c3 = new Polynom(2, 1);
        Polynom c4 = new Polynom(6, 0);
        Polynom c = c1.plus(c2).plus(c3).plus(c4);   //4x^3+6x^2+2x+6
        assertEquals(c,a.plus(b));
    }

    @Test
    void minus(){
        Polynom a1 = new Polynom(4, 3);
        Polynom a2 = new Polynom(3, 2);
        Polynom a3 = new Polynom(2, 1);
        Polynom a4 = new Polynom(1, 0);
        Polynom a = a1.plus(a2).plus(a3).plus(a4);   // 4x^3 + 3x^2 + 2x + 1

        Polynom b1 = new Polynom(3, 2);
        Polynom b2 = new Polynom(5, 0);
        Polynom b = b1.plus(b2);                     // 3x^2 + 5

        Polynom c1 = new Polynom(4, 3);
        Polynom c2 = new Polynom(2, 1);
        Polynom c3 = new Polynom(-4, 0);
        Polynom c = c1.plus(c2).plus(c3);            //4x^3+2x-4
        assertEquals(c,a.minus(b));
    }

    @Test
    void times(){
        Polynom a1 = new Polynom(4, 3);
        Polynom a2 = new Polynom(3, 2);
        Polynom a3 = new Polynom(2, 1);
        Polynom a4 = new Polynom(1, 0);
        Polynom a = a1.plus(a2).plus(a3).plus(a4);   // 4x^3 + 3x^2 + 2x + 1

        Polynom b1 = new Polynom(3, 2);
        Polynom b2 = new Polynom(5, 0);
        Polynom b = b1.plus(b2);                     // 3x^2 + 5

        Polynom c1 = new Polynom(12, 5);
        Polynom c2 = new Polynom(9, 4);
        Polynom c3 = new Polynom(26, 3);
        Polynom c4 = new Polynom(18, 2);
        Polynom c5 = new Polynom(10, 1);
        Polynom c6 = new Polynom(5, 0);
        Polynom c = c1.plus(c2).plus(c3).plus(c4).plus(c5).plus(c6); //12x^5+9x^4+26x^3+18x^2+10x+5
        assertEquals(c,a.times(b));
    }

    @Test
    void equality(){
        Polynom a1 = new Polynom(3, 2);
        Polynom a2 = new Polynom(5, 0);
        Polynom a = a1.plus(a2);                     // 3x^2 + 5

        Polynom b1 = new Polynom(3, 2);
        Polynom b2 = new Polynom(5, 0);
        Polynom b = b1.plus(b2);                     // 3x^2 + 5
        assertEquals(true,a.equality(b));

        Polynom c1 = new Polynom(9, 2);
        Polynom c = c1;                              // 9x^2
        assertEquals(false,b.equality(c));
    }

    @Test
    void qwer(){
        Polynom a1 = new Polynom(5,2);
        Polynom a2 = new Polynom(4,1);
        Polynom a3 = new Polynom(3,0);
        Polynom a = a1.plus(a2).plus(a3);            //5x^2+4x+3
        assertEquals(31,a.qwer(2));

        Polynom b1 = new Polynom(5,3);
        Polynom b2 = new Polynom(1,0);
        Polynom b = b1.plus(b2);            //5x^3+4x+1
        assertEquals(41,b.qwer(2));
    }

    @Test
    void dif(){
        Polynom a1 = new Polynom(1, 3);
        Polynom a2 = new Polynom(-12, 2);
        Polynom a3 = new Polynom(0, 1);
        Polynom a4 = new Polynom(-42, 0);
        Polynom a = a1.plus(a2).plus(a3).plus(a4);   // x^3-12x^2+42

        Polynom b1 = new Polynom(1, 1);
        Polynom b2 = new Polynom(-3, 0);
        Polynom b = b1.plus(b2);                     // x-3

        Polynom c1 = new Polynom(1, 2);
        Polynom c2 = new Polynom(-9, 1);
        Polynom c3 = new Polynom(-27, 0);
        Polynom c = c1.plus(c2).plus(c3);            //x^3-9x-27
        assertEquals(c,a.dif(b));
    }

}
