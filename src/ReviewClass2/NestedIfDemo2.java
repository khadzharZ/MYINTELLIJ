package ReviewClass2;

public class NestedIfDemo2 {
    public static void main(String[] args) {
        boolean studyHard=true;

        if(studyHard) {
            System.out.println("We get the job in first few weeks");
            boolean goodCommunicationSkills=true;
            if(goodCommunicationSkills) {
                System.out.println("Can might get job in Apple Amazon,etc. ");
            }else {
                System.out.println("We need to work on our communication skills");
            }
        }
        else
        {
            System.out.println("It might take a little longer to get the job");
        }
    }
}
