import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import apiexample.User;

import java.io.InputStream;


public class JsonTest {
    @Test
    public void testUsersJson() throws Exception {
        InputStream stream = ClassLoader.getSystemResourceAsStream("users.json");
        String json = (IOUtils.toString(stream));
        User user = new Gson().fromJson(json, User.class);
        System.out.println(user.username);
    }
}