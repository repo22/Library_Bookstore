import java.lang.reflect.Array;

public class Customer {
    private int Age;
    private Array List_Books;
    private String Name;
    private String Email;
    private String Phone_Number;
    private String Address;
    private int Penalties;

    public Customer(int Age, Array List_Books, String Name, String Email, String Phone_Number, String Address, int Penalties) {
        this.Age = Age;
        this.List_Books = List_Books;
        this.Name = Name;
        this.Email = Email;
        this.Phone_Number = Phone_Number;
        this.Address = Address;
        this.Penalties = Penalties;
    }
}
