def filePath = "/Users/hilal/groovy-toturials/data-1.txt"

def file = new File(filePath); //

//  reading the file as string
println("file ====> " +  file.text)

// reading the  file as a list
def list= file.collect{ it }
println("List ====> "+ list )

// reading file as a list of  strings
def listOfString= file.readLines()
println("list of strings "+ listOfString)

// read file line by line
file.eachLine{ l -> println("l ===> "+l)}

// read Line by reader
file.withReader{ l -> {
    def line
    while((line = l.readLine()) != null){
        println(line)
    }
}
}

// read file and create new file by reader
def  newFile = "data-2.txt"
def  reader = file.newReader() // open the reader
new File(newFile).append(reader)
reader.close() // close the reader

// working with binary files
def bFile = file.bytes
println(bFile)



///////////////////////////////// bellow is write files
def location = "./data-3.txt"
def file2 = new  File(location)
file2.write("I am writing to this file ")
file2 << "\n i am writing using shift operator "
file2.text = "\n i am writing using file.text"


