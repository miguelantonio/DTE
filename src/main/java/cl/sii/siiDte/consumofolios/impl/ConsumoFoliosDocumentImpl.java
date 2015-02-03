/*
 * An XML document type.
 * Localname: ConsumoFolios
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.consumofolios.ConsumoFoliosDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.consumofolios.impl;
/**
 * A document containing one ConsumoFolios(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class ConsumoFoliosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConsumoFoliosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.ConsumoFoliosDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName CONSUMOFOLIOS$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ConsumoFolios");
    
    
    /**
     * Gets the "ConsumoFolios" element
     */
    public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios getConsumoFolios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios target = null;
            target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios)get_store().find_element_user(CONSUMOFOLIOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ConsumoFolios" element
     */
    public void setConsumoFolios(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios consumoFolios)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios target = null;
            target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios)get_store().find_element_user(CONSUMOFOLIOS$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios)get_store().add_element_user(CONSUMOFOLIOS$0);
            }
            target.set(consumoFolios);
        }
    }
    
    /**
     * Appends and returns a new empty "ConsumoFolios" element
     */
    public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios addNewConsumoFolios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios target = null;
            target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios)get_store().add_element_user(CONSUMOFOLIOS$0);
            return target;
        }
    }
    /**
     * An XML ConsumoFolios(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class ConsumoFoliosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios
    {
        private static final long serialVersionUID = 1L;
        
        public ConsumoFoliosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DOCUMENTOCONSUMOFOLIOS$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DocumentoConsumoFolios");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "DocumentoConsumoFolios" element
         */
        public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios getDocumentoConsumoFolios()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios target = null;
                target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios)get_store().find_element_user(DOCUMENTOCONSUMOFOLIOS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "DocumentoConsumoFolios" element
         */
        public void setDocumentoConsumoFolios(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios documentoConsumoFolios)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios target = null;
                target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios)get_store().find_element_user(DOCUMENTOCONSUMOFOLIOS$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios)get_store().add_element_user(DOCUMENTOCONSUMOFOLIOS$0);
                }
                target.set(documentoConsumoFolios);
            }
        }
        
        /**
         * Appends and returns a new empty "DocumentoConsumoFolios" element
         */
        public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios addNewDocumentoConsumoFolios()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios target = null;
                target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios)get_store().add_element_user(DOCUMENTOCONSUMOFOLIOS$0);
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
         * An XML DocumentoConsumoFolios(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class DocumentoConsumoFoliosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios
        {
            private static final long serialVersionUID = 1L;
            
            public DocumentoConsumoFoliosImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CARATULA$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Caratula");
            private static final javax.xml.namespace.QName RESUMEN$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Resumen");
            private static final javax.xml.namespace.QName ID$4 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "Caratula" element
             */
            public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula)get_store().find_element_user(CARATULA$0, 0);
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
            public void setCaratula(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets array of all "Resumen" elements
             */
            public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen[] getResumenArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESUMEN$2, targetList);
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen[] result = new cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Resumen" element
             */
            public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen getResumenArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen)get_store().find_element_user(RESUMEN$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Resumen" element
             */
            public int sizeOfResumenArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESUMEN$2);
                }
            }
            
            /**
             * Sets array of all "Resumen" element
             */
            public void setResumenArray(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen[] resumenArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(resumenArray, RESUMEN$2);
                }
            }
            
            /**
             * Sets ith "Resumen" element
             */
            public void setResumenArray(int i, cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen resumen)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen)get_store().find_element_user(RESUMEN$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(resumen);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Resumen" element
             */
            public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen insertNewResumen(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen)get_store().insert_element_user(RESUMEN$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Resumen" element
             */
            public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen addNewResumen()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen target = null;
                    target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen)get_store().add_element_user(RESUMEN$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Resumen" element
             */
            public void removeResumen(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESUMEN$2, i);
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
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula
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
                private static final javax.xml.namespace.QName FCHRESOL$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchResol");
                private static final javax.xml.namespace.QName NRORESOL$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroResol");
                private static final javax.xml.namespace.QName FCHINICIO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchInicio");
                private static final javax.xml.namespace.QName FCHFINAL$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchFinal");
                private static final javax.xml.namespace.QName CORRELATIVO$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Correlativo");
                private static final javax.xml.namespace.QName SECENVIO$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SecEnvio");
                private static final javax.xml.namespace.QName TMSTFIRMAENV$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirmaEnv");
                private static final javax.xml.namespace.QName VERSION$18 = 
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
                public cl.sii.siiDte.consumofolios.RUTType xgetRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.RUTType target = null;
                      target = (cl.sii.siiDte.consumofolios.RUTType)get_store().find_element_user(RUTEMISOR$0, 0);
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
                public void xsetRutEmisor(cl.sii.siiDte.consumofolios.RUTType rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.RUTType target = null;
                      target = (cl.sii.siiDte.consumofolios.RUTType)get_store().find_element_user(RUTEMISOR$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.RUTType)get_store().add_element_user(RUTEMISOR$0);
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
                public cl.sii.siiDte.consumofolios.RUTType xgetRutEnvia()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.RUTType target = null;
                      target = (cl.sii.siiDte.consumofolios.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
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
                public void xsetRutEnvia(cl.sii.siiDte.consumofolios.RUTType rutEnvia)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.RUTType target = null;
                      target = (cl.sii.siiDte.consumofolios.RUTType)get_store().find_element_user(RUTENVIA$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.RUTType)get_store().add_element_user(RUTENVIA$2);
                      }
                      target.set(rutEnvia);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRESOL$4, 0);
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
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHRESOL$4, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRESOL$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHRESOL$4);
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
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHRESOL$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHRESOL$4);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$6, 0);
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
                public cl.sii.siiDte.consumofolios.NroResolType xgetNroResol()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.NroResolType target = null;
                      target = (cl.sii.siiDte.consumofolios.NroResolType)get_store().find_element_user(NRORESOL$6, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRORESOL$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRORESOL$6);
                      }
                      target.setIntValue(nroResol);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                public void xsetNroResol(cl.sii.siiDte.consumofolios.NroResolType nroResol)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.NroResolType target = null;
                      target = (cl.sii.siiDte.consumofolios.NroResolType)get_store().find_element_user(NRORESOL$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.NroResolType)get_store().add_element_user(NRORESOL$6);
                      }
                      target.set(nroResol);
                    }
                }
                
                /**
                 * Gets the "FchInicio" element
                 */
                public java.util.Calendar getFchInicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHINICIO$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchInicio" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchInicio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHINICIO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchInicio" element
                 */
                public void setFchInicio(java.util.Calendar fchInicio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHINICIO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHINICIO$8);
                      }
                      target.setCalendarValue(fchInicio);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchInicio" element
                 */
                public void xsetFchInicio(org.apache.xmlbeans.XmlDate fchInicio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHINICIO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHINICIO$8);
                      }
                      target.set(fchInicio);
                    }
                }
                
                /**
                 * Gets the "FchFinal" element
                 */
                public java.util.Calendar getFchFinal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHFINAL$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchFinal" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchFinal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHFINAL$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchFinal" element
                 */
                public void setFchFinal(java.util.Calendar fchFinal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHFINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHFINAL$10);
                      }
                      target.setCalendarValue(fchFinal);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchFinal" element
                 */
                public void xsetFchFinal(org.apache.xmlbeans.XmlDate fchFinal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHFINAL$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHFINAL$10);
                      }
                      target.set(fchFinal);
                    }
                }
                
                /**
                 * Gets the "Correlativo" element
                 */
                public int getCorrelativo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIVO$12, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Correlativo" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo xgetCorrelativo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo)get_store().find_element_user(CORRELATIVO$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Correlativo" element
                 */
                public boolean isSetCorrelativo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CORRELATIVO$12) != 0;
                    }
                }
                
                /**
                 * Sets the "Correlativo" element
                 */
                public void setCorrelativo(int correlativo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CORRELATIVO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CORRELATIVO$12);
                      }
                      target.setIntValue(correlativo);
                    }
                }
                
                /**
                 * Sets (as xml) the "Correlativo" element
                 */
                public void xsetCorrelativo(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo correlativo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo)get_store().find_element_user(CORRELATIVO$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo)get_store().add_element_user(CORRELATIVO$12);
                      }
                      target.set(correlativo);
                    }
                }
                
                /**
                 * Unsets the "Correlativo" element
                 */
                public void unsetCorrelativo()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CORRELATIVO$12, 0);
                    }
                }
                
                /**
                 * Gets the "SecEnvio" element
                 */
                public int getSecEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECENVIO$14, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "SecEnvio" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio xgetSecEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio)get_store().find_element_user(SECENVIO$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "SecEnvio" element
                 */
                public void setSecEnvio(int secEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SECENVIO$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SECENVIO$14);
                      }
                      target.setIntValue(secEnvio);
                    }
                }
                
                /**
                 * Sets (as xml) the "SecEnvio" element
                 */
                public void xsetSecEnvio(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio secEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio)get_store().find_element_user(SECENVIO$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio)get_store().add_element_user(SECENVIO$14);
                      }
                      target.set(secEnvio);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMAENV$16, 0);
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
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMAENV$16, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMAENV$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMAENV$16);
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
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMAENV$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMAENV$16);
                      }
                      target.set(tmstFirmaEnv);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$18);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$18);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$18);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$18);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$18);
                      }
                      target.set(version);
                    }
                }
                /**
                 * An XML Correlativo(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Caratula$Correlativo.
                 */
                public static class CorrelativoImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CorrelativoImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CorrelativoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML SecEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Caratula$SecEnvio.
                 */
                public static class SecEnvioImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public SecEnvioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected SecEnvioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML Resumen(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class ResumenImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen
            {
                private static final long serialVersionUID = 1L;
                
                public ResumenImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TIPODOCUMENTO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoDocumento");
                private static final javax.xml.namespace.QName MNTNETO$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntNeto");
                private static final javax.xml.namespace.QName MNTIVA$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntIva");
                private static final javax.xml.namespace.QName TASAIVA$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TasaIVA");
                private static final javax.xml.namespace.QName MNTEXENTO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntExento");
                private static final javax.xml.namespace.QName MNTTOTAL$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                private static final javax.xml.namespace.QName FOLIOSEMITIDOS$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FoliosEmitidos");
                private static final javax.xml.namespace.QName FOLIOSANULADOS$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FoliosAnulados");
                private static final javax.xml.namespace.QName FOLIOSUTILIZADOS$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FoliosUtilizados");
                private static final javax.xml.namespace.QName RANGOUTILIZADOS$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RangoUtilizados");
                private static final javax.xml.namespace.QName RANGOANULADOS$20 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RangoAnulados");
                
                
                /**
                 * Gets the "TipoDocumento" element
                 */
                public java.math.BigInteger getTipoDocumento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoDocumento" element
                 */
                public cl.sii.siiDte.consumofolios.TipoConsumoType xgetTipoDocumento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.TipoConsumoType target = null;
                      target = (cl.sii.siiDte.consumofolios.TipoConsumoType)get_store().find_element_user(TIPODOCUMENTO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoDocumento" element
                 */
                public void setTipoDocumento(java.math.BigInteger tipoDocumento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTO$0);
                      }
                      target.setBigIntegerValue(tipoDocumento);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoDocumento" element
                 */
                public void xsetTipoDocumento(cl.sii.siiDte.consumofolios.TipoConsumoType tipoDocumento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.TipoConsumoType target = null;
                      target = (cl.sii.siiDte.consumofolios.TipoConsumoType)get_store().find_element_user(TIPODOCUMENTO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.TipoConsumoType)get_store().add_element_user(TIPODOCUMENTO$0);
                      }
                      target.set(tipoDocumento);
                    }
                }
                
                /**
                 * Gets the "MntNeto" element
                 */
                public long getMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntNeto" element
                 */
                public cl.sii.siiDte.consumofolios.MontoType xgetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTNETO$2, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntNeto" element
                 */
                public boolean isSetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTNETO$2) != 0;
                    }
                }
                
                /**
                 * Sets the "MntNeto" element
                 */
                public void setMntNeto(long mntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTNETO$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTNETO$2);
                      }
                      target.setLongValue(mntNeto);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntNeto" element
                 */
                public void xsetMntNeto(cl.sii.siiDte.consumofolios.MontoType mntNeto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTNETO$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.MontoType)get_store().add_element_user(MNTNETO$2);
                      }
                      target.set(mntNeto);
                    }
                }
                
                /**
                 * Unsets the "MntNeto" element
                 */
                public void unsetMntNeto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTNETO$2, 0);
                    }
                }
                
                /**
                 * Gets the "MntIva" element
                 */
                public long getMntIva()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVA$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntIva" element
                 */
                public cl.sii.siiDte.consumofolios.MontoType xgetMntIva()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTIVA$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntIva" element
                 */
                public boolean isSetMntIva()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTIVA$4) != 0;
                    }
                }
                
                /**
                 * Sets the "MntIva" element
                 */
                public void setMntIva(long mntIva)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTIVA$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTIVA$4);
                      }
                      target.setLongValue(mntIva);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntIva" element
                 */
                public void xsetMntIva(cl.sii.siiDte.consumofolios.MontoType mntIva)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTIVA$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.MontoType)get_store().add_element_user(MNTIVA$4);
                      }
                      target.set(mntIva);
                    }
                }
                
                /**
                 * Unsets the "MntIva" element
                 */
                public void unsetMntIva()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTIVA$4, 0);
                    }
                }
                
                /**
                 * Gets the "TasaIVA" element
                 */
                public java.math.BigDecimal getTasaIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIVA$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigDecimalValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TasaIVA" element
                 */
                public cl.sii.siiDte.consumofolios.PctType xgetTasaIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.PctType target = null;
                      target = (cl.sii.siiDte.consumofolios.PctType)get_store().find_element_user(TASAIVA$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "TasaIVA" element
                 */
                public boolean isSetTasaIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(TASAIVA$6) != 0;
                    }
                }
                
                /**
                 * Sets the "TasaIVA" element
                 */
                public void setTasaIVA(java.math.BigDecimal tasaIVA)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASAIVA$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASAIVA$6);
                      }
                      target.setBigDecimalValue(tasaIVA);
                    }
                }
                
                /**
                 * Sets (as xml) the "TasaIVA" element
                 */
                public void xsetTasaIVA(cl.sii.siiDte.consumofolios.PctType tasaIVA)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.PctType target = null;
                      target = (cl.sii.siiDte.consumofolios.PctType)get_store().find_element_user(TASAIVA$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.PctType)get_store().add_element_user(TASAIVA$6);
                      }
                      target.set(tasaIVA);
                    }
                }
                
                /**
                 * Unsets the "TasaIVA" element
                 */
                public void unsetTasaIVA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(TASAIVA$6, 0);
                    }
                }
                
                /**
                 * Gets the "MntExento" element
                 */
                public long getMntExento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXENTO$8, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntExento" element
                 */
                public cl.sii.siiDte.consumofolios.MontoType xgetMntExento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTEXENTO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MntExento" element
                 */
                public boolean isSetMntExento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MNTEXENTO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "MntExento" element
                 */
                public void setMntExento(long mntExento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTEXENTO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTEXENTO$8);
                      }
                      target.setLongValue(mntExento);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntExento" element
                 */
                public void xsetMntExento(cl.sii.siiDte.consumofolios.MontoType mntExento)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTEXENTO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.MontoType)get_store().add_element_user(MNTEXENTO$8);
                      }
                      target.set(mntExento);
                    }
                }
                
                /**
                 * Unsets the "MntExento" element
                 */
                public void unsetMntExento()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MNTEXENTO$8, 0);
                    }
                }
                
                /**
                 * Gets the "MntTotal" element
                 */
                public long getMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$10, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MntTotal" element
                 */
                public cl.sii.siiDte.consumofolios.MontoType xgetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "MntTotal" element
                 */
                public void setMntTotal(long mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MNTTOTAL$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MNTTOTAL$10);
                      }
                      target.setLongValue(mntTotal);
                    }
                }
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                public void xsetMntTotal(cl.sii.siiDte.consumofolios.MontoType mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.MontoType target = null;
                      target = (cl.sii.siiDte.consumofolios.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.MontoType)get_store().add_element_user(MNTTOTAL$10);
                      }
                      target.set(mntTotal);
                    }
                }
                
                /**
                 * Gets the "FoliosEmitidos" element
                 */
                public int getFoliosEmitidos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIOSEMITIDOS$12, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FoliosEmitidos" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos xgetFoliosEmitidos()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos)get_store().find_element_user(FOLIOSEMITIDOS$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FoliosEmitidos" element
                 */
                public void setFoliosEmitidos(int foliosEmitidos)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIOSEMITIDOS$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIOSEMITIDOS$12);
                      }
                      target.setIntValue(foliosEmitidos);
                    }
                }
                
                /**
                 * Sets (as xml) the "FoliosEmitidos" element
                 */
                public void xsetFoliosEmitidos(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos foliosEmitidos)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos)get_store().find_element_user(FOLIOSEMITIDOS$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos)get_store().add_element_user(FOLIOSEMITIDOS$12);
                      }
                      target.set(foliosEmitidos);
                    }
                }
                
                /**
                 * Gets the "FoliosAnulados" element
                 */
                public int getFoliosAnulados()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIOSANULADOS$14, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FoliosAnulados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados xgetFoliosAnulados()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados)get_store().find_element_user(FOLIOSANULADOS$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FoliosAnulados" element
                 */
                public void setFoliosAnulados(int foliosAnulados)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIOSANULADOS$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIOSANULADOS$14);
                      }
                      target.setIntValue(foliosAnulados);
                    }
                }
                
                /**
                 * Sets (as xml) the "FoliosAnulados" element
                 */
                public void xsetFoliosAnulados(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados foliosAnulados)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados)get_store().find_element_user(FOLIOSANULADOS$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados)get_store().add_element_user(FOLIOSANULADOS$14);
                      }
                      target.set(foliosAnulados);
                    }
                }
                
                /**
                 * Gets the "FoliosUtilizados" element
                 */
                public int getFoliosUtilizados()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIOSUTILIZADOS$16, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FoliosUtilizados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados xgetFoliosUtilizados()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados)get_store().find_element_user(FOLIOSUTILIZADOS$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FoliosUtilizados" element
                 */
                public void setFoliosUtilizados(int foliosUtilizados)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIOSUTILIZADOS$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIOSUTILIZADOS$16);
                      }
                      target.setIntValue(foliosUtilizados);
                    }
                }
                
                /**
                 * Sets (as xml) the "FoliosUtilizados" element
                 */
                public void xsetFoliosUtilizados(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados foliosUtilizados)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados)get_store().find_element_user(FOLIOSUTILIZADOS$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados)get_store().add_element_user(FOLIOSUTILIZADOS$16);
                      }
                      target.set(foliosUtilizados);
                    }
                }
                
                /**
                 * Gets array of all "RangoUtilizados" elements
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados[] getRangoUtilizadosArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(RANGOUTILIZADOS$18, targetList);
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados[] result = new cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "RangoUtilizados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados getRangoUtilizadosArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados)get_store().find_element_user(RANGOUTILIZADOS$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "RangoUtilizados" element
                 */
                public int sizeOfRangoUtilizadosArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RANGOUTILIZADOS$18);
                    }
                }
                
                /**
                 * Sets array of all "RangoUtilizados" element
                 */
                public void setRangoUtilizadosArray(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados[] rangoUtilizadosArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(rangoUtilizadosArray, RANGOUTILIZADOS$18);
                    }
                }
                
                /**
                 * Sets ith "RangoUtilizados" element
                 */
                public void setRangoUtilizadosArray(int i, cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados rangoUtilizados)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados)get_store().find_element_user(RANGOUTILIZADOS$18, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(rangoUtilizados);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RangoUtilizados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados insertNewRangoUtilizados(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados)get_store().insert_element_user(RANGOUTILIZADOS$18, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RangoUtilizados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados addNewRangoUtilizados()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados)get_store().add_element_user(RANGOUTILIZADOS$18);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "RangoUtilizados" element
                 */
                public void removeRangoUtilizados(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RANGOUTILIZADOS$18, i);
                    }
                }
                
                /**
                 * Gets array of all "RangoAnulados" elements
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados[] getRangoAnuladosArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(RANGOANULADOS$20, targetList);
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados[] result = new cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "RangoAnulados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados getRangoAnuladosArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados)get_store().find_element_user(RANGOANULADOS$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "RangoAnulados" element
                 */
                public int sizeOfRangoAnuladosArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RANGOANULADOS$20);
                    }
                }
                
                /**
                 * Sets array of all "RangoAnulados" element
                 */
                public void setRangoAnuladosArray(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados[] rangoAnuladosArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(rangoAnuladosArray, RANGOANULADOS$20);
                    }
                }
                
                /**
                 * Sets ith "RangoAnulados" element
                 */
                public void setRangoAnuladosArray(int i, cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados rangoAnulados)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados)get_store().find_element_user(RANGOANULADOS$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(rangoAnulados);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RangoAnulados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados insertNewRangoAnulados(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados)get_store().insert_element_user(RANGOANULADOS$20, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RangoAnulados" element
                 */
                public cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados addNewRangoAnulados()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados target = null;
                      target = (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados)get_store().add_element_user(RANGOANULADOS$20);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "RangoAnulados" element
                 */
                public void removeRangoAnulados(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RANGOANULADOS$20, i);
                    }
                }
                /**
                 * An XML FoliosEmitidos(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Resumen$FoliosEmitidos.
                 */
                public static class FoliosEmitidosImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FoliosEmitidosImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FoliosEmitidosImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML FoliosAnulados(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Resumen$FoliosAnulados.
                 */
                public static class FoliosAnuladosImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FoliosAnuladosImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FoliosAnuladosImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML FoliosUtilizados(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Resumen$FoliosUtilizados.
                 */
                public static class FoliosUtilizadosImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados
                {
                    private static final long serialVersionUID = 1L;
                    
                    public FoliosUtilizadosImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected FoliosUtilizadosImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML RangoUtilizados(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class RangoUtilizadosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RangoUtilizadosImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName INICIAL$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Inicial");
                    private static final javax.xml.namespace.QName FINAL$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Final");
                    
                    
                    /**
                     * Gets the "Inicial" element
                     */
                    public long getInicial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INICIAL$0, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Inicial" element
                     */
                    public cl.sii.siiDte.consumofolios.FolioType xgetInicial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(INICIAL$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Inicial" element
                     */
                    public void setInicial(long inicial)
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
                        target.setLongValue(inicial);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Inicial" element
                     */
                    public void xsetInicial(cl.sii.siiDte.consumofolios.FolioType inicial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(INICIAL$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.consumofolios.FolioType)get_store().add_element_user(INICIAL$0);
                        }
                        target.set(inicial);
                      }
                    }
                    
                    /**
                     * Gets the "Final" element
                     */
                    public long getFinal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINAL$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Final" element
                     */
                    public cl.sii.siiDte.consumofolios.FolioType xgetFinal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(FINAL$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Final" element
                     */
                    public void setFinal(long xfinal)
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
                        target.setLongValue(xfinal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Final" element
                     */
                    public void xsetFinal(cl.sii.siiDte.consumofolios.FolioType xfinal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(FINAL$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.consumofolios.FolioType)get_store().add_element_user(FINAL$2);
                        }
                        target.set(xfinal);
                      }
                    }
                }
                /**
                 * An XML RangoAnulados(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class RangoAnuladosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RangoAnuladosImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName INICIAL$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Inicial");
                    private static final javax.xml.namespace.QName FINAL$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Final");
                    
                    
                    /**
                     * Gets the "Inicial" element
                     */
                    public long getInicial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INICIAL$0, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Inicial" element
                     */
                    public cl.sii.siiDte.consumofolios.FolioType xgetInicial()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(INICIAL$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Inicial" element
                     */
                    public void setInicial(long inicial)
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
                        target.setLongValue(inicial);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Inicial" element
                     */
                    public void xsetInicial(cl.sii.siiDte.consumofolios.FolioType inicial)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(INICIAL$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.consumofolios.FolioType)get_store().add_element_user(INICIAL$0);
                        }
                        target.set(inicial);
                      }
                    }
                    
                    /**
                     * Gets the "Final" element
                     */
                    public long getFinal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINAL$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Final" element
                     */
                    public cl.sii.siiDte.consumofolios.FolioType xgetFinal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(FINAL$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "Final" element
                     */
                    public boolean isSetFinal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(FINAL$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "Final" element
                     */
                    public void setFinal(long xfinal)
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
                        target.setLongValue(xfinal);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Final" element
                     */
                    public void xsetFinal(cl.sii.siiDte.consumofolios.FolioType xfinal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.consumofolios.FolioType target = null;
                        target = (cl.sii.siiDte.consumofolios.FolioType)get_store().find_element_user(FINAL$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.consumofolios.FolioType)get_store().add_element_user(FINAL$2);
                        }
                        target.set(xfinal);
                      }
                    }
                    
                    /**
                     * Unsets the "Final" element
                     */
                    public void unsetFinal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(FINAL$2, 0);
                      }
                    }
                }
            }
        }
    }
}
