package oops;

public class Stuent
{
	int sid;
	String sname;
	char grad;

	void printStudentData ()
	{
		System.out.println(sid+"   "+sname+"   "+grad);
	}

	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}

	Stuent(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;

	}


}
