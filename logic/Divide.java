package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO -- start your code here
    private int x;
    private int y;

    public Divide(int m, int n) {
        x = m;
        y = n;
    }

    public String Div(int a,int b) {
        if(x==0){
            a=0;
            b=0;
            return("0 R:0");
        }
        else {
            try {
                a = x / y;
                b = x % y;
                return (a + " R:" + b);

            } catch (Exception e) {
                return ("Denominator cannot be zero");
            }
        }
    }
}

