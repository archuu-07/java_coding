import java.util.*;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=1;
        for(int i=1;i<=a;i++){
            num=num*i;
        }
        System.out.print(num);
    }
}