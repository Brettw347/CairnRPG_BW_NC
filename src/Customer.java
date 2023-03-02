/*
Attributes:
     Name (String)
     SSN (int)
     Address (String)
     email (String)

Constructor: The first three parameters should be considered
mandatory, and then just fill in a dummy email address as
a default value for email.
 */

public class Customer {
    private String name;
    private int SSN;
    private String address;
    private String email;

    Customer(String n, int s, String a) {
        this.name = n;
        this.SSN = s;
        this.address = a;
        this.email = "defaultEmail@default.com";

    }


}
