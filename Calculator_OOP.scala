import calculator.routine._;

object Calculator{
    def main(args: Array[String]){


         println("Enter 1st operand");
         var userInput1 = scala.io.StdIn.readDouble();       

         println("Enter 2nd operand");
         var userInput2 = scala.io.StdIn.readDouble();       

        val operand1 = new Operation(userInput1);
        val operand2 = new Operation(userInput2);

    //  val operand1 = obj1.parseNum();
    //  val operand2 = obj2.parseNum();

        println("operands: " +operand1.num+ "," +operand2.num);
        
        //val objOp = new Operations(operand1,operand2);
        val result = operand1.add(operand2);
        val objCheck = new Operation(result);

        if(objCheck.checkInt(result)) {
            println("Output : " + result);
        } else {
            println("Output: "+ result.asInstanceOf[Int]);
        }

    }
}