package FirstProject;

public class GetTestSetTest {
	
	int age;
	String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String args[]) {
		GetTestSetTest gt = new GetTestSetTest();
		gt.setAge(12);
		int age = gt.getAge();
		System.out.println("Age is: " + age);
		gt.setName("Aishwarya");
		String name = gt.getName();
		System.out.println("Name is: " + name);
	}
	

}
