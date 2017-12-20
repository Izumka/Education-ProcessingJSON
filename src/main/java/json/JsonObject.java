package json;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class JsonObject extends Json {

    private ArrayList<JsonPair> arrayList = new ArrayList<>();

    public JsonObject(JsonPair... jsonPairs) {
        this.arrayList.addAll(Arrays.asList(jsonPairs));
    }


    @Override
    public String toJson() {
        String ret = "{";

        if(this.arrayList.size() == 0){return "{}";}

        for(JsonPair pair : this.arrayList){
            if (pair != null) {
                ret += new JsonString(pair.key).toJson() + ": " + pair.value.toJson()+ ", ";
            }
            }
        ret = ret.substring(0, ret.lastIndexOf(',')) + '}';

        return ret;
    }

    public void add(JsonPair jsonPair) {

        for (JsonPair pair : this.arrayList) {
            if(pair.key.equals(jsonPair.key)){
                pair.value = jsonPair.value;
                return;
            }

        }
        this.arrayList.add(jsonPair);
    }

    public Json find(String name) {
        for (JsonPair pair : this.arrayList) {
            if(pair.key.equals(name)) return pair.value;
    }
        return null;
    }

    public JsonObject projection(String... names) {
        JsonObject jsonObject = new JsonObject();

        for(String name : names){
            for (JsonPair pair: this.arrayList) {
                if(name == pair.key){
                    jsonObject.add(pair);
                    break;
                }
            }
        }
        return jsonObject;
    }
    public boolean contains(String name){
        if (toJson().contains(name)){
            return true;
        }
        return false;
    }
}
