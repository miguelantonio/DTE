/*
 * An XML document type.
 * Localname: EnvioRecibos
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.EnvioRecibosDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one EnvioRecibos(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class EnvioRecibosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.EnvioRecibosDocument
{
    private static final long serialVersionUID = 1L;
    
    public EnvioRecibosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.EnvioRecibosDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName ENVIORECIBOS$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EnvioRecibos");
    
    
    /**
     * Gets the "EnvioRecibos" element
     */
    public cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos getEnvioRecibos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos target = null;
            target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos)get_store().find_element_user(ENVIORECIBOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EnvioRecibos" element
     */
    public void setEnvioRecibos(cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos envioRecibos)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos target = null;
            target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos)get_store().find_element_user(ENVIORECIBOS$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos)get_store().add_element_user(ENVIORECIBOS$0);
            }
            target.set(envioRecibos);
        }
    }
    
    /**
     * Appends and returns a new empty "EnvioRecibos" element
     */
    public cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos addNewEnvioRecibos()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos target = null;
            target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos)get_store().add_element_user(ENVIORECIBOS$0);
            return target;
        }
    }
    /**
     * An XML EnvioRecibos(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class EnvioRecibosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos
    {
        private static final long serialVersionUID = 1L;
        
        public EnvioRecibosImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName SETRECIBOS$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SetRecibos");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "SetRecibos" element
         */
        public cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos getSetRecibos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos target = null;
                target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos)get_store().find_element_user(SETRECIBOS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SetRecibos" element
         */
        public void setSetRecibos(cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos setRecibos)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos target = null;
                target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos)get_store().find_element_user(SETRECIBOS$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos)get_store().add_element_user(SETRECIBOS$0);
                }
                target.set(setRecibos);
            }
        }
        
        /**
         * Appends and returns a new empty "SetRecibos" element
         */
        public cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos addNewSetRecibos()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos target = null;
                target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos)get_store().add_element_user(SETRECIBOS$0);
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
         * An XML SetRecibos(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class SetRecibosImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos
        {
            private static final long serialVersionUID = 1L;
            
            public SetRecibosImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CARATULA$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Caratula");
            private static final javax.xml.namespace.QName RECIBO$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Recibo");
            private static final javax.xml.namespace.QName ID$4 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "Caratula" element
             */
            public cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula target = null;
                    target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula)get_store().find_element_user(CARATULA$0, 0);
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
            public void setCaratula(cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula target = null;
                    target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula target = null;
                    target = (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets array of all "Recibo" elements
             */
            public cl.sii.siiDte.ReciboDefType[] getReciboArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RECIBO$2, targetList);
                    cl.sii.siiDte.ReciboDefType[] result = new cl.sii.siiDte.ReciboDefType[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Recibo" element
             */
            public cl.sii.siiDte.ReciboDefType getReciboArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.ReciboDefType target = null;
                    target = (cl.sii.siiDte.ReciboDefType)get_store().find_element_user(RECIBO$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Recibo" element
             */
            public int sizeOfReciboArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RECIBO$2);
                }
            }
            
            /**
             * Sets array of all "Recibo" element
             */
            public void setReciboArray(cl.sii.siiDte.ReciboDefType[] reciboArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(reciboArray, RECIBO$2);
                }
            }
            
            /**
             * Sets ith "Recibo" element
             */
            public void setReciboArray(int i, cl.sii.siiDte.ReciboDefType recibo)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.ReciboDefType target = null;
                    target = (cl.sii.siiDte.ReciboDefType)get_store().find_element_user(RECIBO$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(recibo);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Recibo" element
             */
            public cl.sii.siiDte.ReciboDefType insertNewRecibo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.ReciboDefType target = null;
                    target = (cl.sii.siiDte.ReciboDefType)get_store().insert_element_user(RECIBO$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Recibo" element
             */
            public cl.sii.siiDte.ReciboDefType addNewRecibo()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.ReciboDefType target = null;
                    target = (cl.sii.siiDte.ReciboDefType)get_store().add_element_user(RECIBO$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Recibo" element
             */
            public void removeRecibo(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RECIBO$2, i);
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
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula
            {
                private static final long serialVersionUID = 1L;
                
                public CaratulaImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName RUTRESPONDE$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutResponde");
                private static final javax.xml.namespace.QName RUTRECIBE$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutRecibe");
                private static final javax.xml.namespace.QName NMBCONTACTO$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NmbContacto");
                private static final javax.xml.namespace.QName FONOCONTACTO$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FonoContacto");
                private static final javax.xml.namespace.QName MAILCONTACTO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MailContacto");
                private static final javax.xml.namespace.QName TMSTFIRMAENV$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirmaEnv");
                private static final javax.xml.namespace.QName VERSION$12 = 
                    new javax.xml.namespace.QName("", "version");
                
                
                /**
                 * Gets the "RutResponde" element
                 */
                public java.lang.String getRutResponde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRESPONDE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutResponde" element
                 */
                public cl.sii.siiDte.RUTType xgetRutResponde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRESPONDE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutResponde" element
                 */
                public void setRutResponde(java.lang.String rutResponde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRESPONDE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRESPONDE$0);
                      }
                      target.setStringValue(rutResponde);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutResponde" element
                 */
                public void xsetRutResponde(cl.sii.siiDte.RUTType rutResponde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRESPONDE$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTRESPONDE$0);
                      }
                      target.set(rutResponde);
                    }
                }
                
                /**
                 * Gets the "RutRecibe" element
                 */
                public java.lang.String getRutRecibe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECIBE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RutRecibe" element
                 */
                public cl.sii.siiDte.RUTType xgetRutRecibe()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECIBE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RutRecibe" element
                 */
                public void setRutRecibe(java.lang.String rutRecibe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECIBE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECIBE$2);
                      }
                      target.setStringValue(rutRecibe);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutRecibe" element
                 */
                public void xsetRutRecibe(cl.sii.siiDte.RUTType rutRecibe)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECIBE$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTRECIBE$2);
                      }
                      target.set(rutRecibe);
                    }
                }
                
                /**
                 * Gets the "NmbContacto" element
                 */
                public java.lang.String getNmbContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBCONTACTO$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NmbContacto" element
                 */
                public cl.sii.siiDte.NombreType xgetNmbContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.NombreType target = null;
                      target = (cl.sii.siiDte.NombreType)get_store().find_element_user(NMBCONTACTO$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "NmbContacto" element
                 */
                public boolean isSetNmbContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NMBCONTACTO$4) != 0;
                    }
                }
                
                /**
                 * Sets the "NmbContacto" element
                 */
                public void setNmbContacto(java.lang.String nmbContacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBCONTACTO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMBCONTACTO$4);
                      }
                      target.setStringValue(nmbContacto);
                    }
                }
                
                /**
                 * Sets (as xml) the "NmbContacto" element
                 */
                public void xsetNmbContacto(cl.sii.siiDte.NombreType nmbContacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.NombreType target = null;
                      target = (cl.sii.siiDte.NombreType)get_store().find_element_user(NMBCONTACTO$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.NombreType)get_store().add_element_user(NMBCONTACTO$4);
                      }
                      target.set(nmbContacto);
                    }
                }
                
                /**
                 * Unsets the "NmbContacto" element
                 */
                public void unsetNmbContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NMBCONTACTO$4, 0);
                    }
                }
                
                /**
                 * Gets the "FonoContacto" element
                 */
                public java.lang.String getFonoContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FONOCONTACTO$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FonoContacto" element
                 */
                public cl.sii.siiDte.FonoType xgetFonoContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.FonoType target = null;
                      target = (cl.sii.siiDte.FonoType)get_store().find_element_user(FONOCONTACTO$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "FonoContacto" element
                 */
                public boolean isSetFonoContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(FONOCONTACTO$6) != 0;
                    }
                }
                
                /**
                 * Sets the "FonoContacto" element
                 */
                public void setFonoContacto(java.lang.String fonoContacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FONOCONTACTO$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FONOCONTACTO$6);
                      }
                      target.setStringValue(fonoContacto);
                    }
                }
                
                /**
                 * Sets (as xml) the "FonoContacto" element
                 */
                public void xsetFonoContacto(cl.sii.siiDte.FonoType fonoContacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.FonoType target = null;
                      target = (cl.sii.siiDte.FonoType)get_store().find_element_user(FONOCONTACTO$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.FonoType)get_store().add_element_user(FONOCONTACTO$6);
                      }
                      target.set(fonoContacto);
                    }
                }
                
                /**
                 * Unsets the "FonoContacto" element
                 */
                public void unsetFonoContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(FONOCONTACTO$6, 0);
                    }
                }
                
                /**
                 * Gets the "MailContacto" element
                 */
                public java.lang.String getMailContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILCONTACTO$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "MailContacto" element
                 */
                public cl.sii.siiDte.MailType xgetMailContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.MailType target = null;
                      target = (cl.sii.siiDte.MailType)get_store().find_element_user(MAILCONTACTO$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "MailContacto" element
                 */
                public boolean isSetMailContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MAILCONTACTO$8) != 0;
                    }
                }
                
                /**
                 * Sets the "MailContacto" element
                 */
                public void setMailContacto(java.lang.String mailContacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILCONTACTO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAILCONTACTO$8);
                      }
                      target.setStringValue(mailContacto);
                    }
                }
                
                /**
                 * Sets (as xml) the "MailContacto" element
                 */
                public void xsetMailContacto(cl.sii.siiDte.MailType mailContacto)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.MailType target = null;
                      target = (cl.sii.siiDte.MailType)get_store().find_element_user(MAILCONTACTO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.MailType)get_store().add_element_user(MAILCONTACTO$8);
                      }
                      target.set(mailContacto);
                    }
                }
                
                /**
                 * Unsets the "MailContacto" element
                 */
                public void unsetMailContacto()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MAILCONTACTO$8, 0);
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
                 * Gets the "version" attribute
                 */
                public java.math.BigDecimal getVersion()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$12);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$12);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$12);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$12);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$12);
                      }
                      target.set(version);
                    }
                }
            }
        }
    }
}
