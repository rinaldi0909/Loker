package Job.co;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Loker {

	public static void main (String args[])
	{
	  
	    Scanner input=new Scanner(System.in);
	    System.out.print("Init Loker: ");
	    
	    BufferedReader bilangan=new BufferedReader(new InputStreamReader(System.in));
	  
	    int n=input.nextInt();
	    System.out.println("Berhasil membuat loker dengan jumlah :"+n);
	    String nama[]=new String[n];
	    String status[]=new String[n];
	    int identitas[]=new int[n];
	    String identitas1[] = {"KTP","SIM"};

	    
	    
	    for (int i=0;i<n;i++){
	        System.out.println("Identitas : "+(i+1));
	        System.out.print("Tipe Identitas : ");
	        nama[i]=input.next();

	        System.out.print("No Identitas : ");
	        identitas[i]=input.nextInt();
	        
	        System.out.println("");

	        /*if (nilai[i]<=0) {
	                status[i]="";
	            } else {
	                status[i]="";
	            }*/
	    }
	    System.out.println("");
	    System.out.println("STATUS");
	    System.out.println("======================");
	    System.out.println("No Loker      Tipe Identitas   No Identitas  ");
	    
	    for (int i=0; i<n;i++) {
	        System.out.println((i+1)+"             "+nama[i]+"              "+identitas[i]);
	    }
	    
	    System.out.print("Input KTP: ");
		int KTP = input.nextInt();
		System.out.println("Maaf Loker sudah penuh ");
	    
	    
	    try{
	    	

		    int size=0;
			int[] arr = new int[5];
			int i;
		    
	    System.out.print("Leave : ");
		 int cari=Integer.parseInt(bilangan.readLine());
		 System.out.println();
		 
		  /*System.out.println("Data awal"); 
		  for(int d = 0; d < size; d++)
		  System.out.print(arr[d]+" ");*/
		  
		  //System.out.println();
		  //System.out.println();
		   
		  System.out.println("Loker No:"+n);
		  System.out.print("berhasil dikosongkan");
		  for (int a=0; n<n;a++){
		        if(cari == arr[n]){
		     arr[n]=0;
		   }
		  else{
		  System.out.print(arr[a]+" ");}
		 }
		  
		  }
		  
		catch(Exception e){
		 System.out.println("Loker Nomor:"+n);
		        }}}
		        