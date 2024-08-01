package src.Model.Entity;

import java.util.ArrayList;
import java.util.List;

public class User extends Person{

    private long phoneNumber;
    private String email;
    private Address address;
    private double balance;

    List<Book> borrowBooks;


    public User(String name, String surname, long id,long phoneNumber,String email,
                Address address, double balance) {
        super(name, surname, id);
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.balance = 0.0d;
        this.borrowBooks = new ArrayList<Book>();


    }


}
