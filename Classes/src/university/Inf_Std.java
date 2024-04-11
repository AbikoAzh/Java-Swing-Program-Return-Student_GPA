package university;

public class Inf_Std extends Student{
	
	public String pc;
	
	public Inf_Std(){
		this.Id= 23;
		this.Subject = new String[12];
	}
	
	public double calcGPA (String subj){
		if(subj == "A")
			return 90;
		return 0;
	}
	

}
