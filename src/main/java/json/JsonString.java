package json;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class JsonString extends Json {
    private final String string;

    public JsonString(String string) {
        this.string = string;
    }

    @Override
    public String toJson() {
        return "'" + string + "'";
    }
}
