import java.util.*;
class string{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<=a.length();i+=2){
            System.out.print(a.charAt(i));
        }

    }
}