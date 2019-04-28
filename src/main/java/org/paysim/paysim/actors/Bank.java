package org.paysim.paysim.actors;

import org.paysim.paysim.output.Output;

import java.util.ArrayList;

public class Bank extends SuperActor {
    private static final String BANK_IDENTIFIER = "B";

    public Bank(String name) {
        super(BANK_IDENTIFIER + name);
    }

    @Override
    public String toString() {
        ArrayList<String> properties = new ArrayList<>();

        properties.add(getName());

        return String.join(Output.OUTPUT_SEPARATOR, properties);
    }
}
