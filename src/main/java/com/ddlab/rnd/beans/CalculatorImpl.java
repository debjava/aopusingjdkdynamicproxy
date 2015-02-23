
package com.ddlab.rnd.beans;

// TODO: Auto-generated Javadoc
/**
 * The Class CalculatorImpl.
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
