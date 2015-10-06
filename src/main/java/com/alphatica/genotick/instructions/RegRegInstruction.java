package com.alphatica.genotick.instructions;

import com.alphatica.genotick.mutator.Mutator;

import java.io.Serializable;

public abstract class RegRegInstruction extends Instruction implements Serializable {
    public static final long serialVersionUID = 6740011263492418256L;

    private byte register1;
    private byte register2;

    public byte getRegister1() {
        return register1;
    }

    public void setRegister1(byte register1) {
        this.register1 = Registers.validateRegister(register1);
    }

    public byte getRegister2() {
        return register2;
    }

    public void setRegister2(byte register2) {
        this.register2 = Registers.validateRegister(register2);
    }

    @Override
    public void mutate(Mutator mutator) {
        byte value = Registers.validateRegister(mutator.getNextByte());
        register1 = value;
        value = Registers.validateRegister(mutator.getNextByte());
        register2 = value;
    }
}
