package ru.kkolotyuk.tddbibichev

import spock.lang.Specification

class WorkerTest extends Specification {

    def "NewWorkerTick"() {
        setup:
            Worker worker = new Worker()
        when:
            List<Item> result = worker.tick()
        then:
            result != null
            result.empty
    }
}
