package net.nokok.karaffe.javacc;

import static net.nokok.karaffe.javacc.KaraffeParserCommentTest.runKaraffeParserWithSource;
import net.nokok.karaffe.javacc.stmt.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class KaraffeParserIntLiteralTest {

    @Test
    public void testIntLiteral() throws Exception {
        Statements statements = runKaraffeParserWithSource("x = 1\n");
        assertThat(statements.size(), is(1));
        assertThat(statements.get(0).getType(), is(StatementType.VARIABLE_DECLARATION));
        VariableDeclaration v = (VariableDeclaration) statements.get(0);
        assertThat(v.variableName(), is("x"));
        assertThat(v.evalExpr(), is(1));
    }

    @Test
    public void testIntLiteral2() throws Exception {
        runKaraffeParserWithSource("x = 120\n");
        runKaraffeParserWithSource("x = 0\n");
        runKaraffeParserWithSource("x = -1\n");
        runKaraffeParserWithSource("x = -50\n");
        runKaraffeParserWithSource("x=2\n");
        runKaraffeParserWithSource("x =   3000\n");
    }

    @Test(expected = ParseException.class)
    public void testMinusZero() throws Exception {
        runKaraffeParserWithSource("x = -0\n");
    }

}