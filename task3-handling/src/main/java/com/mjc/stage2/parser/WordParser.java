package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.SymbolLeaf;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public WordParser(AbstractTextParser nextParser) {
        super(nextParser);
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] symbols = string.split("");
        for (String symbol : symbols) {
            AbstractTextComponent symbolComponent = new SymbolLeaf(symbol.charAt(0));
            abstractTextComponent.add(symbolComponent);
        }
    }
}
