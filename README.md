# osirules

Example of [JEP118](http://openjdk.java.net/jeps/118) for Java & Groovy.

### Prereqs

At this point in time, you'll need to checkout and build the latest code from ```incubator-groovy```. Then configure
 the location in the ```build.gradle```. TODO - until released, download overnight build?
 
The code will only work with JDK8+.

Running ```gradlew``` command, outputs:

    main.GroovyTest(String xxx, String yyy)
    main.JavaTest(String aaa, String bbb)

This example demonstrates using reflection to retrieve parameter names.