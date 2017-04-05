package myExample.singleton;

/**
 * Created by Владислав on 01.04.2017.
 */
public class SumCalc {
    private static SumCalc sumCalc = new SumCalc();
    private static int result;
    private SumCalc(){

    }

    public static synchronized SumCalc getSumCalc(){
        if (sumCalc == null){
            sumCalc = new SumCalc();
        }
        return sumCalc;
    }
    public int doItSumCalc(int i, int j){
        result = i+j;
        return  result;
    }


}
