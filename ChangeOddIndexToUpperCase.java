package week2.day4;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text = "naruto";
		//to get chart for string 
		char[] r = text.toCharArray();
		for (int i = 0; i < r.length; i++) {
			if (i % 2 != 1) {
				char e = r[i];
				char upperCase = Character.toUpperCase(e);
				System.out.print(upperCase);

//				System.out.println(r[i]);
//				Arrays.toString(r);
//				System.out.println(r);
//				
			} else {
				
				System.out.print(r[i]);
				
				
//				String s = new String(r);
//				System.out.println(s.toLowerCase());

			}
		}
	}
}
