import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMinTimeRoomII3342Leet {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        int[][] dist = new int[n][m];
        // Initialize distance array with Integer.MAX_VALUE
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        // Directions for moving up, down, left, right
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        // Priority queue to store (time, x, y)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, 0, 0, 1}); // Start at (0, 0) with time 0

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int time = top[0], x = top[1], y = top[2], parity=top[3];
            // Mark the room as visited by setting the moveTime to -1
            moveTime[x][y] = -1;

            // If we reached the destination (bottom-right corner), return the time
            if (x == n - 1 && y == m - 1) {
                return time;
            }
            int nextParity = (parity == 1) ? 2 : 1;

            // Explore all 4 possible directions (up, down, left, right)
            for (int d = 0; d < 4; d++) {
                int n_x = x + dx[d];
                int n_y = y + dy[d];

                // Check if the new room is valid and not visited
                if (n_x < 0 || n_y < 0 || n_x >= n || n_y >= m || moveTime[n_x][n_y] == -1) {
                    continue;
                }

                // Calculate the new time to reach the neighboring room
                int time_n = Math.max(moveTime[n_x][n_y], time);

                // If we found a shorter time to reach (n_x, n_y), update and add to the queue
                if (dist[n_x][n_y] > time_n + parity) {
                    dist[n_x][n_y] = time_n + parity;
                    System.out.println(parity+","+nextParity);
                    pq.offer(new int[]{time_n + parity, n_x, n_y,nextParity});
                }
            }
        }

        // This line is redundant because we already return while processing the queue
        return dist[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int arr[][]={{0,4},{4,4}};
        System.out.println((new FindMinTimeRoomII3342Leet()).minTimeToReach(arr));
    }
}
