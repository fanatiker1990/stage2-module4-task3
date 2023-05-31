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
        size = componentList.size();
        StringBuilder stringBuilder = new StringBuilder();
        componentList.forEach(p -> stringBuilder.append(p.operation()));
        return stringBuilder.toString();
    }

    @Override
    public void add(AbstractTextComponent textComponent) {
        componentList.add(textComponent);
    }

    @Override
    public void remove(AbstractTextComponent textComponent) {
        componentList.remove(textComponent);
    }

    @Override
    public int getSize() {
        return size;
    }
}
