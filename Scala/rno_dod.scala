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
