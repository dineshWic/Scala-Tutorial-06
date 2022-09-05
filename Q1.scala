object Q1 {
  def main(args: Array[String]):Unit={
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val Encript=(c:Char,shiftAmount:Int,a:String)=> a((a.indexOf(c.toUpper)+shiftAmount)%a.size)
    val Decrypt=(c:Char,shiftAmount:Int,a:String)=> a((a.indexOf(c.toUpper)-shiftAmount)%a.size)

    val cipher=(algo:(Char,Int,String)=> Char,s:String,shiftAmount:Int,a:String)=> s.map(algo(_,shiftAmount,a))

    val ct=cipher(Encript,"Dinesh",5,alphabet)
    val pt=cipher(Decrypt,"Dinesh",3,alphabet)

    println(ct)
    println(pt)

  }

}
