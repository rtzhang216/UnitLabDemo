import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
       myString.setString("Google");
       assertEquals(true, myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("leetCode");
        assertEquals(false, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString("USA");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("A");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest6() {
        myString.setString("a");
        assertEquals(true, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest7() {
        myString.setString("");
        assertEquals(false, myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest8() {
        myString.setString(null);
        assertEquals(false, myString.detectCapitalUse());
    }
}
