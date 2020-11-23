import java.util.*;
public class Teste7 {
    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        int i;
        int k;
        int[][] x;
        int z;
        k =  5;
        x =  new int[k][];
        i =  0;
        for(int _AUX_13_4 = k; _AUX_13_4 > 0; _AUX_13_4--) {
            x[i] =  new int[k];

            i =  (i + 1);

        }
        i =  0;
        for(int _AUX_18_4 = k; _AUX_18_4 > 0; _AUX_18_4--) {
            x[i][i] =  ((2 * i) + 1);

            i =  (i + 1);

        }
        z =  x[3][3];

    }

    public static void main(String args[]) {
        main();
    }
}