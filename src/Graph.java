import javafx.util.Pair;

import java.util.*;

public class Graph {
    private List<String> name;
    private List<List<Integer>> matrix;

    public Graph(List<List<Integer>> a, List<String> b) {
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < a.get(i).size(); j++) {
                List<Integer> list = matrix.get(i);
                list.add(a.get(i).get(j));
                matrix.set(i, list);
            }
        }
        List<String> name = new ArrayList<>();
        for (int i = 0; i < b.size(); i++) {
            name.add(b.get(i));
        }
        this.matrix = matrix;
        this.name = name;
        int i, size = matrix.size();
        for (i = 0; i < matrix.size(); i++) {
            if (matrix.get(i).size() > size) size = matrix.get(i).size();
        }
        for (i = 0; i < name.size(); i++)
            if (this.matrix.size() <= i) {
                this.matrix.add(new ArrayList<>());
            }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Graph)) return false;

        Graph graph = (Graph) o;

        if (!getMatrix().equals(graph.getMatrix())) return false;
        return getName().equals(graph.getName());
    }

    @Override
    public int hashCode() {
        int result = getMatrix().hashCode();
        result = 31 * result + getName().hashCode();
        return result;
    }

    public List<List<Integer>> getMatrix() {
        List<List<Integer>> mmm = new ArrayList<>();
        for (int i = 0; i < this.getSize(); i++) {
            mmm.add(new ArrayList<>());
            for (int j = 0; j < this.getSize(); j++) {
                List<Integer> list = mmm.get(i);
                list.add(this.matrix.get(i).get(j));
                mmm.set(i, list);
            }
        }
        return mmm;
    }

    public List<String> getName() {
        List<String> str = new ArrayList<>();
        for (int i = 0; i < this.getSize(); i++) {
            str.add(this.name.get(i));
        }
        return str;
    }

    public int getSize() {
        return this.matrix.size();
    }

    @Override
    public String toString() {
        int i, j, k, p;
        StringBuilder sb = new StringBuilder();
        if (this.getSize() == 0) {
            sb.append("Пустой граф" + "\n");
        } else {
            sb.append(" ");
            for (i = 0; i < this.name.size(); i++) {
                sb.append(this.name.get(i));
                   sb.append(" ");
            }
            sb.append("\n");
            for (i = 0; i < this.name.size(); i++) {
                sb.append(this.name.get(i));
                for (j = 0; j < this.name.size(); j++) {
                    if (this.matrix.get(i).get(j) != null) {
                        sb.append(this.matrix.get(i).get(j));

                        p = this.matrix.get(i).get(j);
                        if (p < 0) p = -p * 10;
                        k = 0;
                        while (p > 0) {
                            p /= 10;
                            k++;
                        }
                        if (k == 0) k = 1;
                            sb.append(" ");
                    } else sb.append("- ");
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    private Graph help() {
        int i;
        int size = this.name.size();
        if (this.matrix.size() > this.name.size()) size = this.matrix.size();
        for (i = 0; i < this.matrix.size(); i++) {
            if (this.matrix.get(i).size() > size) size = this.matrix.get(i).size();
        }
        for (i = this.name.size(); i < size; i++) {
            String str2 = java.lang.Integer.toString(i + 1);
            this.name.add(str2);
        }
        for (i = 0; i < this.name.size(); i++)
            if (this.name.lastIndexOf(this.name.get(i)) != i) throw new IllegalArgumentException("Повторение имени");
        List<List<Integer>> mat = this.matrix;
        for (i = 0; i < size; i++)
            if (i >= this.matrix.size()) mat.add(new ArrayList<>());
        this.matrix = mat;
        for (i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (j >= this.matrix.get(i).size()) {
                    List<Integer> list = this.matrix.get(i);
                    list.add(null);
                    mat.set(i, list);
                }
        this.matrix = mat;
        return this;
    }

    public List<Pair<String, Integer>> output(String a) {
        int i, point;
        point = this.name.indexOf(a);
        if (point == -1) throw new IllegalArgumentException("Нет такой вершины");
        List<Pair<String, Integer>> list = new ArrayList<>();
        for (i = 0; i < this.getSize(); i++) {
            if (this.matrix.get(i).get(point) != null) {
                list.add(new Pair(this.name.get(i), this.matrix.get(i).get(point)));
            }
        }
        return list;
    }

    public List<Pair<String, Integer>> input(String b) {
        int i, point;
        point = this.name.indexOf(b);
        if (point == -1) throw new IllegalArgumentException("Нет такой вершины");
        List<Pair<String, Integer>> list = new ArrayList<>();
        for (i = 0; i < this.getSize(); i++) {
            if (this.matrix.get(i).get(point) != null) {
                list.add(new Pair(this.name.get(i), this.matrix.get(point).get(i)));
            }
        }
        return list;
    }

    public Graph addTrack(String begin, String end, Integer length) {
        int end1 = this.name.indexOf(end);
        int begin1 = this.name.indexOf(begin);
        if ((end1 == -1) || (begin1 == -1))
            throw new IllegalArgumentException("Не существует вершины");
        List<Integer> list = this.matrix.get(end1);
        list.remove(begin1);
        list.add(begin1, length);
        this.matrix.set(end1, list);
        return help();
    }

    public Graph deleteTrack(String begin, String end) {
        this.addTrack(begin, end, null);
        return this;
    }

    public Graph renameTrack(String begin, String end, Integer length) {
        return this.addTrack(begin, end, length);
    }

    public Graph addPoint(String point) {
        this.name.add(point);
        return help();
    }

    public Graph deletePoint(String point) {
        int i, Point;
        Point = this.name.indexOf(point);
        if (Point == -1)
            throw new IllegalArgumentException("Вершины не существует");
        for (i = 0; i < this.matrix.size(); i++) {
            List<Integer> list = this.matrix.get(i);
            list.remove(Point);
            this.matrix.set(i, list);
        }
        this.matrix.remove(Point);
        this.name.remove(Point);
        return this;
    }

    public Graph renamePoint(String name1, String name2) {
        int end1 = this.name.indexOf(name1);
        if (end1 == -1)
            throw new IllegalArgumentException("Вершины не существует");
        this.name.set(end1, name2);
        return help();
    }
}