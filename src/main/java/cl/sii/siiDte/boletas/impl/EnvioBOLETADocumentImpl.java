/*
 * An XML document type.
 * Localname: EnvioBOLETA
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.boletas.EnvioBOLETADocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.boletas.impl;
/**
 * A document containing one EnvioBOLETA(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class EnvioBOLETADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.EnvioBOLETADocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvioBOLETADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.EnvioBOLETADocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName ENVIOBOLETA$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EnvioBOLETA");
    
    
    /**
     * Gets the "EnvioBOLETA" element
     */
    public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA getEnvioBOLETA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA target = null;
            target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA)get_store().find_element_user(ENVIOBOLETA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnvioBOLETA" element
     */
    public void setEnvioBOLETA(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA envioBOLETA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA target = null;
            target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA)get_store().find_element_user(ENVIOBOLETA$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA)get_store().add_element_user(ENVIOBOLETA$0);
            }
            target.set(envioBOLETA);
        }
    }
    
    /**
     * Appends and returns a new empty "EnvioBOLETA" element
     */
    public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA addNewEnvioBOLETA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA target = null;
            target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA)get_store().add_element_user(ENVIOBOLETA$0);
            return target;
        }
    }
    /**
     * An XML EnvioBOLETA(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class EnvioBOLETAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA
    {
        private static final long serialVersionUID = 1L;
        
        public EnvioBOLETAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SETDTE$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SetDTE");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "SetDTE" element
         */
        public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE getSetDTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE target = null;
                target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE)get_store().find_element_user(SETDTE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SetDTE" element
         */
        public void setSetDTE(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE setDTE)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE target = null;
                target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE)get_store().find_element_user(SETDTE$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE)get_store().add_element_user(SETDTE$0);
                }
                target.set(setDTE);
            }
        }
        
        /**
         * Appends and returns a new empty "SetDTE" element
         */
        public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE addNewSetDTE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE target = null;
                target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE)get_store().add_element_user(SETDTE$0);
                return target;
            }
        }
        
        /**
         * Gets the "Signature" element
         */
        public cl.sii.siiDte.dsig.SignatureType getSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.dsig.SignatureType target = null;
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Signature" element
         */
        public void setSignature(cl.sii.siiDte.dsig.SignatureType signature)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.dsig.SignatureType target = null;
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().find_element_user(SIGNATURE$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.dsig.SignatureType)get_store().add_element_user(SIGNATURE$2);
                }
                target.set(signature);
            }
        }
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        public cl.sii.siiDte.dsig.SignatureType addNewSignature()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.dsig.SignatureType target = null;
                target = (cl.sii.siiDte.dsig.SignatureType)get_store().add_element_user(SIGNATURE$2);
                return target;
            }
        }
        
        /**
         * Gets the "version" attribute
         */
        public java.math.BigDecimal getVersion()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$4);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$4);
                }
                return target;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$4);
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
                target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$4);
                }
                target.set(version);
            }
        }
        /**
         * An XML SetDTE(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class SetDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE
        {
            private static final long serialVersionUID = 1L;
            
            public SetDTEImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CARATULA$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Caratula");
            private static final javax.xml.namespace.QName DTE$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DTE");
            private static final javax.xml.namespace.QName ID$4 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "Caratula" element
             */
            public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula target = null;
                    target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Caratula" element
             */
            public void setCaratula(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula target = null;
                    target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula target = null;
                    target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets array of all "DTE" elements
             */
            public cl.sii.siiDte.boletas.BOLETADefType[] getDTEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DTE$2, targetList);
                    cl.sii.siiDte.boletas.BOLETADefType[] result = new cl.sii.siiDte.boletas.BOLETADefType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "DTE" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType getDTEArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType)get_store().find_element_user(DTE$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "DTE" element
             */
            public int sizeOfDTEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DTE$2);
                }
            }
            
            /**
             * Sets array of all "DTE" element
             */
            public void setDTEArray(cl.sii.siiDte.boletas.BOLETADefType[] dteArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(dteArray, DTE$2);
                }
            }
            
            /**
             * Sets ith "DTE" element
             */
            public void setDTEArray(int i, cl.sii.siiDte.boletas.BOLETADefType dte)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType)get_store().find_element_user(DTE$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(dte);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DTE" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType insertNewDTE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType)get_store().insert_element_user(DTE$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DTE" element
             */
            public cl.sii.siiDte.boletas.BOLETADefType addNewDTE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.boletas.BOLETADefType target = null;
                    target = (cl.sii.siiDte.boletas.BOLETADefType)get_store().add_element_user(DTE$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DTE" element
             */
            public void removeDTE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DTE$2, i);
                }
            }
            
            /**
             * Gets the "ID" attribute
             */
            public java.lang.String getID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ID" attribute
             */
            public org.apache.xmlbeans.XmlID xgetID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlID target = null;
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
                    return target;
                }
            }
            
            /**
             * Sets the "ID" attribute
             */
            public void setID(java.lang.String id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
                    }
                    target.setStringValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "ID" attribute
             */
            public void xsetID(org.apache.xmlbeans.XmlID id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlID target = null;
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
                    }
                    target.set(id);
                }
            }
            /**
             * An XML Caratula(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula
            {
                private static final long serialVersionUID = 1L;
                
                public CaratulaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RUTEMISOR$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutEmisor");
                private static final javax.xml.namespace.QName RUTENVIA$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutEnvia");
                private static final javax.xml.namespace.QName RUTRECEPTOR$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutReceptor");
                private static final javax.xml.namespace.QName FCHRESOL$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchResol");
                private static final javax.xml.namespace.QName NRORESOL$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroResol");
                private static final javax.xml.namespace.QName TMSTFIRMAENV$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirmaEnv");
                private static final javax.xml.namespace.QName SUBTOTDTE$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SubTotDTE");
                private static final javax.xml.namespace.QName VERSION$14 = 
                    new javax.xml.namespace.QName("", "version");
                
                
                /**
                 * Gets the "RutEmisor" element
                 */
                public java.lang.String getRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutEmisor" element
                 */
                public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor xgetRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor)get_store().find_element_user(RUTEMISOR$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutEmisor" element
                 */
                public void setRutEmisor(java.lang.String rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$0);
                      }
                      target.setStringValue(rutEmisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutEmisor" element
                 */
                public void xsetRutEmisor(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor)get_store().add_element_user(RUTEMISOR$0);
                      }
                      target.set(rutEmisor);
                    }
                }
                
                /**
                 * Gets the "RutEnvia" element
                 */
                public java.lang.String getRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                public cl.sii.siiDte.boletas.RUTType xgetRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutEnvia" element
                 */
                public void setRutEnvia(java.lang.String rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTENVIA$2);
                      }
                      target.setStringValue(rutEnvia);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                public void xsetRutEnvia(cl.sii.siiDte.boletas.RUTType rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RUTENVIA$2);
                      }
                      target.set(rutEnvia);
                    }
                }
                
                /**
                 * Gets the "RutReceptor" element
                 */
                public java.lang.String getRutReceptor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEPTOR$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutReceptor" element
                 */
                public cl.sii.siiDte.boletas.RUTType xgetRutReceptor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTRECEPTOR$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutReceptor" element
                 */
                public void setRutReceptor(java.lang.String rutReceptor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEPTOR$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECEPTOR$4);
                      }
                      target.setStringValue(rutReceptor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutReceptor" element
                 */
                public void xsetRutReceptor(cl.sii.siiDte.boletas.RUTType rutReceptor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.RUTType target = null;
                      target = (cl.sii.siiDte.boletas.RUTType)get_store().find_element_user(RUTRECEPTOR$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.RUTType)get_store().add_element_user(RUTRECEPTOR$4);
                      }
                      target.set(rutReceptor);
                    }
                }
                
                /**
                 * Gets the "FchResol" element
                 */
                public java.util.Calendar getFchResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRESOL$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchResol" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHRESOL$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchResol" element
                 */
                public void setFchResol(java.util.Calendar fchResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRESOL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHRESOL$6);
                      }
                      target.setCalendarValue(fchResol);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchResol" element
                 */
                public void xsetFchResol(org.apache.xmlbeans.XmlDate fchResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHRESOL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHRESOL$6);
                      }
                      target.set(fchResol);
                    }
                }
                
                /**
                 * Gets the "NroResol" element
                 */
                public int getNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol xgetNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol)get_store().find_element_user(NRORESOL$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "NroResol" element
                 */
                public void setNroResol(int nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRORESOL$8);
                      }
                      target.setIntValue(nroResol);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                public void xsetNroResol(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol)get_store().find_element_user(NRORESOL$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol)get_store().add_element_user(NRORESOL$8);
                      }
                      target.set(nroResol);
                    }
                }
                
                /**
                 * Gets the "TmstFirmaEnv" element
                 */
                public java.util.Calendar getTmstFirmaEnv()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMAENV$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TmstFirmaEnv" element
                 */
                public org.apache.xmlbeans.XmlDateTime xgetTmstFirmaEnv()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMAENV$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TmstFirmaEnv" element
                 */
                public void setTmstFirmaEnv(java.util.Calendar tmstFirmaEnv)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMAENV$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMAENV$10);
                      }
                      target.setCalendarValue(tmstFirmaEnv);
                    }
                }
                
                /**
                 * Sets (as xml) the "TmstFirmaEnv" element
                 */
                public void xsetTmstFirmaEnv(org.apache.xmlbeans.XmlDateTime tmstFirmaEnv)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMAENV$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMAENV$10);
                      }
                      target.set(tmstFirmaEnv);
                    }
                }
                
                /**
                 * Gets array of all "SubTotDTE" elements
                 */
                public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE[] getSubTotDTEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(SUBTOTDTE$12, targetList);
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE[] result = new cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "SubTotDTE" element
                 */
                public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE getSubTotDTEArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE)get_store().find_element_user(SUBTOTDTE$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "SubTotDTE" element
                 */
                public int sizeOfSubTotDTEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(SUBTOTDTE$12);
                    }
                }
                
                /**
                 * Sets array of all "SubTotDTE" element
                 */
                public void setSubTotDTEArray(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE[] subTotDTEArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(subTotDTEArray, SUBTOTDTE$12);
                    }
                }
                
                /**
                 * Sets ith "SubTotDTE" element
                 */
                public void setSubTotDTEArray(int i, cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE subTotDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE)get_store().find_element_user(SUBTOTDTE$12, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(subTotDTE);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SubTotDTE" element
                 */
                public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE insertNewSubTotDTE(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE)get_store().insert_element_user(SUBTOTDTE$12, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SubTotDTE" element
                 */
                public cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE addNewSubTotDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE target = null;
                      target = (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE)get_store().add_element_user(SUBTOTDTE$12);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "SubTotDTE" element
                 */
                public void removeSubTotDTE(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(SUBTOTDTE$12, i);
                    }
                }
                
                /**
                 * Gets the "version" attribute
                 */
                public java.math.BigDecimal getVersion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$14);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$14);
                      }
                      return target;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$14);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$14);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$14);
                      }
                      target.set(version);
                    }
                }
                /**
                 * An XML RutEmisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.EnvioBOLETADocument$EnvioBOLETA$SetDTE$Caratula$RutEmisor.
                 */
                public static class RutEmisorImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RutEmisorImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RutEmisorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML NroResol(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.EnvioBOLETADocument$EnvioBOLETA$SetDTE$Caratula$NroResol.
                 */
                public static class NroResolImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NroResolImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NroResolImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML SubTotDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class SubTotDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE
                {
                    private static final long serialVersionUID = 1L;
                    
                    public SubTotDTEImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TPODTE$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TpoDTE");
                    private static final javax.xml.namespace.QName NRODTE$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroDTE");
                    
                    
                    /**
                     * Gets the "TpoDTE" element
                     */
                    public java.math.BigInteger getTpoDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODTE$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TpoDTE" element
                     */
                    public cl.sii.siiDte.boletas.DTEType xgetTpoDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.DTEType target = null;
                        target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TPODTE$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TpoDTE" element
                     */
                    public void setTpoDTE(java.math.BigInteger tpoDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TPODTE$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TPODTE$0);
                        }
                        target.setBigIntegerValue(tpoDTE);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TpoDTE" element
                     */
                    public void xsetTpoDTE(cl.sii.siiDte.boletas.DTEType tpoDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.boletas.DTEType target = null;
                        target = (cl.sii.siiDte.boletas.DTEType)get_store().find_element_user(TPODTE$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.boletas.DTEType)get_store().add_element_user(TPODTE$0);
                        }
                        target.set(tpoDTE);
                      }
                    }
                    
                    /**
                     * Gets the "NroDTE" element
                     */
                    public java.math.BigInteger getNroDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODTE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "NroDTE" element
                     */
                    public org.apache.xmlbeans.XmlPositiveInteger xgetNroDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlPositiveInteger target = null;
                        target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(NRODTE$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "NroDTE" element
                     */
                    public void setNroDTE(java.math.BigInteger nroDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODTE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRODTE$2);
                        }
                        target.setBigIntegerValue(nroDTE);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "NroDTE" element
                     */
                    public void xsetNroDTE(org.apache.xmlbeans.XmlPositiveInteger nroDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlPositiveInteger target = null;
                        target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(NRODTE$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(NRODTE$2);
                        }
                        target.set(nroDTE);
                      }
                    }
                }
            }
        }
    }
}
