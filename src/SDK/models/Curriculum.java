package SDK.models;

/**
 * Created by Sanggaard on 17/11/2016.
 */
public class Curriculum extends BaseModel {

    private int Curriculum;
    private String School;
    private String Education;
    private int Semester;

    public Curriculum(int curriculum, String school, String education, int semester) {
        Curriculum = curriculum;
        School = school;
        Education = education;
        Semester = semester;
    }

    public void setCurriculum(int curriculum) {
        Curriculum = curriculum;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int semester) {
        Semester = semester;
    }
}
