

class Fruits {
   private def name
   private  def origin
  static  def staticVar = "static var"

    Fruits(name , origin){
        this.name = name
        this.origin = origin
    }
    def fn(){
        println(' ==== > fn')
    }

    def getName() {
        return name
    }

    void setName(name) {
        this.name = name
    }

    def getOrigin() {
        return origin
    }

    void setOrigin(origin) {
        this.origin = origin
    }
}

def orange = new Fruits("orange", "algeria")
println(orange.name)
println(orange.staticVar)
println(Fruits.staticVar)

orange.setName("apple")
println(orange.name)

orange.name = "banana"
println(orange.name)


orange.fn()