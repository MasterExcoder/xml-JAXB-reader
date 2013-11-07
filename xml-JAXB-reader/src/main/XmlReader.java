package main;

import java.awt.List;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import data.Catalog;
import data.Cd;

public class XmlReader {

	public static void main(String[] args) {
		List cds = new List();
		try {
			JAXBContext context = JAXBContext.newInstance("data");
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Catalog catalog = (Catalog) unmarshaller.unmarshal(new File("D:\\git\\xml-JAXB-reader\\xml-JAXB-reader\\cdcatalog.xml"));
			
			System.out.println("___CDs___");
			for (int i = 0; i < catalog.getCD().size(); i++) {
				Cd cd = (Cd) catalog.getCD().get(i);

				System.out.println(cd.getTITLE());
				System.out.println("---Artist: " + cd.getARTIST());
				System.out.println("---Country: " + cd.getCOUNTRY());
				System.out.println("---Company: " + cd.getCOMPANY());
				System.out.println("---Price: " + cd.getPRICE());
				System.out.println("---Year: " + cd.getYEAR());
			}
			
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
