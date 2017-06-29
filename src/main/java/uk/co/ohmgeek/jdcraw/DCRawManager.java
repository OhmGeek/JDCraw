package uk.co.ohmgeek.jdcraw;

import java.io.File;
import java.io.IOException;

/**
 * The uk.co.ohmgeek.jdcraw.DCRawManager Class manages DCRaw operations.
 * It's the key handler used to interface with the library.
 * Created by ryan on 29/06/17.
 */
public class DCRawManager {
    private DCRawExecutableOptions options;
    private File file;

    public DCRawManager(File fileToProcess) {
        this.options = null;
        this.file = fileToProcess;
    }

    public void process() throws IOException {
        ProcessBuilder dcrawProcess = new ProcessBuilder();

        if(options == null) {
            // use default options
            options = new DCRawExecutableOptions();
            System.out.println("Using default options, because none specified.");
        }

        // set the entire process to start running
        dcrawProcess.command(OptionStringBuilder.build(options, this.file));

        // start running the render process
        dcrawProcess.start();

    }

    public void setOptions() {

    }

}
