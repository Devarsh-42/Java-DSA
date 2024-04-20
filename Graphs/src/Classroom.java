import com.sun.tools.attach.VirtualMachine;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Classroom {
    static class Edge{
        int src;// Source
        int dest;// Destination
        int wt;// Weight

        public Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<7;i++){// Can Also import V ( here 5 )
            graph[i] = new ArrayList<>();// Creating a new Arraylist at ith idx of The Array
        }

        //0 - Vertex
        graph[0].add(new Edge(0,1,1));// Added an edge on 0th idx
        graph[0].add(new Edge(0,2,1));

        //1-Vertex
        graph[1].add(new Edge(1,1,1));
        graph[1].add(new Edge(1,3,1));

        //2 - Vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        //3 - Vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        //4 - Vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        //5 - Vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        //6- Vertex
        graph[6].add(new Edge(6,6,1));




        //2's neighbour
        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);// each e will b=have src, dest, wt
            System.out.println(e.dest);//dest == neighbours
        }
    }
    public static void BFS(ArrayList<Edge>[] graph){//O(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];

        q.add(0);// Source = 0

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!vis[curr]){ // visit curr, false initially
                System.out.print(curr + "\t");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++){// Adding all the neighbours of the curr
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void DFS(ArrayList<Edge> graph[], int curr, boolean visited[]){// curr --> vertex no
        //visiting the curr node
        System.out.print(curr + "\t");
        visited[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){// Not Visited
                DFS(graph,e.dest,visited);
            }
        }


    }
    public static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            //e.dest = neighbor
            if(!vis[e.dest] && hasPath(graph,e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        /*
              1 ---- 3
            /       | \
           0        |  5 ---- 6
            \       | /
             2 -----4

     */
        int V = 7; // Total no. of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];// Size of the Array (of ArrayList) == no of vertices
        //null --> empty arrayList
        createGraph(graph);
        System.out.println("BFS: ");
        BFS(graph);//TC: O(V +E)
        System.out.println("\nDFS: ");
        DFS(graph,0,new boolean[V]);// TC: O(V +E)

        boolean isPath = hasPath(graph,0,5,new boolean[V]);
        if(isPath){
            System.out.println("\nThe Path Exist!");
        }else{
            System.out.println("\nThe Path Doesn't exist");
        }

    }
}