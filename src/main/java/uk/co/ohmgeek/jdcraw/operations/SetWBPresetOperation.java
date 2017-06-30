package uk.co.ohmgeek.jdcraw.operations;


import uk.co.ohmgeek.jdcraw.RAWOperation;
import uk.co.ohmgeek.jdcraw.operations.WBPreset;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 30/06/17.
 */
public class SetWBPresetOperation implements RAWOperation {

    private WBPreset preset;

    public SetWBPresetOperation(WBPreset preset) {

        this.preset = preset;
    }

    public List<String> getArgumentList() {
        List<String> args = new ArrayList<String>();
        if(preset == WBPreset.CAMERA) {
            args.add("-w"); // use camera white balance
        }
        return args;
    }
}
