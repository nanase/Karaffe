/* Generated By:JJTree: Do not edit this line. ASTOrOperatorExpr.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTOrOperatorExpr extends SimpleNode {

    public ASTOrOperatorExpr(int id) {
        super(id);
    }

    public ASTOrOperatorExpr(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=1e8ad4bfa2e6e97e7f2a5d8f4d676646 (do not edit this line) */
