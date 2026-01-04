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
//redundent connections 
class Solution {
    private int [] parent;
    private int  [] rank;
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n+1];
        rank = new int[n+1];

        for(int i=1; i<=n; i++){
            parent[i] = i;
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(find(u)  == find(v)){
                return edge;
            }
            join(u,v);
        }
        return new int[0];
    }
    private int find(int i){
        if(parent[i] != i){
            parent[i] = find(parent[i]);
        }
        return parent[i];
    }
    private void join(int u , int v){
        int rootU = find(u);
        int rootV = find(v);

        if(rootU != rootV){
            if(rank[rootU] > rank[rootV]){
                parent[rootV] = rootU;
            }else if(rank[rootU] < rank[rootV]){
                parent[rootU] = rootV;
            }else{
                parent[rootV] = rootU;
                rank[rootU]++;
            }
        }
    }
}
//dsu problems 
class Solution {
    public class DisjointSet {
    int parent[];
    int size[];
    DisjointSet(int nodes){ //0 based (5) 0 to 4
        this.parent = new int[nodes];
        this.size = new int[nodes];
        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
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
    public boolean unionBySize(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return false;
        }
        // 2, union of components
        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }else {
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
        return true;
    }
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }
        DisjointSet set = new DisjointSet(n);
        int wire = 0;
        for(int connection[] : connections){
            int u = connection[0];
            int v = connection[1];
            if(set.unionBySize(u,v)){
                wire++;
            }
        }
        return n-1-wire;
    }
    
}
//another one
class Solution {
    public class DisjointSet {
    int parent[];
    int size[];
    DisjointSet(int nodes){ //0 based (5) 0 to 4
        this.parent = new int[nodes];
        this.size = new int[nodes];
        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
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
    public void unionBySize(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return;
        }
        // 2, union of components
        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }else {
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
    }
    }
    public boolean equationsPossible(String[] equations) {
        DisjointSet dsu = new DisjointSet(26);
        ArrayList<int[]> list = new ArrayList<>();
        for(String equation : equations){
            int u = equation.charAt(0) - 'a';
            int v = equation.charAt(3) - 'a';
            if(equation.charAt(1) == '='){
                dsu.unionBySize(u,v);
            }else{
                list.add(new int[]{u,v});
            }
        }
        for(int edge[] : list){
            int u = edge[0];
            int v = edge[1];
            if(dsu.findRootParent(u) == dsu.findRootParent(v)){
                return false;
            }
        }
        return true;
    }
}
//bipartite
class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int color[] = new int[n];
        Arrays.fill(color,-1);
        for(int i=0; i<n; i++){
            if(color[i] == -1){
                if(!isColor(i,0,graph,color)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isColor(int src ,int col, int[][] graph , int[] color){
        color[src] = col;
            for(int neighbour : graph[src]){
                if(color[neighbour] == -1){
                    color[neighbour] = 1 - color[src];
                    if(!isColor(neighbour,color[neighbour], graph, color)) {
                    return false;
                }
                }else if(color[neighbour] == color[src]){
                    return false;
                }
            }
             return true;

        }
       
    }

// kosaraju algo 
import java.util.*;

public class Solution {
    // First DFS to fill stack based on finish time
    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> edges, Stack<Integer> st) {
        vis[node] = true;
        for (int it : edges.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, edges, st);
            }
        }
        st.push(node);
    }

    // Second DFS on transposed graph
    public static void dfsCount(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adjT) {
        vis[node] = true;
        for (int it : adjT.get(node)) {
            if (!vis[it]) {
                dfsCount(it, vis, adjT);
            }
        }
    }

    public static int stronglyConnectedComponents(int V, ArrayList<ArrayList<Integer>> edges) {
        boolean[] vis = new boolean[V];
        Stack<Integer> st = new Stack<>();

        // Step 1: Order vertices by finish time in stack
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, vis, edges, st);
            }
        }

        // Step 2: Transpose the graph
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            transpose.add(new ArrayList<>());
        }
        for (int i = 0; i < V; i++) {
            for (int it : edges.get(i)) {
                transpose.get(it).add(i);
            }
        }

        // Step 3: Do DFS on transposed graph in order of stack
        Arrays.fill(vis, false); // Reset visited
        int count = 0;
        while (!st.isEmpty()) {
            int node = st.pop();
            if (!vis[node]) {
                count++;
                dfsCount(node, vis, transpose);
            }
        }
        return count;
    }
}
//minimum spanning tree
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int pair1[] , int pair2[]){
                return pair1[2] - pair2[2];
            }
        });
        int sum = 0;
        ArrayList<int[]> edges = new ArrayList<>();
        boolean[] vis = new boolean[V];
        pq.offer(new int[]{-1,0,0});
        while(!pq.isEmpty()){
            int object[] = pq.poll();
            int parent = object[0];
            int node = object[1];
            int weight = object[2];
            if(vis[node]) continue;
            vis[node] = true;
            if(parent != -1){
                edges.add(new int[]{parent,node});
                sum += weight;
            }
            for(int neighbour[] : adj.get(node)){
                int neighbourNode = neighbour[0];
                int neighbourWeight = neighbour[1];
                if(!vis[neighbourNode]){
                    pq.offer(new int[]{node,neighbourNode,neighbourWeight});
                }
            }
        }
        return sum;
    }
}
//kruskal
class Solution {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        // Code Here.
        //(u, v, weight)
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<>(){
            public int compare(int pair1[], int pair2[]){
                return pair1[2] - pair2[2];
            }
        });
        // insert edges in pq
        for(int i=0;i<V;i++){
            for(int edges[] : adj.get(i)){
                pq.offer(new int[]{i,edges[0],edges[1]});
            }
        }
        DisjointSet dsu = new DisjointSet(V);
        int sum=0;
        while(!pq.isEmpty()){
            int object[] = pq.poll();
            int u = object[0];
            int v = object[1];
            int weight = object[2];
            if(dsu.unionBySize(u,v)){
                sum += weight;
            }
        }
        return sum;
    }
}


