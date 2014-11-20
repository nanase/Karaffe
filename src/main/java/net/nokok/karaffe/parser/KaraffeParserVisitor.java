/* Generated By:JavaCC: Do not edit this line. KaraffeParserVisitor.java Version 6.0_1 */
package net.nokok.karaffe.parser;

public interface KaraffeParserVisitor {

    public Object visit(SimpleNode node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTCompileUnit node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTStatement node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTDeclaration node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTModifier node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTBlock node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTTypeDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTInterfaceDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTVariableDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTVariableTypeDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTTypeParameters node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTTypeParameter node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTExpression node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTAssignExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTOrOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTAndOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTEqualityOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTComparisonOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTAdditiveOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTMultiplyOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTUnaryOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTFunctionApply node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTFunctionLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTFunctionVariableBinding node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTIdentifier node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTLeftBracket node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTRightBracket node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTLeftBrace node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTRightParen node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTLeftParen node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTRightBrace node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTColon node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTDot node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTEqualOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTLessThanOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTLessThanEqualToOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTGreaterThanOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTGreaterThanEqualToOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTPlus node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTMinus node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTStarOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTSlashOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTPercentOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTTildeOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTBangOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTAndOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTOrOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTHatOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTQuestionOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTArrowOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTEqualTo node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTNotEqualTo node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTSafeDiv node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTSafeRem node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;

    public Object visit(ASTNewLine node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException;
}
/* JavaCC - OriginalChecksum=01a2055aad4d8925d11a197ce15925ae (do not edit this line) */
