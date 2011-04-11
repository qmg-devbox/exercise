package qmetric.poly.part1;

/**
 * Node can perform simple calculator plus and multiple operations.
 *
 * Node takes operation - can be null
 * Node takes a value - can be zero
 * Node takes left and right nodes to perform operation.
 *
 * eg. new Node('+', 0, left, right) -> calculates left node value plus right node value.
 */
public class Node
{
    char operator;

    int value;

    Node left;

    Node right;

    public Node(char operator, int value, Node left, Node right)
    {
        this.operator = operator;
        this.value = value;
        this.left = left;
        this.right = right;
    }

    int evaluate()
    {
        switch (operator)
        {
            case '+':
                return left.evaluate() + right.evaluate();
            case '*':
                return left.evaluate() * right.evaluate();
            default:
                return value;
        }
    }

    @Override
    public String toString()
    {
        return "evaluates to :" + evaluate();
    }
}
