package Class23;


    class StudentTester {
        public static void main(String[] args) {
            Student[] students = {new SyntaxStudent(),
                    new SchoolStudent(), new CollegeStudent()};
            for (Student st : students) {
                st.Learn();
                st.DoPractice();
                st.Homework();
            }

            for (int i = 0; i < students.length; i++) {
                students[i].Learn();
                students[i].DoPractice();
                students[i].Homework();
            }

        }
    }


