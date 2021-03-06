package com.massrelevance.dropwizard.bundles

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.massrelevance.dropwizard.scala.inject.ScalaCollectionsQueryParamFactoryProvider
import io.dropwizard.Bundle
import io.dropwizard.setup.{Bootstrap, Environment}

class ScalaBundle extends Bundle {
  def initialize(bootstrap: Bootstrap[_]) {
    bootstrap.getObjectMapper.registerModule(new DefaultScalaModule())
  }

  def run(environment: Environment) {
    environment.jersey.register(classOf[ScalaCollectionsQueryParamFactoryProvider])
  }
}
