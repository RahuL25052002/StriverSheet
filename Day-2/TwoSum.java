import java.util.*;

class TwoSum{
	public static String twoSum(int[]arr,int target){
		
		Arrays.sort(arr);//first sorted array  means{2,2,3,3,4,4,4,5,5,34,45}
		int i=0;//first element  index
		int j=arr.length-1;//last element index
		while(i<j){
			int sum=arr[i]+arr[j]; // take sum of ith & jth index value
			if(sum==target){ // if equal then yes target value present
				return "yes";
			}
			if(sum<target){//here target is greater than sum ie. we have increse sum value so move first pointer means i we have to increse
				i++;
			}else{
				j--;// if sum is greater that means we have to decrease j so sum also decrease
			}
		}
		return "NO";//pointer here comes means we not found a paire whose sum EQUAL to TARGET

	}
	public static void main(String[]args){
		int arr[]={3,4,2,45,2,4,5,34,5,4,3};
		String ans=twoSum(arr,79);
		System.out.println(ans);
	}

}
