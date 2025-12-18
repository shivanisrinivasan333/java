public class CopyArray {
    public static void main(String[] args) {
        int[]arr={2,46,7,8,2,8};
        int []copy =  new int[arr.length];
        for(int i=0; i<arr.length;i++){
            copy[i]=arr[i];
        }
        System.out.print("copied array=");
        for(int i=0;i<copy.length; i++){
            System.out.print(copy[i]+" ");
        }
        
    }
}
