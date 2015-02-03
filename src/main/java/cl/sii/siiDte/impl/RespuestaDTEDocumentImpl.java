/*
 * An XML document type.
 * Localname: RespuestaDTE
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.RespuestaDTEDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one RespuestaDTE(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class RespuestaDTEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument
{
    private static final long serialVersionUID = 1L;
    
    public RespuestaDTEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      
     */
    public java.security.cert.X509Certificate getCertificate()
    {
        return 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      .getCertificate(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      
     */
    public byte[] sign(java.security.PrivateKey p0, java.security.cert.X509Certificate p1) throws java.security.NoSuchAlgorithmException, java.security.InvalidAlgorithmParameterException, java.security.KeyException, javax.xml.crypto.MarshalException, javax.xml.crypto.dsig.XMLSignatureException, org.xml.sax.SAXException, java.io.IOException, javax.xml.parsers.ParserConfigurationException, org.apache.xmlbeans.XmlException
    {
        return 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      .sign(this, p0, p1);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifySignature()
    {
        return 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      .verifySignature(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.RespuestaDTEDocumentExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName RESPUESTADTE$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RespuestaDTE");
    
    
    /**
     * Gets the "RespuestaDTE" element
     */
    public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE getRespuestaDTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE target = null;
            target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE)get_store().find_element_user(RESPUESTADTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RespuestaDTE" element
     */
    public void setRespuestaDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE respuestaDTE)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE target = null;
            target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE)get_store().find_element_user(RESPUESTADTE$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE)get_store().add_element_user(RESPUESTADTE$0);
            }
            target.set(respuestaDTE);
        }
    }
    
    /**
     * Appends and returns a new empty "RespuestaDTE" element
     */
    public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE addNewRespuestaDTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE target = null;
            target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE)get_store().add_element_user(RESPUESTADTE$0);
            return target;
        }
    }
    /**
     * An XML RespuestaDTE(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class RespuestaDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE
    {
        private static final long serialVersionUID = 1L;
        
        public RespuestaDTEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTADO$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Resultado");
        private static final javax.xml.namespace.QName SIGNATURE$2 = 
            new javax.xml.namespace.QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
        private static final javax.xml.namespace.QName VERSION$4 = 
            new javax.xml.namespace.QName("", "version");
        
        
        /**
         * Gets the "Resultado" element
         */
        public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado getResultado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado target = null;
                target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado)get_store().find_element_user(RESULTADO$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Resultado" element
         */
        public void setResultado(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado resultado)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado target = null;
                target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado)get_store().find_element_user(RESULTADO$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado)get_store().add_element_user(RESULTADO$0);
                }
                target.set(resultado);
            }
        }
        
        /**
         * Appends and returns a new empty "Resultado" element
         */
        public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado addNewResultado()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado target = null;
                target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado)get_store().add_element_user(RESULTADO$0);
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
         * An XML Resultado(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class ResultadoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado
        {
            private static final long serialVersionUID = 1L;
            
            public ResultadoImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CARATULA$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Caratula");
            private static final javax.xml.namespace.QName RECEPCIONENVIO$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RecepcionEnvio");
            private static final javax.xml.namespace.QName RESULTADODTE$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ResultadoDTE");
            private static final javax.xml.namespace.QName ID$6 = 
                new javax.xml.namespace.QName("", "ID");
            
            
            /**
             * Gets the "Caratula" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula getCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula)get_store().find_element_user(CARATULA$0, 0);
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
            public void setCaratula(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula caratula)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula)get_store().find_element_user(CARATULA$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula)get_store().add_element_user(CARATULA$0);
                    }
                    target.set(caratula);
                }
            }
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula addNewCaratula()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula)get_store().add_element_user(CARATULA$0);
                    return target;
                }
            }
            
            /**
             * Gets array of all "RecepcionEnvio" elements
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio[] getRecepcionEnvioArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RECEPCIONENVIO$2, targetList);
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio[] result = new cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "RecepcionEnvio" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio getRecepcionEnvioArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio)get_store().find_element_user(RECEPCIONENVIO$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "RecepcionEnvio" element
             */
            public int sizeOfRecepcionEnvioArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RECEPCIONENVIO$2);
                }
            }
            
            /**
             * Sets array of all "RecepcionEnvio" element
             */
            public void setRecepcionEnvioArray(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio[] recepcionEnvioArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(recepcionEnvioArray, RECEPCIONENVIO$2);
                }
            }
            
            /**
             * Sets ith "RecepcionEnvio" element
             */
            public void setRecepcionEnvioArray(int i, cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio recepcionEnvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio)get_store().find_element_user(RECEPCIONENVIO$2, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(recepcionEnvio);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "RecepcionEnvio" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio insertNewRecepcionEnvio(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio)get_store().insert_element_user(RECEPCIONENVIO$2, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "RecepcionEnvio" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio addNewRecepcionEnvio()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio)get_store().add_element_user(RECEPCIONENVIO$2);
                    return target;
                }
            }
            
            /**
             * Removes the ith "RecepcionEnvio" element
             */
            public void removeRecepcionEnvio(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RECEPCIONENVIO$2, i);
                }
            }
            
            /**
             * Gets array of all "ResultadoDTE" elements
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE[] getResultadoDTEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESULTADODTE$4, targetList);
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE[] result = new cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "ResultadoDTE" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE getResultadoDTEArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE)get_store().find_element_user(RESULTADODTE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "ResultadoDTE" element
             */
            public int sizeOfResultadoDTEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESULTADODTE$4);
                }
            }
            
            /**
             * Sets array of all "ResultadoDTE" element
             */
            public void setResultadoDTEArray(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE[] resultadoDTEArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(resultadoDTEArray, RESULTADODTE$4);
                }
            }
            
            /**
             * Sets ith "ResultadoDTE" element
             */
            public void setResultadoDTEArray(int i, cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE resultadoDTE)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE)get_store().find_element_user(RESULTADODTE$4, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(resultadoDTE);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ResultadoDTE" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE insertNewResultadoDTE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE)get_store().insert_element_user(RESULTADODTE$4, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ResultadoDTE" element
             */
            public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE addNewResultadoDTE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE target = null;
                    target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE)get_store().add_element_user(RESULTADODTE$4);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ResultadoDTE" element
             */
            public void removeResultadoDTE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESULTADODTE$4, i);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
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
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
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
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$6);
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
                    target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$6);
                    }
                    target.set(id);
                }
            }
            /**
             * An XML Caratula(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class CaratulaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula
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
                private static final javax.xml.namespace.QName IDRESPUESTA$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "IdRespuesta");
                private static final javax.xml.namespace.QName NRODETALLES$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroDetalles");
                private static final javax.xml.namespace.QName NMBCONTACTO$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NmbContacto");
                private static final javax.xml.namespace.QName FONOCONTACTO$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FonoContacto");
                private static final javax.xml.namespace.QName MAILCONTACTO$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MailContacto");
                private static final javax.xml.namespace.QName TMSTFIRMARESP$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TmstFirmaResp");
                private static final javax.xml.namespace.QName VERSION$16 = 
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
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde xgetRutResponde()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde)get_store().find_element_user(RUTRESPONDE$0, 0);
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
                public void xsetRutResponde(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde rutResponde)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde)get_store().find_element_user(RUTRESPONDE$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde)get_store().add_element_user(RUTRESPONDE$0);
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
                 * Gets the "IdRespuesta" element
                 */
                public long getIdRespuesta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDRESPUESTA$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "IdRespuesta" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta xgetIdRespuesta()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta)get_store().find_element_user(IDRESPUESTA$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "IdRespuesta" element
                 */
                public void setIdRespuesta(long idRespuesta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDRESPUESTA$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDRESPUESTA$4);
                      }
                      target.setLongValue(idRespuesta);
                    }
                }
                
                /**
                 * Sets (as xml) the "IdRespuesta" element
                 */
                public void xsetIdRespuesta(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta idRespuesta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta)get_store().find_element_user(IDRESPUESTA$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta)get_store().add_element_user(IDRESPUESTA$4);
                      }
                      target.set(idRespuesta);
                    }
                }
                
                /**
                 * Gets the "NroDetalles" element
                 */
                public int getNroDetalles()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODETALLES$6, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroDetalles" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles xgetNroDetalles()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles)get_store().find_element_user(NRODETALLES$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "NroDetalles" element
                 */
                public void setNroDetalles(int nroDetalles)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODETALLES$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRODETALLES$6);
                      }
                      target.setIntValue(nroDetalles);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroDetalles" element
                 */
                public void xsetNroDetalles(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles nroDetalles)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles)get_store().find_element_user(NRODETALLES$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles)get_store().add_element_user(NRODETALLES$6);
                      }
                      target.set(nroDetalles);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBCONTACTO$8, 0);
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
                      target = (cl.sii.siiDte.NombreType)get_store().find_element_user(NMBCONTACTO$8, 0);
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
                      return get_store().count_elements(NMBCONTACTO$8) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBCONTACTO$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMBCONTACTO$8);
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
                      target = (cl.sii.siiDte.NombreType)get_store().find_element_user(NMBCONTACTO$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.NombreType)get_store().add_element_user(NMBCONTACTO$8);
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
                      get_store().remove_element(NMBCONTACTO$8, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FONOCONTACTO$10, 0);
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
                      target = (cl.sii.siiDte.FonoType)get_store().find_element_user(FONOCONTACTO$10, 0);
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
                      return get_store().count_elements(FONOCONTACTO$10) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FONOCONTACTO$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FONOCONTACTO$10);
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
                      target = (cl.sii.siiDte.FonoType)get_store().find_element_user(FONOCONTACTO$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.FonoType)get_store().add_element_user(FONOCONTACTO$10);
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
                      get_store().remove_element(FONOCONTACTO$10, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILCONTACTO$12, 0);
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
                      target = (cl.sii.siiDte.MailType)get_store().find_element_user(MAILCONTACTO$12, 0);
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
                      return get_store().count_elements(MAILCONTACTO$12) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAILCONTACTO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAILCONTACTO$12);
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
                      target = (cl.sii.siiDte.MailType)get_store().find_element_user(MAILCONTACTO$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.MailType)get_store().add_element_user(MAILCONTACTO$12);
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
                      get_store().remove_element(MAILCONTACTO$12, 0);
                    }
                }
                
                /**
                 * Gets the "TmstFirmaResp" element
                 */
                public java.util.Calendar getTmstFirmaResp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMARESP$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TmstFirmaResp" element
                 */
                public org.apache.xmlbeans.XmlDateTime xgetTmstFirmaResp()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMARESP$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TmstFirmaResp" element
                 */
                public void setTmstFirmaResp(java.util.Calendar tmstFirmaResp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTFIRMARESP$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTFIRMARESP$14);
                      }
                      target.setCalendarValue(tmstFirmaResp);
                    }
                }
                
                /**
                 * Sets (as xml) the "TmstFirmaResp" element
                 */
                public void xsetTmstFirmaResp(org.apache.xmlbeans.XmlDateTime tmstFirmaResp)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TMSTFIRMARESP$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TMSTFIRMARESP$14);
                      }
                      target.set(tmstFirmaResp);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(VERSION$16);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_default_attribute_value(VERSION$16);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSION$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSION$16);
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
                      target = (org.apache.xmlbeans.XmlDecimal)get_store().find_attribute_user(VERSION$16);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDecimal)get_store().add_attribute_user(VERSION$16);
                      }
                      target.set(version);
                    }
                }
                /**
                 * An XML RutResponde(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$Caratula$RutResponde.
                 */
                public static class RutRespondeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RutRespondeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RutRespondeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML IdRespuesta(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$Caratula$IdRespuesta.
                 */
                public static class IdRespuestaImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IdRespuestaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IdRespuestaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML NroDetalles(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$Caratula$NroDetalles.
                 */
                public static class NroDetallesImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NroDetallesImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NroDetallesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML RecepcionEnvio(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class RecepcionEnvioImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio
            {
                private static final long serialVersionUID = 1L;
                
                public RecepcionEnvioImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NMBENVIO$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NmbEnvio");
                private static final javax.xml.namespace.QName FCHRECEP$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchRecep");
                private static final javax.xml.namespace.QName CODENVIO$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodEnvio");
                private static final javax.xml.namespace.QName ENVIODTEID$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EnvioDTEID");
                private static final javax.xml.namespace.QName DIGEST$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Digest");
                private static final javax.xml.namespace.QName RUTEMISOR$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutEmisor");
                private static final javax.xml.namespace.QName RUTRECEPTOR$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RutReceptor");
                private static final javax.xml.namespace.QName ESTADORECEPENV$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EstadoRecepEnv");
                private static final javax.xml.namespace.QName RECEPENVGLOSA$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RecepEnvGlosa");
                private static final javax.xml.namespace.QName NRODTE$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "NroDTE");
                private static final javax.xml.namespace.QName RECEPCIONDTE$20 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RecepcionDTE");
                
                
                /**
                 * Gets the "NmbEnvio" element
                 */
                public java.lang.String getNmbEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBENVIO$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NmbEnvio" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio xgetNmbEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio)get_store().find_element_user(NMBENVIO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "NmbEnvio" element
                 */
                public void setNmbEnvio(java.lang.String nmbEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NMBENVIO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NMBENVIO$0);
                      }
                      target.setStringValue(nmbEnvio);
                    }
                }
                
                /**
                 * Sets (as xml) the "NmbEnvio" element
                 */
                public void xsetNmbEnvio(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio nmbEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio)get_store().find_element_user(NMBENVIO$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio)get_store().add_element_user(NMBENVIO$0);
                      }
                      target.set(nmbEnvio);
                    }
                }
                
                /**
                 * Gets the "FchRecep" element
                 */
                public java.util.Calendar getFchRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRECEP$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchRecep" element
                 */
                public org.apache.xmlbeans.XmlDateTime xgetFchRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FCHRECEP$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchRecep" element
                 */
                public void setFchRecep(java.util.Calendar fchRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHRECEP$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHRECEP$2);
                      }
                      target.setCalendarValue(fchRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchRecep" element
                 */
                public void xsetFchRecep(org.apache.xmlbeans.XmlDateTime fchRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDateTime target = null;
                      target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FCHRECEP$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FCHRECEP$2);
                      }
                      target.set(fchRecep);
                    }
                }
                
                /**
                 * Gets the "CodEnvio" element
                 */
                public long getCodEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODENVIO$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CodEnvio" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio xgetCodEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio)get_store().find_element_user(CODENVIO$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "CodEnvio" element
                 */
                public void setCodEnvio(long codEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODENVIO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODENVIO$4);
                      }
                      target.setLongValue(codEnvio);
                    }
                }
                
                /**
                 * Sets (as xml) the "CodEnvio" element
                 */
                public void xsetCodEnvio(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio codEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio)get_store().find_element_user(CODENVIO$4, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio)get_store().add_element_user(CODENVIO$4);
                      }
                      target.set(codEnvio);
                    }
                }
                
                /**
                 * Gets the "EnvioDTEID" element
                 */
                public java.lang.String getEnvioDTEID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIODTEID$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EnvioDTEID" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID xgetEnvioDTEID()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID)get_store().find_element_user(ENVIODTEID$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "EnvioDTEID" element
                 */
                public void setEnvioDTEID(java.lang.String envioDTEID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENVIODTEID$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENVIODTEID$6);
                      }
                      target.setStringValue(envioDTEID);
                    }
                }
                
                /**
                 * Sets (as xml) the "EnvioDTEID" element
                 */
                public void xsetEnvioDTEID(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID envioDTEID)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID)get_store().find_element_user(ENVIODTEID$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID)get_store().add_element_user(ENVIODTEID$6);
                      }
                      target.set(envioDTEID);
                    }
                }
                
                /**
                 * Gets the "Digest" element
                 */
                public byte[] getDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGEST$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Digest" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DIGEST$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "Digest" element
                 */
                public boolean isSetDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIGEST$8) != 0;
                    }
                }
                
                /**
                 * Sets the "Digest" element
                 */
                public void setDigest(byte[] digest)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGEST$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIGEST$8);
                      }
                      target.setByteArrayValue(digest);
                    }
                }
                
                /**
                 * Sets (as xml) the "Digest" element
                 */
                public void xsetDigest(org.apache.xmlbeans.XmlBase64Binary digest)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DIGEST$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DIGEST$8);
                      }
                      target.set(digest);
                    }
                }
                
                /**
                 * Unsets the "Digest" element
                 */
                public void unsetDigest()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIGEST$8, 0);
                    }
                }
                
                /**
                 * Gets the "RutEmisor" element
                 */
                public java.lang.String getRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$10, 0);
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
                public cl.sii.siiDte.RUTType xgetRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$10, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RutEmisor" element
                 */
                public boolean isSetRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RUTEMISOR$10) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$10);
                      }
                      target.setStringValue(rutEmisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutEmisor" element
                 */
                public void xsetRutEmisor(cl.sii.siiDte.RUTType rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTEMISOR$10);
                      }
                      target.set(rutEmisor);
                    }
                }
                
                /**
                 * Unsets the "RutEmisor" element
                 */
                public void unsetRutEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RUTEMISOR$10, 0);
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEPTOR$12, 0);
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
                public cl.sii.siiDte.RUTType xgetRutReceptor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEPTOR$12, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RutReceptor" element
                 */
                public boolean isSetRutReceptor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RUTRECEPTOR$12) != 0;
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
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEPTOR$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECEPTOR$12);
                      }
                      target.setStringValue(rutReceptor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RutReceptor" element
                 */
                public void xsetRutReceptor(cl.sii.siiDte.RUTType rutReceptor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEPTOR$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTRECEPTOR$12);
                      }
                      target.set(rutReceptor);
                    }
                }
                
                /**
                 * Unsets the "RutReceptor" element
                 */
                public void unsetRutReceptor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RUTRECEPTOR$12, 0);
                    }
                }
                
                /**
                 * Gets the "EstadoRecepEnv" element
                 */
                public int getEstadoRecepEnv()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADORECEPENV$14, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EstadoRecepEnv" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv xgetEstadoRecepEnv()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv)get_store().find_element_user(ESTADORECEPENV$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "EstadoRecepEnv" element
                 */
                public void setEstadoRecepEnv(int estadoRecepEnv)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADORECEPENV$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADORECEPENV$14);
                      }
                      target.setIntValue(estadoRecepEnv);
                    }
                }
                
                /**
                 * Sets (as xml) the "EstadoRecepEnv" element
                 */
                public void xsetEstadoRecepEnv(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv estadoRecepEnv)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv)get_store().find_element_user(ESTADORECEPENV$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv)get_store().add_element_user(ESTADORECEPENV$14);
                      }
                      target.set(estadoRecepEnv);
                    }
                }
                
                /**
                 * Gets the "RecepEnvGlosa" element
                 */
                public java.lang.String getRecepEnvGlosa()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEPENVGLOSA$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RecepEnvGlosa" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa xgetRecepEnvGlosa()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa)get_store().find_element_user(RECEPENVGLOSA$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RecepEnvGlosa" element
                 */
                public void setRecepEnvGlosa(java.lang.String recepEnvGlosa)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEPENVGLOSA$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEPENVGLOSA$16);
                      }
                      target.setStringValue(recepEnvGlosa);
                    }
                }
                
                /**
                 * Sets (as xml) the "RecepEnvGlosa" element
                 */
                public void xsetRecepEnvGlosa(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa recepEnvGlosa)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa)get_store().find_element_user(RECEPENVGLOSA$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa)get_store().add_element_user(RECEPENVGLOSA$16);
                      }
                      target.set(recepEnvGlosa);
                    }
                }
                
                /**
                 * Gets the "NroDTE" element
                 */
                public int getNroDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODTE$18, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "NroDTE" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE xgetNroDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE)get_store().find_element_user(NRODTE$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "NroDTE" element
                 */
                public boolean isSetNroDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(NRODTE$18) != 0;
                    }
                }
                
                /**
                 * Sets the "NroDTE" element
                 */
                public void setNroDTE(int nroDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NRODTE$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NRODTE$18);
                      }
                      target.setIntValue(nroDTE);
                    }
                }
                
                /**
                 * Sets (as xml) the "NroDTE" element
                 */
                public void xsetNroDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE nroDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE)get_store().find_element_user(NRODTE$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE)get_store().add_element_user(NRODTE$18);
                      }
                      target.set(nroDTE);
                    }
                }
                
                /**
                 * Unsets the "NroDTE" element
                 */
                public void unsetNroDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(NRODTE$18, 0);
                    }
                }
                
                /**
                 * Gets array of all "RecepcionDTE" elements
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE[] getRecepcionDTEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(RECEPCIONDTE$20, targetList);
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE[] result = new cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "RecepcionDTE" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE getRecepcionDTEArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE)get_store().find_element_user(RECEPCIONDTE$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "RecepcionDTE" element
                 */
                public int sizeOfRecepcionDTEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RECEPCIONDTE$20);
                    }
                }
                
                /**
                 * Sets array of all "RecepcionDTE" element
                 */
                public void setRecepcionDTEArray(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE[] recepcionDTEArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(recepcionDTEArray, RECEPCIONDTE$20);
                    }
                }
                
                /**
                 * Sets ith "RecepcionDTE" element
                 */
                public void setRecepcionDTEArray(int i, cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE recepcionDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE)get_store().find_element_user(RECEPCIONDTE$20, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(recepcionDTE);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RecepcionDTE" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE insertNewRecepcionDTE(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE)get_store().insert_element_user(RECEPCIONDTE$20, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RecepcionDTE" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE addNewRecepcionDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE)get_store().add_element_user(RECEPCIONDTE$20);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "RecepcionDTE" element
                 */
                public void removeRecepcionDTE(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RECEPCIONDTE$20, i);
                    }
                }
                /**
                 * An XML NmbEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$NmbEnvio.
                 */
                public static class NmbEnvioImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NmbEnvioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NmbEnvioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CodEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$CodEnvio.
                 */
                public static class CodEnvioImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CodEnvioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CodEnvioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML EnvioDTEID(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$EnvioDTEID.
                 */
                public static class EnvioDTEIDImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EnvioDTEIDImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected EnvioDTEIDImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML EstadoRecepEnv(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$EstadoRecepEnv.
                 */
                public static class EstadoRecepEnvImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EstadoRecepEnvImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected EstadoRecepEnvImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML RecepEnvGlosa(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$RecepEnvGlosa.
                 */
                public static class RecepEnvGlosaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RecepEnvGlosaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected RecepEnvGlosaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML NroDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$NroDTE.
                 */
                public static class NroDTEImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NroDTEImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NroDTEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML RecepcionDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class RecepcionDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE
                {
                    private static final long serialVersionUID = 1L;
                    
                    public RecepcionDTEImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName TIPODTE$0 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoDTE");
                    private static final javax.xml.namespace.QName FOLIO$2 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Folio");
                    private static final javax.xml.namespace.QName FCHEMIS$4 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchEmis");
                    private static final javax.xml.namespace.QName RUTEMISOR$6 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTEmisor");
                    private static final javax.xml.namespace.QName RUTRECEP$8 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTRecep");
                    private static final javax.xml.namespace.QName MNTTOTAL$10 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                    private static final javax.xml.namespace.QName ESTADORECEPDTE$12 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EstadoRecepDTE");
                    private static final javax.xml.namespace.QName RECEPDTEGLOSA$14 = 
                      new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RecepDTEGlosa");
                    
                    
                    /**
                     * Gets the "TipoDTE" element
                     */
                    public java.math.BigInteger getTipoDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getBigIntegerValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "TipoDTE" element
                     */
                    public cl.sii.siiDte.DTEType xgetTipoDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.DTEType target = null;
                        target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TIPODTE$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "TipoDTE" element
                     */
                    public void setTipoDTE(java.math.BigInteger tipoDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODTE$0);
                        }
                        target.setBigIntegerValue(tipoDTE);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "TipoDTE" element
                     */
                    public void xsetTipoDTE(cl.sii.siiDte.DTEType tipoDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.DTEType target = null;
                        target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TIPODTE$0, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.DTEType)get_store().add_element_user(TIPODTE$0);
                        }
                        target.set(tipoDTE);
                      }
                    }
                    
                    /**
                     * Gets the "Folio" element
                     */
                    public long getFolio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$2, 0);
                        if (target == null)
                        {
                          return 0L;
                        }
                        return target.getLongValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Folio" element
                     */
                    public cl.sii.siiDte.FolioType xgetFolio()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.FolioType target = null;
                        target = (cl.sii.siiDte.FolioType)get_store().find_element_user(FOLIO$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Folio" element
                     */
                    public void setFolio(long folio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIO$2);
                        }
                        target.setLongValue(folio);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Folio" element
                     */
                    public void xsetFolio(cl.sii.siiDte.FolioType folio)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.FolioType target = null;
                        target = (cl.sii.siiDte.FolioType)get_store().find_element_user(FOLIO$2, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.FolioType)get_store().add_element_user(FOLIO$2);
                        }
                        target.set(folio);
                      }
                    }
                    
                    /**
                     * Gets the "FchEmis" element
                     */
                    public java.util.Calendar getFchEmis()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIS$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "FchEmis" element
                     */
                    public org.apache.xmlbeans.XmlDate xgetFchEmis()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDate target = null;
                        target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIS$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "FchEmis" element
                     */
                    public void setFchEmis(java.util.Calendar fchEmis)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHEMIS$4);
                        }
                        target.setCalendarValue(fchEmis);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "FchEmis" element
                     */
                    public void xsetFchEmis(org.apache.xmlbeans.XmlDate fchEmis)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDate target = null;
                        target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHEMIS$4);
                        }
                        target.set(fchEmis);
                      }
                    }
                    
                    /**
                     * Gets the "RUTEmisor" element
                     */
                    public java.lang.String getRUTEmisor()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RUTEmisor" element
                     */
                    public cl.sii.siiDte.RUTType xgetRUTEmisor()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RUTType target = null;
                        target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$6, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "RUTEmisor" element
                     */
                    public void setRUTEmisor(java.lang.String rutEmisor)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$6, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$6);
                        }
                        target.setStringValue(rutEmisor);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RUTEmisor" element
                     */
                    public void xsetRUTEmisor(cl.sii.siiDte.RUTType rutEmisor)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RUTType target = null;
                        target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$6, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTEMISOR$6);
                        }
                        target.set(rutEmisor);
                      }
                    }
                    
                    /**
                     * Gets the "RUTRecep" element
                     */
                    public java.lang.String getRUTRecep()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RUTRecep" element
                     */
                    public cl.sii.siiDte.RUTType xgetRUTRecep()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RUTType target = null;
                        target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEP$8, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "RUTRecep" element
                     */
                    public void setRUTRecep(java.lang.String rutRecep)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$8, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECEP$8);
                        }
                        target.setStringValue(rutRecep);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RUTRecep" element
                     */
                    public void xsetRUTRecep(cl.sii.siiDte.RUTType rutRecep)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RUTType target = null;
                        target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEP$8, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTRECEP$8);
                        }
                        target.set(rutRecep);
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
                    public cl.sii.siiDte.MontoType xgetMntTotal()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.MontoType target = null;
                        target = (cl.sii.siiDte.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
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
                    public void xsetMntTotal(cl.sii.siiDte.MontoType mntTotal)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.MontoType target = null;
                        target = (cl.sii.siiDte.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.MontoType)get_store().add_element_user(MNTTOTAL$10);
                        }
                        target.set(mntTotal);
                      }
                    }
                    
                    /**
                     * Gets the "EstadoRecepDTE" element
                     */
                    public int getEstadoRecepDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADORECEPDTE$12, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "EstadoRecepDTE" element
                     */
                    public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE xgetEstadoRecepDTE()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE target = null;
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE)get_store().find_element_user(ESTADORECEPDTE$12, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "EstadoRecepDTE" element
                     */
                    public void setEstadoRecepDTE(int estadoRecepDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADORECEPDTE$12, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADORECEPDTE$12);
                        }
                        target.setIntValue(estadoRecepDTE);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "EstadoRecepDTE" element
                     */
                    public void xsetEstadoRecepDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE estadoRecepDTE)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE target = null;
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE)get_store().find_element_user(ESTADORECEPDTE$12, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE)get_store().add_element_user(ESTADORECEPDTE$12);
                        }
                        target.set(estadoRecepDTE);
                      }
                    }
                    
                    /**
                     * Gets the "RecepDTEGlosa" element
                     */
                    public java.lang.String getRecepDTEGlosa()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEPDTEGLOSA$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "RecepDTEGlosa" element
                     */
                    public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa xgetRecepDTEGlosa()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa target = null;
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa)get_store().find_element_user(RECEPDTEGLOSA$14, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "RecepDTEGlosa" element
                     */
                    public void setRecepDTEGlosa(java.lang.String recepDTEGlosa)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECEPDTEGLOSA$14, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECEPDTEGLOSA$14);
                        }
                        target.setStringValue(recepDTEGlosa);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "RecepDTEGlosa" element
                     */
                    public void xsetRecepDTEGlosa(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa recepDTEGlosa)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa target = null;
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa)get_store().find_element_user(RECEPDTEGLOSA$14, 0);
                        if (target == null)
                        {
                          target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa)get_store().add_element_user(RECEPDTEGLOSA$14);
                        }
                        target.set(recepDTEGlosa);
                      }
                    }
                    /**
                     * An XML EstadoRecepDTE(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$RecepcionDTE$EstadoRecepDTE.
                     */
                    public static class EstadoRecepDTEImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public EstadoRecepDTEImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected EstadoRecepDTEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML RecepDTEGlosa(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$RecepcionDTE$RecepDTEGlosa.
                     */
                    public static class RecepDTEGlosaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public RecepDTEGlosaImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected RecepDTEGlosaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
            }
            /**
             * An XML ResultadoDTE(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class ResultadoDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE
            {
                private static final long serialVersionUID = 1L;
                
                public ResultadoDTEImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TIPODTE$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TipoDTE");
                private static final javax.xml.namespace.QName FOLIO$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Folio");
                private static final javax.xml.namespace.QName FCHEMIS$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FchEmis");
                private static final javax.xml.namespace.QName RUTEMISOR$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTEmisor");
                private static final javax.xml.namespace.QName RUTRECEP$8 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTRecep");
                private static final javax.xml.namespace.QName MNTTOTAL$10 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "MntTotal");
                private static final javax.xml.namespace.QName CODENVIO$12 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodEnvio");
                private static final javax.xml.namespace.QName ESTADODTE$14 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EstadoDTE");
                private static final javax.xml.namespace.QName ESTADODTEGLOSA$16 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "EstadoDTEGlosa");
                private static final javax.xml.namespace.QName CODRCHDSC$18 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CodRchDsc");
                
                
                /**
                 * Gets the "TipoDTE" element
                 */
                public java.math.BigInteger getTipoDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TipoDTE" element
                 */
                public cl.sii.siiDte.DTEType xgetTipoDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.DTEType target = null;
                      target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TIPODTE$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TipoDTE" element
                 */
                public void setTipoDTE(java.math.BigInteger tipoDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODTE$0);
                      }
                      target.setBigIntegerValue(tipoDTE);
                    }
                }
                
                /**
                 * Sets (as xml) the "TipoDTE" element
                 */
                public void xsetTipoDTE(cl.sii.siiDte.DTEType tipoDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.DTEType target = null;
                      target = (cl.sii.siiDte.DTEType)get_store().find_element_user(TIPODTE$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.DTEType)get_store().add_element_user(TIPODTE$0);
                      }
                      target.set(tipoDTE);
                    }
                }
                
                /**
                 * Gets the "Folio" element
                 */
                public long getFolio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Folio" element
                 */
                public cl.sii.siiDte.FolioType xgetFolio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.FolioType target = null;
                      target = (cl.sii.siiDte.FolioType)get_store().find_element_user(FOLIO$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Folio" element
                 */
                public void setFolio(long folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIO$2);
                      }
                      target.setLongValue(folio);
                    }
                }
                
                /**
                 * Sets (as xml) the "Folio" element
                 */
                public void xsetFolio(cl.sii.siiDte.FolioType folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.FolioType target = null;
                      target = (cl.sii.siiDte.FolioType)get_store().find_element_user(FOLIO$2, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.FolioType)get_store().add_element_user(FOLIO$2);
                      }
                      target.set(folio);
                    }
                }
                
                /**
                 * Gets the "FchEmis" element
                 */
                public java.util.Calendar getFchEmis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIS$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getCalendarValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FchEmis" element
                 */
                public org.apache.xmlbeans.XmlDate xgetFchEmis()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIS$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FchEmis" element
                 */
                public void setFchEmis(java.util.Calendar fchEmis)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FCHEMIS$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FCHEMIS$4);
                      }
                      target.setCalendarValue(fchEmis);
                    }
                }
                
                /**
                 * Sets (as xml) the "FchEmis" element
                 */
                public void xsetFchEmis(org.apache.xmlbeans.XmlDate fchEmis)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlDate target = null;
                      target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(FCHEMIS$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(FCHEMIS$4);
                      }
                      target.set(fchEmis);
                    }
                }
                
                /**
                 * Gets the "RUTEmisor" element
                 */
                public java.lang.String getRUTEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RUTEmisor" element
                 */
                public cl.sii.siiDte.RUTType xgetRUTEmisor()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RUTEmisor" element
                 */
                public void setRUTEmisor(java.lang.String rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTEMISOR$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTEMISOR$6);
                      }
                      target.setStringValue(rutEmisor);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTEmisor" element
                 */
                public void xsetRUTEmisor(cl.sii.siiDte.RUTType rutEmisor)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTEMISOR$6, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTEMISOR$6);
                      }
                      target.set(rutEmisor);
                    }
                }
                
                /**
                 * Gets the "RUTRecep" element
                 */
                public java.lang.String getRUTRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RUTRecep" element
                 */
                public cl.sii.siiDte.RUTType xgetRUTRecep()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEP$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "RUTRecep" element
                 */
                public void setRUTRecep(java.lang.String rutRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTRECEP$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTRECEP$8);
                      }
                      target.setStringValue(rutRecep);
                    }
                }
                
                /**
                 * Sets (as xml) the "RUTRecep" element
                 */
                public void xsetRUTRecep(cl.sii.siiDte.RUTType rutRecep)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RUTType target = null;
                      target = (cl.sii.siiDte.RUTType)get_store().find_element_user(RUTRECEP$8, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RUTType)get_store().add_element_user(RUTRECEP$8);
                      }
                      target.set(rutRecep);
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
                public cl.sii.siiDte.MontoType xgetMntTotal()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.MontoType target = null;
                      target = (cl.sii.siiDte.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
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
                public void xsetMntTotal(cl.sii.siiDte.MontoType mntTotal)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.MontoType target = null;
                      target = (cl.sii.siiDte.MontoType)get_store().find_element_user(MNTTOTAL$10, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.MontoType)get_store().add_element_user(MNTTOTAL$10);
                      }
                      target.set(mntTotal);
                    }
                }
                
                /**
                 * Gets the "CodEnvio" element
                 */
                public long getCodEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODENVIO$12, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CodEnvio" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio xgetCodEnvio()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio)get_store().find_element_user(CODENVIO$12, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "CodEnvio" element
                 */
                public void setCodEnvio(long codEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODENVIO$12, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODENVIO$12);
                      }
                      target.setLongValue(codEnvio);
                    }
                }
                
                /**
                 * Sets (as xml) the "CodEnvio" element
                 */
                public void xsetCodEnvio(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio codEnvio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio)get_store().find_element_user(CODENVIO$12, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio)get_store().add_element_user(CODENVIO$12);
                      }
                      target.set(codEnvio);
                    }
                }
                
                /**
                 * Gets the "EstadoDTE" element
                 */
                public int getEstadoDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADODTE$14, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EstadoDTE" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE xgetEstadoDTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE)get_store().find_element_user(ESTADODTE$14, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "EstadoDTE" element
                 */
                public void setEstadoDTE(int estadoDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADODTE$14, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADODTE$14);
                      }
                      target.setIntValue(estadoDTE);
                    }
                }
                
                /**
                 * Sets (as xml) the "EstadoDTE" element
                 */
                public void xsetEstadoDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE estadoDTE)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE)get_store().find_element_user(ESTADODTE$14, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE)get_store().add_element_user(ESTADODTE$14);
                      }
                      target.set(estadoDTE);
                    }
                }
                
                /**
                 * Gets the "EstadoDTEGlosa" element
                 */
                public java.lang.String getEstadoDTEGlosa()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADODTEGLOSA$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "EstadoDTEGlosa" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa xgetEstadoDTEGlosa()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa)get_store().find_element_user(ESTADODTEGLOSA$16, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "EstadoDTEGlosa" element
                 */
                public void setEstadoDTEGlosa(java.lang.String estadoDTEGlosa)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADODTEGLOSA$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADODTEGLOSA$16);
                      }
                      target.setStringValue(estadoDTEGlosa);
                    }
                }
                
                /**
                 * Sets (as xml) the "EstadoDTEGlosa" element
                 */
                public void xsetEstadoDTEGlosa(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa estadoDTEGlosa)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa)get_store().find_element_user(ESTADODTEGLOSA$16, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa)get_store().add_element_user(ESTADODTEGLOSA$16);
                      }
                      target.set(estadoDTEGlosa);
                    }
                }
                
                /**
                 * Gets the "CodRchDsc" element
                 */
                public int getCodRchDsc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODRCHDSC$18, 0);
                      if (target == null)
                      {
                        return 0;
                      }
                      return target.getIntValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "CodRchDsc" element
                 */
                public cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc xgetCodRchDsc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc)get_store().find_element_user(CODRCHDSC$18, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "CodRchDsc" element
                 */
                public boolean isSetCodRchDsc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CODRCHDSC$18) != 0;
                    }
                }
                
                /**
                 * Sets the "CodRchDsc" element
                 */
                public void setCodRchDsc(int codRchDsc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODRCHDSC$18, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODRCHDSC$18);
                      }
                      target.setIntValue(codRchDsc);
                    }
                }
                
                /**
                 * Sets (as xml) the "CodRchDsc" element
                 */
                public void xsetCodRchDsc(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc codRchDsc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc target = null;
                      target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc)get_store().find_element_user(CODRCHDSC$18, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc)get_store().add_element_user(CODRCHDSC$18);
                      }
                      target.set(codRchDsc);
                    }
                }
                
                /**
                 * Unsets the "CodRchDsc" element
                 */
                public void unsetCodRchDsc()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CODRCHDSC$18, 0);
                    }
                }
                /**
                 * An XML CodEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$CodEnvio.
                 */
                public static class CodEnvioImpl extends org.apache.xmlbeans.impl.values.JavaLongHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CodEnvioImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CodEnvioImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML EstadoDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$EstadoDTE.
                 */
                public static class EstadoDTEImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EstadoDTEImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected EstadoDTEImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML EstadoDTEGlosa(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$EstadoDTEGlosa.
                 */
                public static class EstadoDTEGlosaImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa
                {
                    private static final long serialVersionUID = 1L;
                    
                    public EstadoDTEGlosaImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected EstadoDTEGlosaImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML CodRchDsc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$CodRchDsc.
                 */
                public static class CodRchDscImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CodRchDscImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CodRchDscImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
    }
}
