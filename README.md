# Age Converter to Other Planets

This project provides a Scala program that calculates your age on various planets based on your age in Earth seconds.

## Features

* Calculates your age on eight planets: Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune.
* Provides results in a user-friendly format with clear labels and two decimal places of precision.
* Implements robust error handling to catch invalid input (non-numeric values).

## Getting Started

1. **Clone or Download the Repository:**
   - Use Git to clone the repository containing the `AgeConverterToOtherPlanets.scala` file.
   - Alternatively, download the file directly.

2. **Compile and Run:**
   - If you're using a Scala IDE or build tool, follow its instructions to compile the project.
   - You can also compile from the command line using `scalac SpaceAgeCalculator.scala`.
   - Once compiled, you can run the program using `scala SpaceAgeCalculator`.

## Usage

When you run the program, it will prompt you to enter your age in seconds:


    
    Enter age in seconds:
    
    
Type your age in seconds and press Enter. The program will then calculate and display your age on each planet in a formatted table:

### Your age on different planets:
Planets  | age equivalent
------------- | -------------
Mercury   |   4.17 years
Venus:  |    1.00 years
Earth:  |  1.00 years
Mars:    |   0.53 years
Jupiter  |  0.08 years
Saturn  | 0.03 years
Uranus  |  0.01 years
Neptune  | 0.01 years



## Error Handling

If you enter a non-numeric value for your age, the program will display an error message:

    Invalid input. Please enter age in seconds.



