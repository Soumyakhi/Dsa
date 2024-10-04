import java.util.Arrays;
import java.util.ArrayList;
public class BellmanFord {
    static class Edge {
        int source;
        int dest;
        int weight;
        Edge(int source,int dest,int weight){
            this.source=source;
            this.dest=dest;
            this.weight=weight;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }
    static void bellmanFord(ArrayList<BellmanFord.Edge>[] graph, int src,int V) {
        int dist[]=new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0]=0;
        for(int k=0;k<V-1;k++){
            for(int i=0;i<V;i++){
                for (Edge edge : graph[i]) {
                    int u=edge.source,v=edge.dest;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+edge.weight<dist[v]){
                        dist[v]=dist[u]+edge.weight;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
    public static void main(String[] args) {
        int V = 5;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        bellmanFord(graph, src,V);
        
    }
    
}
