package university;

public abstract class Student extends Human 
{
	//abstract method
	//public abstract int f1(int x);
	
	public String[] Subject;
	
	public Student ()
	{
		this.Id = 45;
		this.Name = "ahmed";
		this.Mobile = "4546";	
	}
	
	public double calcGPA ( String subj) 
	{
		if(subj == "A")
			return 95;
		return 0 ;
	}
		
	public double calcGPA (String[] subj)
	{
		if (subj[0] == "A")
			return 85;
		return 0;
	}
}
