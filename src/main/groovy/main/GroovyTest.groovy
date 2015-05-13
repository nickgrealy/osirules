package main
/**
 * Created by Nick on 13/05/2015.
 */
class GroovyTest {

    public static void main(String[] args) {
        println "\n\n"
        println GroovyTest.name + "(" + GroovyTest.declaredMethods.find{it.name=='run'}.parameters.collect{"$it.type.simpleName $it.name"}.join(", ") + ")"
        println JavaTest.name + "(" + JavaTest.declaredMethods.find{it.name=='run'}.parameters.collect{"$it.type.simpleName $it.name"}.join(", ") + ")"
        println "\n\n"
    }

    def run (String xxx, String yyy){}
}
