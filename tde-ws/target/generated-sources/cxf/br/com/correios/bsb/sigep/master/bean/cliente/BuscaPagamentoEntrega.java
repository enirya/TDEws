
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for buscaPagamentoEntrega complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="buscaPagamentoEntrega"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="contrato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataInicio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dataFim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="etiqueta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "buscaPagamentoEntrega", propOrder = {
    "usuario",
    "senha",
    "contrato",
    "dataInicio",
    "dataFim",
    "etiqueta"
})
public class BuscaPagamentoEntrega {

    protected String usuario;
    protected String senha;
    protected String contrato;
    protected String dataInicio;
    protected String dataFim;
    protected String etiqueta;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Gets the value of the contrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrato() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrato(String value) {
        this.contrato = value;
    }

    /**
     * Gets the value of the dataInicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataInicio() {
        return dataInicio;
    }

    /**
     * Sets the value of the dataInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataInicio(String value) {
        this.dataInicio = value;
    }

    /**
     * Gets the value of the dataFim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFim() {
        return dataFim;
    }

    /**
     * Sets the value of the dataFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFim(String value) {
        this.dataFim = value;
    }

    /**
     * Gets the value of the etiqueta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * Sets the value of the etiqueta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtiqueta(String value) {
        this.etiqueta = value;
    }

}