class DisjointSet {
    int parent[];
    int size[];
    DisjointSet(int nodes){
        this.parent = new int[nodes];
        this.size = new int[nodes];
        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
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
    public boolean unionBySize(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return false;
        }
        // 2, union of components
        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }else {
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
        return true;
    }
}
//problems on graph
class Solution {
    public void dfs(int src, List<List<Integer>> adList , boolean visited[]){
        visited[src] = true;
        for(int neighbour : adList.get(src)){
            if(!visited[neighbour]){
                dfs(neighbour,adList,visited);
            }
        }
    }
    public int removeStones(int[][] stones) {
        int n = stones.length;
        List<List<Integer>> adList = new ArrayList<>();
        for(int i=0; i<n; i++){
            adList.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1]){
                    adList.get(i).add(j);
                    adList.get(j).add(i);
                }
            }
        }
        int components = 0;
        boolean visited[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adList,visited);
                components++;
            }
        }
        return n-components;
    }
}
//
class Solution {
    public class DisjointSet {
    int parent[];
    int size[];
    DisjointSet(int nodes){ //0 based (5) 0 to 4
        this.parent = new int[nodes];
        this.size = new int[nodes];
        for(int i=0;i<nodes;i++){
            this.parent[i] = i;
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
    public void unionBySize(int node1, int node2){
        //1. find the root parent
        int rootParent1 = findRootParent(node1);
        int rootParent2 = findRootParent(node2);
        if(rootParent1==rootParent2){
            return;
        }
        // 2, union of components
        if(size[rootParent1]<size[rootParent2]){
            parent[rootParent1] = rootParent2;
            size[rootParent2] += size[rootParent1];
        }else {
            parent[rootParent2] = rootParent1;
            size[rootParent1] += size[rootParent2];
        }
    }
    }
    public boolean equationsPossible(String[] equations) {
        DisjointSet dsu = new DisjointSet(26);
        ArrayList<int[]> list = new ArrayList<>();
        for(String equation : equations){
            int u = equation.charAt(0) - 'a';
            int v = equation.charAt(3) - 'a';
            if(equation.charAt(1) == '='){
                dsu.unionBySize(u,v);
            }else{
                list.add(new int[]{u,v});
            }
        }
        for(int edge[] : list){
            int u = edge[0];
            int v = edge[1];
            if(dsu.findRootParent(u) == dsu.findRootParent(v)){
                return false;
            }
        }
        return true;
    }
}
//alien dictionary
class Solution {
    public String alienOrder(String[] words) {

        // Step 1: Build graph
        Map<Character, List<Character>> graph = new HashMap<>();
        Map<Character, Integer> indegree = new HashMap<>();

        // initialize all characters
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
                indegree.putIfAbsent(c, 0);
            }
        }

        // Step 2: Build edges
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i];
            String w2 = words[i + 1];

