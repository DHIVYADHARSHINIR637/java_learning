public class prog1{
    public static void main(String args[]){
        int[] arr={1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int maxCount=1;
        int currentCount=1;
        int element=arr[0];
        for(int i=1;i<arr.length;i++){
             if(arr[i]==arr[i-1]) {
                currentCount++;
                if(currentCount>maxCount)
                {
                    maxCount=currentCount;
                    element=arr[i];
                }
             }
            else
            {
                    currentCount=1;
                    
            }
        }
        System.out.println("element:"+ element +" " +"length:"+maxCount);
    }
}
