package dev.akif.kodluyoruz.streetfinder

import java.io.File

/**
 * See CSV file at: https://github.com/makiftutuncu/kodluyoruz-scala/blob/main/data/streets.csv
 *
 * Original data: https://github.com/life/il-ilce-mahalle-sokak-cadde-sql
 */
object Application {
  def main(args: Array[String]): Unit = {
    val file = new File("C:/Users/tugce/Desktop/kodluyoruz-scala/data/streets.csv")
    val csvfl = new StreetsCsvLoader()
    val pp = csvfl.loadCsv(file)
    val tt = new StreetFinder()
    println(tt.findStreets(pp, Set("GİRNE"))) //Örnek bir girdi.
  }
}
