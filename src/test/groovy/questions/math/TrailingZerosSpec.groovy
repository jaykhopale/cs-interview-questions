package questions.math

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class TrailingZerosSpec extends BaseSpec {

    @Unroll def "test getTrailingZeros"() {
        expect:
        TrailingZeros.getTrailingZeros(a) == b

        where:
        a           || b
        0           || 0
        9           || 0 // none
        5           || 0 // none
        10          || 1
        10011013000 || 3
    }
}
