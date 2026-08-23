package  Collectons;
import java.util.*;

public class SwimInRisingWater {

    public static int swimInWater(int[][] grid) {

        int n = grid.length;

        boolean[][] visited = new boolean[n][n];

        // {height, row, column}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Start from (0,0)
        pq.offer(new int[]{grid[0][0], 0, 0});

        visited[0][0] = true;

        int time = 0;

        int[][] directions = {
                {-1, 0},  // up
                {1, 0},   // down
                {0, -1},  // left
                {0, 1}    // right
        };

        while (!pq.isEmpty()) {

            int[] current = pq.poll();

            int height = current[0];
            int row = current[1];
            int col = current[2];

            // Water level must be at least this height
            time = Math.max(time, height);

            // Destination reached
            if (row == n - 1 && col == n - 1) {
                return time; 
            }

            // Visit neighbours
            for (int[] dir : directions) {

                int newRow = row + dir[0];
                int newCol = col + dir[1];

                // Check boundaries
                if (newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < n &&
                    !visited[newRow][newCol]) {

                    visited[newRow][newCol] = true;

                    pq.offer(new int[]{
                            grid[newRow][newCol],
                            newRow,
                            newCol
                    });
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {0, 2},
                {1, 3}
        };

        int result = swimInWater(grid);

        System.out.println("Minimum Time = " + result);
    }
}