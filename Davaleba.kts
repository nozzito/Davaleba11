import kotlin.math.pow
import kotlin.math.sqrt

class Fraction(val n: Float, val d: Float){
    private var numerator: Float = n
    private var denominator: Float = d

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Fraction){
            if(numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }

    fun reduce(): Fraction{
        val GCD = gcd(numerator, denominator)
        return Fraction(numerator/GCD, denominator/GCD)
    }
    fun sum(fr: Fraction): Fraction{
        if(denominator == fr.denominator) {
            return Fraction(numerator + fr.numerator, denominator).reduce()
        } else {
            return Fraction(numerator * fr.denominator + fr.numerator * denominator, denominator*fr.denominator).reduce()
        }
    }
    fun multiply(fr: Fraction): Fraction {
        return Fraction(numerator * fr.numerator, denominator * fr.denominator).reduce()
    }
    private fun gcd(a: Float, b: Float): Float {
        if (b == 0F) return a
        return gcd(b, a % b)
