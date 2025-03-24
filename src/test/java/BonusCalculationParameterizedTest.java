import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.mirea.BonusService;

public class BonusCalculationParameterizedTest {
/*
@ParameterizedTest
@CsvSource(value = {"1000,true,100","1000,false,40","100000000,true,5000","1000000000,false,5000"})
    public void shouldTestBonusService(int purchaseAmount, boolean ifRegistered, int expectedValue) {

        BonusService bonusService = new BonusService();
        long actual = bonusService.bonusCalculation(purchaseAmount,ifRegistered);

        Assertions.assertEquals(expectedValue,actual);
}

    @ParameterizedTest
    @CsvFileSource(resources = "dataset.csv")
    public void shouldTestBonusServiceFileSource(int purchaseAmount, boolean ifRegistered, int expectedValue) {

        BonusService bonusService = new BonusService();
        long actual = bonusService.bonusCalculation(purchaseAmount,ifRegistered);

        Assertions.assertEquals(expectedValue,actual);
    }*/
}