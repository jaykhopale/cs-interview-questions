package codingbat.recursion

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class PowerNSpec extends BaseSpec {

    @Unroll def "test powerN"() {
        expect:
        PowerN.powerN(a, b) == c

        where:
        a | b || c
        1 | 1 || 1
        3 | 1 || 3
        3 | 2 || 9
        3 | 3 || 27
    }
}
