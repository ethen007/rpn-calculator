package com.ethen.rpncalc.actions;

import java.util.Stack;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/15 0:04
 * @Modified By:
 */
public interface Action {
    public void act(Stack<Double> numbers,Stack<Stack<Double>> snapshots);
}
