import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

public class Tests {
    public int size = 10;
    public String[] name2 = new String[size];
    public String[] name1 = new String[size];

    {
        name2[0] = "a";
        name2[1] = "b";
        name2[2] = "c";
        name2[3] = "d";
        name2[4] = "e";

        name1[0] = "a";
        name1[1] = "b";
        name1[2] = "c";
        name1[3] = "d";
        name1[4] = "e";
    }

    public int[][] matrix2 = new int[size][size];
    public int[][] matrix1 = new int[size][size];

    {
        for (int j = 0; j < size; j++)
            for (int i = 0; i < size; i++)
                matrix2[i][j] = 0;
        matrix2[2][1] = 1;
        matrix2[3][2] = 2;
        matrix2[4][3] = 3;
        matrix2[4][2] = 4;
        matrix2[3][4] = 5;
        matrix2[3][5] = 6;
        matrix2[1][3] = 7;
        matrix2[5][1] = 8;
        matrix2[2][5] = 9;

        matrix1[2][1] = 1;
        matrix1[3][2] = 2;
        matrix1[4][3] = 3;
        matrix1[4][2] = 4;
        matrix1[3][4] = 5;
        matrix1[3][5] = 6;
        matrix1[1][3] = 7;
        matrix1[5][1] = 8;
        matrix1[2][5] = 9;
    }

    @Test
    @Tag("addTrack")
    public void addTrack() {
        Graph asd = new Graph(matrix1, name1);
        matrix2[1][2] = 10;
        //System.out.print(asd.addTrack(10, "a", "b"));
        assertEquals(asd.addTrack(10, "a", "b"), new Graph(matrix2, name2));
    }

    @Test
    @Tag("deleteTrack")
    public void deleteTrack() {
        Graph asd = new Graph(matrix1, name1);
        matrix2[3][5] = 0;
        //System.out.print(asd.deleteTrack("c", "e"));
        assertEquals(asd.deleteTrack("c", "e"), new Graph(matrix2, name2));
    }

    @Test
    @Tag("renameTrack")
    public void renameTrack() {
        Graph asd = new Graph(matrix1, name1);
        matrix2[3][5] = 1;
        //System.out.print(asd.renameTrack(1, "c", "e"));
        assertEquals(asd.renameTrack(1, "c", "e"), new Graph(matrix2, name2));
    }

    @Test
    @Tag("addPoint")
    public void addPoint() {
        Graph asd = new Graph(matrix1, name1);
        name2[5] = "V";
        //System.out.print(asd.addPoint("V"));
        assertEquals(asd.addPoint("V"), new Graph(matrix2, name2));
    }

    @Test
    @Tag("deletePoint")
    public void deletePoint() {
        Graph asd = new Graph(matrix1, name1);
        name2[4] = null;
        matrix2[0][5] = 0;
        matrix2[1][5] = 0;
        matrix2[2][5] = 0;
        matrix2[3][5] = 0;
        matrix2[4][5] = 0;

        matrix2[5][0] = 0;
        matrix2[5][1] = 0;
        matrix2[5][2] = 0;
        matrix2[5][3] = 0;
        matrix2[5][4] = 0;
        //System.out.print(asd.deletePoint("e"));
        assertEquals(asd.deletePoint("e"), new Graph(matrix2, name2));
    }

    @Test
    @Tag("renamePoint")
    public void renamePoint() {
        Graph asd = new Graph(matrix1, name1);
        name2[4] = "V";
        //System.out.print(asd.renamePoint("e", "V"));
        assertEquals(asd.renamePoint("e", "V"), new Graph(matrix2, name2));
    }
}