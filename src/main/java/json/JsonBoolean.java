package json;

import java.util.HashMap;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class JsonBoolean extends Json {
    private final boolean bool;
    private final HashMap<Boolean, String> hashMap = new HashMap<Boolean, String>();

    public JsonBoolean(Boolean bool) {
        this.bool = bool;

        hashMap.put(true, "true");
        hashMap.put(false, "false");

    }

    @Override
    public String toJson() {
        return hashMap.get(this.bool);

    }
}
