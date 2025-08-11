class Solution {
    public int[] searchRange(int[] arr, int target) {
        if(arr.length==1){
            if(arr[0]==target)return new int[]{0,0};
            return new int[]{-1,-1};
        }
        int left=0,right=arr.length-1;
        int one=-1;int two=-1;
        while(left<=right){
            if(arr[left]==target)one=left;
            if(arr[right]==target)two=right;
            if(one!=-1 && two!=-1 )break;
            if(one<0)left++;
            if(two<0)right--;
        }
        return new int[]{one,two};
    }
}
