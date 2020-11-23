import java.util.*;
public class Teste1 {
    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        int n;
        int q;
        int quo;
        int res;
        n =  13;
        q =  5;
        _auxReturnList = divMod(n, q);
        quo = (int) _auxReturnList.get(0);
        _auxReturnList.remove(0);
        res = (int) _auxReturnList.get(0);
        _auxReturnList.remove(0);
        System.out.print('Q');
        System.out.print(':');
        System.out.print(quo);
        System.out.print('\n');
        System.out.print('R');
        System.out.print(':');
        System.out.print(res);
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