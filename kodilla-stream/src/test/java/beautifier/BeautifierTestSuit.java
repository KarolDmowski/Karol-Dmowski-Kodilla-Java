package beautifier;

import com.kodilla.stream.beautifier.PoemBeautifier;
import org.junit.Assert;
import org.junit.Test;

public class BeautifierTestSuit {
    @Test
    public void testCaseBeautifier(){
        //Given
        String textGiven = "TEXT";
        //When
        String result;
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        result = poemBeautifier.beautify("text", text -> text.toUpperCase());
        //Then
        Assert.assertEquals(textGiven,result);
    }
}
