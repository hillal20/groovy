import org.apache.groovy.json.internal.Exceptions
import org.junit.internal.Throwables

def x=8
def result = ""


try{
    result = x/0
}catch( e){
    println(e.message)
}finally{
    println("finally")
}