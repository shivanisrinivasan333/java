public class check_arr_sorted {
    public static void main(String[] args) {
        int[]arr={2,3,4,53,8,9,10};
        if(sorted(arr)==true){
            System.out.println("sorted array");
        }else{
            System.out.println("unsorted array");
        }
    
    }
    static boolean  sorted (int[]arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               return false; 
        }     
        }
        return true;

    }
   
}
