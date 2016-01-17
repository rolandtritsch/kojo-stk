val alphabet = "0123456789abcdefghijklmnopqrstuvwxyz ."

val input = "Gillian is here"

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

val encrypted = encrypt(input, 5)

println(input + " -> " + encrypted)