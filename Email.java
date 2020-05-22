import java.util.Scanner;

public class Email {
    // properties
    private String firstName, lastName, password, department, altEmail, email;
    private String companySuffix = "aeycompany.com";
    private int mailbaoxCap = 500;
    private int defaultPasswordLength = 10;

    // constructor to recieve the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a Method asking for the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is: " + email);
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
    private String randomPassword(int length) {
        String passwordSet = "ABCDEGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailbaoxCap = capacity;
    }

    // set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    // change the password
    public void changePassword(String password) {
        this.password = password;
    }

    // get methods
    public int getMailboxCapacity() {
        return mailbaoxCap;
    }

    public String getAlternateEmail() {
        return altEmail;
    }

    public String getPassword() {
        return password;
    }

}