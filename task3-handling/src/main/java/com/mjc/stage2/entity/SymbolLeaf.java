package com.mjc.stage2.entity;

public class SymbolLeaf  extends AbstractTextComponent{

    private char value;

    public SymbolLeaf(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        return null;
    }

    @Override
    public void add(AbstractTextComponent textComponent) {

    }

    @Override
    public void remove(AbstractTextComponent textComponent) {

    }

    @Override
    public int getSize() {
        return 1;
    }

}
