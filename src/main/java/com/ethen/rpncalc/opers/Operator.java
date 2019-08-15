package com.ethen.rpncalc.opers;

import java.util.Stack;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 21:38
 * @Modified By:
 */
public interface Operator {
    public void compute(Stack<Double> numbers);
}
