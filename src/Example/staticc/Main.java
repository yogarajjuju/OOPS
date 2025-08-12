package Example.staticc;

import com.sun.source.doctree.SystemPropertyTree;

public class Main {
    public static void main(String[] args) {
        Human juju = new Human(20,"juju",10000,false);
        System.out.println(juju.name);
        System.out.println(juju.age);
        System.out.println(juju.population);
    }

}
