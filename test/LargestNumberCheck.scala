import org.scalacheck.Prop.forAll
import org.scalacheck.{Gen, Properties}

object LargestNumberCheck extends Properties("LargestNumber"){

  val genNumbers: Gen[String] = Gen.choose(1, 1000) map (_.toString)
  val listOfNumbers: Gen[Array[String]] =
    for {
      size <- Gen.choose(1,100)
      elems <- Gen.containerOfN[Array, String](size, genNumbers)
    } yield elems

  property("should respect length of numbers") =
    forAll(listOfNumbers){list  =>
      val result = LargestNumber.largestNumber(list)
      val assertion = result.length == list.mkString("").length
      if (!assertion)
        System.out.println(s"ERROR for list : ${list.mkString(",")}")
      assertion
    }

}
