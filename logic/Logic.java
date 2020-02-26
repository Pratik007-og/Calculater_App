package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        Add a;int res;
        Subtract s;int diff;
        Multiply m;int prod;
        Divide d;String str="";
        int q=0,r=0;

        switch(operation){
            case 1:a=new Add(argumentOne,argumentTwo);
                    res=a.Addition();
                    mOut.print(""+res);
                    break;
            case 2:s=new Subtract(argumentOne,argumentTwo);
                    diff=s.Sub();
                    mOut.print(""+diff);
                    break;
            case 3:m=new Multiply(argumentOne,argumentTwo);
                    prod=m.Mul();
                    mOut.print(""+prod);
                    break;
            case 4:d=new Divide(argumentOne,argumentTwo);
                    str=d.Div(q,r);
                    mOut.print(str);
                    break;
            default:mOut.print("Wrong choice");

        }
        // TODO -- start your code here
    }
}
