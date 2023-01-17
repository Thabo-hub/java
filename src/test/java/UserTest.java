package test.java;

import main.java.Grades;
import main.java.User;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

class UserTest {
    @Test
    void testLogin(){
        User testing = new User("name","email","password");
        assertEquals(true,testing.login());
    }

    @Test
    void testsSubject(){
        Grades testingG = new Grades();
        assertEquals("Science",testingG.checkSubject("GG"));
    }

    @Test
    void testMarks(){
        Grades testingG = new Grades();
        assertEquals(90,testingG.checkMarks("",0));
    }

}