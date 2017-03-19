import org.scalatest.FlatSpec

class LargestNumberTest extends FlatSpec {

  behavior of "LargestNumber"

  it should "compute largest number for a case" in {
    assert(LargestNumber.largestNumber(Array("21","2")) === "221")
  }

  it should "compute largest number for b case" in {
    assert(LargestNumber.largestNumber(Array("9","4","6","1","9")) === "99641")
  }

  it should "compute largest number for c case" in {
    assert(LargestNumber.largestNumber(Array("23","39","92")) === "923923")
  }

  it should "compute largest number for d case" in {
    assert(LargestNumber.largestNumber(Array("9","8","7","9","8","7")) === "998877")
  }

  it should "compute largest number for e case" in {
    assert(LargestNumber.largestNumber(Array("11","10")) === "1110")
  }

  it should "compute largest number for f case" in {
    assert(LargestNumber.largestNumber(Array("23","2")) === "232")
  }

}
