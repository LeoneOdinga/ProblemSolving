public class SumEqualsTargetValue 
{
  public static void main(String[] args)
  {
	  int []arr = {-2,-1,2,3,4,5};
          
		int [] values = Finder(arr,3);

		for(int s = 0 ; s < values.length; s++)
		{
		  System.out.println("Array[" + s + "] = "+values[s]);
		}
        
		String result= HasPairWithSum(arr,3)?"Found":"Not Found"; 
		System.out.println(result);
  }
  public static int  [] Finder(int []arr, int val)
 {
	 int [] returnedArray = new int[4];
	 int k=0; /*index variable to move found pairs into returnedArray in their order*/
	   for(int i=0;i<arr.length-1 && k<returnedArray.length;i++)
	   {    
		   for(int j=i+1;j<arr.length;j++)
		   {
			   if(arr[i]+arr[j]==val)
			   {
				 returnedArray[k]=arr[i];
				 returnedArray[k+1]=arr[j];
				 k+=2;
			   }
		   }
	   }
	    return returnedArray;
  }
  public static boolean HasPairWithSum(int arr[], int val) 
  {
 	 int start=0,end=arr.length-1;
 	 while(start<end)
 	{
 		 int sum = arr[start]+arr[end];
 		 
 		 if(sum==val)
 		 {
 			 return true;
 		 }
 		 else if(sum>val)
 		 {
 		   end--;	 
 		 }
 		 else
 		 {
 			 start++;
 		 }
 	 }
 	return false; 
  }
}