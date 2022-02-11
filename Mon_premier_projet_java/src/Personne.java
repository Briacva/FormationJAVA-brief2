public class Personne {
	private String firstname;
	private String lastname;
	private String sex;
	private int age;
	private int weight;
	private int height;
	
	public Personne(String Firstname, String Lastname, String Sex, int Age, int Weight, int Height) {
		this.firstname = Firstname;
		this.lastname = Lastname;
		this.sex = Sex;
		this.age = Age;
		this.weight = Weight;
		this.height = Height; 
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
