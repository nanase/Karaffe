/* Generated By:JJTree: Do not edit this line. ASTLessThanEqualToOperator.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTLessThanEqualToOperator extends SimpleNode {

    public ASTLessThanEqualToOperator(int id) {
        super(id);
    }

    public ASTLessThanEqualToOperator(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=e4f4d3756470a766292bf8c52ca16320 (do not edit this line) */