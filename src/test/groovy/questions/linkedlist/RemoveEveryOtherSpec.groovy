package questions.linkedlist

import api.Node
import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
final class RemoveEveryOtherSpec extends BaseSpec {

    def "test RemoveEveryOther"() {
        given:
        def node = new Node<>(1)
        node.next = new Node<>(1)
        node.next.next = new Node<>(2)
        node.next.next.next = new Node<>(2)
        node.next.next.next.next = new Node<>(4)
        node.next.next.next.next.next = new Node<>(5)

        def nullNext = new Node<>(1)
        nullNext.next = null

        when:
        RemoveEveryOther.deleteEveryOtherRecursive(null)
        RemoveEveryOther.deleteEveryOtherRecursive(nullNext)
        RemoveEveryOther.deleteEveryOtherRecursive(node)

        then:
        node.value == 1
        node.next.value == 2
        node.next.next.value == 4
    }
}
