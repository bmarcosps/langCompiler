import java.util.*;
public class Function_call {
    static void f(int x) {
        List<Object> _auxReturnList = new ArrayList<>();
        int y;
        y =  ((2 * x) + 1);
        System.out.print(y);

    }

    static void main(int[] v, float f) {
        List<Object> _auxReturnList = new ArrayList<>();
        int z;
        z =  10;
        _auxReturnList = f(z);

    }

    public static void main(String args[]) {
        main();
    }
}