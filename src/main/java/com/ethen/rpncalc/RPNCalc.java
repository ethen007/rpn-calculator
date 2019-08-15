package com.ethen.rpncalc;

import com.ethen.rpncalc.actions.Action;
import com.ethen.rpncalc.factory.ActionFactory;
import com.ethen.rpncalc.factory.OperFactory;
import com.ethen.rpncalc.opers.Operator;
import com.ethen.rpncalc.utils.CheckUtil;
import com.ethen.rpncalc.utils.FormatUtil;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Stack;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/14 9:45
 * @Modified By:
 */
public class RPNCalc {
    private Stack<Double> numbers = new Stack<Double>();
    private Stack<Stack<Double>> snapshots = new Stack<>();
    private static final String SPLITER = " ";

    public void process(String expression) {
        String[] args = expression.split(SPLITER);
        for (int i = 0; i < args.length; i++) {
            String current = args[i];
            if (CheckUtil.isNumber(current)) {
                saveSnapshot();
                numbers.push(Double.valueOf(current));
                continue;
            }
            if (CheckUtil.isOperator(current)) {
                saveSnapshot();
                Operator operator = OperFactory.get(current);
                operator.compute(numbers);
                continue;
            }
            if (CheckUtil.isAction(current)) {
                Action action = ActionFactory.get(current);
                action.act(numbers, snapshots);
                continue;
            } else {
                throw new IllegalArgumentException("unrecognized input "+current);
            }
        }
        show();
    }

    private void saveSnapshot() {
        Stack<Double> snapshot = new Stack<>();
        for (Double d : numbers) {
            snapshot.push(d);
        }
        snapshots.push(snapshot);
    }

    private void show() {
        System.out.print("stack:\t");
        if (!numbers.isEmpty()) {
            for (Double ele : numbers) {
                System.out.print(FormatUtil.format(ele) + " ");
            }
        }
        System.out.println();
    }

    public String getCurrentNumbers(){
        StringBuffer sb=new StringBuffer();
        if (!numbers.isEmpty()) {
            for (Double ele : numbers) {
               sb.append(FormatUtil.format(ele) + " ");
            }
        }
        return sb.toString();
    }
}
