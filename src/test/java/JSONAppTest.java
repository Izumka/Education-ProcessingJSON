import json.Json;
import json.Tuple;
import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.Assert.*;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class JSONAppTest {
    @Test
    public void testSessionResult() throws Exception {
        Json jsonObject = JSONApp.sessionResult();

        String expectedJSON =
                "{'name': 'Andrii', 'surname': 'Khoma', 'year': 2, 'exams': [" +
                        "{'course': 'OOP', 'mark': 3, 'passed': true}," +
                        "{'course': 'English', 'mark': 5, 'passed': true}," +
                        "{'course': 'Math', 'mark': 2, 'passed': false}" +
                        "]}";

        JSONAssert.assertEquals(expectedJSON, jsonObject.toJson(), true);
    }
}