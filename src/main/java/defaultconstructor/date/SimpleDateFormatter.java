package defaultconstructor.date;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Locale;

public class SimpleDateFormatter {

    private CountryCode defaultCountry;
    private final String SEPARATOR = "-";


    public SimpleDateFormatter() {
        defaultCountry = CountryCode.HU;
    }

    public String formatDateString(SimpleDate simpleDate) {
        return formatDateStringByCountryCode(defaultCountry, simpleDate);
    }


    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if (countryCode == CountryCode.HU) {
            return simpleDate.getYear() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getDay();
        } else if (countryCode == CountryCode.EN) {
            return simpleDate.getDay() + SEPARATOR + simpleDate.getMonth() + SEPARATOR + simpleDate.getYear();
        } else {
            return simpleDate.getMonth() + SEPARATOR + simpleDate.getDay() + SEPARATOR + simpleDate.getYear();
        }
    }
}
