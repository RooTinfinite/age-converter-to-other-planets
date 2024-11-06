object AgeConverterToOtherPlanets {
  private val OrbitalPeriods = Map(
    "Mercury" -> 0.2408467,
    "Venus" -> 0.61519726,
    "Earth" -> 1.0,
    "Mars" -> 1.8808158,
    "Jupiter" -> 11.862615,
    "Saturn" -> 29.447498,
    "Uranus" -> 84.016846,
    "Neptune" -> 164.79132
  )

  private val EarthYearInSeconds = 31557600.0

  def calculateAge(ageInSeconds: Double): Map[String, Double] = {
    OrbitalPeriods.map { case (planet, orbitalPeriod) =>
      val ageOnPlanet = ageInSeconds / (EarthYearInSeconds * orbitalPeriod)
      planet -> BigDecimal(ageOnPlanet).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    }
  }

  def main(args: Array[String]): Unit = {
    println("Enter age in seconds:")
    try {
      val seconds = scala.io.StdIn.readDouble()
      val ages = calculateAge(seconds)
      
      println("Your age on different planets:")
      println("-" * 30)
      ages.toList.sortBy(_._1).foreach { case (planet, age) =>
        println(f"$planet%-8s: $age%.2f lat")
      }
    } catch {
      case _: NumberFormatException => 
        println("Invalid input. Please enter age in seconds..")
    }
  }
}
