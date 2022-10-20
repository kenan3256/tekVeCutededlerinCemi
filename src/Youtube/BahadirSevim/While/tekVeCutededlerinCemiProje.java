package Youtube.BahadirSevim.While;

import java.util.Scanner;

public class tekVeCutededlerinCemiProje {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tekededlerinCemi=0;
        int cutededlerinCemi=0;
         int i=0;
         int say;
         while (i<10){
             System.out.println((i+1)+".ededi yazin");
             say=sc.nextInt();
             if(i%2==0){
                 tekededlerinCemi+=say;

             }else {
                 cutededlerinCemi+=say;
             }
             i++;
         }
        System.out.println("======================================");
        System.out.println("Tek ededlerin cemi" +tekededlerinCemi);
        System.out.println("Cut ededlerin cemi "+cutededlerinCemi );
    }
}
