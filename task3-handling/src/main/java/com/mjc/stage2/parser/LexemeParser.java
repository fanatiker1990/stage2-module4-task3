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
        String[] sentences = string.split(LEXEME_REGEX);

        for (int i = 0; i <sentences.length ; ++i) {
            String sentence=sentences[i];
            AbstractTextComponent sentenceComponent = new TextComponent(TextComponentType.SENTENCE);
            abstractTextComponent.add(sentenceComponent);
            if (this.nextParser != null) {
                this.nextParser.parse(sentenceComponent, sentence);
            }
        }
        String[] words = string.split(WORD_REGEX);
        for (int i = 0; i < words.length ; ++i) {
            String word=words[i];
            AbstractTextComponent wordComponent = new TextComponent(TextComponentType.WORD);
            abstractTextComponent.add(wordComponent);
            if (this.nextParser != null) {
                this.nextParser.parse(wordComponent, word);
            }
        }
    }


}
