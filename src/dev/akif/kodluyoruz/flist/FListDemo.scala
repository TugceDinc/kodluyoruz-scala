package dev.akif.kodluyoruz.flist

object FListDemo {
  def main(args: Array[String]): Unit = {
    val list = (1 to 100 by 2).toList

    val flist1 = FList(1, 2, 3)
    println("flist1 : size = " + flist1.size)

    val flist2 = FList(list)
    println("flist2 : size = " + flist2.size)

    val flist3 = FList("hello", "world")
    println("flist3 : size = " + flist3.size)

    // Append
    var case1 = ""
    flist1.append(10).append(52).map(p => case1 += p + " ")
    println("case1 : " + case1)

    // Concat
    var case2 = ""
    flist1.concat(flist2).map(p => case2 += p + " ")
    println("case2 : " + case2)

    // Filter
    var case3 = ""
    flist2.filter(b => b == 3).map(p => case3 += p + " ")
    println(case3 match {
      case "" => "case3 : " + "Not found"
      case _ => "case3 : " + "Found"
    })

    // Prepend
    var case4 = ""
    flist1.prepend(10).prepend(52).map(p => case4 += p + " ")
    println("case4 : " + case4)

  }
}
