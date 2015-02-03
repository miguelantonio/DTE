/*
 * An XML document type.
 * Localname: RESPUESTA
 * Namespace: http://www.sii.cl/XMLSchema
 * Java type: cl.sii.xmlSchema.RESPUESTADocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.xmlSchema.impl;
/**
 * A document containing one RESPUESTA(@http://www.sii.cl/XMLSchema) element.
 *
 * This is a complex type.
 */
public class RESPUESTADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.xmlSchema.RESPUESTADocument
{
    private static final long serialVersionUID = 1L;
    
    public RESPUESTADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESPUESTA$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "RESPUESTA");
    
    
    /**
     * Gets the "RESPUESTA" element
     */
    public cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA getRESPUESTA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA target = null;
            target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA)get_store().find_element_user(RESPUESTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RESPUESTA" element
     */
    public void setRESPUESTA(cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA respuesta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA target = null;
            target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA)get_store().find_element_user(RESPUESTA$0, 0);
            if (target == null)
            {
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA)get_store().add_element_user(RESPUESTA$0);
            }
            target.set(respuesta);
        }
    }
    
    /**
     * Appends and returns a new empty "RESPUESTA" element
     */
    public cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA addNewRESPUESTA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA target = null;
            target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA)get_store().add_element_user(RESPUESTA$0);
            return target;
        }
    }
    /**
     * An XML RESPUESTA(@http://www.sii.cl/XMLSchema).
     *
     * This is a complex type.
     */
    public static class RESPUESTAImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA
    {
        private static final long serialVersionUID = 1L;
        
        public RESPUESTAImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESPBODY$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "RESP_BODY");
        private static final javax.xml.namespace.QName RESPHDR$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "RESP_HDR");
        
        
        /**
         * Gets the "RESP_BODY" element
         */
        public cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY getRESPBODY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY target = null;
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY)get_store().find_element_user(RESPBODY$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RESP_BODY" element
         */
        public void setRESPBODY(cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY respbody)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY target = null;
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY)get_store().find_element_user(RESPBODY$0, 0);
                if (target == null)
                {
                    target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY)get_store().add_element_user(RESPBODY$0);
                }
                target.set(respbody);
            }
        }
        
        /**
         * Appends and returns a new empty "RESP_BODY" element
         */
        public cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY addNewRESPBODY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY target = null;
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY)get_store().add_element_user(RESPBODY$0);
                return target;
            }
        }
        
        /**
         * Gets the "RESP_HDR" element
         */
        public cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR getRESPHDR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR target = null;
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR)get_store().find_element_user(RESPHDR$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "RESP_HDR" element
         */
        public void setRESPHDR(cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR resphdr)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR target = null;
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR)get_store().find_element_user(RESPHDR$2, 0);
                if (target == null)
                {
                    target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR)get_store().add_element_user(RESPHDR$2);
                }
                target.set(resphdr);
            }
        }
        
        /**
         * Appends and returns a new empty "RESP_HDR" element
         */
        public cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR addNewRESPHDR()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR target = null;
                target = (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR)get_store().add_element_user(RESPHDR$2);
                return target;
            }
        }
        /**
         * An XML RESP_BODY(@http://www.sii.cl/XMLSchema).
         *
         * This is a complex type.
         */
        public static class RESPBODYImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY
        {
            private static final long serialVersionUID = 1L;
            
            public RESPBODYImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TOKEN$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "TOKEN");
            private static final javax.xml.namespace.QName SEMILLA$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "SEMILLA");
            
            
            /**
             * Gets the "TOKEN" element
             */
            public java.lang.String getTOKEN()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKEN$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "TOKEN" element
             */
            public org.apache.xmlbeans.XmlString xgetTOKEN()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKEN$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "TOKEN" element
             */
            public boolean isSetTOKEN()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TOKEN$0) != 0;
                }
            }
            
            /**
             * Sets the "TOKEN" element
             */
            public void setTOKEN(java.lang.String token)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOKEN$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOKEN$0);
                    }
                    target.setStringValue(token);
                }
            }
            
            /**
             * Sets (as xml) the "TOKEN" element
             */
            public void xsetTOKEN(org.apache.xmlbeans.XmlString token)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOKEN$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOKEN$0);
                    }
                    target.set(token);
                }
            }
            
            /**
             * Unsets the "TOKEN" element
             */
            public void unsetTOKEN()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TOKEN$0, 0);
                }
            }
            
            /**
             * Gets the "SEMILLA" element
             */
            public java.lang.String getSEMILLA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEMILLA$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "SEMILLA" element
             */
            public org.apache.xmlbeans.XmlString xgetSEMILLA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEMILLA$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "SEMILLA" element
             */
            public boolean isSetSEMILLA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SEMILLA$2) != 0;
                }
            }
            
            /**
             * Sets the "SEMILLA" element
             */
            public void setSEMILLA(java.lang.String semilla)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEMILLA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEMILLA$2);
                    }
                    target.setStringValue(semilla);
                }
            }
            
            /**
             * Sets (as xml) the "SEMILLA" element
             */
            public void xsetSEMILLA(org.apache.xmlbeans.XmlString semilla)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SEMILLA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SEMILLA$2);
                    }
                    target.set(semilla);
                }
            }
            
            /**
             * Unsets the "SEMILLA" element
             */
            public void unsetSEMILLA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SEMILLA$2, 0);
                }
            }
        }
        /**
         * An XML RESP_HDR(@http://www.sii.cl/XMLSchema).
         *
         * This is a complex type.
         */
        public static class RESPHDRImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR
        {
            private static final long serialVersionUID = 1L;
            
            public RESPHDRImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ESTADO$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "ESTADO");
            private static final javax.xml.namespace.QName GLOSA$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "GLOSA");
            private static final javax.xml.namespace.QName GLOSAESTADO$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "GLOSA_ESTADO");
            private static final javax.xml.namespace.QName ERRCODE$6 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "ERR_CODE");
            private static final javax.xml.namespace.QName NUMATENCION$8 = 
                new javax.xml.namespace.QName("http://www.sii.cl/XMLSchema", "NUM_ATENCION");
            
            
            /**
             * Gets the "ESTADO" element
             */
            public int getESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$0, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "ESTADO" element
             */
            public org.apache.xmlbeans.XmlInt xgetESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ESTADO$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "ESTADO" element
             */
            public void setESTADO(int estado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESTADO$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESTADO$0);
                    }
                    target.setIntValue(estado);
                }
            }
            
            /**
             * Sets (as xml) the "ESTADO" element
             */
            public void xsetESTADO(org.apache.xmlbeans.XmlInt estado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ESTADO$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ESTADO$0);
                    }
                    target.set(estado);
                }
            }
            
            /**
             * Gets the "GLOSA" element
             */
            public java.lang.String getGLOSA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSA$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "GLOSA" element
             */
            public org.apache.xmlbeans.XmlString xgetGLOSA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOSA$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "GLOSA" element
             */
            public boolean isSetGLOSA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GLOSA$2) != 0;
                }
            }
            
            /**
             * Sets the "GLOSA" element
             */
            public void setGLOSA(java.lang.String glosa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOSA$2);
                    }
                    target.setStringValue(glosa);
                }
            }
            
            /**
             * Sets (as xml) the "GLOSA" element
             */
            public void xsetGLOSA(org.apache.xmlbeans.XmlString glosa)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOSA$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLOSA$2);
                    }
                    target.set(glosa);
                }
            }
            
            /**
             * Unsets the "GLOSA" element
             */
            public void unsetGLOSA()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GLOSA$2, 0);
                }
            }
            
            /**
             * Gets the "GLOSA_ESTADO" element
             */
            public java.lang.String getGLOSAESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSAESTADO$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "GLOSA_ESTADO" element
             */
            public org.apache.xmlbeans.XmlString xgetGLOSAESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOSAESTADO$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "GLOSA_ESTADO" element
             */
            public boolean isSetGLOSAESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(GLOSAESTADO$4) != 0;
                }
            }
            
            /**
             * Sets the "GLOSA_ESTADO" element
             */
            public void setGLOSAESTADO(java.lang.String glosaestado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GLOSAESTADO$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GLOSAESTADO$4);
                    }
                    target.setStringValue(glosaestado);
                }
            }
            
            /**
             * Sets (as xml) the "GLOSA_ESTADO" element
             */
            public void xsetGLOSAESTADO(org.apache.xmlbeans.XmlString glosaestado)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(GLOSAESTADO$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(GLOSAESTADO$4);
                    }
                    target.set(glosaestado);
                }
            }
            
            /**
             * Unsets the "GLOSA_ESTADO" element
             */
            public void unsetGLOSAESTADO()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(GLOSAESTADO$4, 0);
                }
            }
            
            /**
             * Gets the "ERR_CODE" element
             */
            public int getERRCODE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRCODE$6, 0);
                    if (target == null)
                    {
                      return 0;
                    }
                    return target.getIntValue();
                }
            }
            
            /**
             * Gets (as xml) the "ERR_CODE" element
             */
            public org.apache.xmlbeans.XmlInt xgetERRCODE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRCODE$6, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ERR_CODE" element
             */
            public boolean isSetERRCODE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ERRCODE$6) != 0;
                }
            }
            
            /**
             * Sets the "ERR_CODE" element
             */
            public void setERRCODE(int errcode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRCODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRCODE$6);
                    }
                    target.setIntValue(errcode);
                }
            }
            
            /**
             * Sets (as xml) the "ERR_CODE" element
             */
            public void xsetERRCODE(org.apache.xmlbeans.XmlInt errcode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlInt target = null;
                    target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ERRCODE$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ERRCODE$6);
                    }
                    target.set(errcode);
                }
            }
            
            /**
             * Unsets the "ERR_CODE" element
             */
            public void unsetERRCODE()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ERRCODE$6, 0);
                }
            }
            
            /**
             * Gets the "NUM_ATENCION" element
             */
            public java.lang.String getNUMATENCION()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMATENCION$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "NUM_ATENCION" element
             */
            public org.apache.xmlbeans.XmlString xgetNUMATENCION()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMATENCION$8, 0);
                    return target;
                }
            }
            
            /**
             * True if has "NUM_ATENCION" element
             */
            public boolean isSetNUMATENCION()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NUMATENCION$8) != 0;
                }
            }
            
            /**
             * Sets the "NUM_ATENCION" element
             */
            public void setNUMATENCION(java.lang.String numatencion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMATENCION$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMATENCION$8);
                    }
                    target.setStringValue(numatencion);
                }
            }
            
            /**
             * Sets (as xml) the "NUM_ATENCION" element
             */
            public void xsetNUMATENCION(org.apache.xmlbeans.XmlString numatencion)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMATENCION$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMATENCION$8);
                    }
                    target.set(numatencion);
                }
            }
            
            /**
             * Unsets the "NUM_ATENCION" element
             */
            public void unsetNUMATENCION()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NUMATENCION$8, 0);
                }
            }
        }
    }
}
