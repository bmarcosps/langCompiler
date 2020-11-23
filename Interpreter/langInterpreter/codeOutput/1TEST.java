import java.util.*;
public class 1TEST {
    public static class Ponto {
        float x;
        float y;
    }

    public static class PontoArray {
        float[] x;
        float[][] y;
    }
    static void main() {
        List<Object> _auxReturnList = new ArrayList<>();
        float[][][] x;
        Ponto[][] y;
        x =  new float[20][][];
        x[0] =  new float[20][];
        y =  new Ponto[10][];
        y[0] =  new Ponto[5];
        y[0][1] =  new Ponto();
        y[0][1].x =  33.0f;
        y[0][1].y =  44.0f;
        System.out.print(y[0][1].x);
        System.out.print(y[0]);

    }

    public static void main(String args[]) {
        main();
    }
}