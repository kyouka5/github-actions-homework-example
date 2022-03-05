import countries.Country;
import countries.CountryRepository;

import java.util.List;

public interface Homework {
    List<Country> countries = new CountryRepository().getAll();

    /**
     * Returns the name of the first non-independent country.
     * @return the first non-independent country's name
     */
    String getTheFirstNonIndependentCountryName();

    /**
     * Returns the list of country names belonging to UTC+08.00 timezone.
     * @return the list of country names belonging to UTC+08.00 timezone
     */
    List<String> getCountryNamesInUtcPlusEightTimezone();
}
