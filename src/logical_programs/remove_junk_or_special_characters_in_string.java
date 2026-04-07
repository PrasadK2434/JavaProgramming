package logical_programs;

public class remove_junk_or_special_characters_in_string
{
	public static void main (String args [])
	{
		String s= "abc%*#dkgnj";

		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

		String s1="ergjnjk$$$$$$%%%%%%#######&&&&&&&&&";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);









	}

}
