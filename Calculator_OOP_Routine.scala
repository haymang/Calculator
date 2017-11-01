package calculator.routine;

class Number(val num:Double) {
    
    def add(n:Number):Double = {
       return num + n.num;
    }
    
    def subtract(n:Number):Double = {
        return num - n.num;
    }
    
    def multiply(n:Number):Double = {
        return num * n.num;
    }
    
    def divide(n:Number):Double = {
        if(n.num != 0.0) {
            return num / n.num;
        }
        return 0;
    }

    def checkInt():Boolean = {
        return Math.ceil(num) == Math.floor(num);
    }


}



