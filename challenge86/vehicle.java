package challenge86;
/*
define a base class vehicle with a method service() and a subclass Car that overrides service().In Car's service(),provide a specific implementation that calls super.service() as well,to show overriding works.
 */
public class vehicle {
    public void service(){
        System.out.println("Vehicle is getting serviced ...");
    }
}
