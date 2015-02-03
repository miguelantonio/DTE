/*
 * An XML document type.
 * Localname: EnvioRecibos
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.EnvioRecibosDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * A document containing one EnvioRecibos(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface EnvioRecibosDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.EnvioRecibosDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioRecibosDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("enviorecibos06d1doctype");
    
    /**
     * Gets the "EnvioRecibos" element
     */
    cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos getEnvioRecibos();
    
    /**
     * Sets the "EnvioRecibos" element
     */
    void setEnvioRecibos(cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos envioRecibos);
    
    /**
     * Appends and returns a new empty "EnvioRecibos" element
     */
    cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos addNewEnvioRecibos();
    
    /**
     * An XML EnvioRecibos(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface EnvioRecibos extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioRecibos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("enviorecibosc087elemtype");
        
        /**
         * Gets the "SetRecibos" element
         */
        cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos getSetRecibos();
        
        /**
         * Sets the "SetRecibos" element
         */
        void setSetRecibos(cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos setRecibos);
        
        /**
         * Appends and returns a new empty "SetRecibos" element
         */
        cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos addNewSetRecibos();
        
        /**
         * Gets the "Signature" element
         */
        cl.sii.siiDte.dsig.SignatureType getSignature();
        
        /**
         * Sets the "Signature" element
         */
        void setSignature(cl.sii.siiDte.dsig.SignatureType signature);
        
        /**
         * Appends and returns a new empty "Signature" element
         */
        cl.sii.siiDte.dsig.SignatureType addNewSignature();
        
        /**
         * Gets the "version" attribute
         */
        java.math.BigDecimal getVersion();
        
        /**
         * Gets (as xml) the "version" attribute
         */
        org.apache.xmlbeans.XmlDecimal xgetVersion();
        
        /**
         * Sets the "version" attribute
         */
        void setVersion(java.math.BigDecimal version);
        
        /**
         * Sets (as xml) the "version" attribute
         */
        void xsetVersion(org.apache.xmlbeans.XmlDecimal version);
        
        /**
         * An XML SetRecibos(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface SetRecibos extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetRecibos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("setrecibose360elemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula addNewCaratula();
            
            /**
             * Gets array of all "Recibo" elements
             */
            cl.sii.siiDte.ReciboDefType[] getReciboArray();
            
            /**
             * Gets ith "Recibo" element
             */
            cl.sii.siiDte.ReciboDefType getReciboArray(int i);
            
            /**
             * Returns number of "Recibo" element
             */
            int sizeOfReciboArray();
            
            /**
             * Sets array of all "Recibo" element
             */
            void setReciboArray(cl.sii.siiDte.ReciboDefType[] reciboArray);
            
            /**
             * Sets ith "Recibo" element
             */
            void setReciboArray(int i, cl.sii.siiDte.ReciboDefType recibo);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Recibo" element
             */
            cl.sii.siiDte.ReciboDefType insertNewRecibo(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Recibo" element
             */
            cl.sii.siiDte.ReciboDefType addNewRecibo();
            
            /**
             * Removes the ith "Recibo" element
             */
            void removeRecibo(int i);
            
            /**
             * Gets the "ID" attribute
             */
            java.lang.String getID();
            
            /**
             * Gets (as xml) the "ID" attribute
             */
            org.apache.xmlbeans.XmlID xgetID();
            
            /**
             * Sets the "ID" attribute
             */
            void setID(java.lang.String id);
            
            /**
             * Sets (as xml) the "ID" attribute
             */
            void xsetID(org.apache.xmlbeans.XmlID id);
            
            /**
             * An XML Caratula(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Caratula extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("caratulad4dfelemtype");
                
                /**
                 * Gets the "RutResponde" element
                 */
                java.lang.String getRutResponde();
                
                /**
                 * Gets (as xml) the "RutResponde" element
                 */
                cl.sii.siiDte.RUTType xgetRutResponde();
                
                /**
                 * Sets the "RutResponde" element
                 */
                void setRutResponde(java.lang.String rutResponde);
                
                /**
                 * Sets (as xml) the "RutResponde" element
                 */
                void xsetRutResponde(cl.sii.siiDte.RUTType rutResponde);
                
                /**
                 * Gets the "RutRecibe" element
                 */
                java.lang.String getRutRecibe();
                
                /**
                 * Gets (as xml) the "RutRecibe" element
                 */
                cl.sii.siiDte.RUTType xgetRutRecibe();
                
                /**
                 * Sets the "RutRecibe" element
                 */
                void setRutRecibe(java.lang.String rutRecibe);
                
                /**
                 * Sets (as xml) the "RutRecibe" element
                 */
                void xsetRutRecibe(cl.sii.siiDte.RUTType rutRecibe);
                
                /**
                 * Gets the "NmbContacto" element
                 */
                java.lang.String getNmbContacto();
                
                /**
                 * Gets (as xml) the "NmbContacto" element
                 */
                cl.sii.siiDte.NombreType xgetNmbContacto();
                
                /**
                 * True if has "NmbContacto" element
                 */
                boolean isSetNmbContacto();
                
                /**
                 * Sets the "NmbContacto" element
                 */
                void setNmbContacto(java.lang.String nmbContacto);
                
                /**
                 * Sets (as xml) the "NmbContacto" element
                 */
                void xsetNmbContacto(cl.sii.siiDte.NombreType nmbContacto);
                
                /**
                 * Unsets the "NmbContacto" element
                 */
                void unsetNmbContacto();
                
                /**
                 * Gets the "FonoContacto" element
                 */
                java.lang.String getFonoContacto();
                
                /**
                 * Gets (as xml) the "FonoContacto" element
                 */
                cl.sii.siiDte.FonoType xgetFonoContacto();
                
                /**
                 * True if has "FonoContacto" element
                 */
                boolean isSetFonoContacto();
                
                /**
                 * Sets the "FonoContacto" element
                 */
                void setFonoContacto(java.lang.String fonoContacto);
                
                /**
                 * Sets (as xml) the "FonoContacto" element
                 */
                void xsetFonoContacto(cl.sii.siiDte.FonoType fonoContacto);
                
                /**
                 * Unsets the "FonoContacto" element
                 */
                void unsetFonoContacto();
                
                /**
                 * Gets the "MailContacto" element
                 */
                java.lang.String getMailContacto();
                
                /**
                 * Gets (as xml) the "MailContacto" element
                 */
                cl.sii.siiDte.MailType xgetMailContacto();
                
                /**
                 * True if has "MailContacto" element
                 */
                boolean isSetMailContacto();
                
                /**
                 * Sets the "MailContacto" element
                 */
                void setMailContacto(java.lang.String mailContacto);
                
                /**
                 * Sets (as xml) the "MailContacto" element
                 */
                void xsetMailContacto(cl.sii.siiDte.MailType mailContacto);
                
                /**
                 * Unsets the "MailContacto" element
                 */
                void unsetMailContacto();
                
                /**
                 * Gets the "TmstFirmaEnv" element
                 */
                java.util.Calendar getTmstFirmaEnv();
                
                /**
                 * Gets (as xml) the "TmstFirmaEnv" element
                 */
                org.apache.xmlbeans.XmlDateTime xgetTmstFirmaEnv();
                
                /**
                 * Sets the "TmstFirmaEnv" element
                 */
                void setTmstFirmaEnv(java.util.Calendar tmstFirmaEnv);
                
                /**
                 * Sets (as xml) the "TmstFirmaEnv" element
                 */
                void xsetTmstFirmaEnv(org.apache.xmlbeans.XmlDateTime tmstFirmaEnv);
                
                /**
                 * Gets the "version" attribute
                 */
                java.math.BigDecimal getVersion();
                
                /**
                 * Gets (as xml) the "version" attribute
                 */
                org.apache.xmlbeans.XmlDecimal xgetVersion();
                
                /**
                 * Sets the "version" attribute
                 */
                void setVersion(java.math.BigDecimal version);
                
                /**
                 * Sets (as xml) the "version" attribute
                 */
                void xsetVersion(org.apache.xmlbeans.XmlDecimal version);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula newInstance() {
                      return (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos newInstance() {
                  return (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos.SetRecibos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos newInstance() {
              return (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.EnvioRecibosDocument.EnvioRecibos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.EnvioRecibosDocument newInstance() {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.EnvioRecibosDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.EnvioRecibosDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.EnvioRecibosDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.EnvioRecibosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
