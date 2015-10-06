package com.alphatica.genotick.instructions;

import com.alphatica.genotick.processor.Processor;

import java.io.Serializable;

public class SqRootOfRegister extends RegRegInstruction  implements Serializable {
    public static final long serialVersionUID = -2097327161652030023L;

    public SqRootOfRegister(SqRootOfRegister i) {
        this.setRegister1(i.getRegister1());
        this.setRegister2(i.getRegister2());
    }

    @SuppressWarnings("unused")
    public SqRootOfRegister() {
    }

    @Override
    public void executeOn(Processor processor) {
        processor.execute(this);
    }

    @Override
    public SqRootOfRegister copy() {
        return new SqRootOfRegister(this);
    }
}
