class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] indegree = new int[n];

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            adjList.get(i).add(leftChild[i]);
            adjList.get(i).add(rightChild[i]);

            if(leftChild[i] != -1){
                indegree[leftChild[i]]++;
            }
            if(rightChild[i] != -1){
                indegree[rightChild[i]]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        return topsort(q,adjList,indegree);

    }

    private boolean topsort(Queue<Integer> q,List<List<Integer>> adjList, int[] indegree){
        int count = 0;

        if(q.size() >1){
            return false;
        }

        while(!q.isEmpty()){
            count++;
            int current = q.poll();

            for(Integer it: adjList.get(current)){
                if(it != -1){
                    indegree[it]--;

                    if(indegree[it] == 0){
                        q.add(it);
                    } else {
                        return false;
                    }
                }
            }
        }


            if(count==indegree.length){
                return true;
            }
            return false;
}
}