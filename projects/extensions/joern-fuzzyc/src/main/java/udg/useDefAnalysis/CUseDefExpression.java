package udg.useDefAnalysis;

public class CUseDefExpression {
    /**
     * Eliminate all & and *, because we do not need this information for 
     * Semantic Unit identification (and it makes things more complicated).
     */
    public static String simplify(String expr)
    {
        return expr.replace("&", "").replace("*", "");
    }
}
