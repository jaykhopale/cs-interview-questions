package questions.bitmanipulation

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class AddTwoNumbersSpec extends BaseSpec {

    @Unroll def "test getBinarySum"() {
        expect:
        AddTwoNumbers.getBinarySumLib(a, b) == c
        AddTwoNumbers.getBinarySum(a, b) == c
        AddTwoNumbers.getBinarySumBit(a, b) == c

        where:
        a           | b           || c
        null        | null        || null
        "010101101" | null        || "010101101"
        null        | "010101101" || "010101101"
        "010101101" | "101011010" || "1000000111"
        "000000000" | "111111111" || "111111111"
        "000000000" | "100000000" || "100000000"
        "0"         | "100000000" || "100000000"
        "1"         | "1"         || "10"
        "100000000" | "0"         || "100000000"
    }
}
