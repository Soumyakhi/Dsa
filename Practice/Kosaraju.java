import java.util.ArrayList;
import java.util.Stack;
public class Kosaraju {
    static class Edge {
        int src;
        int dest;
        public Edge(int s, int d) {
        this.src = s;
        this.dest = d;
        }
        }
        public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
        graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
    }
    static void topologicalSort(ArrayList<Edge> graph[],boolean[] isVisited,int current,Stack<Integer> inStack){
        isVisited[current]=true;
            ArrayList<Edge> al=graph[current];
            for (Edge edge : al) {
                if(!isVisited[edge.dest])
                {
                    topologicalSort(graph, isVisited, edge.dest, inStack);
                }  
        }   
        inStack.push(current); 
    }
    
    private static void kosaraju(ArrayList<Kosaraju.Edge>[] graph, int V) {
        Stack<Integer> st=new Stack<>();
        boolean []isVisited=new boolean[graph.length];
        for(int i=0; i<V; i++) {
            if(!isVisited[i]) {
                topologicalSort(graph, isVisited, i, st);
            }
        }
        @SuppressWarnings("all")
        ArrayList<Edge> []transPose=new ArrayList[V];
        for(int i=0;i<graph.length;i++){
            transPose[i]=new ArrayList<>();
        }
        for (ArrayList<Edge> arrayList : graph) {
            for (Edge edge : arrayList) {
                transPose[edge.dest].add(new Edge(edge.dest, edge.src));
            }
        }
        isVisited=new boolean[graph.length];
        System.out.println("Strongly Connected Components are : ");
        while (!st.isEmpty()) {
            int x=st.pop();
            if(!isVisited[x]){
                dfs(transPose,isVisited,x);
                System.out.println();
            } 
        }
    }
    static void dfs(ArrayList<Edge> []transPose,boolean []isVisited,int current){
        isVisited[current]=true;
        System.out.print(current+" ");
        for (Edge edge : transPose[current]) {
            if(!isVisited[edge.dest]){
                dfs(transPose, isVisited, edge.dest);
            }
        }
    }
    public static void main(String args[]) {
        int V = 5;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        kosaraju(graph, V);
    }
}
