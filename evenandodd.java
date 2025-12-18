public class evenandodd {
    public static void main(String[] args) {
        int []num={1,2,3,4,5,6,31};
        int even_count=0;
        int odd_count=0;
        for(int i=0; i<num.length;i++){
            if(num[i] %2==0){
                even_count=even_count+1;
                //System.out.println(even_count);
            }else{
                odd_count=odd_count+1;
                //System.out.println(odd_count);
            }
        }
        System.out.println("even number"+even_count);
        System.out.println("odd number"+odd_count);
        
    }

}
