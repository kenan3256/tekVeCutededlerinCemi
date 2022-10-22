package Youtube.BahadirSevim.While;

import java.util.Scanner;

public class SifiryazanaQederToplaProje {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int topla=0;
        int eded;
        while (true){
            System.out.print("Eded yazin: ");
            eded=sc.nextInt();
            if(eded!=0){
                topla+=eded;

            }else{
                break;
            }
        }
        System.out.println("===============================");
        System.out.println("daxil etdiyiniz ededlerin  cemi:  "    +topla );
    }
}
