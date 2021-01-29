package dev.akif.kodluyoruz.streetfinder

import java.io.File
import scala.io.Source

trait CsvLoader {
  def loadCsv(file: File): List[String]
}

class StreetsCsvLoader extends CsvLoader {
  def loadCsv(file: File): List[String] = Source.fromFile(file.getPath).getLines().map(line => line.split(",")(1)).toList.map(street => street.replace("'",""));
}

