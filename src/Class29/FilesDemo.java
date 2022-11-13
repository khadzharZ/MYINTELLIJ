package Class29;

import Utils.ConfigReader;
import Utils.ExcelReader;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        String path="Data/config.properties";
        var properties=  ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));


        String excelPath="Data/Test1.xlsx";
        var excelData=  ExcelReader.read(excelPath);
        System.out.println(excelData);
    }
}
