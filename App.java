/// usr/bin/env jbang "$0" "$@" ; exit $?

// import a dependency with Jbang-like imports
//DEPS org.apache.commons:commons-math3:3.6.1

// NOTE: this Javelit import is only here to help the Intellij Jbang plugin - it is not strictly necessary
// NOTE: make sure to install the plugin for highlighting and completion https://plugins.jetbrains.com/plugin/18257-jbang
//DEPS io.javelit:javelit:0.67.0

import io.javelit.core.Jt;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class App {

    public static void main(String[] args) {
        Jt.title("Hello World!").use();

        Jt.markdown("## A simple click app").use();

        // initialize state - values in the session state are maintained at each update
        Jt.sessionState().putIfAbsent("count", 0);

        // if button is clicked, increment the count value
        if (Jt.button("Click me").use()) {
            Jt.sessionState().computeIfPresentInt("count", (k, v) -> v + 1);
        }

        // display the count
        int count = Jt.sessionState().getInt("count");
        boolean plural =  count > 1 ;
        Jt.markdown("The button was clicked **%s** time%s".formatted(count, plural ? "s" : ""))
                .use();


        // Use the imported library apache commons-math
        Jt.divider("div1").use();
        Jt.markdown("## Using imported apache math dependency").use();
        double[] values = {1.2, 2.3, 3.4, 4.5, 5.6};
        DescriptiveStatistics stats = new DescriptiveStatistics(values);
        double stdDev = stats.getStandardDeviation();
        Jt.text("Computed statistic with Apache commons-math: " + stdDev).use();
    }
}
