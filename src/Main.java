import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int m=n/2;
        boolean a=true;
        for (int i=2;i<=m;i++){
            if(n%i==0){
                a=false;
                break;
            }
        }
        if(a){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}