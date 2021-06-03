import java.text.DecimalFormat

fun main(args: Array<String>) {
    var input1 = 1.00
    var totalAmt = 0.00
    val twoDigits = DecimalFormat("###.00")
    var i=1
    while (i != 0) {
      println("Enter the cost of your item: ")
      input1 = readLine()!!.toDouble()
      if (input1 == 0.00) i--
      totalAmt = totalAmt + input1
    }
  var total = twoDigits.format(totalAmt)
  println("Sub-Total amount of items: $total")
  var tax = totalAmt * 0.025
  var totalTax = twoDigits.format(tax)
  println("Taxes: $totalTax")
  var tip = totalAmt * .175
  var totalTip = twoDigits.format(tip)
  println("Recommended tip is $totalTip Note: This is 17.5% of your bill")
  totalAmt = totalAmt + tax + tip
  total = twoDigits.format(totalAmt)
  println("Total Amount is: $total")

}