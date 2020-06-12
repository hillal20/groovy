

interface Car {


    def startEngine()
}

class AmericanCar implements Car{
    def name = "ford"
    def year = 2019
    def startEngine(){
        println( "yes it is starting ")
    }
}

def americanCar = new AmericanCar()
println(americanCar.year)
