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