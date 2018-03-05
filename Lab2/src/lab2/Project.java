package lab2;

class Project {
	private String name;
	private int capacity;

	public Project() {

	}

	public Project(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return this.name;
	}

}
