/*
 * An XML document type.
 * Localname: RESPUESTA
 * Namespace: http://www.sii.cl/XMLSchema
 * Java type: cl.sii.xmlSchema.RESPUESTADocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.xmlSchema;


/**
 * A document containing one RESPUESTA(@http://www.sii.cl/XMLSchema) element.
 *
 * This is a complex type.
 */
public interface RESPUESTADocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESPUESTADocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("respuestac69ddoctype");
    
    /**
     * Gets the "RESPUESTA" element
     */
    cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA getRESPUESTA();
    
    /**
     * Sets the "RESPUESTA" element
     */
    void setRESPUESTA(cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA respuesta);
    
    /**
     * Appends and returns a new empty "RESPUESTA" element
     */
    cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA addNewRESPUESTA();
    
    /**
     * An XML RESPUESTA(@http://www.sii.cl/XMLSchema).
     *
     * This is a complex type.
     */
    public interface RESPUESTA extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESPUESTA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("respuestae8a9elemtype");
        
        /**
         * Gets the "RESP_BODY" element
         */
        cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY getRESPBODY();
        
        /**
         * Sets the "RESP_BODY" element
         */
        void setRESPBODY(cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY respbody);
        
        /**
         * Appends and returns a new empty "RESP_BODY" element
         */
        cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY addNewRESPBODY();
        
        /**
         * Gets the "RESP_HDR" element
         */
        cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR getRESPHDR();
        
        /**
         * Sets the "RESP_HDR" element
         */
        void setRESPHDR(cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR resphdr);
        
        /**
         * Appends and returns a new empty "RESP_HDR" element
         */
        cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR addNewRESPHDR();
        
        /**
         * An XML RESP_BODY(@http://www.sii.cl/XMLSchema).
         *
         * This is a complex type.
         */
        public interface RESPBODY extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESPBODY.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("respbody1f46elemtype");
            
            /**
             * Gets the "TOKEN" element
             */
            java.lang.String getTOKEN();
            
            /**
             * Gets (as xml) the "TOKEN" element
             */
            org.apache.xmlbeans.XmlString xgetTOKEN();
            
            /**
             * True if has "TOKEN" element
             */
            boolean isSetTOKEN();
            
            /**
             * Sets the "TOKEN" element
             */
            void setTOKEN(java.lang.String token);
            
            /**
             * Sets (as xml) the "TOKEN" element
             */
            void xsetTOKEN(org.apache.xmlbeans.XmlString token);
            
            /**
             * Unsets the "TOKEN" element
             */
            void unsetTOKEN();
            
            /**
             * Gets the "SEMILLA" element
             */
            java.lang.String getSEMILLA();
            
            /**
             * Gets (as xml) the "SEMILLA" element
             */
            org.apache.xmlbeans.XmlString xgetSEMILLA();
            
            /**
             * True if has "SEMILLA" element
             */
            boolean isSetSEMILLA();
            
            /**
             * Sets the "SEMILLA" element
             */
            void setSEMILLA(java.lang.String semilla);
            
            /**
             * Sets (as xml) the "SEMILLA" element
             */
            void xsetSEMILLA(org.apache.xmlbeans.XmlString semilla);
            
            /**
             * Unsets the "SEMILLA" element
             */
            void unsetSEMILLA();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY newInstance() {
                  return (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPBODY) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML RESP_HDR(@http://www.sii.cl/XMLSchema).
         *
         * This is a complex type.
         */
        public interface RESPHDR extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESPHDR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resphdrdfacelemtype");
            
            /**
             * Gets the "ESTADO" element
             */
            int getESTADO();
            
            /**
             * Gets (as xml) the "ESTADO" element
             */
            org.apache.xmlbeans.XmlInt xgetESTADO();
            
            /**
             * Sets the "ESTADO" element
             */
            void setESTADO(int estado);
            
            /**
             * Sets (as xml) the "ESTADO" element
             */
            void xsetESTADO(org.apache.xmlbeans.XmlInt estado);
            
            /**
             * Gets the "GLOSA" element
             */
            java.lang.String getGLOSA();
            
            /**
             * Gets (as xml) the "GLOSA" element
             */
            org.apache.xmlbeans.XmlString xgetGLOSA();
            
            /**
             * True if has "GLOSA" element
             */
            boolean isSetGLOSA();
            
            /**
             * Sets the "GLOSA" element
             */
            void setGLOSA(java.lang.String glosa);
            
            /**
             * Sets (as xml) the "GLOSA" element
             */
            void xsetGLOSA(org.apache.xmlbeans.XmlString glosa);
            
            /**
             * Unsets the "GLOSA" element
             */
            void unsetGLOSA();
            
            /**
             * Gets the "GLOSA_ESTADO" element
             */
            java.lang.String getGLOSAESTADO();
            
            /**
             * Gets (as xml) the "GLOSA_ESTADO" element
             */
            org.apache.xmlbeans.XmlString xgetGLOSAESTADO();
            
            /**
             * True if has "GLOSA_ESTADO" element
             */
            boolean isSetGLOSAESTADO();
            
            /**
             * Sets the "GLOSA_ESTADO" element
             */
            void setGLOSAESTADO(java.lang.String glosaestado);
            
            /**
             * Sets (as xml) the "GLOSA_ESTADO" element
             */
            void xsetGLOSAESTADO(org.apache.xmlbeans.XmlString glosaestado);
            
            /**
             * Unsets the "GLOSA_ESTADO" element
             */
            void unsetGLOSAESTADO();
            
            /**
             * Gets the "ERR_CODE" element
             */
            int getERRCODE();
            
            /**
             * Gets (as xml) the "ERR_CODE" element
             */
            org.apache.xmlbeans.XmlInt xgetERRCODE();
            
            /**
             * True if has "ERR_CODE" element
             */
            boolean isSetERRCODE();
            
            /**
             * Sets the "ERR_CODE" element
             */
            void setERRCODE(int errcode);
            
            /**
             * Sets (as xml) the "ERR_CODE" element
             */
            void xsetERRCODE(org.apache.xmlbeans.XmlInt errcode);
            
            /**
             * Unsets the "ERR_CODE" element
             */
            void unsetERRCODE();
            
            /**
             * Gets the "NUM_ATENCION" element
             */
            java.lang.String getNUMATENCION();
            
            /**
             * Gets (as xml) the "NUM_ATENCION" element
             */
            org.apache.xmlbeans.XmlString xgetNUMATENCION();
            
            /**
             * True if has "NUM_ATENCION" element
             */
            boolean isSetNUMATENCION();
            
            /**
             * Sets the "NUM_ATENCION" element
             */
            void setNUMATENCION(java.lang.String numatencion);
            
            /**
             * Sets (as xml) the "NUM_ATENCION" element
             */
            void xsetNUMATENCION(org.apache.xmlbeans.XmlString numatencion);
            
            /**
             * Unsets the "NUM_ATENCION" element
             */
            void unsetNUMATENCION();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR newInstance() {
                  return (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA.RESPHDR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA newInstance() {
              return (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.xmlSchema.RESPUESTADocument.RESPUESTA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.xmlSchema.RESPUESTADocument newInstance() {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.xmlSchema.RESPUESTADocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.xmlSchema.RESPUESTADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.xmlSchema.RESPUESTADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.xmlSchema.RESPUESTADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
