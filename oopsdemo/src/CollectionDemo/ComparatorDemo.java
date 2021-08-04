package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Developer>  a1=new ArrayList<Developer>();
		
		Developer d1=new Developer(103,"mike","Java");
		Developer d2=new Developer(105,"gosee","Dot net");
		Developer d3=new Developer(101,"luiike","Angular");
		Developer d4=new Developer(102,"johne","Php");
		Developer d5=new Developer(104,"navin","Oracle");
		
		a1.add(d1);a1.add(d2);a1.add(d3);a1.add(d4);a1.add(d5);
		
		System.out.println("-----------Unsorted-----------");
		for(Developer i:a1)
			
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
		
		//sort by id
		System.out.println("-----------sort by ID-----------");
		for(Developer i:a1)
			
		{
			System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
		}
        
		//sort by Domain of developer
		Collections.sort(a1,new DomainComparator());
				System.out.println("-----------sort by Domain-----------");
				for(Developer i:a1)
					
				{
					System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
				}
		        
	}

}
