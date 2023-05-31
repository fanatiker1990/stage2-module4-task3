package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class SymbolParser extends AbstractTextParser{
    private static final String SYMBOL_REGEX = "[^\\w\\s]";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        if (abstractTextComponent.getComponentType() == TextComponentType.SYMBOL) {
            char[] symbols = string.toCharArray();
            for (char symbol : symbols) {
                abstractTextComponent.add(new SymbolLeaf(TextComponentType.SYMBOL, symbol));
            }
        } else if (nextParser != null) {
            nextParser.parse(abstractTextComponent, string);
        }
    }


}
