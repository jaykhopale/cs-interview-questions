package questions.stringarraymatrix

import api.Pair
import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class TwoSumSpec extends BaseSpec {

    @Unroll def "test list all pairs(x ,y), equal given number, allow duplicates"() {
        expect:
        TwoSum.getSums2(a as int[], b) == c

        where:
        a      | b || c
        [1, 1] | 0 || []
        [1, 1] | 2 || [new Pair<>(1, 1), new Pair<>(1, 1), new Pair<>(1, 1), new Pair<>(1, 1)]
    }

    @Unroll def "test list pairs(x ,y), equal given number, no duplicates"() {
        expect:
        TwoSum.getSums(a as int[], b) == c

        where:
        a                               | b || c
        [1, 1]                          | 0 || []
        [2, 4, 3, 5, 6, -2, 4, 7, 8, 9] | 7 || [new Pair<>(-2, 9), new Pair<>(2, 5), new Pair<>(3, 4)]
        [2, 7, 11, 15]                  | 9 || [new Pair<>(2, 7)]
        [1, 1]                          | 2 || [new Pair<>(1, 1)]
    }
}
