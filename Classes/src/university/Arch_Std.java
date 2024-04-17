package university;

public class Arch_Std extends Student{
	
	public String tool;
	
	public double calcGPA ( String subj) 
	{
		if(subj == "A")
			return 85;
		return 0 ;
	}
}
