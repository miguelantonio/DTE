/*
 * XML Type:  ReciboDefType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.ReciboDefType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * An XML ReciboDefType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public interface ReciboDefType extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.ReciboDefTypeExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReciboDefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recibodeftype0554type");
    
    /**
     * Gets the "DocumentoRecibo" element
     */
    cl.sii.siiDte.ReciboDefType.DocumentoRecibo getDocumentoRecibo();
    
    /**
     * Sets the "DocumentoRecibo" element
     */
    void setDocumentoRecibo(cl.sii.siiDte.ReciboDefType.DocumentoRecibo documentoRecibo);
    
    /**
     * Appends and returns a new empty "DocumentoRecibo" element
     */
    cl.sii.siiDte.ReciboDefType.DocumentoRecibo addNewDocumentoRecibo();
    
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
     * An XML DocumentoRecibo(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface DocumentoRecibo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentoRecibo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("documentorecibo1c0eelemtype");
        
        /**
         * Gets the "TipoDoc" element
         */
        java.math.BigInteger getTipoDoc();
        
        /**
         * Gets (as xml) the "TipoDoc" element
         */
        cl.sii.siiDte.DocType2 xgetTipoDoc();
        
        /**
         * Sets the "TipoDoc" element
         */
        void setTipoDoc(java.math.BigInteger tipoDoc);
        
        /**
         * Sets (as xml) the "TipoDoc" element
         */
        void xsetTipoDoc(cl.sii.siiDte.DocType2 tipoDoc);
        
        /**
         * Gets the "Folio" element
         */
        long getFolio();
        
        /**
         * Gets (as xml) the "Folio" element
         */
        cl.sii.siiDte.FolioType xgetFolio();
        
        /**
         * Sets the "Folio" element
         */
        void setFolio(long folio);
        
        /**
         * Sets (as xml) the "Folio" element
         */
        void xsetFolio(cl.sii.siiDte.FolioType folio);
        
        /**
         * Gets the "FchEmis" element
         */
        java.util.Calendar getFchEmis();
        
        /**
         * Gets (as xml) the "FchEmis" element
         */
        org.apache.xmlbeans.XmlDate xgetFchEmis();
        
        /**
         * Sets the "FchEmis" element
         */
        void setFchEmis(java.util.Calendar fchEmis);
        
        /**
         * Sets (as xml) the "FchEmis" element
         */
        void xsetFchEmis(org.apache.xmlbeans.XmlDate fchEmis);
        
        /**
         * Gets the "RUTEmisor" element
         */
        java.lang.String getRUTEmisor();
        
        /**
         * Gets (as xml) the "RUTEmisor" element
         */
        cl.sii.siiDte.RUTType xgetRUTEmisor();
        
        /**
         * Sets the "RUTEmisor" element
         */
        void setRUTEmisor(java.lang.String rutEmisor);
        
        /**
         * Sets (as xml) the "RUTEmisor" element
         */
        void xsetRUTEmisor(cl.sii.siiDte.RUTType rutEmisor);
        
        /**
         * Gets the "RUTRecep" element
         */
        java.lang.String getRUTRecep();
        
        /**
         * Gets (as xml) the "RUTRecep" element
         */
        cl.sii.siiDte.RUTType xgetRUTRecep();
        
        /**
         * Sets the "RUTRecep" element
         */
        void setRUTRecep(java.lang.String rutRecep);
        
        /**
         * Sets (as xml) the "RUTRecep" element
         */
        void xsetRUTRecep(cl.sii.siiDte.RUTType rutRecep);
        
        /**
         * Gets the "MntTotal" element
         */
        long getMntTotal();
        
        /**
         * Gets (as xml) the "MntTotal" element
         */
        cl.sii.siiDte.MontoType xgetMntTotal();
        
        /**
         * Sets the "MntTotal" element
         */
        void setMntTotal(long mntTotal);
        
        /**
         * Sets (as xml) the "MntTotal" element
         */
        void xsetMntTotal(cl.sii.siiDte.MontoType mntTotal);
        
        /**
         * Gets the "Recinto" element
         */
        java.lang.String getRecinto();
        
        /**
         * Gets (as xml) the "Recinto" element
         */
        cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto xgetRecinto();
        
        /**
         * Sets the "Recinto" element
         */
        void setRecinto(java.lang.String recinto);
        
        /**
         * Sets (as xml) the "Recinto" element
         */
        void xsetRecinto(cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto recinto);
        
        /**
         * Gets the "RutFirma" element
         */
        java.lang.String getRutFirma();
        
        /**
         * Gets (as xml) the "RutFirma" element
         */
        cl.sii.siiDte.RUTType xgetRutFirma();
        
        /**
         * Sets the "RutFirma" element
         */
        void setRutFirma(java.lang.String rutFirma);
        
        /**
         * Sets (as xml) the "RutFirma" element
         */
        void xsetRutFirma(cl.sii.siiDte.RUTType rutFirma);
        
        /**
         * Gets the "Declaracion" element
         */
        java.lang.String getDeclaracion();
        
        /**
         * Gets (as xml) the "Declaracion" element
         */
        cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion xgetDeclaracion();
        
        /**
         * Sets the "Declaracion" element
         */
        void setDeclaracion(java.lang.String declaracion);
        
        /**
         * Sets (as xml) the "Declaracion" element
         */
        void xsetDeclaracion(cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion declaracion);
        
        /**
         * Gets the "TmstFirmaRecibo" element
         */
        java.util.Calendar getTmstFirmaRecibo();
        
        /**
         * Gets (as xml) the "TmstFirmaRecibo" element
         */
        org.apache.xmlbeans.XmlDateTime xgetTmstFirmaRecibo();
        
        /**
         * Sets the "TmstFirmaRecibo" element
         */
        void setTmstFirmaRecibo(java.util.Calendar tmstFirmaRecibo);
        
        /**
         * Sets (as xml) the "TmstFirmaRecibo" element
         */
        void xsetTmstFirmaRecibo(org.apache.xmlbeans.XmlDateTime tmstFirmaRecibo);
        
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
         * An XML Recinto(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.ReciboDefType$DocumentoRecibo$Recinto.
         */
        public interface Recinto extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Recinto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recinto5b52elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto newValue(java.lang.Object obj) {
                  return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto) type.newValue( obj ); }
                
                public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto newInstance() {
                  return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Recinto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Declaracion(@http://www.sii.cl/SiiDte).
         *
         * This is an atomic type that is a restriction of cl.sii.siiDte.ReciboDefType$DocumentoRecibo$Declaracion.
         */
        public interface Declaracion extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Declaracion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("declaracion3a37elemtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion newValue(java.lang.Object obj) {
                  return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion) type.newValue( obj ); }
                
                public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion newInstance() {
                  return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo.Declaracion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo newInstance() {
              return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.ReciboDefType.DocumentoRecibo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.ReciboDefType.DocumentoRecibo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.ReciboDefType newInstance() {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.ReciboDefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.ReciboDefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.ReciboDefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.ReciboDefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.ReciboDefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.ReciboDefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
