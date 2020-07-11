package practise2BArraylistA;

public static String calculation(BODMASCalculation bodmas, String result) {
    while (bodmas.hasMatch()) {
        double value, leftOfOperator = bodmas.getLeft();
        char op = bodmas.getOperator();
        double rightOfOprator = bodmas.getRight();

        switch (op) {
        case '/':
            if(rightOfOprator == 0) //Divide by 0 generates Infinity
                value = 0;
            else
                value = leftOfOperator / rightOfOprator;
            break;
        case '*':
            value = leftOfOperator * rightOfOprator;
            break;
        case '+':
            value = leftOfOperator + rightOfOprator;
            break;
        case '-':
            value = leftOfOperator - rightOfOprator;
            break;
        default:
            throw new IllegalArgumentException("Unknown operator.");
        }           
        result = result.substring(0, bodmas.getStart()) + value + result.substring(bodmas.getEnd());
        bodmas = new BODMASCalculation(result);
    }
    return result;
} {

}
