package Projects.DesignAPen;

import java.util.HashMap;
import java.util.Map;

public class PenRegistry {
    private Map<String, Pen> penMap = new HashMap<String, Pen>();

    public void PenRegistry(String penName,Pen pen) {
        penMap.put(penName,pen);
    }

    public Pen getPen(String penName) {
        return penMap.get(penName);
    }
}
