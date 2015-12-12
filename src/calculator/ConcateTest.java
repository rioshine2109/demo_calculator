package calculator;
import junit.framework.TestCase;

public class ConcateTest extends TestCase
{
	public void test()
	{
		calculator.Add a = new Add();
		int result = a.Add(10, 10);
		assertEquals(20, result);
	}
}