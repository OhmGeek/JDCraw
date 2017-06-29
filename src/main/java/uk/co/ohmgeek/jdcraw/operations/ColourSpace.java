package uk.co.ohmgeek.jdcraw.operations;

/**
 * This is an Enum that stores the Colour Spaces used to be output.
 *
 * Created by ryan on 29/06/17.
 */
public enum ColourSpace {
    RAW(0), SRGB(1), ADOBE_RGB(2), WIDE(3), ProPhoto(4), XYZ(5), ACES(6);
    private final int num;
    ColourSpace(int num) {
        this.num = num;
    }
    public String dcrawConstant() {
        return String.valueOf(this.num);
    }
}
