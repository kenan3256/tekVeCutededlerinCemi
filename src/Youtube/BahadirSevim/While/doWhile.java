package Youtube.BahadirSevim.While;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int topla=0;
        int eded;

        do{
            System.out.println("ededi daxil edin");
            eded=sc.nextInt();

            topla+=eded;

        }while (eded==0);
        System.out.println(+topla);
        }


    }

