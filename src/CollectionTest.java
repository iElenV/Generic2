import java.util.ArrayList;

public class CollectionTest extends  TestTool{

    public void testAddElement() {
        ArrayList <Object> list = new ArrayList<>();
        Integer first = 1;
        Integer second = 2;
        list.add(first);
        list.add(second);
        list.add(1, 67);

        this.PrintResult(isEquals(first, list.get(0)));
        this.PrintResult(isEquals(second, list.get(2)));
    }
}
