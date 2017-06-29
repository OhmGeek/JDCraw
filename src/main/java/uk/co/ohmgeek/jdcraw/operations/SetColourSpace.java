package uk.co.ohmgeek.jdcraw.operations;

import uk.co.ohmgeek.jdcraw.RAWOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 29/06/17.
 */
public class SetColourSpace implements RAWOperation{
    private ColourSpace spaceToUse;
    public SetColourSpace(ColourSpace spaceToUse) {
        this.spaceToUse = spaceToUse;
    }

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
