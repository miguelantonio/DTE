/*
 * An XML document type.
 * Localname: ResultadoEnvioLibro
 * Namespace: 
 * Java type: noNamespace.ResultadoEnvioLibroDocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one ResultadoEnvioLibro(@) element.
 *
 * This is a complex type.
 */
public interface ResultadoEnvioLibroDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.DTEXMLExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultadoEnvioLibroDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resultadoenviolibro0005doctype");
    
    /**
     * Gets the "ResultadoEnvioLibro" element
     */
    noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro getResultadoEnvioLibro();
    
    /**
     * Sets the "ResultadoEnvioLibro" element
     */
    void setResultadoEnvioLibro(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro resultadoEnvioLibro);
    
    /**
     * Appends and returns a new empty "ResultadoEnvioLibro" element
     */
    noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro addNewResultadoEnvioLibro();
    
    /**
     * An XML ResultadoEnvioLibro(@).
     *
     * This is a complex type.
     */
    public interface ResultadoEnvioLibro extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultadoEnvioLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resultadoenviolibrobe1felemtype");
        
        /**
         * Gets the "Identificacion" element
         */
        noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion getIdentificacion();
        
        /**
         * Sets the "Identificacion" element
         */
        void setIdentificacion(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion identificacion);
        
        /**
         * Appends and returns a new empty "Identificacion" element
         */
        noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion addNewIdentificacion();
        
        /**
         * Gets the "ErrorEnvioLibro" element
         */
        noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro getErrorEnvioLibro();
        
        /**
         * True if has "ErrorEnvioLibro" element
         */
        boolean isSetErrorEnvioLibro();
        
        /**
         * Sets the "ErrorEnvioLibro" element
         */
        void setErrorEnvioLibro(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro errorEnvioLibro);
        
        /**
         * Appends and returns a new empty "ErrorEnvioLibro" element
         */
        noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro addNewErrorEnvioLibro();
        
        /**
         * Unsets the "ErrorEnvioLibro" element
         */
        void unsetErrorEnvioLibro();
        
        /**
         * An XML Identificacion(@).
         *
         * This is a complex type.
         */
        public interface Identificacion extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Identificacion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("identificacion4a6aelemtype");
            
            /**
             * Gets the "TrackId" element
             */
            long getTrackId();
            
            /**
             * Gets (as xml) the "TrackId" element
             */
            noNamespace.EnteroType xgetTrackId();
            
            /**
             * Sets the "TrackId" element
             */
            void setTrackId(long trackId);
            
            /**
             * Sets (as xml) the "TrackId" element
             */
            void xsetTrackId(noNamespace.EnteroType trackId);
            
            /**
             * Gets the "RutEmisor" element
             */
            java.lang.String getRutEmisor();
            
            /**
             * Gets (as xml) the "RutEmisor" element
             */
            noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor xgetRutEmisor();
            
            /**
             * Sets the "RutEmisor" element
             */
            void setRutEmisor(java.lang.String rutEmisor);
            
            /**
             * Sets (as xml) the "RutEmisor" element
             */
            void xsetRutEmisor(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor rutEmisor);
            
            /**
             * Gets the "RutEnvia" element
             */
            java.lang.String getRutEnvia();
            
            /**
             * Gets (as xml) the "RutEnvia" element
             */
            noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia xgetRutEnvia();
            
            /**
             * Sets the "RutEnvia" element
             */
            void setRutEnvia(java.lang.String rutEnvia);
            
            /**
             * Sets (as xml) the "RutEnvia" element
             */
            void xsetRutEnvia(noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia rutEnvia);
            
            /**
             * Gets the "TmstRecepcion" element
             */
            java.util.Calendar getTmstRecepcion();
            
            /**
             * Gets (as xml) the "TmstRecepcion" element
             */
            org.apache.xmlbeans.XmlDateTime xgetTmstRecepcion();
            
            /**
             * Sets the "TmstRecepcion" element
             */
            void setTmstRecepcion(java.util.Calendar tmstRecepcion);
            
            /**
             * Sets (as xml) the "TmstRecepcion" element
             */
            void xsetTmstRecepcion(org.apache.xmlbeans.XmlDateTime tmstRecepcion);
            
            /**
             * Gets the "EstadoEnvio" element
             */
            java.lang.String getEstadoEnvio();
            
            /**
             * Gets (as xml) the "EstadoEnvio" element
             */
            org.apache.xmlbeans.XmlString xgetEstadoEnvio();
            
            /**
             * Sets the "EstadoEnvio" element
             */
            void setEstadoEnvio(java.lang.String estadoEnvio);
            
            /**
             * Sets (as xml) the "EstadoEnvio" element
             */
            void xsetEstadoEnvio(org.apache.xmlbeans.XmlString estadoEnvio);
            
            /**
             * Gets the "TipoSegmento" element
             */
            java.lang.String getTipoSegmento();
            
            /**
             * Gets (as xml) the "TipoSegmento" element
             */
            org.apache.xmlbeans.XmlString xgetTipoSegmento();
            
            /**
             * True if has "TipoSegmento" element
             */
            boolean isSetTipoSegmento();
            
            /**
             * Sets the "TipoSegmento" element
             */
            void setTipoSegmento(java.lang.String tipoSegmento);
            
            /**
             * Sets (as xml) the "TipoSegmento" element
             */
            void xsetTipoSegmento(org.apache.xmlbeans.XmlString tipoSegmento);
            
            /**
             * Unsets the "TipoSegmento" element
             */
            void unsetTipoSegmento();
            
            /**
             * Gets the "NroSegmento" element
             */
            java.lang.String getNroSegmento();
            
            /**
             * Gets (as xml) the "NroSegmento" element
             */
            org.apache.xmlbeans.XmlString xgetNroSegmento();
            
            /**
             * True if has "NroSegmento" element
             */
            boolean isSetNroSegmento();
            
            /**
             * Sets the "NroSegmento" element
             */
            void setNroSegmento(java.lang.String nroSegmento);
            
            /**
             * Sets (as xml) the "NroSegmento" element
             */
            void xsetNroSegmento(org.apache.xmlbeans.XmlString nroSegmento);
            
            /**
             * Unsets the "NroSegmento" element
             */
            void unsetNroSegmento();
            
            /**
             * Gets the "TipoLibro" element
             */
            java.lang.String getTipoLibro();
            
            /**
             * Gets (as xml) the "TipoLibro" element
             */
            org.apache.xmlbeans.XmlString xgetTipoLibro();
            
            /**
             * True if has "TipoLibro" element
             */
            boolean isSetTipoLibro();
            
            /**
             * Sets the "TipoLibro" element
             */
            void setTipoLibro(java.lang.String tipoLibro);
            
            /**
             * Sets (as xml) the "TipoLibro" element
             */
            void xsetTipoLibro(org.apache.xmlbeans.XmlString tipoLibro);
            
            /**
             * Unsets the "TipoLibro" element
             */
            void unsetTipoLibro();
            
            /**
             * Gets the "TipoOperacion" element
             */
            java.lang.String getTipoOperacion();
            
            /**
             * Gets (as xml) the "TipoOperacion" element
             */
            org.apache.xmlbeans.XmlString xgetTipoOperacion();
            
            /**
             * True if has "TipoOperacion" element
             */
            boolean isSetTipoOperacion();
            
            /**
             * Sets the "TipoOperacion" element
             */
            void setTipoOperacion(java.lang.String tipoOperacion);
            
            /**
             * Sets (as xml) the "TipoOperacion" element
             */
            void xsetTipoOperacion(org.apache.xmlbeans.XmlString tipoOperacion);
            
            /**
             * Unsets the "TipoOperacion" element
             */
            void unsetTipoOperacion();
            
            /**
             * Gets the "PeriodoTributario" element
             */
            java.lang.String getPeriodoTributario();
            
            /**
             * Gets (as xml) the "PeriodoTributario" element
             */
            org.apache.xmlbeans.XmlString xgetPeriodoTributario();
            
            /**
             * True if has "PeriodoTributario" element
             */
            boolean isSetPeriodoTributario();
            
            /**
             * Sets the "PeriodoTributario" element
             */
            void setPeriodoTributario(java.lang.String periodoTributario);
            
            /**
             * Sets (as xml) the "PeriodoTributario" element
             */
            void xsetPeriodoTributario(org.apache.xmlbeans.XmlString periodoTributario);
            
            /**
             * Unsets the "PeriodoTributario" element
             */
            void unsetPeriodoTributario();
            
            /**
             * Gets the "EstadoLibro" element
             */
            java.lang.String getEstadoLibro();
            
            /**
             * Gets (as xml) the "EstadoLibro" element
             */
            org.apache.xmlbeans.XmlString xgetEstadoLibro();
            
            /**
             * True if has "EstadoLibro" element
             */
            boolean isSetEstadoLibro();
            
            /**
             * Sets the "EstadoLibro" element
             */
            void setEstadoLibro(java.lang.String estadoLibro);
            
            /**
             * Sets (as xml) the "EstadoLibro" element
             */
            void xsetEstadoLibro(org.apache.xmlbeans.XmlString estadoLibro);
            
            /**
             * Unsets the "EstadoLibro" element
             */
            void unsetEstadoLibro();
            
            /**
             * An XML RutEmisor(@).
             *
             * This is an atomic type that is a restriction of noNamespace.ResultadoEnvioLibroDocument$ResultadoEnvioLibro$Identificacion$RutEmisor.
             */
            public interface RutEmisor extends noNamespace.RUTType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RutEmisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("rutemisor0428elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor newValue(java.lang.Object obj) {
                      return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor) type.newValue( obj ); }
                    
                    public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor newInstance() {
                      return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML RutEnvia(@).
             *
             * This is an atomic type that is a restriction of noNamespace.ResultadoEnvioLibroDocument$ResultadoEnvioLibro$Identificacion$RutEnvia.
             */
            public interface RutEnvia extends noNamespace.RUTType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RutEnvia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("rutenvia890aelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia newValue(java.lang.Object obj) {
                      return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia) type.newValue( obj ); }
                    
                    public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia newInstance() {
                      return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion.RutEnvia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion newInstance() {
                  return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.Identificacion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ErrorEnvioLibro(@).
         *
         * This is a complex type.
         */
        public interface ErrorEnvioLibro extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorEnvioLibro.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("errorenviolibrode92elemtype");
            
            /**
             * Gets array of all "DetErrEnvio" elements
             */
            java.lang.String[] getDetErrEnvioArray();
            
            /**
             * Gets ith "DetErrEnvio" element
             */
            java.lang.String getDetErrEnvioArray(int i);
            
            /**
             * Gets (as xml) array of all "DetErrEnvio" elements
             */
            org.apache.xmlbeans.XmlString[] xgetDetErrEnvioArray();
            
            /**
             * Gets (as xml) ith "DetErrEnvio" element
             */
            org.apache.xmlbeans.XmlString xgetDetErrEnvioArray(int i);
            
            /**
             * Returns number of "DetErrEnvio" element
             */
            int sizeOfDetErrEnvioArray();
            
            /**
             * Sets array of all "DetErrEnvio" element
             */
            void setDetErrEnvioArray(java.lang.String[] detErrEnvioArray);
            
            /**
             * Sets ith "DetErrEnvio" element
             */
            void setDetErrEnvioArray(int i, java.lang.String detErrEnvio);
            
            /**
             * Sets (as xml) array of all "DetErrEnvio" element
             */
            void xsetDetErrEnvioArray(org.apache.xmlbeans.XmlString[] detErrEnvioArray);
            
            /**
             * Sets (as xml) ith "DetErrEnvio" element
             */
            void xsetDetErrEnvioArray(int i, org.apache.xmlbeans.XmlString detErrEnvio);
            
            /**
             * Inserts the value as the ith "DetErrEnvio" element
             */
            void insertDetErrEnvio(int i, java.lang.String detErrEnvio);
            
            /**
             * Appends the value as the last "DetErrEnvio" element
             */
            void addDetErrEnvio(java.lang.String detErrEnvio);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DetErrEnvio" element
             */
            org.apache.xmlbeans.XmlString insertNewDetErrEnvio(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DetErrEnvio" element
             */
            org.apache.xmlbeans.XmlString addNewDetErrEnvio();
            
            /**
             * Removes the ith "DetErrEnvio" element
             */
            void removeDetErrEnvio(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro newInstance() {
                  return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro.ErrorEnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro newInstance() {
              return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.ResultadoEnvioLibroDocument.ResultadoEnvioLibro) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.ResultadoEnvioLibroDocument newInstance() {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.ResultadoEnvioLibroDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ResultadoEnvioLibroDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.ResultadoEnvioLibroDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.ResultadoEnvioLibroDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
