package org.firstinspires.ftc.teamcode.autos;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.botconfigs.StaticDischargeBot1;

@Autonomous(name = "Red StorageUnit")
public class RedStorageUnit extends LinearOpMode {

    public StaticDischargeBot1 bot;
    public DcMotor carouselWheel = null;
    public Servo rightLatchServo = null;
    public Servo leftLatchServo = null;
    public DcMotor arm =null;
    public ElapsedTime runtime = new ElapsedTime();
    public void runOpMode() {

        bot = new StaticDischargeBot1(telemetry, hardwareMap);
        carouselWheel = hardwareMap.dcMotor.get("wheel");
        rightLatchServo = hardwareMap.servo.get("rightlatch");
        leftLatchServo = hardwareMap.servo.get("leftlatch");
        arm=hardwareMap.dcMotor.get("arm");

        rightLatchServo.setPosition(0.5);
        leftLatchServo.setPosition(0.5);

        waitForStart();
        bot.driveTrain.moveEncoders(0, 12, 0, 0.8);
        sleep(200);
        bot.driveTrain.moveEncoders(-18, 0, 0, 0.5);
        sleep(200);
        bot.driveTrain.moveEncoders(0, -8, 0, 0.4);
        sleep(200);
        carouselWheel.setPower(0.5);
        sleep(3500);
        carouselWheel.setPower(0);

        sleep(500);
        bot.driveTrain.moveEncoders(0, 24, 0, 0.8);
        sleep(200);
        bot.driveTrain.moveEncoders(4.5, 0, 0, 0.5);
        sleep(200);
        bot.driveTrain.moveEncoders(0,0,-0.4,1);
        sleep(200);
        bot.driveTrain.moveEncoders(0,-16.8,0,1);
        sleep(200);
        arm.setPower(-0.5);
        sleep(1600);
        arm.setPower(0.3);
        sleep(700);
        bot.driveTrain.moveEncoders(0,0,0.01,1);
        sleep(200);
        bot.driveTrain.moveEncoders(6, 0, 0, 0.5);
        sleep(200);
        bot.driveTrain.moveEncoders(0,24,0,1);
        sleep(200);
        bot.driveTrain.moveEncoders(-14.8,0, 0, 0.5);
        sleep(200);

        //sleep(100);
        //bot.driveTrain.moveEncoders(0,-5,0,0.5);


    }
}
