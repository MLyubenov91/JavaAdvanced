import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchDatesTest {

    @Test
    public void Test_Match_ValidDate_ReturnsExpectedResult(){
        String input = "11-April-1970";
        String result = MatchDates.Match(input);
        assertEquals("Day: 11, Month: April, Year: 1970", result);
    }

    @Test
    public void Test_Match_MultipleMatches_ReturnsExpectedResult(){
        String input = "11-April-1970 31.December.1991";
        String result = MatchDates.Match(input);
        assertEquals("Day: 11, Month: April, Year: 1970\nDay: 31, Month: December, Year: 1991", result);
    }

    @Test
    public void Test_Match_NoMatch_ReturnsEmptyString(){
        String input = "11-April 1970 31.12.1991";
        String result = MatchDates.Match(input);
        assertEquals("", result);
    }

    @Test
    public void Test_Match_EmptyStringInput_ReturnsEmptyString(){
        String input = "";
        String result = MatchDates.Match(input);
        assertEquals("", result);
    }

}