public class Graph {
    public int size = 6;
    public String[] name = new String[]{"_|", "a", "b", "c", "d", "e", "f"};
    public int[][] matrix = new int[size][size];

    {
        matrix[2][1] = 1;
        matrix[3][2] = 2;
        matrix[4][3] = 3;
        matrix[1][3] = 4;
        matrix[3][4] = 5;
        matrix[3][5] = 6;
        matrix[1][3] = 7;
        matrix[5][1] = 8;
        matrix[2][5] = 9;
    }

    public void create() {
        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {
                if (i == 0 & j == 0) System.out.print(name[j]);
                else if (i == 0) System.out.print(name[j] + " ");
                else if (j == 0) System.out.print(name[i] + " ");
                else if (i == j) System.out.print(0 + " ");
                else if (matrix[i][j] == 0) System.out.print("- ");
                else System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public void addTrack(Integer a, String b, String c) {
        int x = 0, y = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == b) x++;
            if (name[i] == c) y++;
        }
        matrix[x][y] = a;
    }

    public void deleteTrack(String b, String c) {
        int x = 0, y = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == b) x++;
            if (name[i] == c) y++;
        }
        matrix[x][y] = 0;
    }

    public void addPoint(String c) {
        size++;
        name[size] = c;
    }

    public void deletePoint(String b) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == b) {
                name[i] = "";
                x++;
            }
        }
        for (int i = 0; i < size; i++) {
            matrix[i][x] = 0;
            matrix[x][i] = 0;
        }
    }

    public void renamePoint(String b, String c) {
        for (int i = 0; i < size; i++) {
            if (name[i] == b) name[i] = c;
        }
    }
}