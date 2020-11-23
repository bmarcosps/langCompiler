import java.util.*;
public class Teste8 {
    static List<Object> fat(int n) {
        List<Object> _auxReturnList = new ArrayList<>();
        if((n == 0)) {
            _auxReturnList.clear();
            _auxReturnList.add(1);

            return _auxReturnList;

        } _auxReturnList.clear();
        _auxReturnList.add((n * (int) fat((n - 1)).get(0) ));

        return _auxReturnList;

    }

    static List<Object> spook(int n) {
        List<Object> _auxReturnList = new ArrayList<>();
        if((n == 1)) {
            _auxReturnList.clear();
            _auxReturnList.add((2 * n));

            return _auxReturnList;

        } if((n == 2)) {
            _auxReturnList.clear();
            _auxReturnList.add(((2 * n) + 1));

            return _auxReturnList;

        } _auxReturnList.clear();
        _auxReturnList.add((n - 1));

        return _auxReturnList;

    }

    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        int k;
        k =  (int) spook(2).get(0) ;
        System.out.print(k);
        System.out.print('\n');

    }

    public static void main(String args[]) {
        main();
    }
}