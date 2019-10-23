import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        float n1=sn.nextFloat();
        float max=n1;
        float min=n1;
        for (int i=1;i<10;i++){
            float n2=sn.nextFloat();
            if(max<n2){
                max=n2;
            }
            else if(min>n2){
                min=n2;
            }
        }
        System.out.println("max="+max);
        System.out.println("min="+min);
    }
}