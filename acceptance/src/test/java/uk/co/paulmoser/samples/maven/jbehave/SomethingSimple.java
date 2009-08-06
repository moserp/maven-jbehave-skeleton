package uk.co.paulmoser.samples.maven.jbehave;

import uk.co.paulmoser.samples.maven.jbehave.util.BaseScenario;

import org.jbehave.scenario.Scenario;

public class SomethingSimple extends BaseScenario {
  public SomethingSimple(final ClassLoader classLoader) {
    super(classLoader);
    // Add the steps needed for this scenario
    addSteps(new SimpleSteps());
  }
}
