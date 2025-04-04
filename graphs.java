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
