package libraray;

public class Librarian extends Admin {
	String BookName;
	String BookId;
	String Name, IssueBookName, IssueBookId;
	long PhoneNumber;

	void addBook(String BookName, String BookId) {
		this.BookName = BookName;
		this.BookId = BookId;
	}

	boolean verify(String LibrarianId, String Password) {
		if (LibrarianId.equals(this.LibrarianId) & Password.equals(this.Password)) {
			return true;
		} else {
			return false;
		}
	}

	void viewBook() {
		System.out.println("Book name: " + BookName);
		System.out.println("Book Id: " + BookId);
	}

	void IssueBook(String bookName, String bookId, String Name, long PhoneNumber) {

		IssueBookName = bookName;
		IssueBookId = bookId;
		this.Name = Name;
		this.PhoneNumber = PhoneNumber;

	}

	void BooksIssued() {
		System.out.println("Name of Person:" + Name);
		System.out.println("Phonenumber:" + PhoneNumber);
		System.out.println("Book name is:" + IssueBookName);
		System.out.println("Book Id is: " + IssueBookId);
	}

	void returnBook(String name, long phonenumber) {
		
		if (name.equals(Name) && PhoneNumber==phonenumber) {
			Name = null;
			PhoneNumber = 0;
			IssueBookId = null;
			IssueBookName = null;
			System.out.println("Book Returned");
		}else {
			System.out.println("No Book Issued");
		}
		
		
	}

}
