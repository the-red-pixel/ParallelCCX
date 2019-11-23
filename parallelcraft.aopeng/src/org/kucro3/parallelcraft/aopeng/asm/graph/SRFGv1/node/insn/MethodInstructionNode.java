package org.kucro3.parallelcraft.aopeng.asm.graph.SRFGv1.node.insn;

import javax.annotation.Nonnull;
import java.util.Objects;

public class MethodInstructionNode extends InstructionNode {
    public MethodInstructionNode(int opcode,
                                 @Nonnull String owner,
                                 @Nonnull String name,
                                 @Nonnull String descriptor,
                                 boolean itf)
    {
        super(opcode, METHOD_INSN);

        this.descriptor = Objects.requireNonNull(descriptor, "descriptor");
        this.name = Objects.requireNonNull(name, "name");
        this.owner = Objects.requireNonNull(owner, "owner");
        this.itf = itf;
    }

    public void setDescriptor(@Nonnull String descriptor)
    {
        this.descriptor = Objects.requireNonNull(descriptor);
    }

    public void setName(@Nonnull String name)
    {
        this.name = Objects.requireNonNull(name);
    }

    public void setOwner(@Nonnull String owner)
    {
        this.owner = Objects.requireNonNull(owner);
    }

    public void setInterface(boolean itf)
    {
        this.itf = itf;
    }

    public @Nonnull String getDescriptor()
    {
        return descriptor;
    }

    public @Nonnull String getName()
    {
        return name;
    }

    public @Nonnull String getOwner()
    {
        return owner;
    }

    public boolean isInterface()
    {
        return itf;
    }

    private String descriptor;

    private String name;

    private String owner;

    private boolean itf;
}