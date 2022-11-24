import java.util.*;
class Randomadd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int b=0;
       int r=0;
       int m,y;
       for(int i=0;i<=n;i++){
           m=n%10;
           b=b+m;
           n=n/10;
       }
       if(b<10){
        System.out.println(b);
       }
       for(int j=0;j<=b;j++){
           y=b%10;
           r=r+y;
           b=b/10;
       }
       System.out.println(r);
    }
}