fun main() {
    // write your code here
    val input: String = readLine()!!

    val midCharPosition: Int

    if (input.length % 2 == 0) {
        midCharPosition = input.length / 2

        print("${input.substring(0,midCharPosition-1)}${input.substring(midCharPosition+1)}")

        //parzyste

    } else {
        //nie parzyste
        midCharPosition = input.length / 2
        print("${input.replaceRange( midCharPosition, midCharPosition+1, "")}")

    }

//    print("${input.substring(0,midCharPosition)}${input.substring(midCharPosition+1)}")

}