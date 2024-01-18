
package user;

import java.util.HashMap;
import java.util.Map;
public class UserManager {
     private static final Map<String, String> userDatabase = new HashMap<>();

    public static boolean registerUser(String username, String password) {
        if (!userDatabase.containsKey(username)) {
            userDatabase.put(username, password);
            return true; // Registration successful
        }
        return false; // Username already exists
    }

    public static boolean authenticateUser(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }

}
