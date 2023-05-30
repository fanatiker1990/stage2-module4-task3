package com.mjc.stage2.parser;

import com.mjc.stage2.entity.AbstractTextComponent;
import com.mjc.stage2.entity.TextComponent;
import com.mjc.stage2.entity.TextComponentType;

public class LexemeParser extends AbstractTextParser {
    private static final String LEXEME_REGEX = "\\s+";


    @Override
    public void parse(AbstractTextComponent abstractTextComponent, String string) {
        String[] sentences = string.split(LEXEME_REGEX);
        for (String sentence : sentences) {
            AbstractTextComponent sentenceComponent = new TextComponent(TextComponentType.SENTENCE);
            abstractTextComponent.add(sentenceComponent);
            if (nextParser != null) {
                nextParser.parse(sentenceComponent, sentence);
            }
        }
    }


}
