package org.amil.proyectoFinal;

/**
 *
 * @author Amil
 */
import org.springframework.boot.context.embedded.*;

import org.springframework.stereotype.Component;

@Component
public class PersonalizarBeans implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(9000);
    }

}
