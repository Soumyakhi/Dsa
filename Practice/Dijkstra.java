import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
public class Dijkstra {

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
        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 4, 3));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
        }
    static class Pair{
        int node,dist;
        Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }
    static void dijkstraUtil(ArrayList<Edge> []graph,int src,int V){
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{return a.dist-b.dist;});
        int []distArr=new int[V];
        Arrays.fill(distArr, Integer.MAX_VALUE);
        distArr[src]=0;
        pq.add(new Pair(0, 0));
        boolean isVisited[]=new boolean[V];
        while (!pq.isEmpty()) {
            Pair curr=pq.poll();
            if(!isVisited[curr.node]){
                isVisited[curr.node]=true;
                for (Edge e : graph[curr.node]) {
                    int u=e.source;
                    int v=e.dest;
                    if(distArr[u]+e.weight<distArr[v]){
                        distArr[v]=distArr[u]+e.weight;//relaxation
                        pq.offer(new Pair(v, distArr[v]));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(distArr));
    }
    public static void main(String[] args) {
        int v=6;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph);
        dijkstraUtil(graph, 0, v);
        
    }
}


