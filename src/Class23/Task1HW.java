package Class23;
public class Task1HW {
     /*
    Create a class File that will have the following behaviors:
    open, edit, close. Edit and close are implemented method while open is an
    abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
     implementation of open behaviour: Example: to open .java file we need notepad++ or
     sublime text, to open .doc file we need Microsoft word to be installed etc
     */
    public static void main(String[] args) {
        File[] files={new JavaFile(),new PdfFile(),new WordFile()};
        for(File file:files){
            file.open();
            file.edit();
            file.close();
        }}}
abstract class File{
    abstract void open();
    void edit(){
        System.out.println("Edits  file");
    }
    void close(){
        System.out.println("Closes file");
    }}
class JavaFile extends File{
    void open(){
        System.out.println("Notepad++ opens Java file");
    }
    void edit() {
        System.out.println("Edit file with IntelliJ or Eclipse");
    }}
class WordFile extends File{
    void open() {
        System.out.println("MSword help to open word file");
    }}
class PdfFile extends File{
    void open() {
        System.out.println("Using Adobe reader opens  pdf fie");
    }}