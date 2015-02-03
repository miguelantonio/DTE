/*
 * An XML document type.
 * Localname: RESULTADO_ENVIO
 * Namespace: 
 * Java type: noNamespace.RESULTADOENVIODocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace.impl;
/**
 * A document containing one RESULTADO_ENVIO(@) element.
 *
 * This is a complex type.
 */
public class RESULTADOENVIODocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument
{
    private static final long serialVersionUID = 1L;
    
    public RESULTADOENVIODocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RESULTADOENVIOExtensionHandler
      
     */
    public byte[] getBytes() throws java.io.IOException
    {
        return 
      cl.nic.dte.extension.RESULTADOENVIOExtensionHandler
      .getBytes(this);
    }
    
    /**
     * Implementation method for interface 
      cl.nic.dte.extension.RESULTADOENVIOExtensionHandler
      
     */
    public cl.nic.dte.VerifyResult verifyXML()
    {
        return 
      cl.nic.dte.extension.RESULTADOENVIOExtensionHandler
      .verifyXML(this);
    }
    
    private static final javax.xml.namespace.QName RESULTADOENVIO$0 = 
        new javax.xml.namespace.QName("", "RESULTADO_ENVIO");
    
    
    /**
     * Gets the "RESULTADO_ENVIO" element
     */
    public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO getRESULTADOENVIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO target = null;
            target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO)get_store().find_element_user(RESULTADOENVIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RESULTADO_ENVIO" element
     */
    public void setRESULTADOENVIO(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO resultadoenvio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO target = null;
            target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO)get_store().find_element_user(RESULTADOENVIO$0, 0);
            if (target == null)
            {
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO)get_store().add_element_user(RESULTADOENVIO$0);
            }
            target.set(resultadoenvio);
        }
    }
    
    /**
     * Appends and returns a new empty "RESULTADO_ENVIO" element
     */
    public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO addNewRESULTADOENVIO()
    {
        synchronized (monitor())
        {
            check_orphaned();
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO target = null;
            target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO)get_store().add_element_user(RESULTADOENVIO$0);
            return target;
        }
    }
    /**
     * An XML RESULTADO_ENVIO(@).
     *
     * This is a complex type.
     */
    public static class RESULTADOENVIOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO
    {
        private static final long serialVersionUID = 1L;
        
        public RESULTADOENVIOImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFICACION$0 = 
            new javax.xml.namespace.QName("", "IDENTIFICACION");
        private static final javax.xml.namespace.QName ESTADISTICA$2 = 
            new javax.xml.namespace.QName("", "ESTADISTICA");
        private static final javax.xml.namespace.QName ERRORENVIO$4 = 
            new javax.xml.namespace.QName("", "ERRORENVIO");
        private static final javax.xml.namespace.QName REVISIONENVIO$6 = 
            new javax.xml.namespace.QName("", "REVISIONENVIO");
        
        
        /**
         * Gets the "IDENTIFICACION" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION getIDENTIFICACION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION)get_store().find_element_user(IDENTIFICACION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "IDENTIFICACION" element
         */
        public void setIDENTIFICACION(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION identificacion)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION)get_store().find_element_user(IDENTIFICACION$0, 0);
                if (target == null)
                {
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION)get_store().add_element_user(IDENTIFICACION$0);
                }
                target.set(identificacion);
            }
        }
        
        /**
         * Appends and returns a new empty "IDENTIFICACION" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION addNewIDENTIFICACION()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION)get_store().add_element_user(IDENTIFICACION$0);
                return target;
            }
        }
        
        /**
         * Gets the "ESTADISTICA" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA getESTADISTICA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA)get_store().find_element_user(ESTADISTICA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ESTADISTICA" element
         */
        public boolean isSetESTADISTICA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ESTADISTICA$2) != 0;
            }
        }
        
        /**
         * Sets the "ESTADISTICA" element
         */
        public void setESTADISTICA(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA estadistica)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA)get_store().find_element_user(ESTADISTICA$2, 0);
                if (target == null)
                {
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA)get_store().add_element_user(ESTADISTICA$2);
                }
                target.set(estadistica);
            }
        }
        
        /**
         * Appends and returns a new empty "ESTADISTICA" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA addNewESTADISTICA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA)get_store().add_element_user(ESTADISTICA$2);
                return target;
            }
        }
        
        /**
         * Unsets the "ESTADISTICA" element
         */
        public void unsetESTADISTICA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ESTADISTICA$2, 0);
            }
        }
        
        /**
         * Gets the "ERRORENVIO" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO getERRORENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO)get_store().find_element_user(ERRORENVIO$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "ERRORENVIO" element
         */
        public boolean isSetERRORENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ERRORENVIO$4) != 0;
            }
        }
        
        /**
         * Sets the "ERRORENVIO" element
         */
        public void setERRORENVIO(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO errorenvio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO)get_store().find_element_user(ERRORENVIO$4, 0);
                if (target == null)
                {
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO)get_store().add_element_user(ERRORENVIO$4);
                }
                target.set(errorenvio);
            }
        }
        
        /**
         * Appends and returns a new empty "ERRORENVIO" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO addNewERRORENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO)get_store().add_element_user(ERRORENVIO$4);
                return target;
            }
        }
        
        /**
         * Unsets the "ERRORENVIO" element
         */
        public void unsetERRORENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ERRORENVIO$4, 0);
            }
        }
        
        /**
         * Gets the "REVISIONENVIO" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO getREVISIONENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO)get_store().find_element_user(REVISIONENVIO$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "REVISIONENVIO" element
         */
        public boolean isSetREVISIONENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REVISIONENVIO$6) != 0;
            }
        }
        
        /**
         * Sets the "REVISIONENVIO" element
         */
        public void setREVISIONENVIO(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO revisionenvio)
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO)get_store().find_element_user(REVISIONENVIO$6, 0);
                if (target == null)
                {
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO)get_store().add_element_user(REVISIONENVIO$6);
                }
                target.set(revisionenvio);
            }
        }
        
        /**
         * Appends and returns a new empty "REVISIONENVIO" element
         */
        public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO addNewREVISIONENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO target = null;
                target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO)get_store().add_element_user(REVISIONENVIO$6);
                return target;
            }
        }
        
        /**
         * Unsets the "REVISIONENVIO" element
         */
        public void unsetREVISIONENVIO()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REVISIONENVIO$6, 0);
            }
        }
        /**
         * An XML IDENTIFICACION(@).
         *
         * This is a complex type.
         */
        public static class IDENTIFICACIONImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION
        {
            private static final long serialVersionUID = 1L;
            
            public IDENTIFICACIONImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RUTEMISOR$0 = 
                new javax.xml.namespace.QName("", "RUTEMISOR");
            private static final javax.xml.namespace.QName RUTENVIA$2 = 
                new javax.xml.namespace.QName("", "RUTENVIA");
            private static final javax.xml.namespace.QName TRACKID$4 = 
                new javax.xml.namespace.QName("", "TRACKID");
            private static final javax.xml.namespace.QName TMSTRECEPCION$6 = 
                new javax.xml.namespace.QName("", "TMSTRECEPCION");
            private static final javax.xml.namespace.QName ESTADO$8 = 
                new javax.xml.namespace.QName("", "ESTADO");
            
            
            /**
             * Gets the "RUTEMISOR" element
             */
            public java.lang.String getRUTEMISOR()
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
             * Gets (as xml) the "RUTEMISOR" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR xgetRUTEMISOR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR)get_store().find_element_user(RUTEMISOR$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RUTEMISOR" element
             */
            public void setRUTEMISOR(java.lang.String rutemisor)
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
                    target.setStringValue(rutemisor);
                }
            }
            
            /**
             * Sets (as xml) the "RUTEMISOR" element
             */
            public void xsetRUTEMISOR(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR rutemisor)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR)get_store().find_element_user(RUTEMISOR$0, 0);
                    if (target == null)
                    {
                      target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR)get_store().add_element_user(RUTEMISOR$0);
                    }
                    target.set(rutemisor);
                }
            }
            
            /**
             * Gets the "RUTENVIA" element
             */
            public java.lang.String getRUTENVIA()
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
             * Gets (as xml) the "RUTENVIA" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA xgetRUTENVIA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA)get_store().find_element_user(RUTENVIA$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "RUTENVIA" element
             */
            public void setRUTENVIA(java.lang.String rutenvia)
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
                    target.setStringValue(rutenvia);
                }
            }
            
            /**
             * Sets (as xml) the "RUTENVIA" element
             */
            public void xsetRUTENVIA(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA rutenvia)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA)get_store().find_element_user(RUTENVIA$2, 0);
                    if (target == null)
                    {
                      target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA)get_store().add_element_user(RUTENVIA$2);
                    }
                    target.set(rutenvia);
                }
            }
            
            /**
             * Gets the "TRACKID" element
             */
            public long getTRACKID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$4, 0);
                    if (target == null)
                    {
                      return 0L;
                    }
                    return target.getLongValue();
                }
            }
            
            /**
             * Gets (as xml) the "TRACKID" element
             */
            public noNamespace.EnteroType xgetTRACKID()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnteroType target = null;
                    target = (noNamespace.EnteroType)get_store().find_element_user(TRACKID$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TRACKID" element
             */
            public void setTRACKID(long trackid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKID$4);
                    }
                    target.setLongValue(trackid);
                }
            }
            
            /**
             * Sets (as xml) the "TRACKID" element
             */
            public void xsetTRACKID(noNamespace.EnteroType trackid)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.EnteroType target = null;
                    target = (noNamespace.EnteroType)get_store().find_element_user(TRACKID$4, 0);
                    if (target == null)
                    {
                      target = (noNamespace.EnteroType)get_store().add_element_user(TRACKID$4);
                    }
                    target.set(trackid);
                }
            }
            
            /**
             * Gets the "TMSTRECEPCION" element
             */
            public java.lang.String getTMSTRECEPCION()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TMSTRECEPCION" element
             */
            public org.apache.xmlbeans.XmlString xgetTMSTRECEPCION()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "TMSTRECEPCION" element
             */
            public void setTMSTRECEPCION(java.lang.String tmstrecepcion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TMSTRECEPCION$6);
                    }
                    target.setStringValue(tmstrecepcion);
                }
            }
            
            /**
             * Sets (as xml) the "TMSTRECEPCION" element
             */
            public void xsetTMSTRECEPCION(org.apache.xmlbeans.XmlString tmstrecepcion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TMSTRECEPCION$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TMSTRECEPCION$6);
                    }
                    target.set(tmstrecepcion);
                }
            }
            
            /**
             * Gets the "ESTADO" element
             */
            public java.lang.String getESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ESTADO" element
             */
            public org.apache.xmlbeans.XmlString xgetESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADO$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ESTADO" element
             */
            public void setESTADO(java.lang.String estado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADO$8);
                    }
                    target.setStringValue(estado);
                }
            }
            
            /**
             * Sets (as xml) the "ESTADO" element
             */
            public void xsetESTADO(org.apache.xmlbeans.XmlString estado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADO$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTADO$8);
                    }
                    target.set(estado);
                }
            }
            /**
             * An XML RUTEMISOR(@).
             *
             * This is an atomic type that is a restriction of noNamespace.RESULTADOENVIODocument$RESULTADOENVIO$IDENTIFICACION$RUTEMISOR.
             */
            public static class RUTEMISORImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR
            {
                private static final long serialVersionUID = 1L;
                
                public RUTEMISORImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RUTEMISORImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML RUTENVIA(@).
             *
             * This is an atomic type that is a restriction of noNamespace.RESULTADOENVIODocument$RESULTADOENVIO$IDENTIFICACION$RUTENVIA.
             */
            public static class RUTENVIAImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA
            {
                private static final long serialVersionUID = 1L;
                
                public RUTENVIAImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RUTENVIAImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML ESTADISTICA(@).
         *
         * This is a complex type.
         */
        public static class ESTADISTICAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA
        {
            private static final long serialVersionUID = 1L;
            
            public ESTADISTICAImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName SUBTOTAL$0 = 
                new javax.xml.namespace.QName("", "SUBTOTAL");
            
            
            /**
             * Gets array of all "SUBTOTAL" elements
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL[] getSUBTOTALArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(SUBTOTAL$0, targetList);
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL[] result = new noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "SUBTOTAL" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL getSUBTOTALArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL)get_store().find_element_user(SUBTOTAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "SUBTOTAL" element
             */
            public int sizeOfSUBTOTALArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SUBTOTAL$0);
                }
            }
            
            /**
             * Sets array of all "SUBTOTAL" element
             */
            public void setSUBTOTALArray(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL[] subtotalArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(subtotalArray, SUBTOTAL$0);
                }
            }
            
            /**
             * Sets ith "SUBTOTAL" element
             */
            public void setSUBTOTALArray(int i, noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL subtotal)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL)get_store().find_element_user(SUBTOTAL$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(subtotal);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SUBTOTAL" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL insertNewSUBTOTAL(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL)get_store().insert_element_user(SUBTOTAL$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SUBTOTAL" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL addNewSUBTOTAL()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL)get_store().add_element_user(SUBTOTAL$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "SUBTOTAL" element
             */
            public void removeSUBTOTAL(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SUBTOTAL$0, i);
                }
            }
            /**
             * An XML SUBTOTAL(@).
             *
             * This is a complex type.
             */
            public static class SUBTOTALImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL
            {
                private static final long serialVersionUID = 1L;
                
                public SUBTOTALImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TIPODOC$0 = 
                    new javax.xml.namespace.QName("", "TIPODOC");
                private static final javax.xml.namespace.QName INFORMADO$2 = 
                    new javax.xml.namespace.QName("", "INFORMADO");
                private static final javax.xml.namespace.QName RECHAZO$4 = 
                    new javax.xml.namespace.QName("", "RECHAZO");
                private static final javax.xml.namespace.QName REPARO$6 = 
                    new javax.xml.namespace.QName("", "REPARO");
                private static final javax.xml.namespace.QName ACEPTA$8 = 
                    new javax.xml.namespace.QName("", "ACEPTA");
                
                
                /**
                 * Gets the "TIPODOC" element
                 */
                public java.math.BigInteger getTIPODOC()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOC$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TIPODOC" element
                 */
                public noNamespace.DTEType xgetTIPODOC()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DTEType target = null;
                      target = (noNamespace.DTEType)get_store().find_element_user(TIPODOC$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TIPODOC" element
                 */
                public void setTIPODOC(java.math.BigInteger tipodoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOC$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOC$0);
                      }
                      target.setBigIntegerValue(tipodoc);
                    }
                }
                
                /**
                 * Sets (as xml) the "TIPODOC" element
                 */
                public void xsetTIPODOC(noNamespace.DTEType tipodoc)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DTEType target = null;
                      target = (noNamespace.DTEType)get_store().find_element_user(TIPODOC$0, 0);
                      if (target == null)
                      {
                        target = (noNamespace.DTEType)get_store().add_element_user(TIPODOC$0);
                      }
                      target.set(tipodoc);
                    }
                }
                
                /**
                 * Gets the "INFORMADO" element
                 */
                public long getINFORMADO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMADO$2, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "INFORMADO" element
                 */
                public noNamespace.EnteroType xgetINFORMADO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(INFORMADO$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "INFORMADO" element
                 */
                public void setINFORMADO(long informado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INFORMADO$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INFORMADO$2);
                      }
                      target.setLongValue(informado);
                    }
                }
                
                /**
                 * Sets (as xml) the "INFORMADO" element
                 */
                public void xsetINFORMADO(noNamespace.EnteroType informado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(INFORMADO$2, 0);
                      if (target == null)
                      {
                        target = (noNamespace.EnteroType)get_store().add_element_user(INFORMADO$2);
                      }
                      target.set(informado);
                    }
                }
                
                /**
                 * Gets the "RECHAZO" element
                 */
                public long getRECHAZO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECHAZO$4, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "RECHAZO" element
                 */
                public noNamespace.EnteroType xgetRECHAZO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(RECHAZO$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "RECHAZO" element
                 */
                public boolean isSetRECHAZO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(RECHAZO$4) != 0;
                    }
                }
                
                /**
                 * Sets the "RECHAZO" element
                 */
                public void setRECHAZO(long rechazo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RECHAZO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RECHAZO$4);
                      }
                      target.setLongValue(rechazo);
                    }
                }
                
                /**
                 * Sets (as xml) the "RECHAZO" element
                 */
                public void xsetRECHAZO(noNamespace.EnteroType rechazo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(RECHAZO$4, 0);
                      if (target == null)
                      {
                        target = (noNamespace.EnteroType)get_store().add_element_user(RECHAZO$4);
                      }
                      target.set(rechazo);
                    }
                }
                
                /**
                 * Unsets the "RECHAZO" element
                 */
                public void unsetRECHAZO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(RECHAZO$4, 0);
                    }
                }
                
                /**
                 * Gets the "REPARO" element
                 */
                public long getREPARO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPARO$6, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "REPARO" element
                 */
                public noNamespace.EnteroType xgetREPARO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(REPARO$6, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "REPARO" element
                 */
                public boolean isSetREPARO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(REPARO$6) != 0;
                    }
                }
                
                /**
                 * Sets the "REPARO" element
                 */
                public void setREPARO(long reparo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPARO$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPARO$6);
                      }
                      target.setLongValue(reparo);
                    }
                }
                
                /**
                 * Sets (as xml) the "REPARO" element
                 */
                public void xsetREPARO(noNamespace.EnteroType reparo)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(REPARO$6, 0);
                      if (target == null)
                      {
                        target = (noNamespace.EnteroType)get_store().add_element_user(REPARO$6);
                      }
                      target.set(reparo);
                    }
                }
                
                /**
                 * Unsets the "REPARO" element
                 */
                public void unsetREPARO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(REPARO$6, 0);
                    }
                }
                
                /**
                 * Gets the "ACEPTA" element
                 */
                public long getACEPTA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACEPTA$8, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ACEPTA" element
                 */
                public noNamespace.EnteroType xgetACEPTA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(ACEPTA$8, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "ACEPTA" element
                 */
                public boolean isSetACEPTA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(ACEPTA$8) != 0;
                    }
                }
                
                /**
                 * Sets the "ACEPTA" element
                 */
                public void setACEPTA(long acepta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACEPTA$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACEPTA$8);
                      }
                      target.setLongValue(acepta);
                    }
                }
                
                /**
                 * Sets (as xml) the "ACEPTA" element
                 */
                public void xsetACEPTA(noNamespace.EnteroType acepta)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(ACEPTA$8, 0);
                      if (target == null)
                      {
                        target = (noNamespace.EnteroType)get_store().add_element_user(ACEPTA$8);
                      }
                      target.set(acepta);
                    }
                }
                
                /**
                 * Unsets the "ACEPTA" element
                 */
                public void unsetACEPTA()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(ACEPTA$8, 0);
                    }
                }
            }
        }
        /**
         * An XML ERRORENVIO(@).
         *
         * This is a complex type.
         */
        public static class ERRORENVIOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO
        {
            private static final long serialVersionUID = 1L;
            
            public ERRORENVIOImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName DETERRENVIO$0 = 
                new javax.xml.namespace.QName("", "DETERRENVIO");
            
            
            /**
             * Gets array of all "DETERRENVIO" elements
             */
            public java.lang.String[] getDETERRENVIOArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETERRENVIO$0, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "DETERRENVIO" element
             */
            public java.lang.String getDETERRENVIOArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "DETERRENVIO" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetDETERRENVIOArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(DETERRENVIO$0, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "DETERRENVIO" element
             */
            public org.apache.xmlbeans.XmlString xgetDETERRENVIOArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "DETERRENVIO" element
             */
            public int sizeOfDETERRENVIOArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DETERRENVIO$0);
                }
            }
            
            /**
             * Sets array of all "DETERRENVIO" element
             */
            public void setDETERRENVIOArray(java.lang.String[] deterrenvioArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(deterrenvioArray, DETERRENVIO$0);
                }
            }
            
            /**
             * Sets ith "DETERRENVIO" element
             */
            public void setDETERRENVIOArray(int i, java.lang.String deterrenvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(deterrenvio);
                }
            }
            
            /**
             * Sets (as xml) array of all "DETERRENVIO" element
             */
            public void xsetDETERRENVIOArray(org.apache.xmlbeans.XmlString[]deterrenvioArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(deterrenvioArray, DETERRENVIO$0);
                }
            }
            
            /**
             * Sets (as xml) ith "DETERRENVIO" element
             */
            public void xsetDETERRENVIOArray(int i, org.apache.xmlbeans.XmlString deterrenvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETERRENVIO$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(deterrenvio);
                }
            }
            
            /**
             * Inserts the value as the ith "DETERRENVIO" element
             */
            public void insertDETERRENVIO(int i, java.lang.String deterrenvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DETERRENVIO$0, i);
                    target.setStringValue(deterrenvio);
                }
            }
            
            /**
             * Appends the value as the last "DETERRENVIO" element
             */
            public void addDETERRENVIO(java.lang.String deterrenvio)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETERRENVIO$0);
                    target.setStringValue(deterrenvio);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DETERRENVIO" element
             */
            public org.apache.xmlbeans.XmlString insertNewDETERRENVIO(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DETERRENVIO$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DETERRENVIO" element
             */
            public org.apache.xmlbeans.XmlString addNewDETERRENVIO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETERRENVIO$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "DETERRENVIO" element
             */
            public void removeDETERRENVIO(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DETERRENVIO$0, i);
                }
            }
        }
        /**
         * An XML REVISIONENVIO(@).
         *
         * This is a complex type.
         */
        public static class REVISIONENVIOImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO
        {
            private static final long serialVersionUID = 1L;
            
            public REVISIONENVIOImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REVISIONDTE$0 = 
                new javax.xml.namespace.QName("", "REVISIONDTE");
            
            
            /**
             * Gets array of all "REVISIONDTE" elements
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE[] getREVISIONDTEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(REVISIONDTE$0, targetList);
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE[] result = new noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "REVISIONDTE" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE getREVISIONDTEArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE)get_store().find_element_user(REVISIONDTE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "REVISIONDTE" element
             */
            public int sizeOfREVISIONDTEArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REVISIONDTE$0);
                }
            }
            
            /**
             * Sets array of all "REVISIONDTE" element
             */
            public void setREVISIONDTEArray(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE[] revisiondteArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(revisiondteArray, REVISIONDTE$0);
                }
            }
            
            /**
             * Sets ith "REVISIONDTE" element
             */
            public void setREVISIONDTEArray(int i, noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE revisiondte)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE)get_store().find_element_user(REVISIONDTE$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(revisiondte);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "REVISIONDTE" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE insertNewREVISIONDTE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE)get_store().insert_element_user(REVISIONDTE$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "REVISIONDTE" element
             */
            public noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE addNewREVISIONDTE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE target = null;
                    target = (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE)get_store().add_element_user(REVISIONDTE$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "REVISIONDTE" element
             */
            public void removeREVISIONDTE(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REVISIONDTE$0, i);
                }
            }
            /**
             * An XML REVISIONDTE(@).
             *
             * This is a complex type.
             */
            public static class REVISIONDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE
            {
                private static final long serialVersionUID = 1L;
                
                public REVISIONDTEImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName FOLIO$0 = 
                    new javax.xml.namespace.QName("", "FOLIO");
                private static final javax.xml.namespace.QName TIPODTE$2 = 
                    new javax.xml.namespace.QName("", "TIPODTE");
                private static final javax.xml.namespace.QName ESTADO$4 = 
                    new javax.xml.namespace.QName("", "ESTADO");
                private static final javax.xml.namespace.QName DETALLE$6 = 
                    new javax.xml.namespace.QName("", "DETALLE");
                
                
                /**
                 * Gets the "FOLIO" element
                 */
                public long getFOLIO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$0, 0);
                      if (target == null)
                      {
                        return 0L;
                      }
                      return target.getLongValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "FOLIO" element
                 */
                public noNamespace.EnteroType xgetFOLIO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(FOLIO$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "FOLIO" element
                 */
                public void setFOLIO(long folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOLIO$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOLIO$0);
                      }
                      target.setLongValue(folio);
                    }
                }
                
                /**
                 * Sets (as xml) the "FOLIO" element
                 */
                public void xsetFOLIO(noNamespace.EnteroType folio)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.EnteroType target = null;
                      target = (noNamespace.EnteroType)get_store().find_element_user(FOLIO$0, 0);
                      if (target == null)
                      {
                        target = (noNamespace.EnteroType)get_store().add_element_user(FOLIO$0);
                      }
                      target.set(folio);
                    }
                }
                
                /**
                 * Gets the "TIPODTE" element
                 */
                public java.math.BigInteger getTIPODTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getBigIntegerValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "TIPODTE" element
                 */
                public noNamespace.DTEType xgetTIPODTE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DTEType target = null;
                      target = (noNamespace.DTEType)get_store().find_element_user(TIPODTE$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "TIPODTE" element
                 */
                public void setTIPODTE(java.math.BigInteger tipodte)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODTE$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODTE$2);
                      }
                      target.setBigIntegerValue(tipodte);
                    }
                }
                
                /**
                 * Sets (as xml) the "TIPODTE" element
                 */
                public void xsetTIPODTE(noNamespace.DTEType tipodte)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      noNamespace.DTEType target = null;
                      target = (noNamespace.DTEType)get_store().find_element_user(TIPODTE$2, 0);
                      if (target == null)
                      {
                        target = (noNamespace.DTEType)get_store().add_element_user(TIPODTE$2);
                      }
                      target.set(tipodte);
                    }
                }
                
                /**
                 * Gets the "ESTADO" element
                 */
                public java.lang.String getESTADO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ESTADO" element
                 */
                public org.apache.xmlbeans.XmlString xgetESTADO()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADO$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ESTADO" element
                 */
                public void setESTADO(java.lang.String estado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADO$4);
                      }
                      target.setStringValue(estado);
                    }
                }
                
                /**
                 * Sets (as xml) the "ESTADO" element
                 */
                public void xsetESTADO(org.apache.xmlbeans.XmlString estado)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ESTADO$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ESTADO$4);
                      }
                      target.set(estado);
                    }
                }
                
                /**
                 * Gets array of all "DETALLE" elements
                 */
                public java.lang.String[] getDETALLEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DETALLE$6, targetList);
                      java.lang.String[] result = new java.lang.String[targetList.size()];
                      for (int i = 0, len = targetList.size() ; i < len ; i++)
                          result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                      return result;
                    }
                }
                
                /**
                 * Gets ith "DETALLE" element
                 */
                public java.lang.String getDETALLEArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETALLE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) array of all "DETALLE" elements
                 */
                public org.apache.xmlbeans.XmlString[] xgetDETALLEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(DETALLE$6, targetList);
                      org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets (as xml) ith "DETALLE" element
                 */
                public org.apache.xmlbeans.XmlString xgetDETALLEArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETALLE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return (org.apache.xmlbeans.XmlString)target;
                    }
                }
                
                /**
                 * Returns number of "DETALLE" element
                 */
                public int sizeOfDETALLEArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DETALLE$6);
                    }
                }
                
                /**
                 * Sets array of all "DETALLE" element
                 */
                public void setDETALLEArray(java.lang.String[] detalleArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(detalleArray, DETALLE$6);
                    }
                }
                
                /**
                 * Sets ith "DETALLE" element
                 */
                public void setDETALLEArray(int i, java.lang.String detalle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DETALLE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.setStringValue(detalle);
                    }
                }
                
                /**
                 * Sets (as xml) array of all "DETALLE" element
                 */
                public void xsetDETALLEArray(org.apache.xmlbeans.XmlString[]detalleArray)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      arraySetterHelper(detalleArray, DETALLE$6);
                    }
                }
                
                /**
                 * Sets (as xml) ith "DETALLE" element
                 */
                public void xsetDETALLEArray(int i, org.apache.xmlbeans.XmlString detalle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DETALLE$6, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      target.set(detalle);
                    }
                }
                
                /**
                 * Inserts the value as the ith "DETALLE" element
                 */
                public void insertDETALLE(int i, java.lang.String detalle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = 
                        (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(DETALLE$6, i);
                      target.setStringValue(detalle);
                    }
                }
                
                /**
                 * Appends the value as the last "DETALLE" element
                 */
                public void addDETALLE(java.lang.String detalle)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DETALLE$6);
                      target.setStringValue(detalle);
                    }
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "DETALLE" element
                 */
                public org.apache.xmlbeans.XmlString insertNewDETALLE(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(DETALLE$6, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "DETALLE" element
                 */
                public org.apache.xmlbeans.XmlString addNewDETALLE()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DETALLE$6);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "DETALLE" element
                 */
                public void removeDETALLE(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DETALLE$6, i);
                    }
                }
            }
        }
    }
}
