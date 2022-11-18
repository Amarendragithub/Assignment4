
import java.io.*;
import java.util.Arrays;
import java.util.Collections;

class Anagram {
	static boolean areAnagram(char[] str1, char[] str2)
	{

		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}
	public static void main(String args[])
	{
		char str1[] = { 'k', 'e', 'e', 'p' };
		char str2[] = { 'p', 'e', 'e','k' };
	
		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
							+ " anagram of each other");
		else
			System.out.println("The two strings are not"
							+ " anagram of each other");
	}
}


