package May;

import java.util.Scanner;

public class Testmay {

	public static void main(String[] args) {
		Scanner sc;
		// TODO Auto-generated method stub
		String Mamayin ;
        String Tenmayin;
        String Tenhang;
        double Tocdoin;
        double Giaban;
      
		sc = new Scanner(System.in);
		Lopmayin[] dsMayin;
		dsMayin = new Lopmayin[3];
        for(int i=0;i < dsMayin.length;i++)
        {
        	System.out.println("Ma may in ");
        	Mamayin =sc.nextLine();
        	System.out.println("Ten may in ");
            Tenmayin =sc.nextLine();
            System.out.println("ten Hang ");
            Tenhang =sc.nextLine();
            System.out.println("Toc do in");
            Tocdoin =sc.nextDouble();sc.nextLine();
            System.out.println("ten Gia ban ");
            Tocdoin =sc.nextDouble();sc.nextLine();
            
        }
        

	}

}
