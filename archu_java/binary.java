import java.util.*;
class Binary{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        int temp=0;
        String str="";
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<a;i++){
            temp=sc.nextInt();
            for(int j=0;j<=temp;j++){
                str+=Integer.toBinaryString(j);
                res.add(str);
            }
        }
        System.out.println(str);
    }
}