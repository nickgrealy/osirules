package main
/**
 * Created by Nick on 13/05/2015.
 */
class GroovyTest {

    public static void main(String[] args) {
        println "\n\nmain.GroovyTest " + GroovyTest.declaredMethods.find{it.name=='run'}.parameters.collect{it.name}
        println "main.JavaTest   " + JavaTest.declaredMethods.find{it.name=='run'}.parameters.collect{it.name}
        println "\n\n"
    }

    def run (String xxx, String yyy){}
}
