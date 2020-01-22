package lab3;
import java.util.Scanner;

public class q2 {
	static int arr[][];
	static int r;
	static int c;
	
	public static void sortH(int arr[][])
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c-1;j++)
			
			{
				for(int a=0;a<c-j-1;a++)
				{
					if(arr[i][a]>arr[i][a+1])
					{
						int temp=arr[i][a];
						arr[i][a]=arr[i][a+1];
						arr[i][a+1]=temp;
					}
				}
				
			}
		}
		
		
		
	}
	
	public static void sortV(int arr[][])
	{
		for(int j=0;j<c;j++)//j denotes column	
		{
			for(int i=0;i<r-1;i++)//bubble sort
			
			{
				for(int a=0;a<r-i-1;a++)
				{
					if(arr[a][j]>arr[a+1][j])
					{
						int temp=arr[a][j];
						arr[a][j]=arr[a+1][j];
						arr[a+1][j]=temp;
					}
				}
				
			}
		}
		
	}
	
	public static boolean search(int arr[][])
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter element");
		int a=sc1.nextInt();
		sc1.nextLine();
		boolean b=false;
		
		for(int i=0;i<r;i++)	
		{
			for(int j=0;j<c;j++)
			
			{
				if(arr[i][j]==a)
				{
					b=true;
					
				}
				
			}
		}
		return b;
		
		
	}
	
	public static void insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows");
		r=sc.nextInt();
		
		sc.nextLine();
		System.out.println("enter columns");
		c=sc.nextInt();
		
		sc.nextLine();
		arr=new int[r][c];
		
		for(int i=0;i<r;i++)	
		{
			for(int j=0;j<c;j++)
			
			{
				System.out.println("enter value at "+(i+1)+" row and "+(j+1)+" column");
				arr[i][j]=sc.nextInt();
				sc.nextLine();
			}
		}
		
	}
	public static void print()
	{
		for(int i=0;i<r;i++)	
		{
			for(int j=0;j<c;j++)
			
			{
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		Scanner sc2=new Scanner(System.in);
		while(a==1)
			
		{
			System.out.println("input array press 1");
			System.out.println("sort array press 2");
			System.out.println("search array press 3");
			System.out.println("print array press 4");
			System.out.println("exit press 5");
			int c=sc2.nextInt();
			sc2.nextLine();
			if(c==1)
			{
				insert();
				print();
				
			}
			if(c==2)
			{
				sortH(arr);
				sortV(arr);
				print();
			}
			if(c==3)
			{
				System.out.println(search(arr));
			}
			if(c==4)
			{
				print();
			}
			if(c==5)
			{
				a=2;
				
			}
		}
		

	}

}
