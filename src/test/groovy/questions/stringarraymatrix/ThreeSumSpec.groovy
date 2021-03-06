package questions.stringarraymatrix

import api.Trio
import spock.lang.Ignore
import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class ThreeSumSpec extends BaseSpec {

    @Ignore
    @Unroll def "test list trios(x ,y), equal given number, no duplicates"() {
        expect:
        ThreeSum.getSums(a as int[], b) == c

        where:
        a                     | b || c
        [1, 1, 1]             | 0 || []
        [-1, 0, 1, 2, -1, -4] | 0 || [new Trio<>(-1, -1, 2), new Trio<>(-1, 0, 1)]
        //          [Trio{first=0, second=-1, third=1}, Trio{first=2, second=2, third=-4}]

    }
}
