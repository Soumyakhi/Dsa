import java.util.ArrayList;
import java.util.PriorityQueue;;
public class PrimsMST {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.wt = w;
        }
        @Override
        public int compareTo(Edge e2) {
        return this.wt - e2.wt;
        }
        }
        static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
        
        }
    public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        primAlgo(graph,V);
    }
    private static void primAlgo(ArrayList<PrimsMST.Edge>[] graph,int V) {
        int cost=0;
        boolean isVisited[]=new boolean[V];
        ArrayList<Edge> al=new ArrayList<>();
        PriorityQueue<Edge> pq=new PriorityQueue<>();
        pq.offer(new Edge(0,0,0));
        while (!pq.isEmpty()) {
            Edge edge=pq.poll();
            if(isVisited[edge.dest]){
                continue;
            }
            isVisited[edge.dest]=true;
            cost+=edge.wt;
            al.add(edge);
            for (Edge e : graph[edge.dest]) {
                if(!isVisited[e.dest]){
                    pq.offer(new Edge(e.src,e.dest,e.wt));
                }
            }
        }
        al.remove(0);
        for (Edge edge : al) {
            System.out.println(edge.src+"---->"+edge.dest);
        }
        System.out.println("MST cost is : "+cost);
    }
}
