package qsp;

public class hospital {
	String name;
	String location;
	void patientReg(String pname)
	{
		
		patient p=new patient( pname);
		System.out.println("Registration done for "+pname);


	}

}
