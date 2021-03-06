package codingbat.warmup

import spock.lang.Unroll
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class SleepInSpec extends BaseSpec {

    @Unroll def "test sleepIn"() {
        expect:
        SleepIn.sleepIn(a, b) == c

        where:
        a     | b     || c
        false | false || true
        true  | false || false
        false | true  || true
    }
}
