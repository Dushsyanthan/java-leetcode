class Solution{
    public int[] twoSum(int arr[],int target) {
     HashMap<Integer,Integer> ans=new HashMap<>();
     for(int i=0;i<arr.length;i++){
        int need=target-arr[i];
        if(ans.containsKey(need)){
            return new int[]{ans.get(need),i};
        }
        ans.put(arr[i],i);
     }
     return new int[]{};
    }
}
