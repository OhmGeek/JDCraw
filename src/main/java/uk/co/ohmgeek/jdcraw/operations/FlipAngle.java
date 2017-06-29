package uk.co.ohmgeek.jdcraw.operations;

/**
 * An Enum to represent the angles that we can flip the image by.
 * Created by ryan on 29/06/17.
 */
public enum FlipAngle {
    NONE(0), DEGREES90(90), DEGREES180(180), DEGREES270(270);

    private final int angle;
    FlipAngle(int angle) {
        this.angle = angle;
    }
    public int degrees() {
        return this.angle;
    }
}
