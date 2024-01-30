package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class GreetTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    Main greeter = new Main();

    @Test
    public void greet(){

        
       String actual = greeter.greet("Bob");
       String expected = "Hello, Bob";

       assertEquals(expected,actual);
    }

    @Test
    public void nameCheck(){
        String actual = greeter.greet(null);
        String expected = "Hello, my friend.";

        assertEquals(expected,actual);
    }

    @Test
    public void uppercaseLettersCheck(){
        String actual = greeter.greet("HEJ");
        String expected = "HELLO, HEJ";

        assertEquals(expected, actual);
    }

    @Test
    public void twoNameCheck(){

        String actual = greeter.greet("Jake ", "Jill");
        String expected = "Hello, Jake and Jill";

        assertEquals(expected, actual);
    }

    @Test
    public void moreThanTwoNames(){
        String actual = greeter.greet("Jim", "Jill", "Jens", "Mona", "Tove");
        String expected = "Hello, Jim, Jill, Jens, Mona and Tove.";

        assertEquals(expected,actual);
    }

    @Test
    public void upperCaseLetterCheck(){
        String actual = greeter.greet("Henrik", "Mona", "TOVE");
        String expected = "Hello, Henrik, Mona and TOVE.";

        assertEquals(expected,actual);
    }

    @Test
    public void checkForCommas(){
        String actual = greeter.greet("Helga,", "Tove", "Ditlev");
        String expected = "Hello, Helga, Tove and Ditlev.";

        assertEquals(expected, actual);
    }
    @Test
    public void someCommasAreOkay() {
        String actual = greeter.greet("Torben,", "\"Tove, Henning\"", "Ditlev");
        String expected = "Hello, Torben, Tove, Henning and Ditlev.";

        assertEquals(expected, actual);
    }

}