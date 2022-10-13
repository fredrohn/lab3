import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;

public class ListTests {
    @Test
    public void testListExamples(){

        List<String> input = new ArrayList<>();
        input.add("Fred");
        input.add("Frederick");
        input.add("Rohn");
        input.add("fortress");

        List<String> toCheck = new ArrayList<>();
        toCheck.add("Frederick");
        toCheck.add("fortress");
        
        assertEquals(toCheck, ListExamples.filterFixed(input, new longString()));
    }
}
