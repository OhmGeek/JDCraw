package uk.co.ohmgeek.jdcraw;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * This builds the string to be parsed by the ProcessBuilder. It combines options, filename and the renderer path.
 * Created by ryan on 29/06/17.
 */
class OptionStringBuilder {
    // todo make this less dependent on dcraw (so we can choose what renderer to use, in case a better one is available)
    static List<String> build(DCRawExecutableOptions specifiedOptions, File file) {
        List<String> args = new ArrayList<String>();

        // first, add the name of the application
        args.add("dcraw"); //todo make this more portable (based on system)
        // then, add the list of arguments for the application (from options)
        args.addAll(specifiedOptions.getRendererArgs());
        // return the list.
        return args;
    }
}
