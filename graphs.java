//rotten oranges 
class Solution {
    public int orangesRotting(int[][] grid) {
        int freshCount = 0;
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    freshCount++;
                }else if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        if(freshCount == 0){
            return 0;
        }
        int time = 0;
        while(!queue.isEmpty()){
            int currSize = queue.size();
            for(int i=0; i<currSize; i++){
                int rottenLoc[] = queue.poll();
                int r = rottenLoc[0];
                int c = rottenLoc[1];
                int neighbours[][] = {
                    {r-1,c},
                    {r,c+1},
                    {r+1,c},
                    {r,c-1}
                };
                for(int neighbour[] : neighbours){
                    int nr = neighbour[0];
                    int nc = neighbour[1];
                    if(nr < 0|| nr >= n || nc<0 || nc >= m || grid[nr][nc] == 2 || grid[nr][nc] == 0){
                        continue;
                    }
                    queue.offer(new int[]{nr,nc});
                    grid[nr][nc] = 2;
                }
            }
            time++;
            freshCount -= queue.size();
            if(freshCount == 0){
                break;
            }
        }
        return (freshCount == 0) ? time : -1;
    }
}
//topological sort
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int V = adj.size();
        return topoSort(V,adj);
    }
    public static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // Step 1: Create adjacency list
        

        // Step 2: Compute indegree
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        // Step 3: Add all nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        // Step 4: Kahn's Algorithm
        ArrayList<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }
        if(topo.size() != V){
            return true;
        }

        return false;
    }

}

import java.util.*;

class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // Step 1: Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }

        // Step 2: Compute indegree
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        // Step 3: Add all nodes with indegree 0 to queue
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        // Step 4: Kahn's Algorithm
        ArrayList<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }

        return topo;
    }
}
//shortest path in unweighted graph 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;

