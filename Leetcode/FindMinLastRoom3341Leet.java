import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FindMinLastRoom3341Leet {
    /*Map<String,Integer> memo=new HashMap<>();
    public int minTimeToReach(int[][] moveTime) {
        boolean [][]isVisited=new boolean[moveTime.length][moveTime[0].length];
        return minTime(moveTime, 0, 0, 0, isVisited);
    }
    public int minTime(int[][] moveTime,int time,int i,int j,boolean[][] isVisited){
        if(i < 0 || i >= moveTime.length || j < 0 || j >= moveTime[0].length || isVisited[i][j]){
            return Integer.MAX_VALUE;
        }
        if(i==moveTime.length-1 && j==moveTime[0].length-1){
            return Math.max(time+1,1+moveTime[i][j]);
        }
        String key = i + "," + j + time;
        if(memo.containsKey(key)){
            return memo.get(key);
        }
        int currentTime=0;
        if(i!=0 || j!=0){
            currentTime=Math.max(time+1,1+moveTime[i][j]);
        }
        isVisited[i][j]=true;
        //up
        int up=minTime(moveTime, currentTime, i-1, j, isVisited);
        //down
        int down=minTime(moveTime, currentTime, i+1, j, isVisited);
        //left
        int left=minTime(moveTime, currentTime, i, j-1, isVisited);
        //right
        int right=minTime(moveTime, currentTime, i, j+1, isVisited);
        isVisited[i][j]=false;
        int res=Math.min(Math.min(left, right),Math.min(up, down));
        memo.put(key,res);
        return memo.get(key);
    }*/
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
        pq.offer(new int[]{0, 0, 0}); // Start at (0, 0) with time 0

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int time = top[0], x = top[1], y = top[2];

            // Mark the room as visited by setting the moveTime to -1
            moveTime[x][y] = -1;

            // If we reached the destination (bottom-right corner), return the time
            if (x == n - 1 && y == m - 1) {
                return time;
            }

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
                if (dist[n_x][n_y] > time_n + 1) {
                    dist[n_x][n_y] = time_n + 1;
                    pq.offer(new int[]{time_n + 1, n_x, n_y});
                }
            }
        }

        // This line is redundant because we already return while processing the queue
        return dist[n - 1][m - 1];
    }

    public static void main(String[] args) {
        int arr[][]={{0,4},{4,4}};
        System.out.println((new FindMinLastRoom3341Leet()).minTimeToReach(arr));
    }
}
