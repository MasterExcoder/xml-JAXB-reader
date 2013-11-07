package main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import xjcData.Catalog;
import xjcData.Cd;

public class XmlReader {

	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance("data");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Cd cd = (Cd) unmarshaller.unmarshal(new File("D:\\git\\xml-JAXB-reader\\xml-JAXB-reader\\cdcatalog.xml"));
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
