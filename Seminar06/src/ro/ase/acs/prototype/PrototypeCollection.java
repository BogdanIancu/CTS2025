package ro.ase.acs.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private Map<String, BuildingBlock> collection = new HashMap<>();

    public PrototypeCollection() {
        collection.put("wood", new WoodBlock());
        collection.put("stone", new StoneBlock());
    }

    public BuildingBlock getBlock(String key) {
        try {
            return (BuildingBlock) collection.get(key).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
