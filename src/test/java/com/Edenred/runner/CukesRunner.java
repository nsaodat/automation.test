package com.Edenred.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
        "pretty", // prints out additional information about the scenario that is being executed in the console
        "html:target/cucumber-reports.html", // ---> assists with generating of the report
        // "html: ---> the type of the report
        // target ---> where we save our report
        // cucumber-reports.html" ---> the name of the report file that will be auto generated by cucumber

        //CUCUMBER RERUN PLUGIN
        // Cucumber rerun plugin allows us to store failed scenarios in a file
        // We can run those scenarios using another runner class
        // Why do we need another runner class?
        //Because we need to point
        "rerun:target/rerun.txt", // rerun can be replaced with any naming
     //   "me.jvt.cucumber.report.PrettyReports:target/cucumber"
},

        features = "src/test/resources/features", // ---> we pass feature files path
        glue = "com/Edenred/step_definitions", // ---> we pass step_definitions path
        dryRun = false, // if true: not executing the step definitions
                 // if false: executing the step definitions


        tags = "@wip",
        publish = true // when true --> publishes the tests online and the link can be shared with others, valid for a day
)


public class CukesRunner {
}
