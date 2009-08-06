package uk.co.paulmoser.samples.maven.jbehave;

import org.jbehave.scenario.steps.Steps;
import org.jbehave.scenario.annotations.Given;
import org.jbehave.scenario.annotations.When;
import org.jbehave.scenario.annotations.Then;

public class SimpleSteps extends Steps {

  @Given("some setup")
  public void someSetupMethod() {
    System.out.println("In the Given setup method");
  }

}
