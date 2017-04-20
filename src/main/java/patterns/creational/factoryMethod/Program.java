package patterns.creational.factoryMethod;
import patterns.creational.factoryMethod.factories.CppDeveloperFactory;
import patterns.creational.factoryMethod.factories.JavaDeveloperFactory;
import patterns.creational.factoryMethod.factories.PhpDeveloperFactory;

import java.util.Scanner;

public class Program {
    private static final String JAVA_DEVELOPER = "java";
    private static final String CPP_DEVELOPER = "C++";
    private static final String PHP_DEVELOPER = "php";
    private static final String ERROR_MESSAGE = " is unknown speciality";


    public static void main(String[] args) {
        String developerType;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            developerType = scanner.next();
            DeveloperFactory developerFactory = createDeveloperBySpeciality(developerType);
            Developer developer = developerFactory.createDeveloper();
            developer.writeCode();

        }



    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase(JAVA_DEVELOPER)) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase(CPP_DEVELOPER)) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase(PHP_DEVELOPER)) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + ERROR_MESSAGE);
        }
    }
}

