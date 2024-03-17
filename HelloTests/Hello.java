package HelloTests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Hello {
    
    @Test
    public void CheckIfXEqual5(){
        int expected = 5;
        int actual = 5;
        Assertions.assertEquals(expected, actual);
        
    }
}
