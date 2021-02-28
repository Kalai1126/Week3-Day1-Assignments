package week3.Day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The Students info is retreived by id: "+ id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("The Students info is retreived by id: "+id+" and Name:"+ name);
	}

	public void getStudentInfo(String Email, int PhoneNum) {
		System.out.println("The Students info is retreived by Email: "+Email+" and PhoneNumber:"+ PhoneNum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students St = new Students();
		St.getStudentInfo(112233);
		St.getStudentInfo(112233, "Kalaivani");
		St.getStudentInfo("Students.Info@TestLeaf.com", 1234567890);
	}

}
