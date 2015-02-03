/*
 * An XML document type.
 * Localname: DTE
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.DTEDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one DTE(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class DTEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.DTEDocument
{
    private static final long serialVersionUID = 1L;
    
    public DTEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DTE$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DTE");
    
    
    /**
     * Gets the "DTE" element
     */
    public cl.sii.siiDte.DTEDefType getDTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.DTEDefType target = null;
            target = (cl.sii.siiDte.DTEDefType)get_store().find_element_user(DTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DTE" element
     */
    public void setDTE(cl.sii.siiDte.DTEDefType dte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.DTEDefType target = null;
            target = (cl.sii.siiDte.DTEDefType)get_store().find_element_user(DTE$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.DTEDefType)get_store().add_element_user(DTE$0);
            }
            target.set(dte);
        }
    }
    
    /**
     * Appends and returns a new empty "DTE" element
     */
    public cl.sii.siiDte.DTEDefType addNewDTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.DTEDefType target = null;
            target = (cl.sii.siiDte.DTEDefType)get_store().add_element_user(DTE$0);
            return target;
        }
    }
}
