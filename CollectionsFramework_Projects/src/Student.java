
public class Student {

	private int sno;
	private String name;
	private String colleageName;

	public Student(int sno, String name, String colleageName) {
		this.sno = sno;
		this.name = name;
		this.colleageName = colleageName;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColleageName() {
		return colleageName;
	}

	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", colleageName=" + colleageName + "]";
	}

}
