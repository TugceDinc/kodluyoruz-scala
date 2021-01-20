package dev.akif.kodluyoruz.streetfinder
import scala.collection.mutable.ListBuffer
class StreetFinder {
  def findStreets(streets: List[String], names: Set[String]): List[String] ={
    var liste = streets.filterNot(p => names.filter(t => p.contains(t)).isEmpty).distinct
    liste
  }
}