package io.cinsight.cel.main;

import io.cinsight.cel.parser.CELBaseListener;
import io.cinsight.cel.parser.CELParser;

public class TestListener extends CELBaseListener {

    public int i = 0;


    @Override public void exitRelation(CELParser.RelationContext ctx) {i++; }
}
