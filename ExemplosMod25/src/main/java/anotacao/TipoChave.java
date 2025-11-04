package anotacao;

import java.lang.annotation.*;

/**
 * @author Mateus Gonçalves
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
