/*
 * An XML document type.
 * Localname: LceCoCertif
 * Namespace: http://www.sii.cl/SiiLce
 * Java type: cl.sii.siiLce.LceCoCertifDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiLce;


/**
 * A document containing one LceCoCertif(@http://www.sii.cl/SiiLce) element.
 *
 * This is a complex type.
 */
public interface LceCoCertifDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LceCoCertifDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s570DD657698ABEDD464AAC89D7583DC3").resolveHandle("lcecocertiff43bdoctype");
    
    /**
     * Gets the "LceCoCertif" element
     */
    cl.sii.siiLce.LceCoCertifDocument.LceCoCertif getLceCoCertif();
    
    /**
     * Sets the "LceCoCertif" element
     */
    void setLceCoCertif(cl.sii.siiLce.LceCoCertifDocument.LceCoCertif lceCoCertif);
    
    /**
     * Appends and returns a new empty "LceCoCertif" element
     */
    cl.sii.siiLce.LceCoCertifDocument.LceCoCertif addNewLceCoCertif();
    
    /**
     * An XML LceCoCertif(@http://www.sii.cl/SiiLce).
     *
     * This is a complex type.
     */
    public interface LceCoCertif extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LceCoCertif.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s570DD657698ABEDD464AAC89D7583DC3").resolveHandle("lcecocertif0c54elemtype");
        
        /**
         * Gets the "DocumentoCoCertif" element
         */
        cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif getDocumentoCoCertif();
        
        /**
         * Sets the "DocumentoCoCertif" element
         */
        void setDocumentoCoCertif(cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif documentoCoCertif);
        
        /**
         * Appends and returns a new empty "DocumentoCoCertif" element
         */
        cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif addNewDocumentoCoCertif();
        
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
         * An XML DocumentoCoCertif(@http://www.sii.cl/SiiLce).
         *
         * This is a complex type.
         */
        public interface DocumentoCoCertif extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentoCoCertif.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s570DD657698ABEDD464AAC89D7583DC3").resolveHandle("documentococertifb387elemtype");
            
            /**
             * Gets the "RutContribuyente" element
             */
            java.lang.String getRutContribuyente();
            
            /**
             * Gets (as xml) the "RutContribuyente" element
             */
            cl.sii.siiLce.RUTType xgetRutContribuyente();
            
            /**
             * Sets the "RutContribuyente" element
             */
            void setRutContribuyente(java.lang.String rutContribuyente);
            
            /**
             * Sets (as xml) the "RutContribuyente" element
             */
            void xsetRutContribuyente(cl.sii.siiLce.RUTType rutContribuyente);
            
            /**
             * Gets the "FchEmision" element
             */
            java.util.Calendar getFchEmision();
            
            /**
             * Gets (as xml) the "FchEmision" element
             */
            org.apache.xmlbeans.XmlDate xgetFchEmision();
            
            /**
             * Sets the "FchEmision" element
             */
            void setFchEmision(java.util.Calendar fchEmision);
            
            /**
             * Sets (as xml) the "FchEmision" element
             */
            void xsetFchEmision(org.apache.xmlbeans.XmlDate fchEmision);
            
            /**
             * Gets the "LceCal" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal getLceCal();
            
            /**
             * Sets the "LceCal" element
             */
            void setLceCal(cl.sii.siiLce.LceCalDocument.LceCal lceCal);
            
            /**
             * Appends and returns a new empty "LceCal" element
             */
            cl.sii.siiLce.LceCalDocument.LceCal addNewLceCal();
            
            /**
             * Gets the "RutFirmanteDistribuidor" element
             */
            java.lang.String getRutFirmanteDistribuidor();
            
            /**
             * Gets (as xml) the "RutFirmanteDistribuidor" element
             */
            cl.sii.siiLce.RUTType xgetRutFirmanteDistribuidor();
            
            /**
             * Sets the "RutFirmanteDistribuidor" element
             */
            void setRutFirmanteDistribuidor(java.lang.String rutFirmanteDistribuidor);
            
            /**
             * Sets (as xml) the "RutFirmanteDistribuidor" element
             */
            void xsetRutFirmanteDistribuidor(cl.sii.siiLce.RUTType rutFirmanteDistribuidor);
            
            /**
             * Gets the "TmstFirma" element
             */
            java.util.Calendar getTmstFirma();
            
            /**
             * Gets (as xml) the "TmstFirma" element
             */
            org.apache.xmlbeans.XmlDateTime xgetTmstFirma();
            
            /**
             * Sets the "TmstFirma" element
             */
            void setTmstFirma(java.util.Calendar tmstFirma);
            
            /**
             * Sets (as xml) the "TmstFirma" element
             */
            void xsetTmstFirma(org.apache.xmlbeans.XmlDateTime tmstFirma);
            
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
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif newInstance() {
                  return (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif.DocumentoCoCertif) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiLce.LceCoCertifDocument.LceCoCertif newInstance() {
              return (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiLce.LceCoCertifDocument.LceCoCertif newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiLce.LceCoCertifDocument.LceCoCertif) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiLce.LceCoCertifDocument newInstance() {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiLce.LceCoCertifDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiLce.LceCoCertifDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiLce.LceCoCertifDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiLce.LceCoCertifDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
