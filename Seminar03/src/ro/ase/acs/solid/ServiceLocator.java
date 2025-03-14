package ro.ase.acs.solid;

import java.util.HashMap;
import java.util.Map;

public class ServiceLocator {
    private Map<String, Object> repo = new HashMap<>();

    public void register(String contract, Object implementation) {
        repo.put(contract, implementation);
    }

    public Object resolve(String contract) {
        return repo.get(contract);
    }
}
