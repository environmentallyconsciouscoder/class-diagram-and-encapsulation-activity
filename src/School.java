class School extends Student {

    final char gradeValueForUpdate = 'A';
    final char gradeValueForDownGrade = 'D';

    final char upGradeValueThreshold = 'B';
    final char downGradeValueThreshold = 'C';

    public School(String name, char grade, int group) {
        super(name, grade, group);
    }

    public void upGrade() {
        if (getGrade() == upGradeValueThreshold) {
            setGrade(gradeValueForUpdate);
        }
    }

    public void downGrade() {
        if (getGrade() == downGradeValueThreshold) {
            setGrade(gradeValueForDownGrade);
        }
    }
}

