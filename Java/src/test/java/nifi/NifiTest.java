package test.java.nifi;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NifiTest {

    @Test
    public void test() {
        System.out.println("{\n" +
                "\t\"Columns\": [{\n" +
                "\t\t\"sourceColumn\": \"MAIN_DIAG_1\",\n" +
                "\t\t\"groupId\": 1,\n" +
                "\t\t\"destColumns\": [{\n" +
                "\t\t\t\t\"colName\": \"DIAG_CODE\",\n" +
                "\t\t\t\t\"colValue\": \"-\",\n" +
                "\t\t\t\t\"colValueType\": \"Source\"\n" +
                "\t\t\t},\n" +
                "\t\t\t{\n" +
                "\t\t\t\t\"colName\": \"IF_MAIN_DIAG\",\n" +
                "\t\t\t\t\"colValue\": \"MAIN\",\n" +
                "\t\t\t\t\"colValueType\": \"string\"\n" +
                "\t\t\t}\n" +
                "\t\t]\n" +
                "\t}]\n" +
                "}");
    }

    @Test
    public void test2() {
        System.out.println("{\"colName\": \"\",\"colValue\": \"-\",\"colValueType\": \"Combination\",\"connector\": \"-\",\"values\": []}");
    }

}
