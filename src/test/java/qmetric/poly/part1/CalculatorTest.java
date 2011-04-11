package qmetric.poly.part1;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CalculatorTest
{
    private static final Node ONE = new Node(' ', 1, null, null);

    private static final Node TWO = new Node(' ', 2, null, null);

    private static final Node THREE = new Node(' ', 3, null, null);

    private static final Node TWO_TIMES_THREE = new Node('*', 0, TWO, THREE);

    @Test
    public void calculateTwoTimesThreeEqualsSix()
    {
        assertThat(TWO_TIMES_THREE.evaluate(), equalTo(6));
    }

    @Test
    public void calculateOnePlusTwoTimesThreeEqualsSeven()
    {
        Node result = new Node('+', 0, ONE, TWO_TIMES_THREE);

        assertThat(result.evaluate(), equalTo(7));
    }
}
