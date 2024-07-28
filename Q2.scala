import scala.collection.mutable
import scala.io.StdIn.{readLine, readInt}

object manage_student_record{
    def main(args:Array[String]): Unit = {

        def grade(percentage:Int):String = percentage match {
            case percentage if(percentage >= 90) => "A"
            case percentage if(percentage >=75 && percentage <90 ) => "B"
            case percentage if(percentage >=50 && percentage <75 ) => "C"
            case _ => "D"
        }

        def printStudentRecord(r:(String,Int,Int))={
            printf("Name\t: %s\n",r._1)
            printf("Mark\t:%d\n",r._2)
            printf("Grade\t:%s\n",grade(r._3))
        }

        def validateInput(nameVal:String,marksVal:Any,totalVal:Any):(Boolean,Option[String]) ={
            if(nameVal.trim.isEmpty){
                return (false,Some("Name should be non empty"))
            }

            val totalValInt = totalVal.asInstanceOf[Int]
            if (totalValInt < marksVal.asInstanceOf[Int]) {
                return (false,Some("marks cannot greater than total marks"))
            }

            // If all validations are passed
            (true,None)

            def getStudentInfo():(String,Int,Int) ={

                var isValid = false
                var errorMessage: Option[String] = None
                var name: String = ""

                while (!isValid){
                    val name = readLine("Enter the name: ")
                    print("Enter the marks: ")
                    val m = readInt()
                    print("Enter the total marks: ")
                    val total_marks = readInt()
                        val validation = validateInput(nameVal,marksVal,totalVal)

                    
                }

                (name,m,total_marks)
        }
        }





        val stu_rec = getStudentInfo()
        printStudentRecord(stu_rec)

    }
}