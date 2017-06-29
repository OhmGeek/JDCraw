package uk.co.ohmgeek.jdcraw;
import java.io.File;

/**
 * This is a data structure that stores the result from a DCRaw executed process.
 * I.e. the output, error codes, and the location of the output filename.
 * Created by ryan on 29/06/17.
 */
public class DCRawExecutableResult {
    // todo look at structure and maybe replace with a single constructor instead
    private String stdOutput;
    private String stdError;
    private int exitCode;
    private File outputFile;

    public DCRawExecutableResult() {
        stdOutput = null;
        stdError = null;
        exitCode = -1;
        outputFile = null;

    }

    public File getOutputFile() {
        return outputFile;
    }

    public void setOutputFile(File outputFile) {
        this.outputFile = outputFile;
    }

    public int getExitCode() {
        return exitCode;
    }

    public void setExitCode(int exitCode) {
        this.exitCode = exitCode;
    }

    public String getStdError() {
        return stdError;
    }

    public void setStdError(String stdError) {
        this.stdError = stdError;
    }

    public String getStdOutput() {
        return stdOutput;
    }

    public void setStdOutput(String stdOutput) {
        this.stdOutput = stdOutput;
    }
}
