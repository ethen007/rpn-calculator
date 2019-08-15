package com.ethen.rpncalc.actions;

import java.util.Stack;

/**
 * @author:jianwentao
 * @Description: clear current stack
 * @Date:2019/8/15 0:07
 * @Modified By:
 */
public class Clear implements Action {
    @Override
    public void act(Stack<Double> numbers, Stack<Stack<Double>> snapshots) {
        while (!numbers.isEmpty()) {
            numbers.pop();
        }
        Stack<Double> empty = new Stack<>();
        snapshots.push(empty);
    }
}
