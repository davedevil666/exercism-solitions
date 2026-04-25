class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
         
         if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        } 
        else if (operation.isEmpty()){
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        else if (!operation.matches("[+*/]")){
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        
        String answer = "";
        switch(operation){
            case "+":
                int sum = operand1 + operand2; 
                answer = operand1 + " + " + operand2 + " = " + sum;
                break;
            case "*":
                int mult = operand1 * operand2; 
                answer = operand1 + " * " + operand2 + " = " + mult;
                break;
            case "/":                
            try{
                int div = operand1 / operand2; 
                answer = operand1 + " / " + operand2 + " = " + div;
            }catch(ArithmeticException e){
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
                break;
                
    }
        return answer;
      
    }
}
