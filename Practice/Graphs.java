import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graphs {
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
    static void createGraph(ArrayList<Edge> graph[],int vertexCount){
        for(int i=0;i<vertexCount;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));
        graph[6].add(new Edge(6, 5, 1));
    }
    static void findNeighbours(int vertexNo,ArrayList<Edge> graph[]){
        ArrayList<Edge> al=graph[vertexNo];
        for (Edge edge : al) {
            System.out.println("Neighbour : "+edge.dest+" , Weight : "+edge.weight);
        }
    }
    static void bfs(ArrayList<Edge> graph[],int vertexCount){
        Queue<Integer> q=new LinkedList<>();
        boolean isVisited[]=new boolean[vertexCount];
        q.add(0);
        while (!q.isEmpty()) {
            int x=q.poll();
            if(!isVisited[x]){
                System.out.print(" "+x+" ");
                ArrayList<Edge> al=graph[x];
                for (Edge edge : al) {
                    q.add(edge.dest);
                }
                isVisited[x]=true;
            }
        }
        System.out.println();
    }
    static void dfs(ArrayList<Edge> graph[],boolean[] isVisited,int current){
        if(!isVisited[current]){
            System.out.print(" "+current);
            isVisited[current]=true;
            ArrayList<Edge> al=graph[current];
            for (Edge edge : al) {
                dfs(graph, isVisited, edge.dest);
            }
        }
    }
    static void allPath(ArrayList<Edge> graph[],boolean[] isVisited,int current,int dest,String path){
        if(current==dest){
            System.out.println(path+current);
            return;
        }
        if(!isVisited[current]){
            isVisited[current]=true;
            path+=current;
            ArrayList<Edge> al=graph[current];
            for (Edge edge : al) {
                allPath(graph, isVisited, edge.dest,dest,path);
            }
            isVisited[current]=false;
        }
    }
    public static void main(String[] args) {
        int v=7;
        @SuppressWarnings("all")
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);
        System.out.println("neighbours of 2 are");
        findNeighbours(2, graph);
        System.out.print("Bfs :");
        bfs(graph, v);
        System.out.print("dfs :");
        boolean isVisited[]=new boolean[v];
        dfs(graph, isVisited, 0);
        System.out.println();
        System.out.println("All Paths from Source 0 to Dest 5 :");
        isVisited=new boolean[v];
        allPath(graph, isVisited, 0, 5, "");
    }
}
