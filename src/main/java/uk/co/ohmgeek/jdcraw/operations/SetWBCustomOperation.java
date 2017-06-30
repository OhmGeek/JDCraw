package uk.co.ohmgeek.jdcraw.operations;

import uk.co.ohmgeek.jdcraw.RAWOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 30/06/17.
 */
public class SetWBCustomOperation implements RAWOperation {
    private int mul0, mul1, mul2, mul3;

    /**
     * Create an operation to create a custom white balance setting.
     * @param mul0 : multiplier 0
     * @param mul1 : multiplier 1
     * @param mul2 : multiplier 2
     * @param mul3 : multiplier 3
     */
    public SetWBCustomOperation(int mul0, int mul1, int mul2, int mul3) {
        this.mul0 = mul0;
        this.mul1 = mul1;
        this.mul2 = mul2;
        this.mul3 = mul3;
    }
    public List<String> getArgumentList() {
        List<String> arguments = new ArrayList<String>();

        // add the -r flag
        arguments.add("-r");

        // then add the multiplier values
        arguments.add(String.valueOf(mul0));
        arguments.add(String.valueOf(mul1));
        arguments.add(String.valueOf(mul2));
        arguments.add(String.valueOf(mul3));

        return arguments;
    }
}
