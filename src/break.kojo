val alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .!?"

val input = "p2?bP7hP63g3R"

val keyWord = "the"
val keyWordEncrypted = "i63"

def decrypt(text: String, key: Int): String = {
    var output = ""
    for(character <- text) {
        // println("character: " + character)       
        val position = alphabet.indexOf(character)
        // println("position: " + position)
        val encryptedPosition = if(position - key < 0) {
            position - key + alphabet.size 
        } else {
            position - key
        }
        // println("encrypted position: " + encryptedPosition)
        val encryptedCharacter = alphabet(encryptedPosition)
        // println("encrypted character: " + encryptedCharacter)
        output = output + encryptedCharacter
    }
    output
}

var key = 0
var tryKey = 0
var done = false
while(tryKey < alphabet.size && !done) {
    if(keyWord == decrypt(keyWordEncrypted, tryKey)) {
        key = tryKey
        done = true        
    } else {
        tryKey = tryKey + 1
    }
}

println("Found key: " + key)
println(input + " -> " + decrypt(input, key)) 