package ebob_ekok;
import java.util.Scanner;
public class Ebob_ekok {

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int n1,n2;
        System.out.println("n1 sayısı giriniz:");
        n1=input.nextInt();
        System.out.println("n2 sayısı giriniz:");
        n2=input.nextInt();
        int ebob=1;
        int ekok;
        int i=1;
        while (i<=n1){
          if(n1%i==0 && n2%i==0){
             ebob=i;
          }
          i++;
        }
        System.out.println("ebob:"+ebob);

        ekok=(n1*n2)/ebob;
        System.out.println("ekok:"+ekok);
    }
}
