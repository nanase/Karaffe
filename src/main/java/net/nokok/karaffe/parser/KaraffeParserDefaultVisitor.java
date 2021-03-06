/* Generated By:JavaCC: Do not edit this line. KaraffeParserDefaultVisitor.java Version 6.0_1 */
package net.nokok.karaffe.parser;

public class KaraffeParserDefaultVisitor implements KaraffeParserVisitor {

    public Object defaultVisit(SimpleNode node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        node.childrenAccept(this, data);
        return data;
    }

    public Object visit(SimpleNode node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTCompileUnit node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTStatement node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTDeclaration node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTModifier node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTBlock node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTTypeDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTInterfaceDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTVariableDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTVariableTypeDcl node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTTypeParameters node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTTypeParameter node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTExpression node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTAssignExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTOrOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTAndOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTEqualityOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTComparisonOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTAdditiveOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTMultiplyOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTUnaryOperatorExpr node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTFunctionApply node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTFunctionLiteral node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTFunctionVariableBinding node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTIdentifier node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTLeftBracket node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTRightBracket node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTLeftBrace node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTRightParen node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTLeftParen node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTRightBrace node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTColon node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTDot node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTEqualOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTLessThanOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTLessThanEqualToOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTGreaterThanOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTGreaterThanEqualToOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTPlus node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTMinus node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTStarOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTSlashOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTPercentOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTTildeOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTBangOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTAndOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTOrOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTHatOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTQuestionOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTArrowOperator node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTEqualTo node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTNotEqualTo node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTSafeDiv node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTSafeRem node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }

    public Object visit(ASTNewLine node, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {
        return defaultVisit(node, data);
    }
}
/* JavaCC - OriginalChecksum=35f771a14376694e93899831a8c7e558 (do not edit this line) */
