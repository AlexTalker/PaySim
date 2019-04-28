package org.paysim.paysim.actors;

import org.paysim.paysim.PaySim;
import org.paysim.paysim.output.Output;

import java.util.ArrayList;
import java.util.Objects;

public class Merchant extends SuperActor {
    private static final String MERCHANT_IDENTIFIER = "M";
    private Bank bank;

    public Merchant(String name) { super(MERCHANT_IDENTIFIER + name);  }

    public Merchant(PaySim paySim) {
        this(paySim.generateId());
        this.bank = paySim.pickRandomBank();
    }

    @Override
    public String toString() {
        ArrayList<String> properties = new ArrayList<>();

        properties.add(getName());
        properties.add(Objects.isNull(bank) ? "" : bank.getName());

        return String.join(Output.OUTPUT_SEPARATOR, properties);
    }
}
