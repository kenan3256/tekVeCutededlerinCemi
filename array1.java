package Youtube.BahadirSevim.Array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayilar []=new int[5];
        int cem=0;
        double ilksoncem=0;
        double nisbet;

        for(int i=0;i< sayilar.length;i++){
            System.out.println((i+1)+"-ededi daxil edin: ");
            sayilar[i] =sc.nextInt();
            cem+=sayilar[i];
            ilksoncem=sayilar[0]+sayilar[4];

        }
        System.out.println("ededlerin cemi= "+cem);

        System.out.println("ilk ve son ededlerin cemi= "+ilksoncem);
        nisbet=ilksoncem/cem*100;
        System.out.println("ilk ve son nisbeti= "+nisbet+"%");

    }
}
