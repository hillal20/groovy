def x = "fffff"

def closure = {  name -> println("hello "+ name + " ${x}")}
closure.call("hill")



def y = "hhfhf"


def fn(y) {
   println(y) ;
}

fn(y)



def list = ["a","b","c","a"]
def  r = list.each{  println(it)}
println(r)

