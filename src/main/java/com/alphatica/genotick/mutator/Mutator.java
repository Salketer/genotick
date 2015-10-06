package com.alphatica.genotick.mutator;

import com.alphatica.genotick.instructions.Instruction;

public interface Mutator {
    Instruction getRandomInstruction();

    boolean getAllowInstructionMutation();

    boolean getAllowNewInstruction();

    int getNextInt();

    long getNextLong();

    double getNextDouble();

    byte getNextByte();

    void setSettings(MutatorSettings mutatorSettings);

    boolean skipNextInstruction();

    boolean nextBoolean();
}
