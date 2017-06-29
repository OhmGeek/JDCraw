package uk.co.ohmgeek.jdcraw.operations;

/**
 * An Enum to represent the angles that we can flip the image by.
 * Created by ryan on 29/06/17.
 */
public enum FlipAngle {
    NONE(0), DEGREES90(90), DEGREES180(180), DEGREES270(270);

    private final int angle;

    /**
     * Constructor for creating an instance of the Enumeration FlipAngle.
     * @param angle : the associated angle value in DCraw's command line.
     */
    FlipAngle(int angle) {
        this.angle = angle;
    }

    /**
     * Fetch the angle in degrees (also the angle value for DCRaw).
     * @return angle : the angle to flip the image by.
     */
    public int degrees() {
        return this.angle;
    }
}
