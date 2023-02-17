import java.util.LinkedHashMap;
import java.util.Map;

public class dz1 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name","Ivanov");
        map.put("country","Russia");
        map.put("city","Moscow");
        map.put("age",null);
        map.put("name1","Ivanov");
        map.put("name2","Ivanov");
        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        if (params == null || params.isEmpty())
            return result.toString();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getKey() == null || pair.getValue() == null)
                continue;
            result.append(pair.getKey()).append(" = '").append(pair.getValue()).append("' and ");
        }
        if (result.length() > 5)
            result.delete(result.length() - 5, result.length());
        return result.toString();
    }
}

