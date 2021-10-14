
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for tipoEmbalagem.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="tipoEmbalagem"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="DE"/&amp;gt;
 *     &amp;lt;enumeration value="PD"/&amp;gt;
 *     &amp;lt;enumeration value="RL"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "tipoEmbalagem")
@XmlEnum
public enum TipoEmbalagem {

    DE,
    PD,
    RL;

    public String value() {
        return name();
    }

    public static TipoEmbalagem fromValue(String v) {
        return valueOf(v);
    }

}
