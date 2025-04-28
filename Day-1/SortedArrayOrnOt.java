class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<arr.length-1;i++){

            if(arr[i]>arr[i+1]){
                count++;
            }
        }
	// so my logic is simple i check only compare elements any time count increases means array is not sorted
	// but if count==n means array is descending sorted and its true thats why it check like this below
        if(count==0 || n==count){
            return true;
        }else{
            return false;
        }
    }
}
