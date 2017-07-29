package pack_topla;

import java.util.Scanner;

public class ToplaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("yaþýnýzý girin");
		  Scanner sc=new Scanner(System.in);
		  int yas=sc.nextInt();
		  
		  if(yas<=18)
		   System.out.println("reþit deðil");
		  else
		   System.out.println("reþittir");


	}

}
