import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a=sn.nextInt();
        int sum=0;
        for(int i=3;i<=a;i+=3){
        sum=sum+i;}
        System.out.println(sum);
    }
}
