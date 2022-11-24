import java.util.*;
class Roman{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String st="";
       int []arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        while{
            for(int i=0;i<=str.length();i++){
                if(str>=arr[i]){
                    str-=arr[i];
                    st+=add(str);
                }
            }
        }
        System.out.println(st);
    }
}