package Ej3;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ProcesamientoXML {
	//Realizar el m�todo para guardar un listado de objetos de tipo Edificio por JAXB
	//Incluir comentarios JAVADOC indicando qu� hace el m�todo y para qu� son sus par�metros
	public void escribirJAXB(ArrayList<Edificio> edificios, String ruta) throws JAXBException {
		File file = new File(ruta);

		JAXBContext jaxbContext = JAXBContext.newInstance(Edificios.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		Edificios listaEdif = new Edificios();
		listaEdif.setListaEdificios(edificios);
		jaxbMarshaller.marshal(listaEdif, file);

	}// escribirJAXB (xml)
	
	//Realizar el m�todo para leer un listado de objetos de tipo Edificio por JAXB
	//Incluir comentarios JAVADOC indicando qu� hace el m�todo y para qu� son sus par�metros
	public ArrayList<Edificio> leerJAXB(String ruta) throws JAXBException {
		File file = new File(ruta);

		
		JAXBContext jaxbContext = JAXBContext.newInstance(Edificios.class);
		Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();


		Edificios listaEdif = new Edificios();

		listaEdif =(Edificios) jaxbMarshaller.unmarshal(file);
		return listaEdif.getListaEdificios();

	}// escribirJAXB (xml)
	
}
