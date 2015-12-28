val alphabet = "abcdefghijklmnopqrstuvwxyz ."

val input = "ogtt aejtkuvocuafcttcijb"

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

val decrypted = decrypt(input, 2)

println(input + " -> " + decrypted)