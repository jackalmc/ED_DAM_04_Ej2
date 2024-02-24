public class CostePersonal {
 
	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeFinal = 0;
		Trabajador trabajador;
		for (int i = 0; i < trabajadores.length; i++) {
			trabajador = trabajadores[i];
			if (esJefe(trabajador)){
					costeFinal += trabajador.getNomina();
			}
			else
			{
				costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * 20);
			}
		}
		return costeFinal;
	}

	public static boolean esJefe(Trabajador trabajador){
		return trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR;
	}
		
}
