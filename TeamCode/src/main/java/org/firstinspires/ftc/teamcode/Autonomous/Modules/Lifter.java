package org.firstinspires.ftc.teamcode.Autonomous.Modules;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.FTC_API.Autonomous.Modules.Module;
import org.firstinspires.ftc.teamcode.Robot.SubSystems.Arm;

import static org.firstinspires.ftc.teamcode.Utilitys.Constants.BILDA_MOTOR_TICKS_PER_REV;

public class Lifter extends Module {
    private Arm lift;
    private final double ROTATIONS = -15;
    private boolean isDone = false;


    @Override
    public void start() {
        lift = (Arm) robot.getSubSystem("Arm");
        lift.getMotor().setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        lift.getMotor().setTargetPosition((int) (ROTATIONS * BILDA_MOTOR_TICKS_PER_REV));
        lift.getMotor().setMode(DcMotor.RunMode.RUN_TO_POSITION);
        //lift.getMotor().setDirection(DcMotorSimple.Direction.REVERSE);
        lift.liftUp();
    }

    @Override
    public void tick() {
        if(!lift.getMotor().isBusy()){
            isDone = true;
        }
    }

    @Override
    public int stop(){
        lift.stopLift();
        lift.getMotor().setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        return positionInArray;
    }

    @Override
    public boolean isDone() {
        return isDone;
    }
}
