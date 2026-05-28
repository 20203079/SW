package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<String, Operation> operations = new HashMap<>();

    public Calculator() {
        operations.put("+", new Add());
        operations.put("-", new Minus());
        operations.put("/", new Div());
        operations.put("*", new Multiply());
    }

    public int calculate(int a, String op, int b) {
        if (!operations.containsKey(op)) {
            throw new IllegalArgumentException("잘못된 연산기호입니다!");
        }
        return operations.get(op).calculate(a, b);
    }
}