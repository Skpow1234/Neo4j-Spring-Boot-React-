package juanhurtado.springneo4j.requests;

public class CourseEnrolmentRequest {
    private String courseIdentifier;

    public CourseEnrolmentRequest() {
    }

    public String getCourseIdentifier() {
        return courseIdentifier;
    }

    public void setCourseIdentifier(String courseIdentifier) {
        this.courseIdentifier = courseIdentifier;
    }
}
