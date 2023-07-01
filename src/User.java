import java.io.Serializable;

public class User  implements Serializable {

    // public static final long serialVersionUID = 1L;
    
    String name;
    transient String password;

    public void seyHello() {
        System.out.println("Hello " + name);
    }
}
