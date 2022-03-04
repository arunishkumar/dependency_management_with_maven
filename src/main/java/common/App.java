package common;


public class App {
	
	
	public String truncateFirst2AsCharacters(String str)
    {
    	if(str.length()<=2)
    	{
    		return str.replaceAll("A", "");
    	}
         String first2Characters=str.substring(0,2);
         String otherCharacters=str.substring(2);
         return first2Characters.replaceAll("A", "")+otherCharacters;
    }
}

