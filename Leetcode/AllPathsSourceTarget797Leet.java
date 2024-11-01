import java.util.ArrayList;

public class AllPathsSourceTarget797Leet {
    public ArrayList<ArrayList<Integer>> allPathsSourceTarget(int[][] graph) {
        ArrayList<ArrayList<Integer>> allPaths = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        currentPath.add(0);
        dfs(graph, 0, currentPath, allPaths);
        return allPaths;
    }
    
    private void dfs(int[][] graph, int currentNode, ArrayList<Integer> currentPath, ArrayList<ArrayList<Integer>> allPaths) {
        if (currentNode == graph.length - 1) {
            allPaths.add(new ArrayList<>(currentPath));
            return;
        }
        
        for (int nextNode : graph[currentNode]) {
            currentPath.add(nextNode);
            dfs(graph, nextNode, currentPath, allPaths);
            currentPath.remove(currentPath.size() - 1); // Backtrack
        }
    }
}
