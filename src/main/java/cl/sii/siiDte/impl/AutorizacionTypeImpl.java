/*
 * XML Type:  AutorizacionType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.AutorizacionType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * An XML AutorizacionType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public class AutorizacionTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.AutorizacionType
{
    private static final long serialVersionUID = 1L;
    
    public AutorizacionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.AutorizacionTypeExtensionHandler
      
     */
    public java.security.PublicKey getPublicKey() throws java.security.spec.InvalidKeySpecException, java.security.NoSuchAlgorithmException
    {
        return 
      cl.nic.dte.extension.AutorizacionTypeExtensionHandler
      .getPublicKey(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.AutorizacionTypeExtensionHandler
      
     */
    public java.security.PrivateKey getPrivateKey(char[] p0) throws java.security.InvalidKeyException, java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException, java.security.spec.InvalidKeySpecException, java.security.InvalidAlgorithmParameterException, java.io.IOException
    {
        return 
      cl.nic.dte.extension.AutorizacionTypeExtensionHandler
      .getPrivateKey(this, p0);
    }
    
    private static final javax.xml.namespace.QName CAF$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CAF");
    private static final javax.xml.namespace.QName RSASK$2 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RSASK");
    private static final javax.xml.namespace.QName RSAPUBK$4 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RSAPUBK");
    
    
    /**
     * Gets the "CAF" element
     */
    public cl.sii.siiDte.CAFType getCAF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType target = null;
            target = (cl.sii.siiDte.CAFType)get_store().find_element_user(CAF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CAF" element
     */
    public void setCAF(cl.sii.siiDte.CAFType caf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType target = null;
            target = (cl.sii.siiDte.CAFType)get_store().find_element_user(CAF$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.CAFType)get_store().add_element_user(CAF$0);
            }
            target.set(caf);
        }
    }
    
    /**
     * Appends and returns a new empty "CAF" element
     */
    public cl.sii.siiDte.CAFType addNewCAF()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.CAFType target = null;
            target = (cl.sii.siiDte.CAFType)get_store().add_element_user(CAF$0);
            return target;
        }
    }
    
    /**
     * Gets the "RSASK" element
     */
    public java.lang.String getRSASK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSASK$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RSASK" element
     */
    public org.apache.xmlbeans.XmlString xgetRSASK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSASK$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RSASK" element
     */
    public void setRSASK(java.lang.String rsask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSASK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RSASK$2);
            }
            target.setStringValue(rsask);
        }
    }
    
    /**
     * Sets (as xml) the "RSASK" element
     */
    public void xsetRSASK(org.apache.xmlbeans.XmlString rsask)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSASK$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RSASK$2);
            }
            target.set(rsask);
        }
    }
    
    /**
     * Gets the "RSAPUBK" element
     */
    public java.lang.String getRSAPUBK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSAPUBK$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RSAPUBK" element
     */
    public org.apache.xmlbeans.XmlString xgetRSAPUBK()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSAPUBK$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RSAPUBK" element
     */
    public void setRSAPUBK(java.lang.String rsapubk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RSAPUBK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RSAPUBK$4);
            }
            target.setStringValue(rsapubk);
        }
    }
    
    /**
     * Sets (as xml) the "RSAPUBK" element
     */
    public void xsetRSAPUBK(org.apache.xmlbeans.XmlString rsapubk)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RSAPUBK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RSAPUBK$4);
            }
            target.set(rsapubk);
        }
    }
}