public class Solution 
{
    public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) 
    {    
        // We will store graph in an adjecency list.
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n + 1);
        
        for (int i = 0; i <= n; i++) 
        {
            adj.add(new ArrayList<Integer>());
        }

        // Making adjacency list ADJ from edges.
        for (int i = 0; i < m; i++) 
        {
            int x, y;
            x = edges[i][0];
            y = edges[i][1];
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        /* 
        	Declaring visited array and parent array , visited will be used in dfs.
        	And parent will be use to recreate the path.
        */
        int visited[] = new int[n + 1];
        int parent[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            visited[i] = 0;
            parent[i] = -1;
        }

        /* 
        	Starting BFS from node S.
        	Q is the queue used in bfs.
        */
        LinkedList<Integer> q = new LinkedList<Integer>();
        visited[s] = 1;
        parent[s] = -1;
        q.add(s);
        
        while (!q.isEmpty()) 
        {
            // Selecting a node and traversing all its neighbours.
            int currentNode = q.remove();
            
            for (int i = 0; i < adj.get(currentNode).size(); i++) 
            {
                // If the node is not already visited we will add it to the Q.
                if (visited[adj.get(currentNode).get(i)] == 0) 
                {
                    visited[adj.get(currentNode).get(i)] = 1;
                    q.add(adj.get(currentNode).get(i));
                    parent[adj.get(currentNode).get(i)] = currentNode;
                }
            }
        }

        // Now we will backtrack and recreate the path from S to T using parent array.
        LinkedList<Integer> path = new LinkedList<Integer>();
        int currentNode = t;
        
        // We will start from T and try to go back from here until we reach S.
        path.add(currentNode);
        
        while (parent[currentNode] != -1) 
        {    
            /* 
            	From current node we will find a neighbour who has distance equal to
            	distance of current node - 1 , that node will be the parent of currentNode.
            */
            currentNode = parent[currentNode];
            path.add(currentNode);
        }

        // We got path in from T to S , so we will reverse it and return it.
        Collections.reverse(path);
        return path;
    }

}
//floyd warshall
class Solution{
    public static void floyd(int mat[][]){
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == -1){
                    mat[i][j] == 1001;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    mat[i][j] = Math.min(mat[i][j] , mat[i][k]+mat[k][j]);
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1001){
                    mat[i][j] == -1;
                }
            }
        }
    }
}
//bellmanford
static int[] bellmanFord(int V, int[][] edges, int src) {
    int[] dist = new int[V];
    Arrays.fill(dist, (int) 1e8); // Use large number as "infinity"
    dist[src] = 0;

    // Relax all edges V-1 times
    for (int i = 0; i < V - 1; i++) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] != (int) 1e8 && dist[u] + w < dist[v]) {
                dist[v] = dist[u] + w;
            }
        }
    }

    // Check for negative-weight cycles
    for (int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];
        int w = edge[2];

        if (dist[u] != (int) 1e8 && dist[u] + w < dist[v]) {
            return new int[]{-1}; // Negative cycle found
        }
    }

    return dist;
}
//pecific and atlantic water overflw
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        boolean[][] pac = new boolean[rows][cols];
        boolean[][] atl = new boolean[rows][cols];
        
        for (int col = 0; col< cols; col++){
            dfs(0, col, rows, cols, pac, heights[0][col], heights);
            dfs(rows-1, col,rows, cols, atl, heights[rows-1][col], heights);
        }
        for (int row = 0; row<rows; row++){
            dfs(row, 0,rows, cols, pac, heights[row][0], heights);
            dfs(row, cols-1,rows, cols, atl, heights[row][cols-1], heights);
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++){
                if (pac[i][j] && atl[i][j])
                    result.add(Arrays.asList(i,j));
            }
        return result;
    }
    private void dfs(int row, int col, int rows, int cols, boolean[][] visited, int prevHeight, int[][] heights){
        if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || prevHeight > heights[row][col])
            return;
        visited[row][col]= true;
        dfs(row+1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row-1, col, rows, cols, visited, heights[row][col], heights);
        dfs(row, col+1, rows, cols, visited, heights[row][col], heights);
        dfs(row, col-1, rows, cols, visited, heights[row][col], heights);
        
    }
}
//DSU
public class DisjointSet {
    int parent[];
    int rank[];
    int size[];
    int components;
    DisjointSet(int nodes){ //0 based (5) 0 to 4
        this.parent = new int[nodes];
        this.rank = new int[nodes];
        this.size = new int[nodes];
        this.components = nodes;
        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
            this.rank[i] = 0;
            this.size[i] = 1;
        }
    }

    public int findRootParent(int node){
        if(node == parent[node]){
            return node;
        }
        parent[node] = findRootParent(parent[node]);
        return parent[node];
    }

    public void unionByRank(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return;
        }
        components--;
        // 2, union of components
        if(rank[rootParent1]<rank[rootParent2]){
            parent[rootParent1] = rootParent2;
        }else if(rank[rootParent2] < rank[rootParent1]){
            parent[rootParent2] = rootParent1;
        }else{
            parent[rootParent2] = rootParent1;
            rank[rootParent1]++;
        }


     }

    public void unionBySize(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return;
        }
        components--;
        // 2, union of components
        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }else {
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
    }

    public static void main(String[] args) {
      // union by rank
       DisjointSet dsu1 = new DisjointSet(4);
       System.out.println("total components -> " + dsu1.components);
       System.out.println(dsu1.findRootParent(0) == dsu1.findRootParent(3));
       dsu.unionByRank(0,3);
       System.out.println("total components -> " + dsu1.components);
       System.out.println(dsu1.findRootParent(0) == dsu1.findRootParent(3));

        // union by size
        DisjointSet dsu = new DisjointSet(4);
        System.out.println("total components -> " + dsu.components);
        System.out.println(dsu.findRootParent(0) == dsu.findRootParent(3));
        dsu.unionBySize(0,3);
        System.out.println("total components -> " + dsu.components);
        System.out.println(dsu.findRootParent(0) == dsu.findRootParent(3));
        
    }
}