import scala.collection.mutable.ListBuffer;

object Calculator{

	def main(args: Array[String]){

		// var intResult :Int = 0;
		println("Enter 1st operand");
		var str1 = scala.io.StdIn.readLine();
		var operand1 = parseNum(str1);


		println("Enter 2nd operand");
		var str2 = scala.io.StdIn.readLine();
		var operand2 = parseNum(str2);

		//println("operands: "+1,+v2);
		val op = new Operations();
		var result = op.addNum(operand1,operand2);


		var intResult  = if(checkInt(result)){
			result.asInstanceOf[Int];			
		}

		if(checkInt(result)){
			println("Output :" +intResult);
		}
		else
			println("Output:" +result)

	}


	def operands(args: String*):ListBuffer[Double] = {
			println("Enter the operands");

			var operand = ListBuffer[Double]();
			for(arg <- args){
				var op = parseNum(arg);
				operand += op;

			}
			return operand;
	}
	def parseNum(a:String):Double = {
			try{
				return a.toDouble;
			}
			
			catch{
			case e: Exception => println("Not a Number");
			return 0.0;
			}
	}

	private def checkInt(number:Double):Boolean = {
			return Math.ceil(number) == Math.floor(number);

			// return number.toInt;


	}

	class Operations {


		def addNum(a:Double,b:Double):Double = {
				var sum = a+b;
				return sum;
		}

		def subNum(a:Double,b:Double):Double = {
				var result = a-b;
				return result;
		}
		def mulNum(a:Double,b:Double):Double = {
				var result = a*b;
				return result;
		}
		def divNum(a:Double,b:Double):Double = {
				var result = a/b;
				return result;
		}
 }
	
}