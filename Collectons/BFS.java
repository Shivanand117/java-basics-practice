package Collectons;
import java.util.*;

public class BFS {

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[graph.size()];

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbour : graph.get(current)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;

                    queue.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        int V = 6;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        graph.get(2).add(5);

        bfs(graph, 0);
    }
}