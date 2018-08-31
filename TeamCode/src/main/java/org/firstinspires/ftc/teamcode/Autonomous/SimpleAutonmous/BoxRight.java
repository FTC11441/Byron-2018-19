package org.firstinspires.ftc.teamcode.Autonomous.SimpleAutonmous;

import org.firstinspires.ftc.teamcode.Autonomous.Modules.Wait;
import org.firstinspires.ftc.teamcode.FTC_API.Autonomous.AutonomousBase;
import org.firstinspires.ftc.teamcode.FTC_API.Autonomous.Modules.Module;
import org.firstinspires.ftc.teamcode.Robot.CompRobot;

import static org.firstinspires.ftc.teamcode.Constants.*;

/**
 * Created by Byron.Nice on 8/30/2018.
 * DESCRIPTION: Robot drives in a 12" x 12" square to the right, returning to it's original position.
 */

public class BoxRight extends AutonomousBase {
    private CompRobot bot = new CompRobot();
    private Module[][] steps = new Module[][]{
            {encodeForward(12)}, //Drive forward 12 inches
            {new Wait().setWaitTime(200)}, //Waits for .2 sec.
            {turnRight90()}, //Turns to the right
            {encodeForward(12)},//Drive forward 12 inches
            {new Wait().setWaitTime(200)},//Waits for .2 sec.
            {turnRight90()},//Turns to the right
            {encodeForward(12)},//Drive forward 12 inches
            {new Wait().setWaitTime(200)},//Waits for .2 sec.
            {turnRight90()},//Turns to the right
            {encodeForward(12)},//Drive forward 12 inches
            {new Wait().setWaitTime(200)},//Waits for .2 sec.
            {turnRight90()},//Turns to the right

    };

    @Override
    public void init() {
        init(hardwareMap, bot, steps);
    }

}