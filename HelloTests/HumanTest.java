package HelloTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Hello.Human;

public class HumanTest {
     @Test
    void testGetAge() {
        // Arrange
        int expected = 25;
        Human testDemo = new Human("Test",expected);
        // Act
        int actual = testDemo.getAge();
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetName() {
        // Arrange
        String expected = "Test";
        Human testDemo = new Human(expected,25);
        // Act
        String actual = testDemo.getName();
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetAge() {
        // Arrange
        int expected = 25;
        Human testDemo = new Human("Test", expected);
        // Act
        testDemo.setAge(expected);
        int actual = testDemo.getAge();
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testSetName() {
        // Arrange
        String expected = "Test1";
        Human testDemo = new Human("null", 0);
        // Act
        testDemo.setName(expected);
        String actual = testDemo.getName();
        // Assert
        Assertions.assertEquals(expected, actual);
    }
}
