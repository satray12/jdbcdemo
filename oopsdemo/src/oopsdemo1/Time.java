package oopsdemo1;

/* Java program to perform addition of 2 Time
 * t1 --> 12 : 45 :55
 * t2 --> 10 : 30 :30
 *
 * t1 + t2
 *   if sec> 60 .. mins should be incremented & sec -60,,
 *   if min> 60  ... hrs should be incremented & min -60
 */



public class Time {
	
	int hrs,min,sec;
	Time()
	{
		hrs=min=sec=0;
		
	}
	Time (int h,int m,int s)
	{
		hrs=h;
		min=m;
		sec=s;
		
	}
	
	void add(Time t)
	{
		
	}
}
