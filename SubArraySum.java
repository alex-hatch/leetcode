class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0,1);
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(sumCount.containsKey(sum - k)) {
                count += sumCount.get(sum - k);
            }
            sumCount.put(sum, sumCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
