package com.example.hellounittests.foo

import spock.lang.Specification

class ThingySpec extends Specification {

  Thingy thingy

  def setup() {
    thingy = new Thingy()
  }

  def "should be a thingy"() {
    when:
    def result = thingy.thingy

    then:
    result == "thingy"
  }
}
