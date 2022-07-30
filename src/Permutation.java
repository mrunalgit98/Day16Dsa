import java.util.Scanner;

public class Permutation {
    static void permute(String a,String b){
        if(a.length()==0){
            System.out.println(b + " ");
            return;
        }
        for(int i=0;i<a.length();i++){
            char  ch=a.charAt(i);
            String left=a.substring(0,i);
            String right=a.substring(i+1);
            String rest=left+right;
            permute(rest,b+ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String a;
        String b = " ";

        System.out.println("enter string");
        a=sc.next();


        permute(a,b);
    }
}
