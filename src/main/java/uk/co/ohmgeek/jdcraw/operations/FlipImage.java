package uk.co.ohmgeek.jdcraw.operations;

import uk.co.ohmgeek.jdcraw.RAWOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 29/06/17.
 */
public class FlipImage implements RAWOperation {
    private FlipAngle angle;

    /**
     * Create an operation for flipping an image
     * @param angle : The angle to flip the image by. It's specified as an Enum in FlipAngle.
     */
    public FlipImage(FlipAngle angle) {
        this.angle = angle;
    }

    /**
     * This method gets the argument list for DCRaw based on the operation.
     * @return args : Argument list (of strings)
     */
    public List<String> getArgumentList() {
        List<String> args = new ArrayList<String>();
        args.add("-t");
        args.add(String.valueOf(angle.degrees()));
        return args;
    }
}
