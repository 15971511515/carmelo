package servlet.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;  
import java.lang.annotation.RetentionPolicy;  

@Target({ElementType.PARAMETER})   // ���ڲ���  
@Retention(RetentionPolicy.RUNTIME) // ������ʱ���ص�Annotation��JVM��  
public @interface PassParameter {  
    String name();    // ����һ��û��Ĭ��ֵ��String��Ա  
    //Class<?> type();  // ��������
}  
