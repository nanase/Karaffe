/* Generated By:JJTree: Do not edit this line. ASTFunctionVariableBinding.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTFunctionVariableBinding extends SimpleNode {

    public ASTFunctionVariableBinding(int id) {
        super(id);
    }

    public ASTFunctionVariableBinding(KaraffeParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=3516b0878dd8d43ed3a797f681f41386 (do not edit this line) */
