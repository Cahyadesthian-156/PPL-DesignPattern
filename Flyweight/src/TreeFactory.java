import java.util.HashMap;

/**
 * 3
 * Encapsulates complexity of flyweight creation
 */

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    static Map<String, TreeType> treeTypes = new HashMap<>();
    
    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if(result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name,result);
        }
        return result;
    }

}
