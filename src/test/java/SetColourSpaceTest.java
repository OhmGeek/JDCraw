import junit.framework.TestCase;
import uk.co.ohmgeek.jdcraw.OptionStringBuilder;
import uk.co.ohmgeek.jdcraw.operations.ColourSpace;
import uk.co.ohmgeek.jdcraw.operations.SetColourSpace;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 29/06/17.
 */
public class SetColourSpaceTest extends TestCase {
    public void testArgsRAW() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("0");

        SetColourSpace op = new SetColourSpace(ColourSpace.RAW);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testArgsSRGB() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("1");

        SetColourSpace op = new SetColourSpace(ColourSpace.SRGB);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testArgsAdobeRGB() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("2");

        SetColourSpace op = new SetColourSpace(ColourSpace.ADOBE_RGB);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testArgsWide() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("3");

        SetColourSpace op = new SetColourSpace(ColourSpace.WIDE);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testArgsProPhoto() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("4");

        SetColourSpace op = new SetColourSpace(ColourSpace.ProPhoto);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testArgsXYZ() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("5");

        SetColourSpace op = new SetColourSpace(ColourSpace.XYZ);
        assertEquals(op.getArgumentList(), expectedOutput);
    }
    public void testArgsACES() {
        List<String> expectedOutput = new ArrayList<String>();
        expectedOutput.add("-o");
        expectedOutput.add("6");

        SetColourSpace op = new SetColourSpace(ColourSpace.ACES);
        assertEquals(op.getArgumentList(), expectedOutput);
    }

}
