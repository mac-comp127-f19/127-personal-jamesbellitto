package basicjava.test;

import basicjava.Hypotenuse;
import org.junit.jupiter.api.Test;

public class HypotenuseTest {
    @Test
    public void testHypotenuse(){
        assert Hypotenuse.calculateHypotenuse(3.0,4.0) == 5.0;

    }
}
