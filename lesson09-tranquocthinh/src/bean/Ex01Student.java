package bean;

public class Ex01Student {
	private String id;
	private String name;
	private Ex01ClassificationLevel level;

	public Ex01Student() {
		super();
	}

	public Ex01Student(String id, String name, Ex01ClassificationLevel level) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
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

	public Ex01ClassificationLevel getLevel() {
		return level;
	}

	public void setLevel(Ex01ClassificationLevel level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Ex01Student [id=" + id + ", name=" + name + ", level=" + level + "]";
	}
}
