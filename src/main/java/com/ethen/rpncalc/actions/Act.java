package com.ethen.rpncalc.actions;

/**
 * @author:jianwentao
 * @Description:
 * @Date:2019/8/15 0:19
 * @Modified By:
 */
public enum Act {
    UNDO("undo"),
    CLEAR("clear");

    String name;

    private Act(String name){
        this.name=name;
    }

    public static Act isAction(String name){
        for(Act act:Act.values()){
            if(act.name.equalsIgnoreCase(name)){
                return act;
            }
        }
        return null;
    }
}
