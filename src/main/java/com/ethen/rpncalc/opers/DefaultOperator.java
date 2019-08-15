package com.ethen.rpncalc.opers;

import java.util.Stack;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 22:47
 * @Modified By:
 */
public abstract class DefaultOperator implements Operator{
    protected String oper;
    @Override
    public void compute(Stack<Double> numbers) {
        if(isDoubleOper(oper)){
            Double a=numbers.pop();
            Double b=numbers.pop();
            Double c=doCompute(b,a);
            numbers.push(c);
        }else if(isSingleOper(oper)){
            Double a=numbers.pop();
            Double c=doCompute(a,null);
            numbers.push(c);
        }else {
            throw new IllegalArgumentException();
        }
    }
    public abstract Double doCompute(Double a,Double b);

    protected boolean isSingleOper(String oper){
        return SingleOper.get(oper)!=null;
    }

    protected boolean isDoubleOper(String oper){
        return DoubleOper.get(oper)!=null;
    }
}
