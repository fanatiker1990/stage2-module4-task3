package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        this.parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        AbstractTextParser firstParser = parsers.get(0);
        AbstractTextParser currentParser = firstParser;

        for (int i = 1; i < parsers.size(); i++) {
            AbstractTextParser nextParser = parsers.get(i);
            currentParser.setNextParser(nextParser);
            currentParser = nextParser;
        }

        return firstParser;
    }
}
