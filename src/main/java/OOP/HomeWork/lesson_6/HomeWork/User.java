package OOP.HomeWork.lesson_6.HomeWork;

public class User{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return  name;
	}

}