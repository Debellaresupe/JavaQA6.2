import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/TestParameters.csv")


    public void bonusServiceTest(long amount, boolean registered, int expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}
