import java.util.*;
public class Function_call_ret_use {
    static List<Object> f(int x) {
        List<Object> _auxReturnList = new ArrayList<>();
        int y;
        y =  ((2 * x) + 1);
        _auxReturnList.clear();
        _auxReturnList.add(y);

        return _auxReturnList;

    }

    static void main(int[] v, float f) {
        List<Object> _auxReturnList = new ArrayList<>();
        int x;
        int z;
        z =  10;
        _auxReturnList = f(z);
        x = (int) _auxReturnList.get(0);
        _auxReturnList.remove(0);

    }

    public static void main(String args[]) {
        main();
    }
}