            // invalid case
            if (w1.length() > w2.length() && w1.startsWith(w2)) {
                return "";
            }

            for (int j = 0; j < Math.min(w1.length(), w2.length()); j++) {
                char c1 = w1.charAt(j);
                char c2 = w2.charAt(j);

                if (c1 != c2) {
                    graph.get(c1).add(c2);
                    indegree.put(c2, indegree.get(c2) + 1);
                    break;
                }
            }
        }

        // Step 3: Topological Sort (Kahn’s Algorithm)
        Queue<Character> q = new LinkedList<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) {
                q.offer(c);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!q.isEmpty()) {
            char curr = q.poll();
            res.append(curr);

            for (char nei : graph.get(curr)) {
                indegree.put(nei, indegree.get(nei) - 1);
                if (indegree.get(nei) == 0) {
                    q.offer(nei);
                }
            }
        }

        // cycle check
        if (res.length() != indegree.size()) return "";

        return res.toString();
    }
}
//word ladder
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                if (currentWord.equals(endWord)) {
                    return level;
                }

                char[] wordChars = currentWord.toCharArray();
                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == originalChar) continue;
                        wordChars[j] = c;
                        String newWord = new String(wordChars);
                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            visited.add(newWord);
                            queue.offer(newWord);
                        }
                    }
                    wordChars[j] = originalChar; // revert change
                }
            }
            level++;
        }

        return 0;
    }
}
//number of islands
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1' && !visited[i][j]){
                    count++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return count;
    }
    public void dfs(int row, int col, char[][] grid, boolean[][] visited){
        int n = grid.length;
        int m = grid[0].length;
        visited[row][col] = true;
        int directions[][] = {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        };
        for(int direction[] : directions){
            int nrow = row + direction[0];
            int ncol = col + direction[1];
            if(nrow >=0 && nrow < n && ncol >=0 && ncol < m && grid[nrow][ncol] == '1' && !visited[nrow][ncol]){
                dfs(nrow,ncol,grid,visited);
            }
        }
    }
}
//number of islands II
class Solution {
    public List<Integer> numIslands2(int n, int m, int[][] positions) {
        List<Integer> result = new ArrayList<>();
        DisjointSet dsu = new DisjointSet(n*m);
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        int directions[][] = {
            {-1,0},
            {0,1},
            {1,0},
            {0,-1}
        };
        for(int position[] : positions){
            int row = position[0];
            int col = position[1];
            if(visited[row][col]){
                result.add(count);
                continue;
            }
            visited[row][col] = true;
            count++;
            int nodeNo = row * m + col;
            for(int direction[] : directions){
                int nrow = row + direction[0];
                int ncol = col + direction[1];
                int neighbourNodeNo = nrow * m + ncol;
                if(nrow >=0 && nrow < n && ncol >=0 && ncol < m && visited[nrow][ncol]){
                    if(dsu.unionBySize(nodeNo,neighbourNodeNo)){
                        count--;
                    }
                }
            }
            result.add(count);
        }
        return result;
    }
    public class DisjointSet {
        int parent[];
        int size[];
        DisjointSet(int nodes){ //0 based (5) 0 to 4
            this.parent = new int[nodes];
            this.size = new int[nodes];
            for(int i=0;i<nodes;i++){
                this.parent[i] = i;
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
        public boolean unionBySize(int node1, int node2){
            //1. find the root parent
            int rootParent1 = findRootParent(node1);
            int rootParent2 = findRootParent(node2);
            if(rootParent1==rootParent2){
                return false;
            }
            // 2, union of components
            if(size[rootParent1]<size[rootParent2]){
                parent[rootParent1] = rootParent2;
                size[rootParent2] += size
[rootParent1];
            }else {
                parent[rootParent2] = rootParent1;
                size[rootParent1] += size[rootParent2];
            }
            return true;
        }
    }
}

//detect cycle in directed graph
import java.util.*;
class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // Kahn's Algorithm
        int indegree[] = new int[V];
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
        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;

            for (int neighbor : adj.get(node)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }
        return count != V;
    }
}
//topological sort using kahn's algorithm
import java.util.*;
class Solution {
    public ArrayList<Integer> topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        // Kahn's Algorithm
        int indegree[] = new int[V];
        for (int i
    = 0; i < V; i++) {
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
                if (indegree[
neighbor] == 0) {
                    q.offer(neighbor);
                }   
            }
        }
        return topo;
    }
}
