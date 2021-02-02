package comparator;

//This Class doesn't provide write access to other developers. So can't implement Comparable interface to sort.

public class ClassUserComparator{
	
	private int id;
	private String userName;
	public ClassUserComparator(int id, String userName) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClassUserComparator other = (ClassUserComparator) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
