package practice.ch06.framework;

import java.util.HashMap;
import java.util.Map;
import practice.ch06.framework.Manager;

public class Manager {
    private Map<String, Product> showcase = new HashMap<>();

    // 원본을 등록하는 메소드 
    // public void register(String name, Product prototype) {
    //     showcase.put(name, prototype);
    // }

    // public Product create(String prototypeName) {
    //     Product p = showcase.get(prototypeName);
    //     return p.createCopy();
    // }

    // Manager 이용
    Manager manager = new Manager();

    MessageBox mbox1 = new MessageBox('*');
    manager.register("star box", mbox1);

    UnderlinePen upen1 = new UnderlinePen('-');
    manager.register("underline pen", upen1);

    MessageBox mbox2 = new MessageBox('/');
    manager.register("slash box", mbox2);

    manager.create("star box").use("Hello, World.");
    manager.create("underline pen".use("Hello, World.");

}
