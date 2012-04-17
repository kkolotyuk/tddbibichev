package ru.kkolotyuk.tddbibichev

import spock.lang.Specification

class ItemTest extends Specification {

    def "NewItemHasZeroLifeTime"() {
        expect:
            new Item().lifeTime == 0
    }

}
