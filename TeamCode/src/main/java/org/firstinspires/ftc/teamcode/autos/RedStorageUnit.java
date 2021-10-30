package org.firstinspires.ftc.teamcode.autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.botconfigs.StaticDischargeBot1;

@Autonomous(name = "Red StorageUnit")
public class RedStorageUnit extends LinearOpMode {

    public StaticDischargeBot1 bot;
    public DcMotor carouselWheel = null;
    public ElapsedTime runtime = new ElapsedTime();
    public void runOpMode() {

        bot = new StaticDischargeBot1(telemetry, hardwareMap);
        carouselWheel = hardwareMap.dcMotor.get("wheel");

        waitForStart();
        bot.driveTrain.moveEncoders(0, 12, 0, 0.8);
        sleep(200);
        bot.driveTrain.moveEncoders(-7, 0, 0, 1);
        sleep(200);
        bot.driveTrain.moveEncoders(0, -12, 0, 0.8);
        sleep(200);
        carouselWheel.setPower(-0.8);
        sleep(3000);

        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < 2.5)) {
            telemetry.addData("Path", "Leg 2: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }
        //hello from charlie
        sleep(500);
        bot.driveTrain.moveEncoders(0, 12, 0, 0.8);
        //bot.driveTrain.moveEncoders(-10.5, 0, 0, 1);
        //sleep(100);
        //bot.driveTrain.moveEncoders(0,-5,0,0.5);


    }
}
