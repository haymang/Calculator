package calculator.routine;

class Number(val num:Double) {
    
    def add(n:Number):Number = {
       return new Number(num + n.num);
    }
    
    def subtract(n:Number):Number = {
        return new Number(num - n.num);
    }
    
    def multiply(n:Number):Number = {
        return new Number(num * n.num);
    }
    
    def divide(n:Number):Number = {
        if(n.num != 0.0) {
            return new Number(num / n.num);
        }
        println("Cannot divide by 0");
        sys.exit;
    }

    def checkInt():Boolean = {
        return Math.ceil(num) == Math.floor(num);
    }


}



