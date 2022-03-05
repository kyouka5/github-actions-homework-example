import countries.Country;

import java.time.ZoneId;
import java.util.List;
import java.util.NoSuchElementException;

public class Solution implements Homework {
    @Override
    public String getTheFirstNonIndependentCountryName() {
        return countries.stream()
                .filter(Country::isIndependent)
                .map(Country::getName)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public List<String> getCountryNamesInUtcPlusEightTimezone() {
        return countries.stream()
                .filter(country -> country.getTimezones().contains(ZoneId.of("UTC+08:00")))
                .map(Country::getName)
                .toList();
    }
}