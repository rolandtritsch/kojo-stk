val alphabet = "abcdefghijklmnopqrstuvwxyz ."

val input = "ogtt aejtkuvocuafcttcijb"

def decrypt(text: String, key: Int): String = {
    for(character <- text) yield {
        val position = alphabet.indexOf(character)
        val encryptedPosition = if(position - key < 0) {
            position - key + alphabet.size 
        } else {
            position - key
        }
        alphabet(encryptedPosition)
    }
}

val decrypted = decrypt(input, 2)

println(input + " -> " + decrypted)