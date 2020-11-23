import java.util.*;
public class Teste0 {
    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        int i;
        int k;
        int[] x;
        k =  4;
        x =  new int[k];
        x[0] =  0;
        x[3] =  15;
        System.out.print(x[3]);
        System.out.print('\n');
        i =  0;
        for(int _AUX_17_3 = k; _AUX_17_3 > 0; _AUX_17_3--) {
            if(((i % 2) == 0)) {
                x[i] =  (2 * i);

            } else {
                x[i] =  ((2 * i) + 1);

            }

            i =  (i + 1);

        }
        i =  0;
        System.out.print('{');
        if((0 < k)) {
            System.out.print(x[0]);

            for(int _AUX_31_6 = (k - 1); _AUX_31_6 > 0; _AUX_31_6--) {
                System.out.print(',');

                System.out.print(x[(i + 1)]);

                i =  (i + 1);

            }

        } System.out.print('}');
        System.out.print('\n');

    }

    public static void main(String args[]) {
        main();
    }
}