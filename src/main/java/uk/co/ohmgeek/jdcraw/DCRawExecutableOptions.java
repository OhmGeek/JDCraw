package uk.co.ohmgeek.jdcraw;

import java.util.ArrayList;
import java.util.List;

/**
 * The uk.co.ohmgeek.jdcraw.DCRawExecutableOptions Class manages the arguments for the DCRaw executable.
 * The idea is we can set options (i.e. flags) by calling functions, and then run these on the executable.
 *
 * Created by ryan on 29/06/17.
 */
class DCRawExecutableOptions {

    DCRawExecutableOptions() {
        // specify default options for the class

    }
    List<String> getRendererArgs() {
        // todo generate args based on properties
        List<String> args = new ArrayList<String>();
        return args;
    }
}
