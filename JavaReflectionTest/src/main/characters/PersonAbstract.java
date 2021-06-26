package main.characters;

public abstract class PersonAbstract {

	String id;
	String name;
	String firstSurname;
	String secondSurname;
	
	public PersonAbstract(String id, String name, String firstSurname, String secondSurname) {
		super();
		this.id = id;
		this.name = name;
		this.firstSurname = firstSurname;
		this.secondSurname = secondSurname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	
}
