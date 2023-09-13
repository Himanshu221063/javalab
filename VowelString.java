import java.util.*;
public class VowelString
{
	public static void main(String[] args) {
	    String a="umbrella";
	    int x=0;
	    int v=0;
	    boolean per=false;
	    for(int i=0;i<a.length();i++)
	    {
	        if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
	        {
	            x++;
	        }
	        else
	        {
	            v++;
	        }
	    }
	    System.out.println("Vowels: "+x + " \nConsonants: "+ v);
	}
}