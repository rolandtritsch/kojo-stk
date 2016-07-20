val alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ .!?"

val input = "the"
val key = 55

def encrypt(text: String, key: Int): String = {
    var output = ""
    for(character <- text) {
        // println("character: " + character)       
        val position = alphabet.indexOf(character)
        // println("position: " + position)
        val encryptedPosition = if(position + key > alphabet.size - 1) {
            position + key - alphabet.size 
        } else {
            position + key
        }
        // println("encrypted position: " + encryptedPosition)
        val encryptedCharacter = alphabet(encryptedPosition)
        // println("encrypted character: " + encryptedCharacter)
        output = output + encryptedCharacter
    }
    output
}

println("Size of the alphabet: " + alphabet.size)
if(key < 0 || key > alphabet.size) {
    println("Key out of range [0 .. alphabet.size]")
} else {
    println(input + " -> " + encrypt(input, key))
}
