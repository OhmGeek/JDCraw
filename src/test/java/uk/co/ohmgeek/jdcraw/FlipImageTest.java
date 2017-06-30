package uk.co.ohmgeek.jdcraw;

import junit.framework.TestCase;
import uk.co.ohmgeek.jdcraw.operations.ColourSpace;
import uk.co.ohmgeek.jdcraw.operations.FlipAngle;
import uk.co.ohmgeek.jdcraw.operations.FlipImage;
import uk.co.ohmgeek.jdcraw.operations.SetColourSpace;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 29/06/17.
 */
public class FlipImageTest extends TestCase {
    //todo iterate through all values of enum rather than this hacky method.
    public void testAngleZero() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-t");
        expectedOutput.add("0");

        FlipImage op = new FlipImage(FlipAngle.NONE);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testAngleNinety() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-t");
        expectedOutput.add("90");

        FlipImage op = new FlipImage(FlipAngle.DEGREES90);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testAngleOneEighty() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-t");
        expectedOutput.add("180");

        FlipImage op = new FlipImage(FlipAngle.DEGREES180);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testAngleTwoSeventy() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-t");
        expectedOutput.add("270");

        FlipImage op = new FlipImage(FlipAngle.DEGREES270);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
}
