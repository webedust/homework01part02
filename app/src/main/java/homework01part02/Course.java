package homework01part02;

public class Course
{
    // Variables
    // Course number
    private String num;
    // Course name
    private String name;
    // Course credits
    private int credits;
    // Dept. code this Course object is using
    private String code;
    // Index of dept. code being used in relation to "codes" array.
    private int codeIndex;
    private static final String[] codes = { "CS", "CHEM", "PHYS", "MATH", "BTNY", "ZOO" };


    // Constructor
    public Course(String num, String name, int credits, String code, int codeIndex)
    {
        this.num = num;
        this.name = name;
        this.credits = credits;
        this.code = code;
        this.codeIndex = codeIndex;
    }

    // Methods
    public String getNum() { return num; }
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public String getCode() { return code; }
    public int getCodeIndex() { return codeIndex; }
    /** Returns string array of ALL department codes. */
    public static String[] getAllCodes() { return codes; }

    public void setNum(String num) { this.num = num; }
    public void setName(String name) { this.name = name; }
    public void setCredits(int credits) { this.credits = credits; }
    public void setCode(String code, int i)
    {
        this.code = code;
        // Code Index must be set at same time
        codeIndex = i;
    }

    public String toString()
    {
        return code + " " + num + " " + name + " (" + credits + " credits)";
    }
}
