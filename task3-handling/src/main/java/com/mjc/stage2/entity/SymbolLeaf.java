package com.mjc.stage2.entity;

public class SymbolLeaf  extends AbstractTextComponent{

    private char value;

    public SymbolLeaf(TextComponentType componentType, char value) {
        super(componentType);
        this.value=value;
    }

    @Override
    public String operation() {
        return String.valueOf(this.value);
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot add a component to a SymbolLeaf.");
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        throw new UnsupportedOperationException("Cannot remove a component from a SymbolLeaf.");
    }

    @Override
    public int getSize() {
        return 1;
    }

}
