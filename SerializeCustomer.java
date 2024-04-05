import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeCustomer {

    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "John Doe", "123-456-7890", "123 Main Street");

        // Create a FileOutputStream to write the object to a file
        FileOutputStream fos = new FileOutputStream("JavaObject.txt");

        // Create an ObjectOutputStream to write the object to the file
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Write the object to the file
        oos.writeObject(customer);

        // Close the ObjectOutputStream
        oos.close();

        // Close the FileOutputStream
        fos.close();

        System.out.println("Customer object serialized to JavaObject.txt file");
    }
}

class Customer implements java.io.Serializable {
    private int id;
    private String name;
    private String contactNo;
    private String address;

    public Customer(int id, String name, String contactNo, String address) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
