import mt.TemplateClass;
import mt.TemplateClassImpl1;
import mt.TemplateClassImpl2;

public class Client {
    public static void main(String[] args) {
        TemplateClass templateClass = new TemplateClassImpl1();
        System.out.println(templateClass.templateMethod());
        templateClass = new TemplateClassImpl2();
        System.out.println(templateClass.templateMethod());
    }
}
