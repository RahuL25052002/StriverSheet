import java.util.*;
class MoveZerosToEnd{

	public static void moveZeros(int []arr){
	
		int j=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==0){//if the zero found i save the position and break the loop
				      //means the first position of zer here find it
				j=i;
				break;
			}
		}
		if(j==-1){//if there is no zero simply return 
			return;
		}

		//from the first position of zero 
		//swap the non-zero elements with zero
		for(int i=j+1;i<arr.length;i++){

			if(arr[i]!=0){
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}

		}
	}
	public static void main(String[]args){

		int []nums={1,2,0,0,3,2,0,9};
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	
	}
}
