public class positive_negative {
   
    public static void main(String[] args) {
        int[]arr= {2,-8,5,0,-9,4,0,-31,31};
        int postive=0;
        int negative=0;
        int zero=0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]==0) {
         zero++;
           }
           if(arr[i]>0){
         postive++;

           }
           if(arr[i]<0){
          negative++;
           }
        }
        System.out.println(postive);
        System.out.println(negative);
        System.out.println(zero);

    }


}
