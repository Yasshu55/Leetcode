class Solution {
    private List<List<Integer>> buildGraph(int n,int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] edge: edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = buildGraph(n,edges);
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        stack.push(source);

        while(!stack.isEmpty()){
            int current = stack.pop();

            if(current == destination){
                return true;
            }
            visited[current] = true;

            for(int neighbour: graph.get(current)){
                if(!visited[neighbour])
                stack.push(neighbour);
            }
        }
        return false;
    }
}