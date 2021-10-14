
package br.com.correios.bsb.sigep.master.bean.cliente;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for acao.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * &lt;pre&gt;
 * &amp;lt;simpleType name="acao"&amp;gt;
 *   &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *     &amp;lt;enumeration value="DEVOLVIDO_AO_REMETENTE"/&amp;gt;
 *     &amp;lt;enumeration value="ENCAMINHADO_PARA_REFUGO"/&amp;gt;
 *     &amp;lt;enumeration value="REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE"/&amp;gt;
 *     &amp;lt;enumeration value="DESBLOQUEADO"/&amp;gt;
 *   &amp;lt;/restriction&amp;gt;
 * &amp;lt;/simpleType&amp;gt;
 * &lt;/pre&gt;
 * 
 */
@XmlType(name = "acao")
@XmlEnum
public enum Acao {

    DEVOLVIDO_AO_REMETENTE,
    ENCAMINHADO_PARA_REFUGO,
    REINTEGRADO_E_DEVOLVIDO_AO_REMETENTE,
    DESBLOQUEADO;

    public String value() {
        return name();
    }

    public static Acao fromValue(String v) {
        return valueOf(v);
    }

}
