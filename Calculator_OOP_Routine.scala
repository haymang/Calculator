package calculator.routine;

class Operation(val num:Double) {
    
    def add(n:Operation):Double = {
        return num + n.num;
    }
    
    def subtract(n:Operation):Double = {
        return num - n.num;
    }
    
    def multiply(n:Operation):Double = {
        return num * n.num;
    }
    
    def divide(n:Operation):Double = {
        if(n.num != 0.0) {
            return num / n.num;
        }
        return 0;
    }

    def checkInt(number:Double):Boolean = {
        return Math.ceil(number) == Math.floor(number);
    }


}



