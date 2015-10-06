package com.alphatica.genotick.instructions;

import com.alphatica.genotick.mutator.Mutator;

import java.io.Serializable;

abstract class VarVarJumpInstruction extends VarVarInstruction implements JumpInstruction, Serializable {
    public static final long serialVersionUID = 6418593915852218659L;

    private int address;

    protected VarVarJumpInstruction() {
        address = 0;
    }
    @Override
    public int getAddress() {
        return address;
    }

    @Override
    public void mutate(Mutator mutator) {
        super.mutate(mutator);
        address = mutator.getNextInt();
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
