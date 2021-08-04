package assignment;


public  class TollsMethod implements Toolbooth
{

	int lastReceipt,collectReceipt;
    @Override
    public void calculateToll(Truck t)
    {
        System.out.println("----- Truck Number: "+(collectReceipt+1)+" -------");
        int totalDue=(5*t.getAxles())+(10*(t.getWeight()/500));
        System.out.println("Total Axles:    "+t.getAxles());
        System.out.println("Total Weight:   "+t.getWeight());
        System.out.println("Total Amount:  "+"$"+totalDue);
        lastReceipt+=totalDue;
        collectReceipt+=1;
    }

    @Override
    public void displayData()
    {
    	System.out.println();
    	System.out.println("Collection of the day--------------");
        System.out.println("Total Trucks:  "+collectReceipt);
        System.out.println("Today Collection:   "+lastReceipt);
    }
    
    void reset()
    {
    	lastReceipt=0;
    	collectReceipt=0;
    }
    
    void displayAfter()
    {
		System.out.println();
		System.out.println("------------Reset Receipts------------");
		System.out.println("Collection at- Receipts :$"
							+lastReceipt+", Trucks :"+collectReceipt);
		System.out.println();
    }

 public static void main(String[] args) {
    	
	 TollsMethod st = new TollsMethod();
 
    	System.out.println("Welcome To Allegheny TollBooth*************8");
    	System.out.println();
        Truck ford =new Truck(5,12500);
        System.out.println("Arrival of Ford Truck------");
        System.out.println();
        st.calculateToll(ford);
        
        Truck nissan=new Truck(2,5000);
        System.out.println();
        System.out.println("Arrival of nissan Truck------");
        System.out.println();
        st.calculateToll(nissan);
        
        Truck daewoo=new Truck(6,17000);
        System.out.println();
        System.out.println("Arrival of daewoo Truck------");
        System.out.println();
        st.calculateToll(daewoo);
        
        Truck chevrolet=new Truck(6,17000);
        System.out.println();
        System.out.println("Arrival of chevrolet Truck------");
        System.out.println();
        st.calculateToll(chevrolet);
        
        st.displayData();
        
        st.reset();
        st.displayAfter();

    }
}


