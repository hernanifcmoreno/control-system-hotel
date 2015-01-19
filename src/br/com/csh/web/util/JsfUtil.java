package br.com.csh.web.util;

import java.net.URL;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import br.com.csh.model.bean.EnderecoBean;

public class JsfUtil {

	public static void mensagemOK(String idMensagem, String conteudo) {
		messageFactory(FacesMessage.SEVERITY_INFO, idMensagem, conteudo);
	}

	public static void mensagemErro(String idMensagem, String conteudo) {
		
		messageFactory(FacesMessage.SEVERITY_ERROR, idMensagem, conteudo);
	}

	public static void mensagemFatal(String idMensagem, String conteudo) {
		messageFactory(FacesMessage.SEVERITY_FATAL, idMensagem, conteudo);
	}

	public static void mensagemPerigo(String idMensagem, String conteudo) {
		messageFactory(FacesMessage.SEVERITY_INFO, idMensagem, conteudo);
	}

	private static void messageFactory(FacesMessage.Severity msg, String idMensagem, String conteudo){
		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage message = new FacesMessage(msg,conteudo, conteudo);
		context.addMessage(idMensagem, message);
	}
	
	//public static Object getBeanController(FacesContext context, String string) {
	//	return context.getELContext().getELResolver()
	//			.getValue(context.getELContext(), null, string);
	//}

	public static EnderecoBean CepWebService(String cep) {

		 EnderecoBean enderecoBean =  new EnderecoBean();
		
		/*try {
			URL url = new URL(
					"http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep
							+ "&formato=xml");

			Document document = getDocumento(url);
			Element root = document.getRootElement();
			for (Iterator i = root.elementIterator(); i.hasNext();) {
				Element element = (Element) i.next();

				if (element.getQualifiedName().equals("uf"))
					enderecoBean.setEstado(element.getText().charAt(0));

				if (element.getQualifiedName().equals("cidade"))
					enderecoBean.setCidade(element.getText());

				if (element.getQualifiedName().equals("bairro"))
					enderecoBean.setBairro(element.getText());

				if (element.getQualifiedName().equals("logradouro"))
					enderecoBean.setRua(element.getText());
			}
		} catch (Exception ex) {
			return enderecoBean;
		}*/
		return enderecoBean;
	}

	public static Document getDocumento(URL url) throws DocumentException {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(url);
			return document;
		} catch (Exception e) {
			return null;
		}
	}

}