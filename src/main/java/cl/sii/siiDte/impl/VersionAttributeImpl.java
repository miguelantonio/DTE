/*
 * An XML attribute type.
 * Localname: version
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.VersionAttribute
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one version(@http://www.sii.cl/SiiDte) attribute.
 *
 * This is a complex type.
 */
public class VersionAttributeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.VersionAttribute
{
    private static final long serialVersionUID = 1L;
    
    public VersionAttributeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSION$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "version");
    
    
    /**
     * Gets the "version" attribute
     */
    public java.math.BigDecimal getVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "version" attribute
     */
    public org.apache.xmlbeans.XmlDecimal xgetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "version" attribute
     */
    public boolean isSetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VERSION$0) != null;
        }
    }
    
    /**
     * Sets the "version" attribute
     */
    public void setVersion(java.math.BigDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$0);
            }
            target.setBigDecimalValue(version);
        }
    }
    
    /**
     * Sets (as xml) the "version" attribute
     */
    public void xsetVersion(org.apache.xmlbeans.XmlDecimal version)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDecimal target = null;
            target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$0);
            }
            target.set(version);
        }
    }
    
    /**
     * Unsets the "version" attribute
     */
    public void unsetVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VERSION$0);
        }
    }
}
