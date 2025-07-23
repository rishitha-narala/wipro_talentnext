package collections_problems;

import java.util.Properties;
import java.util.Set;
import java.util.Iterator;

public class StateCapitalProperties {
    public static void main(String[] args) {
        
        Properties statesAndCapitals = new Properties();

        
        statesAndCapitals.setProperty("Andhra Pradesh", "Amaravati");
        statesAndCapitals.setProperty("Tamil Nadu", "Chennai");
        statesAndCapitals.setProperty("Karnataka", "Bengaluru");
        statesAndCapitals.setProperty("Maharashtra", "Mumbai");
        statesAndCapitals.setProperty("Telangana", "Hyderabad");

        
        Set<Object> states = statesAndCapitals.keySet();

        
        System.out.println("States and their Capitals (using Iterator):");
        Iterator<Object> iterator = states.iterator();
        while (iterator.hasNext()) {
            Object state = iterator.next();
            String capital = statesAndCapitals.getProperty((String) state);
            System.out.println("State: " + state + ", Capital: " + capital);
        }
    }
}

