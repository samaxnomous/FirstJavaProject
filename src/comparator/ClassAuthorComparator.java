package comparator;

public class ClassAuthorComparator implements Comparable<ClassAuthorComparator> {
	
	private int id;
	private String userName;
	public ClassAuthorComparator(int id, String userName) {
		this.id = id;
		this.userName = userName;
	}
	public int getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}
	@Override
	public String toString() {
		return "ClassAuthorComparator [id=" + id + ", userName=" + userName + "]";
	}
	
	@Override
	public int compareTo(ClassAuthorComparator other) {
		return other.id-this.id;
	}

	
	
	
	
	
}
