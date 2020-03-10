class Arrayx{  
    var array1 = Array.ofDim[Float](2,2)  // We Create our multidimensional array  
    var array2 = Array.ofDim[Float](2,2) 
    array1 = Array(Array(1,2), Array(3,4))   // We initialise our multidimensional array  
    array2 = Array(Array(5,6), Array(7,8))  
    var array3 = Array.ofDim[Float](2,2)  
    
    def displayArray(){  
        print("2D ARRAY is: ")
        println()  
        for(i<- 0 to 1)
        {               // Traversing elements using loop  
           for(j<- 0 to 1)
           {  
                print(array1(i)(j) + "      ")  
            }  
            println()  
        }      
    }
    
    def getElement(a:Int, b:Int){
        print("Element at [" + a + "][" + b + "] " + "is: ") 
        print(array1(a)(b))         //print the element at i row and j coloumn
        println()
        
    }
    def setElement(a:Int, b:Int, value:Int){
        array1(a)(b) = value          //set the element at i row and j coloumn to user defined value
        print("New 2D ARRAY is: ")
        println()
        displayArray()
        
    }
    
    def sumOfArrays(){  
        for(i<- 0 to 1)
        {              
           for(j<- 0 to 1)
           {  
                array3(i)(j) = array1(i)(j)+array2(i)(j)  //addition of i and j element of both rows
            }  
        } 
        print("The sum of arrays is:")
        println()
        for(i<- 0 to 1)
        {               
           for(j<- 0 to 1)
           {  
                print(array3(i)(j) + "      ")
            }  
            println()
        }  
    }
    
}  
  
object MainObject{  
    def main(args:Array[String]){  
        var a = new Arrayx() 
        a.displayArray()
        a.getElement(1,1)
        a.setElement(1,1, 22)
        a.sumOfArrays()
    }  
}  


