package lab2;

class Problem {
	String[] students=new String[4];
	String[] teachers=new String[3];
	public void setStudents(String s1,String s2,String s3,String s4) {
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		students[3]=s4;
	}
	public void setTeachers(String t1,String t2,String t3) {
		teachers[0]=t1;
		teachers[1]=t2;
		teachers[2]=t3;
	}
	public String[] getParticipants() {
		return students;
	}


}
