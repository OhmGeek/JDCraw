package uk.co.ohmgeek.jdcraw;

import junit.framework.TestCase;

/**
 * Created by ryan on 30/06/17.
 */
public class LibrarySettingsTest extends TestCase {
    public void testDefaultSettings() {
        LibSettings settings = new DefaultLibSettings();

        assertEquals(settings.getDcrawPath(), "dcraw");
    }

    public void testCustomSettings() {
        LibSettings settings = new LibSettings();
        settings.setCustomDcrawPath("/path/to/dcraw");

        assertEquals(settings.getDcrawPath(), "/path/to/dcraw");
    }

}
