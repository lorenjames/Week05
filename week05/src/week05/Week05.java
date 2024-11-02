package week05;

public class Week05 {

	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  
	  System.out.println(isAPalindrome("racecar"));
	  
	  Person person = new Person("Sam",4);
	  
	  System.out.println(person.getName() + " " + person.getAge());
	 
	  }
	 

	public static Boolean isAPalindrome(String word) {

		for (int index = 0; index < (word.length() / 2); index++) {

			if (word.charAt(index) != word.charAt((word.length() - 1) - index)) {
				return false;
			}
		}

		return true;

	}
	
	

}
