package SEZIONE_10_List_ArrayList_LinkedList.Esercizio_di_Codifica_44_Mobile_Phone;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact (String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact (String personName, String phoneNumber) {
        return new Contact(personName,phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return this.name.equals(contact.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

/*
Mobile Phone
Create a program that implements a simple mobile phone with the following capabilities.

1.  Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:
    -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
    -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
    -  And seven methods, they are (their functions are in their names):
        -  addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't exists, or false if the contact already exists.
        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
        -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists and was removed successfully, or false if the contact doesn't exists.
        -  findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
        -  findContact(), same as above, only it has one parameter of type String.
        -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name and then return the Contact. Return null otherwise.
        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:
1.	Contact List:
2.	1. Bob -> 31415926
3.	2. Alice -> 16180339
4.	3. Tom -> 11235813
5.	4. Jane -> 23571113

2. Implement the Contact class with the following attributes:
    -  Two fields, both String, one called name and the other phoneNumber.
    -  A constructor that takes two Strings, and initialises name and phoneNumber.
    -  And Three methods, they are:
        -  getName(), getter for name.
        -  getPhoneNumber(), getter for phoneNumber.
        -  createContact(), has two parameters of type String (the persons name and phone number) and returns an instance of Contact. This is the only method that is static.

TIP:  In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists before proceeding.
TIP:  Two Contact objects are equal if they have the same name.
TIP:  Be extremely careful about spaces in the printed message.

NOTE:  All fields are private.
NOTE:  Constructors should be defined as public.
NOTE:  All methods should be defined as public (except for the two findContact() methods which are private).
NOTE:  Do not add a main method to the solution code.
NOTE: Classes that are not in the java.lang package should be manually imported.
NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a constructor or if the constructor has the right arguments.

 */