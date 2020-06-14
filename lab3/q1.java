package lab3;
import java.util.Scanner;//testing25
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		
		
		int g=2;
		while(g==2) {
		System.out.println("enter deatails press 1");
		System.out.println("delete deatails press 2");
		System.out.println("show deatails press 3");
		System.out.println("exit program");
		int a=sc1.nextInt();
		sc1.nextLine();
		if(a==1)
		{
			q1fn.insertion();
		}
		if(a==2)
		{
			q1fn.delete();
		}
		if(a==3)
		{
			q1fn.print();
		}
		if(a==4)
		{
			g=14;
		}
		

		}

	}		
	//can be created only one time during run of program
		
}
	
