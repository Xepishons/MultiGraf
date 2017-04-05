import static org.junit.jupiter.api.Assertions.assertEquals;

import javafx.util.Pair;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import java.util.ArrayList;
import java.util.List;

public class Tests {

    @Test
    @Tag("deletePoint")
    void deletePoint() {
        ArrayList<List<Integer>> matr = new ArrayList<>();
        List<Integer> matr1 = new ArrayList<>();
        matr1.add(0);
        matr1.add(4);
        matr1.add(2);
        matr1.add(-1);
        matr.add(matr1);
        List<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(7);
        matr2.add(6);
        matr.add(matr2);
        List<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(8);
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        Graph graph = new Graph(matr, nnnn);
        List<List<Integer>> matr0 = new ArrayList<>();
        ArrayList<Integer> matr12 = new ArrayList<>();
        matr12.add(0);
        matr12.add(4);
        matr12.add(-1);
        matr0.add(matr12);
        ArrayList<Integer> matr22 = new ArrayList<>();
        matr22.add(-1);
        matr22.add(0);
        matr22.add(6);
        matr0.add(matr22);
        ArrayList<Integer> matr32 = new ArrayList<>();
        matr32.add(-1);
        matr32.add(5);
        matr32.add(0);
        matr0.add(matr32);
        ArrayList<String> nnnn2 = new ArrayList<>();
        nnnn2.add("a");
        nnnn2.add("b");
        nnnn2.add("d");
        graph = new Graph(matr0, nnnn2);
        assertEquals(graphTest.deletePoint("c"), graph);
    }

    @Test
    @Tag("addPoint")
    void addPoint() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        matr1.add(0);
        matr1.add(2);
        matr1.add(1);
        matr1.add(null);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(8);
        matr2.add(0);
        matr2.add(1);
        matr2.add(null);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(3);
        matr3.add(2);
        matr3.add(0);
        matr3.add(null);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(null);
        matr4.add(null);
        matr4.add(null);
        matr4.add(null);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        Graph graph = new Graph(matr, nnnn);
        List<List<Integer>> matr0 = new ArrayList<>();
        ArrayList<Integer> matr12 = new ArrayList<>();
        matr12.add(0);
        matr12.add(2);
        matr12.add(1);
        matr0.add(matr12);
        ArrayList<Integer> matr22 = new ArrayList<>();
        matr22.add(8);
        matr22.add(0);
        matr22.add(1);
        matr0.add(matr22);
        ArrayList<Integer> matr32 = new ArrayList<>();
        matr32.add(3);
        matr32.add(2);
        matr32.add(0);
        matr0.add(matr32);
        ArrayList<String> nnnn2 = new ArrayList<>();
        nnnn2.add("a");
        nnnn2.add("b");
        nnnn2.add("c");

