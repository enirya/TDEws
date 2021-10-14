
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for verificaDisponibilidadeServico complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="verificaDisponibilidadeServico"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="codAdministrativo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numeroServico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="cepOrigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="cepDestino" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verificaDisponibilidadeServico", propOrder = {
    "codAdministrativo",
    "numeroServico",
    "cepOrigem",
    "cepDestino",
    "usuario",
    "senha"
})
public class VerificaDisponibilidadeServico {

    protected Integer codAdministrativo;
    protected String numeroServico;
    protected String cepOrigem;
    protected String cepDestino;
    protected String usuario;
    protected String senha;

    /**
     * Gets the value of the codAdministrativo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAdministrativo() {
        return codAdministrativo;
    }

    /**
     * Sets the value of the codAdministrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAdministrativo(Integer value) {
        this.codAdministrativo = value;
    }

    /**
     * Gets the value of the numeroServico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroServico() {
        return numeroServico;
    }

    /**
     * Sets the value of the numeroServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroServico(String value) {
        this.numeroServico = value;
    }

    /**
     * Gets the value of the cepOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepOrigem() {
        return cepOrigem;
    }

    /**
     * Sets the value of the cepOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepOrigem(String value) {
        this.cepOrigem = value;
    }

    /**
     * Gets the value of the cepDestino property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCepDestino() {
        return cepDestino;
    }

    /**
     * Sets the value of the cepDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCepDestino(String value) {
        this.cepDestino = value;
    }

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

}
