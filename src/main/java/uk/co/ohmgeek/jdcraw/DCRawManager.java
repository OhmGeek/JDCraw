package uk.co.ohmgeek.jdcraw;

import org.apache.commons.io.FilenameUtils;
import uk.co.ohmgeek.jdcraw.operations.SetFileOutputType;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * The uk.co.ohmgeek.jdcraw.DCRawManager Class manages DCRaw operations.
 * It's the key handler used to interface with the library.
 * Created by ryan on 29/06/17.
 */
public class DCRawManager {
    private File file;
    private List<RAWOperation> operationList;
    public DCRawManager(File fileToProcess) {
        this.file = fileToProcess;
    }

    /**
     * Process the image, with operations specified.
     * @return destinationPath : the path to the destination as a string
     * @throws IOException : error executing dcraw
     */
    public String process() throws IOException {
        ProcessBuilder dcrawProcessBuilder = new ProcessBuilder();

        // start running the render process
        Process dcrawProcess = dcrawProcessBuilder.start();

        // get the filename
        // todo use a function to output this, as it will be tiff with -T arg, otherwise it will be different.
        return getDestination(); //return the path of the destination.
    }

    /**
     * Get the destination path of the image.
     * @return path : string.
     */
    private String getDestination() {
        // first, get the path without extension
        String outputFilename = FilenameUtils.removeExtension(this.file.getPath());

        boolean isTiff = false;
        // look through operations, and look at property of SetFileOutputType instance (if there is one).
        //todo optimise for multiple arguments that are the same.
        for (RAWOperation op: operationList) {
            isTiff = op instanceof SetFileOutputType && op.getArgumentList().contains("-T");
        }

        //choose the correct extension
        if(isTiff) {
            outputFilename = outputFilename.concat(".tiff");
        } else {
            outputFilename = outputFilename.concat(".ppm");
        }

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
