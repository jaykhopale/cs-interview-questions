package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class RotateArraySpec extends BaseSpec {

    @Unroll def "test rotate"() {
        expect:
        RotateArray.rotate(a as int[], b) == c as int[]

        where:
        a               | b  || c
        [1, 2, 3, 4, 5] | -1 || null
        null            | 1  || null
        [1, 2, 3, 4, 5] | 1  || [5, 1, 2, 3, 4]
        [1]             | 0  || [1]
    }
}
