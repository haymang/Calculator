import calculator.routine._;
import scala.util.control.Breaks._;

object Calculator{
	def main(args: Array[String]){

		var userInput1:Double = 0;
	var userInput2:Double = 0;


	println("Enter 1st operand");
	breakable{
		while(true){
			try{         
				userInput1 = scala.io.StdIn.readDouble(); 
				break;
			}
			catch{
			case e:Exception => println("Not a Number, Try Again!");
			}
		}
	}

	println("Enter 2nd operand");
	breakable{
		while(true){
			try{
				userInput2 = scala.io.StdIn.readDouble();
				break;
			}
			catch{
			case e:Exception => println("Not a Number, Try Again!");
			}
		}
	}

	val operand1 = new Number(userInput1);
	val operand2 = new Number(userInput2);


	println("operands: " +operand1.num+ "," +operand2.num);

	val result = operand1.add(operand2);
	val objCheck = new Number(result);

	if(objCheck.checkInt()) {
		println("Output : " + result.asInstanceOf[Int]);
	} else {
		println("Output: "+ result);
	}

	}
}