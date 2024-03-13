package pw.avvero

import spock.lang.Specification

class MainGTest extends Specification {

    def "Check that 1 == 1"() {
        when:
        String fileName = "file-in-resources.txt";
        then:
        1 == 1
    }

}
