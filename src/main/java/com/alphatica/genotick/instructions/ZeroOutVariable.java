package com.alphatica.genotick.instructions;

import com.alphatica.genotick.processor.Processor;

import java.io.Serializable;

public class ZeroOutVariable extends VarInstruction implements Serializable {
    public static final long serialVersionUID = -7513892893024990050L;

    public ZeroOutVariable(ZeroOutVariable i) {
        this.setVariableArgument(i.getVariableArgument());
    }

    @SuppressWarnings("unused")
    public ZeroOutVariable() {
    }

    @Override
    public void executeOn(Processor processor) {
        processor.execute(this);
    }

    @Override
    public ZeroOutVariable copy() {
        return new ZeroOutVariable(this);
    }

}
