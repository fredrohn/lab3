import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlaceAgain(){
    int[] input = {1,2,3,4,5,6};
    int[] toCheck = {6,5,4,3,2,1};
    ArrayExamples.reverseInPlaceFixed(input);
    assertArrayEquals(toCheck, input);
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedAgain(){
    int[] input = {1,2,3,4,5,6};
    int[] toCheck = {6,5,4,3,2,1};
    assertArrayEquals(toCheck, ArrayExamples.reversedFixed(input));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input = {2,2,2,2};
    double toCheck = 2.0;
    assertEquals(toCheck, ArrayExamples.averageWithoutLowestFixed(input), 0.01);
  }
}
