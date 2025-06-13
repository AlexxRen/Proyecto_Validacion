package com.tuempresa.proyecto_validacion.run;

import org.openxava.util.*;

/**
 * Ejecuta esta clase para arrancar la aplicación.
 *
 * Con OpenXava Studio/Eclipse: Botón derecho del ratón > Run As > Java Application
 */

public class proyecto_validacion {

	public static void main(String[] args) throws Exception {
		//DBServer.start("proyecto_validacion-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("proyecto_validacion"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
