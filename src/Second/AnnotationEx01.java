package Second;

import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111")
@TestInfo(testedBy = "Dongwan", testDate = @DateTime(yymmdd = "211112", hhmmss = "201843"))
public class AnnotationEx01 {
    public static void main(String[] args) {
        Class<AnnotationEx01> InstanceOfAnnotationEx01 = AnnotationEx01.class;

        TestInfo annotation = (TestInfo)InstanceOfAnnotationEx01.getAnnotation(TestInfo.class);
        System.out.println("annotation.testBy() : " + annotation.testedBy());
        System.out.println("annotation.testDate().yymmdd : " + annotation.testDate().yymmdd());
        System.out.println("annotation.testDate().hhmmss : " + annotation.testDate().hhmmss());
        System.out.println("annotation.testTools() : " + annotation.testTools());

        System.out.println();
        Annotation[] annotations = InstanceOfAnnotationEx01.getAnnotations();
        for (Annotation annotation1 : annotations)
            System.out.println(annotation1);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int     count()         default 1;
    String  testedBy();
    String  testTools()     default "Junit";
    TestType testType()     default TestType.FIRST;
    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();
    String hhmmss();
}

enum TestType { FIRST, FINAL }
