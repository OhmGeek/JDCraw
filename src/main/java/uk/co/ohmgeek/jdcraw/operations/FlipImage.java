package uk.co.ohmgeek.jdcraw.operations;

import uk.co.ohmgeek.jdcraw.RAWOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 29/06/17.
 */
public class FlipImage implements RAWOperation {
    FlipAngle angle;
    public FlipImage(FlipAngle angle) {
        this.angle = angle;
    }

    public List<String> getArgumentList() {
        List<String> args = new ArrayList<String>();
        args.add("-t");
        args.add(String.valueOf(angle.degrees()));
        return args;
    }
}
