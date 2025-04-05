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