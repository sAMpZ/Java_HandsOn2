import java.util.Random;

//person class with random number generator method
class Person{
	String name;
	public Person(String personName) {
		
		name= personName;
	}

	public int randNum(int min, int max){
		
		Random rand = new Random();
		
		int number = rand.nextInt(max) + min;
		return number;
	}
	
	}


public class Race {

	public static void main(String[] args) {
		
		//two people in the race
		Person person1 = new Person("Bruce");
		Person person2 = new Person("Micheal");
		
		int person1Number = person1.randNum(1, 1000);
		int person2Number = person2.randNum(1, 1000);
		
		//make sure their numbers are not equal
		while( person1Number==person2Number){
			
			person1Number =person1.randNum(1, 1000);
			person2Number = person2.randNum(1, 1000);
			
		}
		if(person1Number > person2Number){
			
			System.out.printf("%s wins the race, his number is %d, %s's numbers is %d",person1.name, person1Number, person2.name, person2Number);
		}
		else{
			System.out.printf("%s wins the race, his number is %d, %s's numbers is %d", person2.name, person2Number, person1.name, person1Number);	
			
		}
	}

}