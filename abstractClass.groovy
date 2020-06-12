abstract class Animal { // can have abstracted methods or can not

  abstract   def name = "mic"
    def age = 30

    Animal(name, age) {
        this.name = name
        this.age = age
    }

    abstract def eatMeat()

    def bark(){
     println(" ho ho ho !! ")
    }
}


class AfricanAnimal extends Animal{ // any  class must extends other class and not implement them
    AfricanAnimal(name, age ) {
        super(name, age)
    }

    def eatMeat(){
        println("yes i eat meat ")
    }
}

abstract class AsianAnimal extends Animal{

    AsianAnimal( name,  age) {
        super(name, age)
    }

    def eatMeat(){
        println("yes i eat meat ")
    }
   abstract def bite()

}

def africanAnimal = new AfricanAnimal( "bilo", 40)
println(africanAnimal.name)
println(africanAnimal.age)
africanAnimal.bark()