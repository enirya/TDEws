
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for categoriaServico.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="categoriaServico"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="SEM_CATEGORIA"/&amp;gt;
 *     &amp;lt;enumeration value="PAC"/&amp;gt;
 *     &amp;lt;enumeration value="SEDEX"/&amp;gt;
 *     &amp;lt;enumeration value="CARTA"/&amp;gt;
 *     &amp;lt;enumeration value="GRANDES_FORMATOS"/&amp;gt;
 *     &amp;lt;enumeration value="REVERSO"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "categoriaServico")
@XmlEnum
public enum CategoriaServico {

    SEM_CATEGORIA,
    PAC,
    SEDEX,
    CARTA,
    GRANDES_FORMATOS,
    REVERSO;

    public String value() {
        return name();
    }

    public static CategoriaServico fromValue(String v) {
        return valueOf(v);
    }

}
