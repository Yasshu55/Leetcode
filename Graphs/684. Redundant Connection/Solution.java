class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        UnionSet us = new UnionSet(edges.length+1);
        for(int[] edge:edges){
            if(!us.union(edge[0],edge[1])){
                return edge;
            }
        }
        return null;
    }

    public class UnionSet{
        int[] parent;
        int[] rank;

        UnionSet(int n){
            parent = new int[n];
            rank = new int[n];

            for(int i=0;i<n;i++){
                parent[i] = i;
                rank[i] = 1;
            }
        }

        private int find(int p){
           p = parent[p];
           while(p!=parent[p]){
            // parent[p] = parent[parent[p]];  // we should use this for optimized dont know why research later....afaik it is used to reduce number of nodes we are searching
            p = parent[p];
           }
           return p;
        }

        private boolean union(int p1,int p2){
            p1 = find(p1);
            p2 = find(p2);

            if(p1 == p2){
                return false;
            }
            else if(rank[p1] > rank[p2]){
                parent[p2] = p1;
            } 
            else if(rank[p1] < rank[p2]){
                parent[p1] = p2;
            }
            else {
                parent[p1] = p2;
                rank[p1] += 1;
            }
            return true;
        }

    }
}