object Calculator{
  import scala.collection.mutable.ListBuffer;
	def main(args: Array[String]){

	  var res :Int = 0;
		println("Enter 1st operand");
		var op1 = scala.io.StdIn.toString;
		//println("op1:" +op1);
		var v1 = parseNum(op1);
		

		println("Enter 2nd operand");
		var op2 = scala.io.StdIn.toString;
		//println("op2:" +op2);
		var v2 = parseNum(op2);
		
		println("operands: "+v1,+v2);
		val op = new Operations();
		var result = op.addNum(v1,v2);
		println("fd:" +result);
		if(checkInt(result)){
			 res = result.asInstanceOf[Int];
			
		}
		if(res == 0){
		println("Output : " +result);
		}
		else
		  println("Output:" +res)
		
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