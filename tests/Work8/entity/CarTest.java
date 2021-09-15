package Work8.entity;

import Work8.exception.EngineStartException;
import junit.framework.TestCase;
import org.junit.Test;

public class CarTest {

    @Test(expected = EngineStartException.class)
    public void testCheckEngineNumber_shouldThrowAnException() throws EngineStartException {
        // Given
        int num = 8;
        Car car = new Car();

        //When
        car.checkEngineNumber(num);
    }
}