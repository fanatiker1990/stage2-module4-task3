package com.mjc.stage2.parser;


import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class WordParser extends AbstractTextParser {

    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String [] strs = string.split(WORD_REGEX);

        for (String str : strs) {
            abstractTextComponent.add(new TextComponent(TextComponentType.WORD));
        }
    }

}
