package com.ethen.rpncalc.actions;

import java.util.Stack;

/**
 * @author:jianwentao
 * @Description: recover stack to last snapshot
 * @Date:2019/8/15 0:06
 * @Modified By:
 */
public class Undo implements Action {
    @Override
    public void act(Stack<Double> numbers, Stack<Stack<Double>> snapshots) {
        if (!snapshots.isEmpty()) {
            while (!numbers.isEmpty()) {
                numbers.pop();
            }
            for (Double d : snapshots.pop()) {
                if (d != null) {
                    numbers.push(d);
                }
            }
        }
    }
}
