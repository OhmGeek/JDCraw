package uk.co.ohmgeek.jdcraw;



/**
 * Created by ryan on 30/06/17.
 */
public class LibSettings {
    private String pathToDcraw;

    public LibSettings() {

    }

    /**
     * Set a custom path for dcraw to use. This is particularly useful
     * if one is using Windows where dcraw isn't necessarily set properly.
     * @param path : the path to dcraw (as a string)
     */
    protected void setCustomDcrawPath(String path) {
        this.pathToDcraw = path;
    }

    /**
     * Fetch the path to the DCraw executable
     * @return pathToDcraw : the path to Dcraw
     */
    protected String getDcrawPath() {
        return pathToDcraw;
    }

}
