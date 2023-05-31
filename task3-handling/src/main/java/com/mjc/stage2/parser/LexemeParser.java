package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";
    private AbstractTextParser nextParser;

    public LexemeParser(AbstractTextParser nextParser) {
        this.nextParser = nextParser;
    }

    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] lexemes = string.split(LEXEME_REGEX);
        for (String lexeme : lexemes) {
            AbstractTextComponent lexemeComponent = new TextComponent(TextComponentType.WORD);
            abstractTextComponent.add(lexemeComponent);

            if (nextParser != null) {
                nextParser.parse(lexemeComponent, lexeme);
            }
        }
    }


}
