
import org.junit.Assert;
import org.junit.Test;


public class ArrayListTest {

    private ArrayList<String> arrayList = new ArrayList<>(String.class);

    @Test
     public void testAddValueById() {
        arrayList.add("First value",0);
        arrayList.add("Second value", 0);
        Assert.assertEquals(2, arrayList.size());
        arrayList.add("Third value", 2);
        Assert.assertEquals(3, arrayList.size());
        arrayList.add("Fourth value", 1);
        Assert.assertEquals(4, arrayList.size());
        arrayList.add("Fifth value", 3);
        Assert.assertEquals(5, arrayList.size());
        arrayList.add("Sixth value", 4);
        Assert.assertEquals(6, arrayList.size());
    }

    @Test
    public void testAddValue(){
        arrayList.add("FirstValue");
        Assert.assertEquals(1, arrayList.size());
        arrayList.add("SecondValue");
        Assert.assertEquals(2, arrayList.size());
    }

    @Test
    public void testClear() {
        Assert.assertEquals(true, arrayList.isEmpty());
        arrayList.add("TestValue");
        Assert.assertEquals(false, arrayList.isEmpty());
    }

    @Test
    public void testGet() {
        arrayList.add("FirstValue");
        Assert.assertEquals("FirstValue", arrayList.get(0));
    }

    @Test
    public void testIndexOf() {
        arrayList.add("SecondValue");
        Assert.assertEquals(0, arrayList.indexOf("SecondValue"));
    }

    @Test
    public void testRemoveById() {
        arrayList.add("FirstValue");
        Assert.assertEquals("FirstValue", arrayList.remove(0));
    }

    @Test
    public void testRemoveByValue() {
        arrayList.add("FirstValue");
        Assert.assertEquals("FirstValue", arrayList.remove("FirstValue"));
    }

    @Test
    public void testSet() {
        arrayList.add("FirstValue");
        Assert.assertEquals("UpdatedValue", arrayList.set("UpdatedValue",0));
    }

    @Test
    public void TestSize() {
        arrayList.add("FirstOne");
        arrayList.add("SecondOne");
        Assert.assertEquals(2, arrayList.size());
    }
}
