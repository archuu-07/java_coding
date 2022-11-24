import java.util.*;
class ReverseNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String temp="";
        for(int i=a.length()-1;i>=0;i--){
            temp=temp+a.charAt(i);
        }
        if(temp.equals(a)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}