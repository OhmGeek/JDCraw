import junit.framework.TestCase;
import uk.co.ohmgeek.jdcraw.operations.ColourSpace;
import uk.co.ohmgeek.jdcraw.operations.FileOutputType;
import uk.co.ohmgeek.jdcraw.operations.SetColourSpace;
import uk.co.ohmgeek.jdcraw.operations.SetFileOutputType;

import java.util.ArrayList;
import java.util.List;

/**
 * Object to set the file output type, as either Tiff or PNM style format.
 * Created by ryan on 29/06/17.
 */
public class SetFileOutputTypeTest extends TestCase {
    public void testTiffFormat() {
        List<String> expected = new ArrayList<String>();
        expected.add("-T");

        SetFileOutputType op = new SetFileOutputType(FileOutputType.TIFF);

        assertEquals(expected, op.getArgumentList());
    }

    public void testPNMFormat() {
        List<String> expected = new ArrayList<String>();

        SetFileOutputType op = new SetFileOutputType(FileOutputType.PNM);

        assertEquals(expected, op.getArgumentList());
    }
}
