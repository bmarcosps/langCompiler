import java.util.*;
public class Teste1eMeio {
    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        int n;
        int q;
        int w;
        int z;
        n =  13;
        q =  5;
        w =  (int) divMod(n, q).get(1) ;
        z =  ((2 * w) + 1);
        System.out.print('Z');
        System.out.print(':');
        System.out.print(z);
        System.out.print('\n');

    }

    static List<Object> divMod(int n, int q) {
        List<Object> _auxReturnList = new ArrayList<>();
        _auxReturnList.clear();
        _auxReturnList.add((n / q));
        _auxReturnList.add((n % q));

        return _auxReturnList;

    }

    public static void main(String args[]) {
        main();
    }
}