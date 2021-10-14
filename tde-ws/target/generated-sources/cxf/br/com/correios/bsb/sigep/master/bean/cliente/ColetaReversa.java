
package br.com.correios.bsb.sigep.master.bean.cliente;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for coletaReversa complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="coletaReversa"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;extension base="{http://cliente.bean.master.sigep.bsb.correios.com.br/}coleta"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="ag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="obj_col" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}objeto" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="servico_adicional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/extension&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coletaReversa", propOrder = {
    "ag",
    "ar",
    "cartao",
    "numero",
    "objCol",
    "servicoAdicional"
})
public class ColetaReversa
    extends Coleta
{

    protected String ag;
    protected Integer ar;
    protected String cartao;
    protected Integer numero;
    @XmlElement(name = "obj_col", nillable = true)
    protected List<Objeto> objCol;
    @XmlElement(name = "servico_adicional")
    protected String servicoAdicional;

    /**
     * Gets the value of the ag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAg() {
        return ag;
    }

    /**
     * Sets the value of the ag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAg(String value) {
        this.ag = value;
    }

    /**
     * Gets the value of the ar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAr() {
        return ar;
    }

    /**
     * Sets the value of the ar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAr(Integer value) {
        this.ar = value;
    }

    /**
     * Gets the value of the cartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * Sets the value of the cartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartao(String value) {
        this.cartao = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumero(Integer value) {
        this.numero = value;
    }

    /**
     * Gets the value of the objCol property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the objCol property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getObjCol().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Objeto }
     * 
     * 
     */
    public List<Objeto> getObjCol() {
        if (objCol == null) {
            objCol = new ArrayList<Objeto>();
        }
        return this.objCol;
    }

    /**
     * Gets the value of the servicoAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicoAdicional() {
        return servicoAdicional;
    }

    /**
     * Sets the value of the servicoAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicoAdicional(String value) {
        this.servicoAdicional = value;
    }

}
