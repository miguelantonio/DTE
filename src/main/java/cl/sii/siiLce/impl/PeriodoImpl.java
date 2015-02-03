/*
 * XML Type:  Periodo
 * Namespace: http://www.sii.cl/SiiLce
 * Java type: cl.sii.siiLce.Periodo
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiLce.impl;
/**
 * An XML Periodo(@http://www.sii.cl/SiiLce).
 *
 * This is a complex type.
 */
public class PeriodoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiLce.Periodo
{
    private static final long serialVersionUID = 1L;
    
    public PeriodoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INICIAL$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "Inicial");
    private static final javax.xml.namespace.QName FINAL$2 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiLce", "Final");
    
    
    /**
     * Gets the "Inicial" element
     */
    public java.util.Calendar getInicial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INICIAL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Inicial" element
     */
    public org.apache.xmlbeans.XmlGYearMonth xgetInicial()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYearMonth target = null;
            target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(INICIAL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Inicial" element
     */
    public void setInicial(java.util.Calendar inicial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INICIAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INICIAL$0);
            }
            target.setCalendarValue(inicial);
        }
    }
    
    /**
     * Sets (as xml) the "Inicial" element
     */
    public void xsetInicial(org.apache.xmlbeans.XmlGYearMonth inicial)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYearMonth target = null;
            target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(INICIAL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGYearMonth)get_store().add_element_user(INICIAL$0);
            }
            target.set(inicial);
        }
    }
    
    /**
     * Gets the "Final" element
     */
    public java.util.Calendar getFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Final" element
     */
    public org.apache.xmlbeans.XmlGYearMonth xgetFinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYearMonth target = null;
            target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(FINAL$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Final" element
     */
    public void setFinal(java.util.Calendar xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINAL$2);
            }
            target.setCalendarValue(xfinal);
        }
    }
    
    /**
     * Sets (as xml) the "Final" element
     */
    public void xsetFinal(org.apache.xmlbeans.XmlGYearMonth xfinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlGYearMonth target = null;
            target = (org.apache.xmlbeans.XmlGYearMonth)get_store().find_element_user(FINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlGYearMonth)get_store().add_element_user(FINAL$2);
            }
            target.set(xfinal);
        }
    }
}
