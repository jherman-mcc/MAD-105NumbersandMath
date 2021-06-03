import java.text.DecimalFormat

fun main(args: Array<String>) {
    // This program adds up item costs and determines tax and tip
    var input1 = 1.00
    var totalAmt = 0.00
    val twoDigits = DecimalFormat("\u0024####.00")
    var i=1
    while (i != 0) {
      // loop while asking the user how much for each item. Exit loop when user presses zero.
      println("Enter the cost of your item: ")
      input1 = readLine()!!.toDouble()
      if (input1 == 0.00) i--
      // i has been set to 1 until the user enters 0, and which point it is reset to 0 to exit loop.
      totalAmt = totalAmt + input1
    }
  var total = twoDigits.format(totalAmt)
  println("Sub-Total amount of items: $total")
  var tax = totalAmt * 0.025   // calculate tax
  var totalTax = twoDigits.format(tax)
  println("Taxes: $totalTax")
  var tip = totalAmt * .175  // calculate tip
  var totalTip = twoDigits.format(tip)
  println("Recommended tip is $totalTip Note: This is 17.5% of your bill")
  totalAmt = totalAmt + tax + tip  // calculate total amount including tax and tip
  total = twoDigits.format(totalAmt)
  println("Total Amount is: $total")

}