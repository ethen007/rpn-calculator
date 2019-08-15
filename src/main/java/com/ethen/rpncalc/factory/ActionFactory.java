package com.ethen.rpncalc.factory;

import com.ethen.rpncalc.actions.Action;
import com.ethen.rpncalc.actions.Clear;
import com.ethen.rpncalc.actions.Undo;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/15 0:13
 * @Modified By:
 */
public class ActionFactory {
    public static Action get(String action) {
        action=action.toLowerCase();
        switch (action) {
            case "undo":
                return new Undo();
            case "clear":
                return new Clear();
            default:
                throw new IllegalArgumentException();
        }
    }
}
