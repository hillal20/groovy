
class  Vehicle{
    def name
    def year

    Vehicle(name, year) {
        this.name = name
        this.year = year
    }

    def hasAc(){
      return "has ac"
    }
    def convertible(){
       return  "yes convrtible"
    }

}

class Car extends Vehicle{
    Car(name, year, fuel) {
        super(name, year)
        this.fuel = fuel
    }
    def fuel
       def  isGreen(){
          return "yes it hybrid "
       }

    // override methods
    def convretible(){
        return  "no it is  convrtible"
    }
}

def clio4 = new Car("clio4",2016, "deisele")

println(clio4.convretible())