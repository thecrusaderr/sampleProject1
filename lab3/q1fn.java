package lab3;
import java.util.Scanner;

public class q1fn {
	static String[] player=new String[10];
	static int[] highScore=new int[10]; 
	static int 	ones;
	static int	twos;
	static int threes;
	static int fours;
	static int sixes;
	static int number=0;
	//static int index=0;
	
	static void print()
	{
		if(number<=5)
		{
		for(int i=number-1;i>=0;i--)
		{
			System.out.println(player[i]+"   "+highScore[i]);
		}
		}
		if(number>5)
		{
			for(int i=number-1;i>=((number-1)-4);i--)
			{
				System.out.println(player[i]+"   "+highScore[i]);
			}
		}
	}
	
	static void sort()
	{
		for (int i = 0; i < number-1; i++)
		{    
		for (int j = 0; j < number-i-1; j++)
		
		{
			if (highScore[j] > highScore[j+1])
                {
                    // swap temp and arr[i]
                    int temp = highScore[j];
                    String temp1=player[j];
                    highScore[j] = highScore[j+1];
                    player[j]=player[j+1];
                    highScore[j+1] = temp;
                    player[j+1]=temp1;
                    
                }
			
            }
		}
	}
	static void delete()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter player name");
		String name=sc.nextLine();
		int index=20;
		for(int i=0;i<number;i++)
		{
			if(player[i].equals(name))
			{
				index=i;
				number=number-1;//total no. of players having high score reduced
				System.out.println("deleted");
				System.out.println(number+"  players in high score left ");
				break;
				
			}
			if(index==20)
			{
				System.out.println("no such name");
				
			}
			
		}
		
		if(index!=20 & index!=number)
		{
			for(int i=index;i<number;i++)
			{
				player[i]=player[i+1];
				highScore[i]=highScore[i+1];
				
			}
		}
		
	}
	
	
	static void insertion()
	{
		Scanner sc=new Scanner(System.in);
		//System.out.println("currently "+number+" players in scoreboard");
		
		if(number==10)
		{
			int score;
			String name;
			System.out.println("enter player details");
			System.out.println("enter player name");
			name=sc.nextLine();
			System.out.println("enter ones scored");
			ones=sc.nextInt();
			sc.nextLine();
			System.out.println("enter twos scored");
			twos=sc.nextInt();
			sc.nextLine();
			System.out.println("enter threes scored");
			threes=sc.nextInt();
			sc.nextLine();
			System.out.println("enter fours scored");
			fours=sc.nextInt();
			sc.nextLine();
			System.out.println("enter sixes scored");
			sixes=sc.nextInt();
			sc.nextLine();
			score= ones*1+twos*2+threes*4+fours*6+sixes*8;
			if(score>highScore[0])
			{
				highScore[0]=score;
				player[0]=name;
				sort();
				
			}
			
		}
		if(number>=5&number<10)
		{
			int score;
			String name;
			//int shift;//keep track of from which index to shift
			System.out.println("enter player details");
			System.out.println("enter player name");
			name=sc.nextLine();
			System.out.println("enter ones scored");
			ones=sc.nextInt();
			sc.nextLine();
			System.out.println("enter twos scored");
			twos=sc.nextInt();
			sc.nextLine();
			System.out.println("enter threes scored");
			threes=sc.nextInt();
			sc.nextLine();
			System.out.println("enter fours scored");
			fours=sc.nextInt();
			sc.nextLine();
			System.out.println("enter sixes scored");
			sixes=sc.nextInt();
			sc.nextLine();
			score= ones*1+twos*2+threes*4+fours*6+sixes*8;
				if(score>highScore[0])
				{
					number=number+1;
					highScore[0]=score;
					player[0]=name;
					sort();
				}
				
		}
		if(number<5)
		{
		number=number+1;
		
		System.out.println("enter player name");
		player[number-1]=sc.nextLine();
		System.out.println("enter "+player[number-1]+" details");
		System.out.println("enter ones scored");
		ones=sc.nextInt();
		sc.nextLine();
		System.out.println("enter twos scored");
		twos=sc.nextInt();
		sc.nextLine();
		System.out.println("enter threes scored");
		threes=sc.nextInt();
		sc.nextLine();
		System.out.println("enter fours scored");
		fours=sc.nextInt();
		sc.nextLine();
		System.out.println("enter sixes scored");
		sixes=sc.nextInt();
		sc.nextLine();
		highScore[number-1]= ones*1+twos*2+threes*4+fours*6+sixes*8;
		sort();
		
		}
		
		//both first colmn then row sort or first row sort then colnm sort is correct
		//take eg first row then colmn row 1 col1 element is smaller then row 1 colmn 2 element as row 1 col 1 elemnt is smallest in col 1 and row 1 col 2 element if smaller then should have been an element in column one which is smaller and that should have been in row 1 column 1-use this logic everywhere to convince yourself
		//row 1 column 1 element is 100% smaller than row 1 column 2 element as we have done column sort later
		//bubble sort
		//i denotes row	
		
		
	    }
	}

