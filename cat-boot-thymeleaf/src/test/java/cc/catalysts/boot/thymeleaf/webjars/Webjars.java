package cc.catalysts.boot.thymeleaf.webjars;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This class is usually generated by the gradle plugin <code>cc.catalysts.webjars</code>
 */
public class Webjars {
    public static class Webjar {
        public final String group;
        public final String name;
        public final String version;
        public final String path;

        private Webjar(String group, String name, String version) {
            this.group = group;
            this.name = name;
            this.version = version;
            this.path = "webjars/" + name + "/" + version;
        }
    }

    public static final Map<String, Webjar> webjars;

    static {
        Map<String, Webjar> webjarsMap = new HashMap<String, Webjar>();
        webjarsMap.put("angular", new Webjar("org.webjars.bower", "angular", "1.4.6"));
        webjarsMap.put("angular-i18n", new Webjar("org.webjars.bower", "angular-i18n", "1.4.6"));
        webjarsMap.put("angular-route", new Webjar("org.webjars.bower", "angular-route", "1.4.6"));
        webjarsMap.put("paper", new Webjar("org.webjars.bower", "paper", "0.9.23"));
        webjarsMap.put("bootstrap", new Webjar("org.webjars.bower", "bootstrap", "3.3.5"));
        webjarsMap.put("jquery", new Webjar("org.webjars.bower", "jquery", "2.2.0"));
        webjarsMap.put("lodash", new Webjar("org.webjars.bower", "lodash", "3.10.1"));
        webjarsMap.put("system.js", new Webjar("org.webjars.bower", "system.js", "0.19.17"));
        webjars = Collections.unmodifiableMap(webjarsMap);
    }
}