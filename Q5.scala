@main def main:Unit = {
    println(countLetterOccurrences(List("apple", "banana", "cherry", "date")))
}

def countLetterOccurrences(letters:List[String]):Int = letters.map(l=>l.length).reduce((a,b)=>a+b)