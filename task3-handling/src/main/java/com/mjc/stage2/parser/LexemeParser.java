package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private static final String WORD_REGEX = "\\w[\\w!=?():]+";

    public LexemeParser() {
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        if (abstractTextComponent.getComponentType() == TextComponentType.SENTENCE) {
            String[] lexemes = string.split(LEXEME_REGEX);
            for (String lexeme : lexemes) {
                AbstractTextComponent component = new TextComponent(TextComponentType.WORD);
                abstractTextComponent.add(component);
                nextParser.parse(component, lexeme);
            }
        } else if (nextParser != null) {
            nextParser.parse(abstractTextComponent, string);

        }
    }


}
