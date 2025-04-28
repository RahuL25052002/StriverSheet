class Solution {
/*
 *this approch of mine just two pointer ways;
 by two pointer method i take 1 k and l pointer
 k points to first and l aslo
 if duplicate found then left pointer shift by 1 place and again check 
 with k position elements
 if not found dupicate then arr[k+1]=arr[l]; means upto l there duplicate so next to k
 add that element and that way solve this problem
 */
    public int removeDuplicates(int[] nums) {
        int k=0;
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[k]!=nums[l]){
                nums[k+1]=nums[l];
                k++;
            }
            l++;
        }
        return k+1;
    }
}
