package fictionbook.android.com.fictionbook.helpers;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Moon on 10/9/2015.
 */
public class JSONObjectParserTest {
    private final Double EPSILON = 10E-5;
    private final String primaryTypesJSON = "{\n" +
            "  \"integerField\" : 1,\n" +
            "  \"stringField\" : \"a simple string\",\n" +
            "  \"doubleField\" : 3.5\n" +
            "}";

    @Test
    public void testParseJSONContainsPrimityTypes() {
        PrimaryTypesObject object = JSONObjectParser.tryParseJSON(primaryTypesJSON, PrimaryTypesObject.class);

        Assert.assertNotNull("Object should be parsed successfully", object);
        Assert.assertEquals(1, object.integerField);
        Assert.assertEquals(3.5, object.doubleField, EPSILON);
        Assert.assertEquals("a simple string", object.stringField);
    }
}
