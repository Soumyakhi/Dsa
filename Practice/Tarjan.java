import java.util.ArrayList;
public class Tarjan {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));
    
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
    
        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
    
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));
    
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
    
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
    }
    static int time=0;
    static void getBridge(ArrayList<Edge> []graph,int V){
        boolean isVisited[]=new boolean[V];
        int disc[]=new int[V];
        int low[]=new int[V];
        dfs(disc,low,graph,0,-1,isVisited);
    }
    static void dfs(int disc[],int low[],ArrayList<Edge> []graph,int current,int parent,boolean []isVisited){
        isVisited[current]=true;
        time++;
        disc[current]=time;
        low[current]=time;
        for (Edge edge : graph[current]) {
            if(edge.dest==parent){
                continue;
            }
            else if(isVisited[edge.dest]){
                low[current]=Math.min(low[current], disc[edge.dest]);
            }
            else{
                dfs(disc, low, graph, edge.dest, current, isVisited);
                low[current]=Math.min(low[current], low[edge.dest]);
                if(disc[current]<low[edge.dest]){
                    System.out.println("Bridge found "+edge.src+" ----- "+edge.dest);
                }
            }
        }
    }
    static void createGraphAp(ArrayList<Edge> []graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
    
        graph[1].add(new Edge(1, 0));
    
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
    
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
    
        graph[4].add(new Edge(4, 3));
    }
    public static void main(String args[]) {
        int V = 6;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println("Bridges :-");
        getBridge(graph, V);
        @SuppressWarnings("all")
        ArrayList<Edge> graph2[] = new ArrayList[5];
        createGraphAp(graph2);
        System.out.println("Articulation points :-");
        getAp(graph2,5);
    }
    private static void getAp(ArrayList<Edge>[] graph2, int V) {
        time=0;
        boolean isVisited[]=new boolean[V];
        int disc[]=new int[V];
        int low[]=new int[V];
        dfsAp(disc,low,graph2,0,-1,isVisited);
    }
    static void dfsAp(int disc[],int low[],ArrayList<Edge> []graph,int current,int parent,boolean []isVisited){
        isVisited[current]=true;
        time++;
        int children=0;
        disc[current]=time;
        low[current]=time;
        for (Edge edge : graph[current]) {
            if(edge.dest==parent){
                continue;
            }
            else if(isVisited[edge.dest]){
                low[current]=Math.min(low[current], disc[edge.dest]);
            }
            else{
                children++;
                dfsAp(disc, low, graph, edge.dest, current, isVisited);
                low[current]=Math.min(low[current], low[edge.dest]);
                if(disc[current]<=low[edge.dest] && parent!=-1){
                    System.out.println("Ap found "+current);
                }
            }
        }
        if(parent==-1 && children>1){
            System.out.println("Ap found "+current);
        }
    }
}
