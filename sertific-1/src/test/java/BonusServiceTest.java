import org.example.BonusService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BonusServiceTest {
    @Test
    public void shouldCheckRegisteredUnderLimit() {
        long expected = 1000;
        BonusService bonusService = new BonusService();
        long actual = bonusService.bonusCalculation(10000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCheckRegisteredOverLimit() {
        long expected = 5000;
        BonusService bonusService = new BonusService();
        long actual = bonusService.bonusCalculation(1_000_000, true);
        Assertions.assertEquals(expected, actual);
    }
}
