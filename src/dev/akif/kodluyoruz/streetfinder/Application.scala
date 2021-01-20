import java.io.File
import scala.io.Source
import scala.collection.Map
import dev.akif.kodluyoruz.streetfinder.StreetsCsvLoader
import dev.akif.kodluyoruz.streetfinder.StreetFinder

object Application {
  def main(args: Array[String]): Unit = {
    val file = new File("C:/Users/tugce/Desktop/trendyol 4.hafta ödev/kodluyoruz-scala/data/streets.csv")
    val csvfl = new StreetsCsvLoader()
    val pp = csvfl.loadCsv(file)
    val tt = new StreetFinder()
    println(tt.findStreets(pp, Set("GİRNE"))) //Örnek bir girdi.
  }
}
