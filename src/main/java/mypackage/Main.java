package mypackage;

import javax.xml.bind.Marshaller;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.stream.StreamSource;


public class Main {
  private URL link;
  private YmlCatalog wholeFile;

  public static void main(String[] args) {
    Main mn = new Main();
    mn.start();
  }

  private void start() {
    getXml();
    getJAXB();
    takeWhatWeNeed();
    makeXml();
  }

  private void takeWhatWeNeed() {
    wholeFile.getShop().offers.setOffer(wholeFile.getShop().offers.getOffer().stream().
            filter(o -> (((o.getOldprice() - o.getPrice()) / o.getOldprice()) * 100) > 60)
            .collect(Collectors.toCollection(ArrayList::new)));
  }

  private void makeXml() {
    try {
      File file = new File("new.xml");
      JAXBContext jaxbContext = JAXBContext.newInstance(YmlCatalog.class);
      Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
      jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      jaxbMarshaller.marshal(wholeFile, file);
    } catch (JAXBException e) {
      e.printStackTrace();
    }
  }

  private void getJAXB() {
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(YmlCatalog.class);
      XMLInputFactory xif = XMLInputFactory.newFactory();
      xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
      StreamSource xml = new StreamSource(link.openStream());
      XMLStreamReader xsr = xif.createXMLStreamReader(xml);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      while (xsr.hasNext()) {
        if (xsr.isStartElement() && xsr.getLocalName().equals("yml_catalog")) {
          break;
        }
        xsr.next();
      }
      while (!xsr.getLocalName().equals("yml_catalog")) {
        xsr.nextTag();
      }
      wholeFile = (YmlCatalog) jaxbUnmarshaller.unmarshal(xsr);

      //  System.out.println(wholeFile);
    } catch (JAXBException e) {
      e.printStackTrace();
    } catch (XMLStreamException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  private void getXml() {
    try {
      link = new URL("http://export.admitad.com/ru/webmaster/websites/976606/products/export_adv_products/?feed_id=7775&code=9ipifofafz&user=Sitostore&template=38965");
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

}
