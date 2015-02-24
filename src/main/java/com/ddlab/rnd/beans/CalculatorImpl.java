package com.ddlab.rnd.beans;

/**
 * The Class CalculatorImpl.
 *
 * @author Debadatta Mishra
 */
public class CalculatorImpl implements Calculator {

    /* (non-Javadoc)
     * @see com.ddlab.rnd.beans.Calculator#calculate(int, int)
     */
    @Override
    public int calculate(int a, int b) {
    	System.out.println("**********Actual Method Execution**********");
        return a/b;
    }

}
