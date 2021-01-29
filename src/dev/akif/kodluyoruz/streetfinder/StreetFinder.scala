package dev.akif.kodluyoruz.streetfinder

class StreetFinder {
  def findStreets(streets: List[String], names: Set[String]): List[String] ={
    var liste = streets.filterNot(p => names.filter(t => p.contains(t)).isEmpty).distinct
    liste
  }
}

