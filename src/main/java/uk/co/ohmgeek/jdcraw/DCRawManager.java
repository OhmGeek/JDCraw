package uk.co.ohmgeek.jdcraw;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * The uk.co.ohmgeek.jdcraw.DCRawManager Class manages DCRaw operations.
 * It's the key handler used to interface with the library.
 * Created by ryan on 29/06/17.
 */
public class DCRawManager {
    private DCRawExecutableOptions options;
    private File file;
    private List<RAWOperation> operationList;
    public DCRawManager(File fileToProcess) {
        this.options = null;
        this.file = fileToProcess;
    }

    public String process() throws IOException {
        ProcessBuilder dcrawProcessBuilder = new ProcessBuilder();

        if(options == null) {
            // use default options
            options = new DCRawExecutableOptions();
            System.out.println("Using default options, because none specified.");
        }

        // set the entire process to start running
        dcrawProcessBuilder.command(OptionStringBuilder.build(options.getRendererArgs(), this.file));

        // start running the render process
        Process dcrawProcess = dcrawProcessBuilder.start();

        // get the filename
        // todo use a function to output this, as it will be tiff with -T arg, otherwise it will be different.
        String outputFilename = FilenameUtils.removeExtension(this.file.getPath());
        outputFilename = outputFilename.concat(".tiff"); //this is for a tiff file
        // now get the result.
        return outputFilename;
    }

    /**
     * Add an operation to be made by DCRaw
     * @param op : an instance of RawOperation to be added to the operation list.
     */
    public void addOperation(RAWOperation op) {
        operationList.add(op);
    }

}
