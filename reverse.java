public class reverse {
    public static void main (String[]args){
int num=121;
int rev=0;
int temp=num;
while(num>0){
    rev=rev*10+num%10;
    num=num/10;
}
// System.out.println(rev);
if(temp==rev){
    System.out.println("palindrome");
}else{
    System.out.println("not palindrome");
}

    }
}

