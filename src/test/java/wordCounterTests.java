import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class wordCounterTests {
    @Test
    public void wordCounter_whenStringIsNullOrEmpty_shouldReturnZero()
    {
        //Arrange
        wordCounter counter = new wordCounter();
        //Act
        int number = counter.wordCounter("");
        //Assert
        assertEquals(number, 0);
    }
    @Test
    public void wordCounter_whenStringHasPunctuations_shouldRemoveIt()
    {
        //Arrange
        wordCounter counter = new wordCounter();
        //Act
        int number = counter.wordCounter("This, is a test and a good test.");
        //Assert
        assertEquals(number, 6);
    }
    @Test
    public void wordCounter_whenStringHasRepeatedWords_shouldCountItOnce()
    {
        //Arrange
        wordCounter counter = new wordCounter();
        //Act
        int number = counter.wordCounter("This is a test and a very good test");
        //Assert
        assertEquals(number, 7);
    }
}


