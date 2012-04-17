package ru.kkolotyuk.tddbibichev

import spock.lang.Specification

class ItemTest extends Specification {

    def "NewItemHasZeroLifeTime"() {
        expect:
            new Item().lifeTime == 0
    }

    def "OneTick"() {
        setup:
            def item = new Item()
        when:
            item.tick()
        then:
            item.lifeTime == old(item.lifeTime) + 1
    }

}
