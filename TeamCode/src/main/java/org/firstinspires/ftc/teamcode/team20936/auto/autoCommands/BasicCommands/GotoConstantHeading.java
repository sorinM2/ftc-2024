package org.firstinspires.ftc.teamcode.team20936.auto.autoCommands.BasicCommands;

import com.arcrobotics.ftclib.command.CommandBase;

import org.firstinspires.ftc.teamcode.team20936.auto.subsystems.Singleton_AutoSubsystem;

public class GotoConstantHeading extends CommandBase{
    private final Singleton_AutoSubsystem autoSubsystem;

    private final double TargetX, TargetY;
    public GotoConstantHeading(double TargetX, double TargetY)
    {
        autoSubsystem = Singleton_AutoSubsystem.getInstance();
        addRequirements(autoSubsystem);

        this.TargetX = TargetX;
        this.TargetY = TargetY;
    }

    @Override
    public void initialize()
    {
        autoSubsystem.gotoConstantHeading(TargetX, TargetY);
    }

    @Override
    public boolean isFinished() {
        return true;
    }
}
