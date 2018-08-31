import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner Input= new Scanner(System.in);
        System.out.print("Enter String: ");
        String s =Input.nextLine();
        if(vowels(s)) System.out.println(" YESIt contains a vowel!");
        else System.out.println(" NO It does not!");
    }
    public static boolean vowels(String s){
        String word = s.toUpperCase();
        char[] words = word.toCharArray();
        for(int i = 0; i<words.length; i++){
            char z = words[i];
            if (z=='A'||z=='E'||z=='I'||z=='O'||z=='U') return true;
        }
        return false;
	}
}
