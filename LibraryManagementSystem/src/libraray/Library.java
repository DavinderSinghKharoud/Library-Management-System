package libraray;

import java.util.Scanner;

class Menu extends Librarian {
	void showMenu() {
		Scanner scan = new Scanner(System.in);
		char options;
		while (true) {
			System.out.println("A: Admin");

			System.out.println("B: Librarian");
			System.out.println("C: BookIssueScanner");

			char menu1 = scan.next().charAt(0);
			char menu = Character.toUpperCase(menu1);
			if (menu == 'A') {
				System.out.println("Enter Username");
				AdminName = scan.next();
				System.out.println("Enter Password");
				AdminPassword = scan.next();

				if (adminVerify(AdminName, AdminPassword)) {

					do {
						System.out.println("********************");
						System.out.println("A: Add Librarian");
						System.out.println("V: View Librarian");
						System.out.println("D :Delete Librarian");
						System.out.println("E: Exit");
						System.out.println("---------------------");
						System.out.println("Enter any option");
						System.out.println("---------------------");
						char optionsUpperCase = scan.next().charAt(0);
						options = Character.toUpperCase(optionsUpperCase);
						switch (options) {
						case 'A': {
							System.out.println("Enter Name");
							String n = scan.next();
							System.out.println("Enter Address");
							String add = scan.next();
							System.out.println("Set Id");
							String id = scan.next();
							System.out.println("Set Password");
							String pass = scan.next();
							addLibrarian(n, add, id, pass);
							break;
						}
						case 'V': {
							view();
							break;
						}
						case 'D': {
							Delete();
							break;

						}
						case 'E': {
							break;
						}
						default: {
							System.out.println("===================");
							System.out.println("Enter Correct Option");
							System.out.println("===================");
						}

						}
					} while (options != 'E');
				} else {
					System.out.println("************************************");
					System.out.println("Username and Password Does Not Match");
					System.out.println("************************************");
				}

			} else if (menu == 'B') {

				System.out.println("Enter your Id");
				String Id = scan.next();
				System.out.println("Enter your Password");
				String Password = scan.next();

				if (verify(Id, Password)) {

					do {
						System.out.println("********************");
						System.out.println("A:Add Books");
						System.out.println("V:View Books");
						System.out.println("I:Issue Books");
						System.out.println("B:Books Issued");
						System.out.println("R:Return Books");
						System.out.println("E:Exit");
						System.out.println("---------------------");
						System.out.println("Enter any option");
						System.out.println("---------------------");
						char optionsUpperCase = scan.next().charAt(0);
						options = Character.toUpperCase(optionsUpperCase);
						switch (options) {
						case 'A': {
							System.out.print("Type Book name:");
							String bookName = scan.next();
							System.out.print("Type Book Id:");
							String bookId = scan.next();
							addBook(bookName, bookId);
							break;
						}
						case 'V': {
							viewBook();
							break;
						}
						case 'I': {
							System.out.println("Enter Book Name:");
							String bookName = scan.next();
							System.out.println("Enter Book Id:");
							String bookId = scan.next();
							System.out.println("Enter Name of person:");
							String N = scan.next();

							try {
								System.out.println("Enter the phonenumber:");
								long PhoneNumber = scan.nextLong();
								IssueBook(bookName, bookId, N, PhoneNumber);
								System.out.println("Book issued");
								System.out.println("After the two weeks if anyone does not return the books "
										+ "he or she need to pay 10$ and after each week fine would increase at the rate of 10&");

							} catch (Exception e) {
								System.out.println("Enter integer value in phone number");
							}

							break;
						}
						case 'B': {
							BooksIssued();
							break;
						}
						case 'R': {

							System.out.println("Enter the name of person");
							String NamePerson = scan.next();
							System.out.println("Enter the phonenumber");
							try {

								long phoneNumberr = scan.nextLong();

								returnBook(NamePerson, phoneNumberr);
							} catch (Exception e) {
								System.out.println("Enter integer value");
							}
						}
						case 'E': {
							break;
						}
						default: {
							System.out.println("===================");
							System.out.println("Enter Correct Option");
							System.out.println("===================");
						}
						}
					} while (options != 'E');

				} else {
					System.out.println("************************************");
					System.out.println("Username and Password Does Not Match");
					System.out.println("************************************");

				}
			} else if (menu == 'C') {
				System.out.println("A: Enter Personal Details");
				System.out.println("B: Provide Id");
				System.out.println("E: Exit");
				char optionsUpperCase = scan.next().charAt(0);
				options = Character.toUpperCase(optionsUpperCase);
				switch (options) {
				case 'A': {
					System.out.println("Enter Your Name");
					String name = scan.next();
					System.out.println("Enter your phonenumber");
					try {
						long phonenumber = scan.nextLong();
						System.out.println("Enter verification code:");
						int verificationcode = scan.nextInt();
						if (verificationcode == 1234) {
							System.out.println("Place Barcode Of Book On Downside Of Screen to Scan");
							IssueBook("sunny", "kharoud", name, phonenumber);
							System.out.println("Book Issued");
							System.out.println("After the two weeks if anyone does not return the books "
									+ "he or she need to pay 10$ and after each week fine would increase at the rate of 10&");

						} else {
							System.out.println("Verification failed");
						}
					} catch (Exception e) {
						System.out.println("Enter integer value");
					}

					break;
				}
				case 'B': {
					System.out.println("Place Your Id On The Left Side Of Screen");
					System.out.println("Place Barcode Of Book On Downside Of Screen to Scan");
					try {

						System.out.println("Enter the phone Number");
						long phonenumber = scan.nextLong();
						System.out.println("Enter verification code:");
						int verificationcode = scan.nextInt();
						if (verificationcode == 1234) {

							IssueBook("kharoud", "234", " sunny", phonenumber);
							System.out.println("Book Issued");
							System.out.println("After the two weeks if anyone does not return the books"
									+ " he or she need to pay 10$ and after each week fine would increase at the rate of 10&");
						}
					} catch (Exception e) {
						System.out.println("Enter integer value");
					}

					break;
				}
				case 'E': {
					break;

				}
				}
			}

			else {
				System.out.println("Invalid option");
			}

		}
	}
}

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu obj = new Menu();
		obj.showMenu();
		// Username of admin is:sunny and Password is:1234
		// Verification code is 1234
	}

}
