import static org.junit.Assert.*;

import module_1.Third;
import org.junit.Test;

public class ThirdTest {

    @Test
    public void test() {
        Third tester = new Third();

        assertEquals("0 2 2 3 4 5 ", tester.pain(2, 6,
                new int[]{0, 0, 2, 3, 4, 5},
                new int[]{2, 0, 0, 0, 0, 0}),"11111");
        assertEquals("1 101 -1 ", tester.pain(2, 3,
                new int[]{1,1,1},
                new int[]{100,100,0}));
        assertEquals("0 0 0 1 1 1 2 -1 ", tester.pain(2, 8, new int[]{0,0,0,1,1,1,1,1}, new int[]{0,0,0,0,0,1,2,3}));
        assertEquals("0 -1 5 -1 12 ", tester.pain(1, 5, new int[]{0, 0, 5, 6, 12}, new int[]{5, 1, 7, 8, 3}));
        assertEquals("0 1 ", tester.pain(2, 2, new int[]{0,0}, new int[]{1,1}));
        assertEquals("0 1 25 ", tester.pain(2, 3, new int[]{0,1,25}, new int[]{1,1,10}));
        assertEquals("2  11 -1  19 21 ", tester.pain(2, 5, new int[]{2,4,10,15,19}, new int[]{9,8,9,2,1}));
        assertEquals("0 7 14 21 28 -1 ", tester.pain(4, 5, new int[]{0,2,4,6,21}, new int[]{7,7,7,7,7}));

    }
}