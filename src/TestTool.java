public class TestTool {



    public  <T,K> boolean isEquals (T t, K k) {
        System.out.println("Check t");
        if (isNull(t)) {
            return false;
        }
        System.out.println("Check k");
        if (isNull(k)) {
            return false;
        }
        return t.equals(k);
    }
    public  <T> boolean isNull (T t) {
        return t==null;
    }

    public  <T> boolean isNotNull (T t) {
        return t!=null;
    }
    public  void PrintResult (boolean result) {
        if (result) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}
