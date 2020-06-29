import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class StandardDev {

	public static void main(String[] args){
		//double mean;
		double sd;
		double variance=0;
		Scanner scan = new Scanner(System.in);
		ArrayList <Double> list = new ArrayList<Double>();
		ArrayList <Double> list1 = new ArrayList<Double>();
		ArrayList <Double> listSq = new ArrayList<Double>();
		list.clear();
		list1.clear();
		listSq.clear();
		
		System.out.println("Size of data?  \n");
		int x = scan.nextInt();
		System.out.println("------------------------------------------------------");
			double [] data = new double[x];
			  for(int i= 0; i<x; i++){
				  data[i]= scan.nextDouble();  
			  }
			  
			  System.out.println("THE GIVEN DATA LIST IS");
			  System.out.println("--------------------------------------------------");
			 /* for(int i= 0; i<x; i++){
				  System.out.println(data[i]);  
			  }
			  */
			  // for mean
			  
			  for(int i=0; i<x; i++){
				 list.add(data[i]);
			  }
			  // INPUTTING THE ARRAY TO ARRAYLIST
			  for(int i=0; i<x; i++) {
				  System.out.println(list.get(i));
			  }
			  
			 // FOR SORTING
			/*  Collections.sort(list);
			  System.out.println("THE SORTED DATA IS");
			  for(double i : list){
				  System.out.println(i + "\t");
			  }
			  System.out.println("\n");
				  */
			  //FOR MEAN
			  
			  System.out.println("Mean");
			  double mv = 0;
			   for(double i: list) {
				    mv = mv + i;
			   }
			   double xbar = mv/list.size();
			   System.out.println(xbar);
			   
			   System.out.println("\n");
				   
		// The x-mean data list
			   
			   for(int i=0; i<x; i++)
			   {
				   list1.add(data[i]-xbar);
			   }
			   
			   System.out.println("The mean value difference list is");
			   System.out.println("-----------------------------------------");
			    for(int i=0; i<x ; i++) {
			    	System.out.println(list1.get(i));
			    } 
			    System.out.println("-----------------------------------------");
			    System.out.println("\n");
			    
	   // Sqaure of mean value difference
			    
			     for(int i=0; i<x ; i++) {
			    	 listSq.add(list1.get(i)* list1.get(i));
			    	 //listSq.add(Math.pow(list1.get(i),2));
			     }
			    	
			     System.out.println("The meanValueDifferenceSquare is");
			     for(int i=0; i<x; i++) {
			    	 System.out.println(listSq.get(i));
			     }
			     
			     
	   // sum of MeanValueDifferenceSquare E(x-Xvar) square
			     double ssd=0;
			     for(int i=0; i<x; i++) {
			    	 ssd += listSq.get(i);
			     }
			     System.out.println("-----------------------------------");
			     System.out.println("the value of summation diffrence sqaure is " + ssd);
			     
			     
      // STANDARD DEVIATION and VARIANCE
			     
			    sd = Math.sqrt(ssd/(x-1));
			    variance = ssd/(x-1);
			    
			 System.out.println("Standard deviation: "+ sd + "\t" + "Variance :" + variance );
			   
			 
	 //FINAL TABLE
			 System.out.println("The final Table");
			 System.out.println("x\t (x-xB)\t (x-xB)SQ");
			 System.out.println("--------------------------------------------------------------");
			 for(int i=0 ; i<x; i++) {
				 System.out.println(list.get(i)+"\t " + list1.get(i)+ "\t "  + listSq.get(i));
			 }
			 System.out.println("--------------------------------------------------------------"); 
			 System.out.println("mean :" + xbar);
			 System.out.println("Standard Deviation: : " + sd);
			 System.out.println("Variance :" + variance);		 
			 
			 scan.close();
	}
	
}
