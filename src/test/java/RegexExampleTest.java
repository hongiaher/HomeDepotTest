import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by HHER on 9/14/2017.
 */
public class RegexExampleTest {

    RegexExample regexExample = new RegexExample();

    @Test
    public void testRegexOutput(){
        String actualOutput = regexExample.regexHomeDepot(regexExample.getInput());
        String expectedOutput = regexExample.getOutput();
        Assert.assertTrue(actualOutput.equals(expectedOutput), "Output was not as " +
                "expected:\nExpected: " + expectedOutput + "\nAcutal: " + actualOutput);
    }

    @Test
    public void testMatcherMatches(){
        String input = regexExample.getInput();
        Pattern pattern = Pattern.compile("(\\w+)(\\s+)(\\w+)(\\s+)(\\w+)(\\s+)(\\w+)([!.,]+)(\\w+)");
        Matcher matcher = pattern.matcher(input);
        Assert.assertTrue(matcher.matches(), "Input does not match pattern.\nInput: " + input + "\nPattern: " +
        pattern.toString());
    }
}
