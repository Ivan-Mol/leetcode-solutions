package interviews;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PojoExampleTest extends TestCase {
    private PojoExample example;

    @Before
    public void setUp() throws Exception {
        example = new PojoExample("Bob", 35, "QA");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("test complited");
    }

    @Test
    public void testTestGetName() {
        Assert.assertEquals("Bob", example.getName());
    }
    @Test
    public void testTestSetName() {
        example.setName("Ivan");
        Assert.assertEquals("Ivan", example.getName());
    }
}