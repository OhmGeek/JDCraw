package uk.co.ohmgeek.jdcraw.operations;

import uk.co.ohmgeek.jdcraw.RAWOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * A raw operation object for setting the colour space of an image.
 *
 * Created by ryan on 29/06/17.
 */
public class SetColourSpace implements RAWOperation{
    private ColourSpace spaceToUse;

    /**
     * Create an operation to set the Colour Space.
     * @param spaceToUse : the specified colour space, found in the ColourSpace enum.
     */
    public SetColourSpace(ColourSpace spaceToUse) {
        this.spaceToUse = spaceToUse;
    }

    /**
     * Fetch an argument list to be passed to DCraw.
     * @return args : An argument list (of strings), which are the arguments to pass.
     */
    public List<String> getArgumentList() {
        List<String> args = new ArrayList<String>();

        // dcraw -o [0-6] sets the colour space.
        args.add("-o");
        args.add(spaceToUse.dcrawConstant());
        System.out.println("Value of chosen is:");
        System.out.println(spaceToUse.dcrawConstant());
        return args;
    }
}
