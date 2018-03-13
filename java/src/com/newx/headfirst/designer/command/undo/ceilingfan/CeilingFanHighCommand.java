package com.newx.headfirst.designer.command.undo.ceilingfan;

import com.newx.headfirst.designer.command.undo.Command;

/**
 * Created by xuzhijian on 2018/2/22 0022.
 */
public class CeilingFanHighCommand extends CeilingFanCommand implements Command {

//    public CeilingFan ceilingFan;
//    public int prevSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

//    public CeilingFanHighCommand(CeilingFan ceilingFan) {
//        this.ceilingFan = ceilingFan;
//    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

}
