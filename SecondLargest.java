
//import java.util.*;;
public class SecondLargest {
    public static void main(String[] args) {
        int []arr={2,5,36,25,34};
        //System.out.println(sorted(arr));


        int largest=Integer.MIN_VALUE;
         int secondlargest=Integer.MIN_VALUE;
         for(int i=0;i<arr.length;i++){
             if(arr[i]>largest){
                 secondlargest=largest;
                 largest=arr[i];
             }
                 if(secondlargest>arr[i]& arr[i]!=largest){
                     secondlargest=arr[i];


             }

             }
             System.out.println(secondlargest);

         }
        //-------------------------------using sorted array method-------------------------------
        // static int sorted (int []arr){
        //     Arrays.sort(arr);
        //     int secondlargest=0;
        //     for(int i=0;i<arr.length;i++){
        //         secondlargest=arr[arr.length-2];
                
        //     }
        //     return secondlargest;
        // }
         
        

    }

