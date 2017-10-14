import scala.collection.mutable.ListBuffer;

object Calculator_FP{

	def parseNum(strInput:String):Double = {

			//def isNumber: Boolean = strInput.matches("[+-]?\\d+.?\\d+");

			try{
				return strInput.toDouble;
			}
			catch{
			  case e: Exception => {
				  println("Not a Number, Enter a number");
				  scala.io.StdIn.readLine().toDouble;
			  }
		 }
	}


	private def checkInt(number:Double):Boolean = {
			return Math.ceil(number) == Math.floor(number);

	}


	def add(a:Double,b:Double) = a+b;

	def sub(a:Double,b:Double) = a-b;

	def mul(a:Double,b:Double) = a*b;

	def div(a:Double,b:Double) = if(b == 0){ 
		  println("Can't divide by 0");
		  sys.exit
		  }
	else a/b;


	def main(args: Array[String]){

		println("Enter 1st operand");
		var str1 = scala.io.StdIn.readLine();
		var operand1 = parseNum(str1);

		println("Enter 2nd operand");
		var str2 = scala.io.StdIn.readLine();
		var operand2 = parseNum(str2);

		var result = div(operand1,operand2);

		if(checkInt(result)){
			println("Output :" +result.asInstanceOf[Int]);
		}
		else
			println("Output:" +result)
	}
}