        graph = new Graph(matr0, nnnn2);
        assertEquals(graph.addPoint("d"), graphTest);
    }

    @Test
    @Tag("addTrack")
    void addTrack() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        matr1.add(0);
        matr1.add(4);
        matr1.add(2);
        matr1.add(2);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(7);
        matr2.add(6);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(8);
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        Graph graph = new Graph(matr, nnnn);
        List<List<Integer>> matr0 = new ArrayList<>();
        ArrayList<Integer> matr12 = new ArrayList<>();
        matr12.add(0);
        matr12.add(4);
        matr12.add(2);
        matr12.add(-1);
        matr0.add(matr12);
        ArrayList<Integer> matr22 = new ArrayList<>();
        matr22.add(-1);
        matr22.add(0);
        matr22.add(7);
        matr22.add(6);
        matr0.add(matr22);
        ArrayList<Integer> matr32 = new ArrayList<>();
        matr32.add(1);
        matr32.add(9);
        matr32.add(0);
        matr32.add(3);
        matr0.add(matr32);
        ArrayList<Integer> matr42 = new ArrayList<>();
        matr42.add(-1);
        matr42.add(5);
        matr42.add(8);
        matr42.add(0);
        matr0.add(matr42);
        ArrayList<String> nnnn2 = new ArrayList<>();
        nnnn2.add("a");
        nnnn2.add("b");
        nnnn2.add("c");
        nnnn2.add("d");
        graph = new Graph(matr0, nnnn2);
        assertEquals(graphTest, graph.addTrack("d", "a", 2));
    }

    @Test
    @Tag("renameTrack")
    void renameTrack() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        matr1.add(0);
        matr1.add(4);
        matr1.add(2);
        matr1.add(-1);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(7);
        matr2.add(6);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(10);
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        Graph graph = new Graph(matr, nnnn);
        List<List<Integer>> matr0 = new ArrayList<>();
        ArrayList<Integer> matr12 = new ArrayList<>();
        matr12.add(0);
        matr12.add(4);
        matr12.add(2);
        matr12.add(-1);
        matr0.add(matr12);
        ArrayList<Integer> matr22 = new ArrayList<>();
        matr22.add(-1);
        matr22.add(0);
        matr22.add(7);
        matr22.add(6);
        matr0.add(matr22);
        ArrayList<Integer> matr32 = new ArrayList<>();
        matr32.add(1);
        matr32.add(9);
        matr32.add(0);
        matr32.add(3);
        matr0.add(matr32);
        ArrayList<Integer> matr42 = new ArrayList<>();
        matr42.add(-1);
        matr42.add(5);
        matr42.add(8);
        matr42.add(0);
        matr0.add(matr42);
        ArrayList<String> nnnn2 = new ArrayList<>();
        nnnn2.add("a");
        nnnn2.add("b");
        nnnn2.add("c");
        nnnn2.add("d");
        graph = new Graph(matr0, nnnn2);
        assertEquals(graphTest, graph.renameTrack("c", "d", 10));
    }

    @Test
    @Tag("renameTrack")
    void deleteTrack() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        matr1.add(0);
        matr1.add(null);
        matr1.add(2);
        matr1.add(-1);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(7);
        matr2.add(6);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(8);
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        Graph graph = new Graph(matr, nnnn);
        List<List<Integer>> matr0 = new ArrayList<>();
        ArrayList<Integer> matr12 = new ArrayList<>();
        matr12.add(0);
        matr12.add(4);
        matr12.add(2);
        matr12.add(-1);
        matr0.add(matr12);
        ArrayList<Integer> matr22 = new ArrayList<>();
        matr22.add(-1);
        matr22.add(0);
        matr22.add(7);
        matr22.add(6);
        matr0.add(matr22);
        ArrayList<Integer> matr32 = new ArrayList<>();
        matr32.add(1);
        matr32.add(9);
        matr32.add(0);
        matr32.add(3);
        matr0.add(matr32);
        ArrayList<Integer> matr42 = new ArrayList<>();
        matr42.add(-1);
        matr42.add(5);
        matr42.add(8);
        matr42.add(0);
        matr0.add(matr42);
        ArrayList<String> nnnn2 = new ArrayList<>();
        nnnn2.add("a");
        nnnn2.add("b");
        nnnn2.add("c");
        nnnn2.add("d");
        graph = new Graph(matr0, nnnn2);
        assertEquals(graphTest, graph.deleteTrack("b", "a"));
    }

    @Test
    @Tag("input")
    void input() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        matr1.add(0);
        matr1.add(4);
        matr1.add(2);
        matr1.add(-1);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(7);
        matr2.add(6);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(8);
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        ArrayList<Pair<String, Integer>> test = new ArrayList<>();
        test.add(new Pair("a", -1));
        test.add(new Pair("b", 0));
        test.add(new Pair("c", 7));
        test.add(new Pair("d", 6));
        Graph graphTest = new Graph(matr, nnnn);
        assertEquals(graphTest.input("b"), test);
    }

    @Test
    @Tag("output")
    void output() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        ArrayList<Pair<String, Integer>> test = new ArrayList<>();
        matr1.add(0);
        matr1.add(4);
        matr1.add(2);
        test.add(new Pair("a", 2));
        matr1.add(-1);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(7);
        test.add(new Pair("b", 7));
        matr2.add(6);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        test.add(new Pair("c", 0));
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(8);
        test.add(new Pair("d", 8));
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        assertEquals(graphTest.output("c"), test);
    }

    @Test
    @Tag("renamePoint")
    void renamePoint() {
        List<List<Integer>> matr = new ArrayList<>();
        ArrayList<Integer> matr1 = new ArrayList<>();
        ArrayList<Integer> test = new ArrayList<>();
        matr1.add(0);
        matr1.add(4);
        matr1.add(2);
        matr1.add(10);
        matr.add(matr1);
        ArrayList<Integer> matr2 = new ArrayList<>();
        matr2.add(-1);
        matr2.add(0);
        matr2.add(-7);
        matr2.add(6);
        matr.add(matr2);
        ArrayList<Integer> matr3 = new ArrayList<>();
        matr3.add(1);
        matr3.add(9);
        matr3.add(0);
        matr3.add(3);
        matr.add(matr3);
        ArrayList<Integer> matr4 = new ArrayList<>();
        matr4.add(-1);
        matr4.add(5);
        matr4.add(8);
        matr4.add(0);
        matr.add(matr4);
        ArrayList<String> nnnn = new ArrayList<>();
        nnnn.add("a");
        nnnn.add("b");
        nnnn.add("c");
        nnnn.add("d");
        ArrayList<String> nnnnT = new ArrayList<>();
        nnnnT.add("a");
        nnnnT.add("b");
        nnnnT.add("f");
        nnnnT.add("d");
        Graph graphTest = new Graph(matr, nnnn);
        Graph graph = new Graph(matr, nnnnT);
        assertEquals(graphTest.renamePoint("c", "f"), graph);
    }

}
