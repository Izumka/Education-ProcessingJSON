package json;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class JsonNumber extends Json {
    private final Number number;

    public JsonNumber(Number number) {
        this.number = number;
    }

    @Override
    public String toJson() {
        return number.toString();
    }
}
