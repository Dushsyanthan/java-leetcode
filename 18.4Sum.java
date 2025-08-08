class Solution {
	public static  List<List<Integer>> fourSum(int[] nums, int target) {
            Long t=(long)target;
	        Arrays.sort(nums);
	        Set<List<Integer>> an=new HashSet<>();
	        int n=nums.length;
	        for (int i = 0; i < n - 3; i++) {
	            for (int j = i + 1; j < n - 2; j++) {
	                int left = j + 1;
	                int right = n - 1;
	        while(left<right) {
	            Long tempNum=(long)nums[left]+nums[i]+nums[j]+nums[right];
	        	if(tempNum.equals(t)) {
	        		List<Integer> temp=Arrays.asList(new Integer[] {nums[left],nums[i],nums[j],nums[right]});
	        			an.add(temp);
                    left++;right--;
				}
	        	else if(tempNum<target) {
	        		left++;
	        	}
	        	else {
	        		right--;
	        	}
	        	}
            }
        }
	        
	        return new ArrayList<>(an);
	}
}
