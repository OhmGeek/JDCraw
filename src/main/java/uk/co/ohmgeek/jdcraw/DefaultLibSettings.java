package uk.co.ohmgeek.jdcraw;

/**
 * Created by ryan on 30/06/17.
 */
public class DefaultLibSettings extends LibSettings {
    /**
     * Create default settings for the library. Assume a linux/mac installation,
     * as calling dcraw will work.
     *
     * Windows requires a different path to be set. This is done by the user of the library
     * simply because they will know more about the system config. Feel free to send a PR
     * if you want to create a Default Windows configuration. I'll happily accept it :)
     */
    public DefaultLibSettings() {
        super();
        setCustomDcrawPath("dcraw");
    }

}
