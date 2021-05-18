package tollplaza;
import java.util.*;
import datetype.*;
public class tollplaza {
	
	static void vechiletype(String t)
	{
		String s1="1",s2="2",s3="3";
		if(t.equals(s1))
			//System.out.print(s1);
			vechiletax(s1);
		else if(t.equals(s2))
			vechiletax(s2);
		else if(t.equals(s3))
			vechiletax(s3);
		else
			System.out.print("invalid input");
			
	}

	
	static void vechiletax( String vechile)
	{
		String t1="1",t2="2",t3="3";
		String s1="1",s2="2",s3="3";
		
		//for vechile type is car
		if(vechile.equals(s1))
		{
			System.out.println("Enter the trip which you go enter the chocie:");
			System.out.println("press key "
					+ "1.oneside   "
					+ "2. twoway  "
					+ "3. multiway");
			Scanner kb= new Scanner(System.in);
			String trip=kb.nextLine();
			
			if(trip.equals(t1))
			{
				int fare_oneside=100; 
				System.out.println("one way trip fare :-" +fare_oneside);
			}
			else if(trip.equals(t2))
			{
				int fare_twoway=150; 
				System.out.println("fare for up down :-" +fare_twoway);
			}
			else if(trip.equals(t3))
			{
				int fare_mutliway=0; 
				System.out.println("fare for multiway trip :-"+fare_mutliway);
			}
		}
		//for truck type vechile
		if(vechile.equals(s2))
		{
			System.out.println("Enter the trip which you go enter the chocie:");
			System.out.println("press key"
					+ " 1.oneside "
					+ " 2. twoway"
					+ " 3. multiway");
			Scanner kb= new Scanner(System.in);
			String trip2=kb.nextLine();
			
			if(trip2.equals(t1))
			{
				int fare_oneside=200; 
				System.out.println("one way trip fare :-" +fare_oneside);
			}
			else if(trip2.equals(t2))
			{
				int fare_twoway=400; 
				System.out.println("fare for up down :-" +fare_twoway);
			}
			else if(trip2.equals(t3))
			{
				int fare_mutliway=0; 
				System.out.println("fare for multiway trip :-"+fare_mutliway);
			}
		}
		//for govt vechile 
		if(vechile.equals(s3))
		{
			System.out.println("Enter the trip which you go enter the chocie:");
			System.out.println(" press key 1.oneside   2. twoway  3. multiway");
			Scanner kb= new Scanner(System.in);
			String trip3=kb.nextLine();
			
			if(trip3.equals(t1))
			{
				int fare_oneside=00; 
				System.out.println("one way trip fare :-"+fare_oneside);
			}
			else if(trip3.equals(t2))
			{
				int fare_twoway=0; 
				System.out.println("fare for up down -:" +fare_twoway);
			}
			else if(trip3.equals(t3))
			{
				int fare_mutliway=0; 
				System.out.println("fare for multiway trip -:"+fare_mutliway);
			}
		}
	}
	
	static void output(String driver,String vnum,String vtypes)
	{
		System.out.println("driver name :"+driver);
		System.out.println("vehicle number :"+vnum);
		//System.out.println("Total tax");
		if(vtypes=="1") 
		{
			System.out.println("vechile type :Light weight");
		}
		else if (vtypes=="2")
		{
			System.out.println("vechile type :Heavy weight");
		}
		else
		{
			System.out.println("vechile type :Goverment Vehicle");
		}
		datetype obj=new datetype();
		obj.msg();
		System.out.println("do you want to cont...  yes(1) or  no(0)");
		Scanner kb= new Scanner(System.in);
		int i =kb.nextInt();
		if(i==1)
		{
			main(null);
		}
		else
		{
			System.out.println("Thanks for Using my services");
		}
	}
	public static void main (String args[])
	{
		
		//datetype obj=new datetype();
		Scanner kc=new Scanner (System.in);
		System.out.println("enter the driver name");
		String Drivername=kc.nextLine();
		System.out.println("enter the name of the vehicle number");
		String vehiclenum=kc.nextLine();
		System.out.println("enter the name of the vechile type choice");
		System.out.println("press key "
				+ "1.lightweight "
				+ "2.heavyweight  "
				+ "3. govt. vehicle");
		String vechile_type=kc.nextLine();
		vechiletype(vechile_type);
		//obj.msg();
		output(Drivername,vehiclenum,vechile_type);

	}
	
}

