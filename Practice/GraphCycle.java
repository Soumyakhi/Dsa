import java.util.ArrayList;
import java.util.Stack;
public class GraphCycle {
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
    static boolean cycleDirected(ArrayList<Edge> graph[],boolean[] isVisited,int current,boolean[] inStack){
        isVisited[current]=true;
        inStack[current]=true;
            ArrayList<Edge> al=graph[current];
            for (Edge edge : al) {
                if(inStack[edge.dest]){
                    return true;
                }
                if(!isVisited[edge.dest] && cycleDirected(graph, isVisited, edge.dest,inStack))
                {
                    return true;
                }   
        }
        inStack[current]=false;
        return false;
        
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
    static void createGraphDirected(ArrayList<Edge> graph[],int vertexCount){
        for(int i=0;i<vertexCount;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[4].add(new Edge(4, 3, 1));
    }
    static void createGraphUnDirected(ArrayList<Edge> graph[],int vertexCount){
        for(int i=0;i<vertexCount;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 2, 1));
        graph[4].add(new Edge(4, 2, 1));
    }
    static boolean cycleUnDirected(ArrayList<Edge> graph[],boolean[] isVisited,int current,int parent){
        isVisited[current]=true;
            ArrayList<Edge> al=graph[current];
            for (Edge edge : al) {
                if(!isVisited[edge.dest])
                {   if(cycleUnDirected(graph, isVisited, edge.dest,current)){
                        return true;
                    }  
                }
                else if(edge.dest!=parent){
                    return true;
                }   
        }
        return false;
    }
    public static void main(String[] args) {
        int v=5;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraphDirected(graph, v);
        boolean isVisited[]=new boolean[v];
        boolean detected=false;
        for(int i=0;i<graph.length;i++){
            detected=detected||cycleDirected(graph, isVisited, i, new boolean[v]);
        }
        System.out.println("Cycle present Directed : "+detected);
        isVisited=new boolean[v];
        Stack<Integer> st=new Stack<>();
        if(!detected){
            for(int i=0;i<graph.length;i++){
                if(!isVisited[i]){
                    topologicalSort(graph, isVisited, i, st);
                }
            }
            
            System.out.print("Topological sort res : ");
            while (!st.isEmpty()) {
                System.out.print(st.pop()+" ");
            }
        }
        System.out.println();
        @SuppressWarnings("all")
        ArrayList<Edge> graphUndriected[]=new ArrayList[v]; 
        createGraphUnDirected(graphUndriected, v);
        detected=false;
        isVisited=new boolean[v];
        for(int i=0;i<graph.length;i++){
            if(!isVisited[i]){
                detected=detected||cycleUnDirected(graphUndriected, isVisited, i, -1);
            }
        }
        System.out.println("Cycle present Undirected : "+detected);
    }
}
