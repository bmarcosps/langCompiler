import java.util.*;
public class Teste6 {
    public static class Ponto {
        int x;
        int y;
    }
    static void printP(Ponto p) {
        List<Object> _auxReturnList = new ArrayList<>();
        System.out.print('(');
        System.out.print(p.x);
        System.out.print(',');
        System.out.print(p.y);
        System.out.print(')');

    }

    static void printV(Ponto[] v, int n) {
        List<Object> _auxReturnList = new ArrayList<>();
        int i;
        System.out.print('{');
        if((0 < n)) {
            _auxReturnList = printP(v[0]);

            i =  1;

            for(int _AUX_30_7 = (n - 1); _AUX_30_7 > 0; _AUX_30_7--) {
                System.out.print(',');

                _auxReturnList = printP(v[i]);

                i =  (i + 1);

            }

        } System.out.print('}');

    }

    static void sort(Ponto[] v, int n) {
        List<Object> _auxReturnList = new ArrayList<>();
        Ponto aux;
        int i;
        int j;
        i =  0;
        for(int _AUX_42_4 = (n - 1); _AUX_42_4 > 0; _AUX_42_4--) {
            j =  (i + 1);

            for(int _AUX_44_7 = (n - (i + 1)); _AUX_44_7 > 0; _AUX_44_7--) {
                if((v[i].x < v[j].x)) {
                    aux =  v[i];

                    v[i] =  v[j];

                    v[j] =  aux;

                } 
                j =  (j + 1);

            }

            i =  (i + 1);

        }

    }

    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        int i;
        int k;
        Ponto[] p;
        k =  5;
        p =  new Ponto[k];
        i =  0;
        for(int _AUX_60_3 = k; _AUX_60_3 > 0; _AUX_60_3--) {
            p[i] =  new Ponto;

            p[i].x =  (12 + i);

            p[i].y =  (12 - i);

            i =  (i + 1);

        }
        _auxReturnList = printV(p, k);
        _auxReturnList = sort(p, k);
        System.out.print('\n');
        _auxReturnList = printV(p, k);
        System.out.print('\n');

    }

    public static void main(String args[]) {
        main();
    }
}