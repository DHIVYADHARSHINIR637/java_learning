package java_learning;

public class Demo23 {
	public static void main(String args[])
	{
		int[] arr= {2,6,4,9,18};
		int max=arr[0];
		int min=arr[0];
		for(int ind=0;ind<arr.length;ind++) {
			if(arr[ind]>max) {  //arr[1]=4
				max=arr[ind];
			}
			if(arr[ind]<min) {//arr[1]=4
			min=arr[ind];
			}
		}
		System.out.println("Max = " +max+" Min = "+min);
		
		  
		    }
		}
	
