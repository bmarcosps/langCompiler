import java.util.*;
public class 00a {
    public static class Ponto {
        float x;
        float y;
    }

    public static class PontoArray {
        float[] x;
        float[][] y;
    }
    static List<Object> f(int x) {
        List<Object> _auxReturnList = new ArrayList<>();
        int y;
        y =  ((2 * x) + 1);
        _auxReturnList.clear();
        _auxReturnList.add(y);
        _auxReturnList.add(1.5f);

        return _auxReturnList;

    }

    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        float w;
        int x;
        int z;
        z =  10;
        _auxReturnList = f(z);
        x = (int) _auxReturnList.get(0);
        _auxReturnList.remove(0);
        w = (float) _auxReturnList.get(0);
        _auxReturnList.remove(0);
        System.out.print(x);
        System.out.print(z);
        System.out.print(w);

    }

    public static void main(String args[]) {
        main();
    }
}