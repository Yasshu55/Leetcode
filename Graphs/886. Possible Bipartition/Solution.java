class Solution {
       private boolean bfs(List<List<Integer>> adjList, int node,int[] color){
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(node);
        color[node] = 1;

        while(!q.isEmpty()){
            int curr = q.poll();

            for(int it: adjList.get(curr)){
            if(color[it] == -1){
                color[it] = 1 - color[curr];
                q.offer(it);
            } else if (color[it] == color[curr]){
                return false;
            }
        }
        }
        return true;
    }

    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] color = new int[n+1];


        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<dislikes.length;i++){
            adj.get(dislikes[i][0]).add(dislikes[i][1]);
             adj.get(dislikes[i][1]).add(dislikes[i][0]);
        }

        Arrays.fill(color,-1);

        for(int i=1;i<=n;i++){
            if(color[i] == -1){
                if(!bfs(adj,i,color)){
                    return false;
                }
            }
        }
        return true;
    }
    }
