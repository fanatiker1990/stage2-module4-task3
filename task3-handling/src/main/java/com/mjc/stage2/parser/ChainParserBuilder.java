package com.mjc.stage2.parser;

import java.util.ArrayList;
import java.util.List;

public class ChainParserBuilder {
    private List<AbstractTextParser> parsers = new ArrayList<>();

    public ChainParserBuilder() {
    }

    public ChainParserBuilder setParser(AbstractTextParser abstractTextParser) {
        parsers.add(abstractTextParser);
        return this;
    }

    public AbstractTextParser build() {
        boolean first = true;
        AbstractTextParser main = parsers.get(0);
        for (int i = 1; i < parsers.size(); i++){
            main.setNextParser(parsers.get(i));
        }
        return main;
    }
}
