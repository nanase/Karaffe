/* Generated By:JJTree: Do not edit this line. ASTAdditiveOperatorExpr.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTAdditiveOperatorExpr extends SimpleNode {

    public ASTAdditiveOperatorExpr(int id) {
        super(id);
    }

    public ASTAdditiveOperatorExpr(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=e5090eeac0da80cfecdabf2264120aaa (do not edit this line) */
