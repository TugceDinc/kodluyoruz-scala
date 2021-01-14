package dev.akif.kodluyoruz.streetfinder

import java.io.File
import scala.io.Source

class StreetsCsvLoader extends CsvLoader {
  def loadCsv(file: File): List[String] = Source.fromFile(file.getPath).getLines().toList
} 

