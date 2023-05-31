package com.mjc.stage2.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComponent  extends AbstractTextComponent{
    protected List<AbstractTextComponent> componentList = new ArrayList<>();
    private int size = 0;

    public TextComponent(TextComponentType componentType) {
        super(componentType);
    }

    @Override
    public String operation() {
        StringBuilder sb = new StringBuilder();
        for (AbstractTextComponent component : componentList) {
            sb.append(component.operation());
        }
        return sb.toString();}

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }
    @Override
    public int getSize() {
        int size = 0;
        for (AbstractTextComponent component : componentList) {
            size += component.getSize();
        }
        return size;
    }
}
