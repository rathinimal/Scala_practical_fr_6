import scala.collection.mutable
import scala.io.StdIn.{readLine,readInt}

object inventory_warehouse {
    def main(args: Array[String]): Unit = {
        
        //the data type of products inside
        type Detail_of_products = (String,Int,Double)

        val inventory1 : Map[Int,Detail_of_products] = Map(
            2020 -> ("Product_1", 32,10.00),
            2021 -> ("Product_2", 20,40.00),
            2022 -> ("Product_3",10,5.00),
            2023 -> ("Product_4",40,25.00)
        )

        val inventory2 : Map[Int,Detail_of_products]=Map(
            2021 -> ("Product_2", 20,50.00),
            2025 -> ("Product_54",10,10.00),
        )

        //Q1 product names in inventory 1
        def view_products(n:Map[Int,Detail_of_products]):Unit ={
            println(n.values.map(_._1))
        }

        //Q2 total value of products
        def total_value(m:Map[Int,Detail_of_products]): Unit ={
            print(m.values.map{case (_,quantity,price) => quantity* price})
        }

        def 

        view_products(inventory1)
        total_value(inventory1)
    }

    
}