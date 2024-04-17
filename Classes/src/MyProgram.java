import java.util.Scanner;

import university.*;

public class MyProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		
		Student[]  x = new Student[10];
		
		for(int i =0; i<x.length ; i++ )
		{
		
			System.out.println("please enter 'A'(Arch) or 'I'(Inf): ");
			String choice = input.nextLine(); 
			
			if(choice.equals("A"))
			{
				x[i] = new Arch_Std();
				System.out.println(x[i].calcGPA("A"));	
			}else
			if(choice.equals("I"))
			{
				x[i] = new Inf_Std();
				
				//casting
				Inf_Std q = (Inf_Std)x[i];
				q.pc= "awq";
				System.out.println(q.calcGPA("A"));	
			}
		
		}
	}

}
