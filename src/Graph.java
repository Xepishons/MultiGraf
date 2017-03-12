import java.util.Arrays;

public class Graph {
    private int size = 10;
    private String[] name = new String[]{};
    private int[][] matrix = new int[size][size];

    public Graph(int[][] matrix, String[] name) {
        this.matrix = matrix;
        this.name = name;
    }

    public Graph addTrack(Integer length, String begin, String end) {
        int x = 0, y = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == begin) x = i + 1;
            if (name[i] == end) y = i + 1;
        }
        this.matrix[x][y] = length;
        return new Graph(this.matrix, this.name);
    }

    public Graph deleteTrack(String begin, String end) {
        int x = 0, y = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == begin) x = i + 1;
            if (name[i] == end) y = i + 1;
        }
        matrix[x][y] = 0;
        return new Graph(this.matrix, this.name);
    }

    public Graph renameTrack(Integer length, String begin, String end) {
        int x = 0, y = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == begin) x = i + 1;
            if (name[i] == end) y = i + 1;
        }
        matrix[x][y] = length;
        return new Graph(this.matrix, this.name);
    }

    public Graph addPoint(String point) {
        int x = 0;
        for (int i = 0; i < size; i++)
            if (name[i] == null) {
                x = i;
                break;
            }
        name[x] = point;
        return new Graph(this.matrix, this.name);
    }

    public Graph deletePoint(String point) {
        int x = 0;
        for (int i = 0; i < size; i++) {
            if (name[i] == point) {
                name[i] = null;
                x = i + 1;
            }
        }
        for (int i = 0; i < x; i++) {
            matrix[i][x] = 0;
            matrix[x][i] = 0;
        }
        return new Graph(this.matrix, this.name);
    }

    public Graph renamePoint(String name1, String name2) {
        for (int i = 0; i < size; i++) {
            if (name[i] == name1) name[i] = name2;
        }
        return new Graph(this.matrix, this.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Graph)) return false;

        Graph graph = (Graph) o;

        if (size != graph.size) return false;
        if (!Arrays.equals(name, graph.name)) return false;
        return Arrays.deepEquals(matrix, graph.matrix);
    }

    @Override
    public int hashCode() {
        int result = size;
        result = 31 * result + Arrays.hashCode(name);
        result = 31 * result + Arrays.deepHashCode(matrix);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (size == 0) {
            sb.append("Пустой граф" + "\n");
        } else {
            for (int j = 0; j < size; j++) {
                for (int i = 0; i < size; i++) {

                    if (i == 0 & j == 0) sb.append("_|");
                    else if (i == 0) sb.append(name[j - 1] + " ");
                    else if (j == 0) sb.append(name[i - 1] + " ");
                    else if (i == j) sb.append(0 + " ");
                    else if (matrix[i][j] == 0) sb.append("- ");
                    else sb.append(matrix[i][j] + " ");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }


}