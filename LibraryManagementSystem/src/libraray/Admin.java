package libraray;

public class Admin {
	String LibrarianName;
	String LibrarianAddress;
	String LibrarianId;
	String Password;
	String AdminName;
	String AdminPassword;

	void addLibrarian(String LibrarianName, String LibrarianAddress, String LibrarianId, String Password) {
		this.LibrarianName = LibrarianName;
		this.LibrarianAddress = LibrarianAddress;
		this.LibrarianId = LibrarianId;
		this.Password = Password;
	}

	void view() {
		System.out.println("Librarian [LibrarianName=" + LibrarianName + ", LibrarianAddress=" + LibrarianAddress
				+ ", LibrarianId=" + LibrarianId + "]");
	}

	void Delete() {
		LibrarianName = null;
		LibrarianAddress = null;
		LibrarianId = null;
		Password = null;
	}

	boolean adminVerify(String AdminName, String AdminPassword) {
		if (AdminName.equals("sunny") && AdminPassword.equals("1234")) {
			return true;
		} else {
			return false;
		}
	}

}
