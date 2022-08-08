package edunova;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LoveCalculator {

 

    private int recursivelyCalculateLovePercent(final String letterValues) {
        if (letterValues.length() <= 2) {
            return Integer.parseInt(letterValues);
        }

        StringBuilder newLetterValues = new StringBuilder();
        final String[] letterArrayValues = letterValues.split("");
        for (int i = 0, j = letterArrayValues.length - 1; i <= j; i++, j--) {
            if (i == j) {
                newLetterValues.append(letterArrayValues[i]);
                break;
            }
            newLetterValues.append(Integer.parseInt(letterArrayValues[i]) + Integer.parseInt(letterArrayValues[j]));
        }

        return recursivelyCalculateLovePercent(newLetterValues.toString());
    }
}
