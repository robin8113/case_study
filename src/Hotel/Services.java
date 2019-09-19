package Hotel;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Services {
	int tot=0;
	int n;
	
	void serv() throws IOException {
	System.out.println("Services Offered");
	Scanner s=new Scanner(System.in);
     String str;
     int m,m1,m2,m3,m4;
	do
	{
		tot=0;
		System.out.println("Enter 1 for Ac(Rs.1000)/2 for non-AC(Rs.750)");
		m=s.nextInt();
		if(m==1)
		{
			tot=tot+1000;
		}
		else if(m==2)
		{
			tot=tot+750;
		}
	
		System.out.println("Enter 1 for cot(single)(Rs.0)/2 for cot(double)(Rs.350)");
		 m1=s.nextInt();
		if(m1==1)
		{
			tot=tot+0;
		}
		else if(m1==2)
		{
			tot=tot+350;
		}
		
		System.out.println("Enter 1 for with cable connection(Rs.50)/2 for without cable connection(Rs.0)");
		 m2=s.nextInt();
		if(m2==1)
		{
			tot=tot+50;
		}
		else if(m2==2)
		{
			tot=tot+0;
		}
		
		System.out.println("Enter 1 for wifi connection(Rs.200)/2 for without wifi connection(Rs.0)");
		 m3=s.nextInt();
		if(m3==1)
		{
			tot=tot+200;
		}
		else if(m3==2)
		{
			tot=tot+0;
		}
	
		System.out.println("Enter 1 for Laundary service(Rs.100)/2 for without Laundary Service(Rs.0)");
		 m4=s.nextInt();
		if(m4==1)
		{
			tot=tot+100;
		}
		else if(m4==2)
		{
			tot=tot+0;
		}
		System.out.println("Total Cost Of Booking="+tot);
		System.out.println("Needed any correction  enter yes/no \n");
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		 str=b.readLine();
	}while(str.equals("yes"));
		if(!(str.equals("No")))
		{
			System.out.println("The total facilities selcted  are:"); 
			if(m==1)
			{
				System.out.println("Ac room ");
			}
			else
			{
				System.out.println("Non Ac room ");
			}
			if(m1==1)
			{
				System.out.println("single cot ");
			}
			else
			{
				System.out.println("double cot ");
			}
			if(m2==1)
			{
				System.out.println("cable facility  ");
			}
			else
			{
				System.out.println("no cable facility  ");
			}
			if(m3==1)
			{
				System.out.println("wifi facility  ");
			}
			else
			{
				System.out.println("no wifi facility  ");
			}
			if(m4==1)
			{
				System.out.println("Laundary facility  ");
			}
			else
			{
				System.out.println("no laundary facility  ");
			}
			System.out.println("Total Cost Of Booking="+tot);
		}
		
	
	}
	}




