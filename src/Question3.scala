//19000091
//Assignment 1
//Question 3
object Question3 extends App {
  val numberOfBookCopies = 60
  val bookCoverPrice = 24.95
  val discountPercentage = 40.0/100.0

  def calculateShippingCost(noOfBookcopies:Int):Double = {
    if (noOfBookcopies <= 50) 3.0
    else 3.0 + (0.75 * (noOfBookcopies - 50))
  }

  def calculateAmountofDiscount(bookCoverPrice:Double ,numberOfBookCopies:Int, discountPercetage:Double) = {
    bookCoverPrice * numberOfBookCopies * discountPercetage
  }

  def calculateWholeCost(numberOfBookCopies:Int ,bookCoverPrice:Double,discountPercetage:Double) = {
    ( (numberOfBookCopies * bookCoverPrice) - calculateAmountofDiscount(bookCoverPrice,numberOfBookCopies,discountPercetage) + calculateShippingCost(numberOfBookCopies))
  }

  val wholeSaleCost = calculateWholeCost(numberOfBookCopies,bookCoverPrice,discountPercentage)
  print("The Total Wholesale Cost = ")
  println(f"$wholeSaleCost%1.2f")
}
