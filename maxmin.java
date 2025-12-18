import java.util.Arrays;
public class maxmin {
      public static void main(String[] args) {
        int[]arr={2,45,6,723,3};
        //using loop 
         int max=arr[0];
         int min=arr[0];
         for(int i=1;i<arr.length;i++){
            
           if (arr[i]<min){
               min=arr[i];
         }
               if(arr[i]>max){
               max=arr[i];
           }  
          }
          System.out.println("min value"+min);
          System.out.println("max value"+max);
        //using sort function
           Arrays.sort(arr);
            min=arr[0];
            max=arr[arr.length-1];
           System.out.println(min);
           System.out.println(max);
          //using math function
          
        //    max=Math.max( max,  arr[i]);
        //    min =Math.min( min, arr[i]);
        //    System.out.println(max);
        //    System.out.println(min);
}
}
    




