package codegym.service;

import org.springframework.stereotype.Service;

@Service
public class CalculaterServiceImpl implements ICalculaterService{
    @Override
    public float calculate(float firstOperand, float secondOperand, String operator) {
        float result = 0;
        switch (operator){
            case "Addition(+)":
                result = firstOperand + secondOperand;
                break;
            case "Subtraction(-)":
                result = firstOperand - secondOperand;
                break;
            case "Multiplication(*)":
                result = firstOperand * secondOperand;
                break;
            case "Division(/)":
                if(secondOperand != 0)
                     result = firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can't divide by zero");
                break;
        }
        return result;
    }
}
