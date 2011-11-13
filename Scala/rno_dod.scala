object Main {
  def main(args: Array[String]) {
    val test = Console.readInt()
    var array = List[Integer]()
    for (i <- 1 to test) {
      var iter = Console.readInt()
      val splited_str = Console.readLine().split(" ")
      var sum = 0
      for (value: String <- splited_str) {
        sum += value.toInt
      }
      array = array ::: List[Integer](sum)
    }
    if (test > 0) 
      array.foreach(println)
  }
}


/*
test = gets
test = Integer(test)
#
ile=[]
n=[]
test.times  { |it|
  i = Integer(it)
  ile[i] = gets
  ile[i] = Integer(ile[i])
  n[it] = gets.split(" ")
}

wynik=[]
test.times { |e|
  wynik[e] = 0
  ile[e].times { |i|
    wynik[e] += Integer(n[e][i])
  }
  puts wynik[e]
}
*/
