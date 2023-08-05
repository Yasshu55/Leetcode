class TopVotedCandidate {
    private int[] times;
    private int[] leader;

    public TopVotedCandidate(int[] persons, int[] times) {
        this.times = times;
        leader = new int[persons.length];
        int lead = persons[0];


        Map<Integer,Integer> leadCount = new HashMap<>();
        for(int i=0;i<persons.length;i++){
            if(leadCount.merge(persons[i],1,Integer::sum) >= leadCount.get(lead)){
                lead = persons[i];
            }
            leader[i] = lead;
        }
    }

    private int searchInsertPos(int t){
        int left = 0;
        int right = times.length;

        while(left<right){
            int mid = left+(right-left)/2;

            if(times[mid] == t){
                return mid;
            }
            else if(times[mid]>=t){
                right = mid;
            }
            else {
                left = mid +1;
            }
        }
        return left -1;
    }
    
    public int q(int t) {
        return leader[searchInsertPos(t)];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */