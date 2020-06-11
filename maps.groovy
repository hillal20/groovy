def map = ["hill":"aiss","Bill":"FILL"]


for( x in map){
    println(x)
    println(x.key)
    println(x.value)
}
println('========')


map.each{ key,vlaue -> println(key+ ": " + vlaue)  }
map.eachWithIndex{ key,vlaue, i-> println(key+ ": " + vlaue + "=== "+ i)  }
map.each{ x -> println(x.key)  }

if(map.X)
     println(map.hill)
else println('NO')