package domain;

import json.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Edited by Andrii_Khoma on 17/12/2017.
 */
public class Student extends BasicStudent {
    private ArrayList<Tuple<
            String, Integer>> exams = new ArrayList<>();


    public Student(String name, String surname, Integer year, Tuple<String, Integer>... exams) {
        super(name, surname, year);
        this.exams.addAll(Arrays.asList(exams));
    }

        public JsonObject toJsonObject() {
        JsonObject jsonObject = super.toJsonObject();

            JsonObject[] examens = new JsonObject[exams.size()];
            for (Tuple<String, Integer> exam: exams){
                examens[exams.indexOf(exam)] = new JsonObject    (
                        new JsonPair("course", new JsonString(exam.key)),
                        new JsonPair("mark", new JsonNumber(exam.value)),
                        new JsonPair("passed", new JsonBoolean(exam.value > 2))
                );
            }
            JsonArray jsonExamsArray = new JsonArray(examens);
            jsonObject.add(new JsonPair("exams", jsonExamsArray));
            return jsonObject;
}}
