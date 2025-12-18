public class sumofarrays {
    public static void main(String[] args) {
        
    
        int []arr={1,2,3,4,5,6,7};
        // int ans2=sumarray(arr);
        // System.out.println(ans2);
        // int ans1=average(arr);
        // System.out.println(ans1);
        System.out.println(sumarray(arr));
        System.out.println(average(arr));

    }

         
         //function used to sum of elements in the array
         static int  sumarray (int []arr)
          {
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                
            }
            return sum;
         }
         //function used to find the average value of array elements
         static int average(int[]arr){
            int avg=0;
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
                avg=sum/arr[arr.length-1];

            }
            return avg;
         }

    }

