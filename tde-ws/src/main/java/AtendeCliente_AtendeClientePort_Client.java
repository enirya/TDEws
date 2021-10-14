


/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import javax.xml.namespace.QName;
/*import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;*/

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-10-13T22:22:50.409-03:00
 * Generated source version: 3.4.3
 *
 */
public final class AtendeCliente_AtendeClientePort_Client {

    private static final QName SERVICE_NAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");

    private AtendeCliente_AtendeClientePort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
    	System.out.println("ASDASD");
        URL wsdlURL = AtendeClienteService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        AtendeClienteService ss = new AtendeClienteService(wsdlURL, SERVICE_NAME);
        AtendeCliente port = ss.getAtendeClientePort();

        {
        System.out.println("Invoking consultaCEP...");
        Scanner sc = new Scanner(System.in);
        String cep = sc.nextLine();
        java.lang.String _consultaCEP_cep = cep;
        try {
            br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP _consultaCEP__return = port.consultaCEP(_consultaCEP_cep);
            System.out.println("consultaCEP.result=" + _consultaCEP__return.getEnd()+","+_consultaCEP__return.getBairro()+" "+ _consultaCEP__return.getCidade()+","+_consultaCEP__return.getUf()+".");
        } catch (SQLException_Exception e) {
            System.out.println("Expected exception: SQLException has occurred.");
            System.out.println(e.toString());
        } catch (SigepClienteException e) {
            System.out.println("Expected exception: SigepClienteException has occurred.");
            System.out.println(e.toString());
        }
        }
        System.exit(0);
    }

}