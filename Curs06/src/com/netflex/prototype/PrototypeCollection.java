package com.netflex.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeCollection {
    private Map<Integer, AbstractThumbnail> prototypes = new HashMap<>();

    public PrototypeCollection() {
        prototypes.put(1, new UltraHdThumbnail("Interstellar", "RO"));
        prototypes.put(2, new FullHdThumbnail("Friends", "MD"));
    }

    public AbstractThumbnail getThumbnail(Integer id) {
        try {
            return (AbstractThumbnail) prototypes.get(id).clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
