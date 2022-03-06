import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    @DisplayName("getTheFirstNonIndependentCountry should return the first non-independent country's name")
    void testGetTheFirstNonIndependentCountryName() {
        var actualResult = solution.getTheFirstNonIndependentCountryName();
        assertEquals("Åland Islands", actualResult);
    }

    @Test
    @DisplayName("getCountryNamesInUtcPlusEightTimezone should return a list of all country names in UTC+08.00 timezone")
    void testGetCountryNamesInUtcPlusEightTimezone() {
        var actualResult = solution.getCountryNamesInUtcPlusEightTimezone();
        var expected = List.of("Antarctica", "Australia", "Brunei Darussalam", "China", "Hong Kong", "Indonesia", "Macao", "Malaysia", "Mongolia", "Philippines", "Russian Federation", "Singapore", "Taiwan");
        assertEquals(expected, actualResult);
    }
}
