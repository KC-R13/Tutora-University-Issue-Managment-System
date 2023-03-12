
package Test;

import Models.Users;
import Controler.LoginController;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginUnitTest {
     static LoginController c;
    Users actual;

    @BeforeClass
    public static void CreateLogin() {
        c = new LoginController();
    }

    @Before
    public void SetValues() {
       // actual = c.x("KC");

    }

    @Test
    public void TestLogin() {
        assertNotNull(actual);
    }

    @After
    public void CleanValues() {
        actual = null;
    }

    @AfterClass
    public static void DeleteLogin() {
        c = null;
    }
}
