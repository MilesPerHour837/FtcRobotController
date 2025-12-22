package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 26100;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Warrior Bots";
        int motorAngle = 67;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Name", teamName);
        telemetry.addData("Motor Angle", motorAngle);

    }

    @Override
    public void loop() {

    }
}


