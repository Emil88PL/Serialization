import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

public class App {
    public static void main(String[] args) throws Exception {

        // Steps to Serialize

        // 1 Your object class should implement Serializable interface
        // 2 add import java.io.Serializable;
        // 3 FileOutputStream fileOut = new FileOutputStream(File path);
        // 4 ObjectOutputStream out = new ObjectOutputStream(fileOut);
        // 5 out.writeObject(objectName);
        // 6 out.close(); fileOut.close();

        
        User user1 = new User();
        user1.name = "Tony Montana";
        user1.password = "password_1234";

        User user2 = new User();
        user2.name = "Bob";
        user1.password = "password";


      
        
                                        // try catch block
        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser", false);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);

        out.writeObject(user1);
        out.writeObject(user2);

        out.close(); 
        fileOut.close();

        System.out.println("Object info saved...");

        long serialVersionUID = ObjectStreamClass.lookup(user1.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
