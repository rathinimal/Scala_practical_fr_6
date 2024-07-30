import scala.io.StdIn.{readLine, readInt}

object manage_student_record{
    def main(args:Array[String]): Unit = {

        def grade(percentage:Int):String = percentage match {
            case percentage if(percentage >= 90) => "A"
            case percentage if(percentage >=75 && percentage <90 ) => "B"
            case percentage if(percentage >=50 && percentage <75 ) => "C"
            case _ => "D"
        }

        def printStudentRecord(r:(String,Int,Int)): Unit = {
            printf("Name\t: %s\n",r._1)
            printf("Mark\t:%d\n",r._2)
            val percentage = ((r._2.toDouble / r._3)*100)
            printf("Grade\t:%s\n",grade(percentage.toInt))
        }

        def validateInput(nameVal:String,marksVal:Int,totalVal:Int):(Boolean,Option[String]) ={
            if(nameVal.trim.isEmpty){
                return (false,Some("Name should be non empty"))
            }

            if(marksVal < 0 || totalVal < 0) {
                return (false,Some("Marks and total should greater than zero"))
            }
            
            if(marksVal > totalVal) {
                return (false,Some("Marks cannot be greater than total marks."))
            }

            // If all validations are passed
            (true,None)
        }

        def getStudentInfo():(String,Int,Int) = {
            var isValid = false
            var errorMessage: Option[String] = None
            var name: String = ""
            var marks: Int = 0
            var total_marks: Int = 0

            while (!isValid){
                name = readLine("Enter the name: ")
                print("Enter the marks: ")
                marks = readInt()
                print("Enter the total marks: ")
                total_marks = readInt()

                var validation = validateInput(name,marks,total_marks)
                isValid = validation._1
                errorMessage = validation._2
                
                if (!isValid) {
                    println(s"Invalid input: ${errorMessage.get}")
                }
            }
            (name,marks,total_marks)
        }
        val stu_rec = getStudentInfo()
        printStudentRecord(stu_rec)
            
    }   
}

