package questions.stringarraymatrix

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class FindKSmallestNumbersSpec extends BaseSpec {

    @Unroll def "test getSmallestNumbers"() {
        expect:
        FindKSmallestNumbers.getSmallestNumbers(a, b) == c

        where:
        a               | b || c
        [[3], [1], [2]] | 1 || [1]
//        [[3], [1], [2]] | 3 | [1, 2, 3]
//        [[1, 2, 3, 5],
//         [-1, 2, 4, 5]] | 3 | [-1, 1, 2]
//        [[-1, 0, 3],
//         [1, 5, 6,],
//         [-4, 5, 10]] | 5 | [-4, -1, 0, 1, 3]
    }
}
