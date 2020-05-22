import java.util.Scanner;

public class Email {
    // properties
    private String firstName, lastName, password, department, altEmail;
    private int mailbaoxCap;

    // constructor to recieve the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a Method asking for the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
    }

    // ask for the department
    private String setDepartment() {
        System.out.print(
                "DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Dev";
        } else if (depChoice == 3) {
            return "Acct";
        } else {
            return "";
        }
    }

    // generate a random password

    // set mailbox capacity

    // set the alternate email

    // change the password

}