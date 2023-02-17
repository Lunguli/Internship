fun main() {
    val cgpa = 1.6
    val grade: String
    grade =if(cgpa >= 4.6)
        "First class"
    else if (cgpa <= 4.4 && cgpa >= 3.6)
        "Second class upper"
    else if (cgpa <= 3.5 && cgpa >= 2.7)
        "Second class lower"
    else
        "pass"
    print("Your grade is $grade")
}