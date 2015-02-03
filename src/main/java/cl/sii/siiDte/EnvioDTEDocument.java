/*
 * An XML document type.
 * Localname: EnvioDTE
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.EnvioDTEDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * A document containing one EnvioDTE(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface EnvioDTEDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.EnvioDTEDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioDTEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("enviodtee449doctype");
    
    /**
     * Gets the "EnvioDTE" element
     */
    cl.sii.siiDte.EnvioDTEDocument.EnvioDTE getEnvioDTE();
    
    /**
     * Sets the "EnvioDTE" element
     */
    void setEnvioDTE(cl.sii.siiDte.EnvioDTEDocument.EnvioDTE envioDTE);
    
    /**
     * Appends and returns a new empty "EnvioDTE" element
     */
    cl.sii.siiDte.EnvioDTEDocument.EnvioDTE addNewEnvioDTE();
    
    /**
     * An XML EnvioDTE(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface EnvioDTE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("enviodte5807elemtype");
        
        /**
         * Gets the "SetDTE" element
         */
        cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE getSetDTE();
        
        /**
         * Sets the "SetDTE" element
         */
        void setSetDTE(cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE setDTE);
        
        /**
         * Appends and returns a new empty "SetDTE" element
         */
        cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE addNewSetDTE();
        
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
         * An XML SetDTE(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface SetDTE extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("setdte3f58elemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula addNewCaratula();
            
            /**
             * Gets array of all "DTE" elements
             */
            cl.sii.siiDte.DTEDefType[] getDTEArray();
            
            /**
             * Gets ith "DTE" element
             */
            cl.sii.siiDte.DTEDefType getDTEArray(int i);
            
            /**
             * Returns number of "DTE" element
             */
            int sizeOfDTEArray();
            
            /**
             * Sets array of all "DTE" element
             */
            void setDTEArray(cl.sii.siiDte.DTEDefType[] dteArray);
            
            /**
             * Sets ith "DTE" element
             */
            void setDTEArray(int i, cl.sii.siiDte.DTEDefType dte);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DTE" element
             */
            cl.sii.siiDte.DTEDefType insertNewDTE(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DTE" element
             */
            cl.sii.siiDte.DTEDefType addNewDTE();
            
            /**
             * Removes the ith "DTE" element
             */
            void removeDTE(int i);
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("caratula3757elemtype");
                
                /**
                 * Gets the "RutEmisor" element
                 */
                java.lang.String getRutEmisor();
                
                /**
                 * Gets (as xml) the "RutEmisor" element
                 */
                cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor xgetRutEmisor();
                
                /**
                 * Sets the "RutEmisor" element
                 */
                void setRutEmisor(java.lang.String rutEmisor);
                
                /**
                 * Sets (as xml) the "RutEmisor" element
                 */
                void xsetRutEmisor(cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor rutEmisor);
                
                /**
                 * Gets the "RutEnvia" element
                 */
                java.lang.String getRutEnvia();
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                cl.sii.siiDte.RUTType xgetRutEnvia();
                
                /**
                 * Sets the "RutEnvia" element
                 */
                void setRutEnvia(java.lang.String rutEnvia);
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                void xsetRutEnvia(cl.sii.siiDte.RUTType rutEnvia);
                
                /**
                 * Gets the "RutReceptor" element
                 */
                java.lang.String getRutReceptor();
                
                /**
                 * Gets (as xml) the "RutReceptor" element
                 */
                cl.sii.siiDte.RUTType xgetRutReceptor();
                
                /**
                 * Sets the "RutReceptor" element
                 */
                void setRutReceptor(java.lang.String rutReceptor);
                
                /**
                 * Sets (as xml) the "RutReceptor" element
                 */
                void xsetRutReceptor(cl.sii.siiDte.RUTType rutReceptor);
                
                /**
                 * Gets the "FchResol" element
                 */
                java.util.Calendar getFchResol();
                
                /**
                 * Gets (as xml) the "FchResol" element
                 */
                cl.sii.siiDte.FechaType xgetFchResol();
                
                /**
                 * Sets the "FchResol" element
                 */
                void setFchResol(java.util.Calendar fchResol);
                
                /**
                 * Sets (as xml) the "FchResol" element
                 */
                void xsetFchResol(cl.sii.siiDte.FechaType fchResol);
                
                /**
                 * Gets the "NroResol" element
                 */
                int getNroResol();
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                cl.sii.siiDte.NroResolType xgetNroResol();
                
                /**
                 * Sets the "NroResol" element
                 */
                void setNroResol(int nroResol);
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                void xsetNroResol(cl.sii.siiDte.NroResolType nroResol);
                
                /**
                 * Gets the "TmstFirmaEnv" element
                 */
                java.util.Calendar getTmstFirmaEnv();
                
                /**
                 * Gets (as xml) the "TmstFirmaEnv" element
                 */
                cl.sii.siiDte.FechaHoraType xgetTmstFirmaEnv();
                
                /**
                 * Sets the "TmstFirmaEnv" element
                 */
                void setTmstFirmaEnv(java.util.Calendar tmstFirmaEnv);
                
                /**
                 * Sets (as xml) the "TmstFirmaEnv" element
                 */
                void xsetTmstFirmaEnv(cl.sii.siiDte.FechaHoraType tmstFirmaEnv);
                
                /**
                 * Gets array of all "SubTotDTE" elements
                 */
                cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE[] getSubTotDTEArray();
                
                /**
                 * Gets ith "SubTotDTE" element
                 */
                cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE getSubTotDTEArray(int i);
                
                /**
                 * Returns number of "SubTotDTE" element
                 */
                int sizeOfSubTotDTEArray();
                
                /**
                 * Sets array of all "SubTotDTE" element
                 */
                void setSubTotDTEArray(cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE[] subTotDTEArray);
                
                /**
                 * Sets ith "SubTotDTE" element
                 */
                void setSubTotDTEArray(int i, cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE subTotDTE);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SubTotDTE" element
                 */
                cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE insertNewSubTotDTE(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SubTotDTE" element
                 */
                cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE addNewSubTotDTE();
                
                /**
                 * Removes the ith "SubTotDTE" element
                 */
                void removeSubTotDTE(int i);
                
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
                 * An XML RutEmisor(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.EnvioDTEDocument$EnvioDTE$SetDTE$Caratula$RutEmisor.
                 */
                public interface RutEmisor extends cl.sii.siiDte.RUTType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RutEmisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("rutemisor10a5elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor newInstance() {
                        return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.RutEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML SubTotDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface SubTotDTE extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubTotDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("subtotdte23efelemtype");
                    
                    /**
                     * Gets the "TpoDTE" element
                     */
                    java.math.BigInteger getTpoDTE();
                    
                    /**
                     * Gets (as xml) the "TpoDTE" element
                     */
                    cl.sii.siiDte.DOCType xgetTpoDTE();
                    
                    /**
                     * Sets the "TpoDTE" element
                     */
                    void setTpoDTE(java.math.BigInteger tpoDTE);
                    
                    /**
                     * Sets (as xml) the "TpoDTE" element
                     */
                    void xsetTpoDTE(cl.sii.siiDte.DOCType tpoDTE);
                    
                    /**
                     * Gets the "NroDTE" element
                     */
                    java.math.BigInteger getNroDTE();
                    
                    /**
                     * Gets (as xml) the "NroDTE" element
                     */
                    org.apache.xmlbeans.XmlPositiveInteger xgetNroDTE();
                    
                    /**
                     * Sets the "NroDTE" element
                     */
                    void setNroDTE(java.math.BigInteger nroDTE);
                    
                    /**
                     * Sets (as xml) the "NroDTE" element
                     */
                    void xsetNroDTE(org.apache.xmlbeans.XmlPositiveInteger nroDTE);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE newInstance() {
                        return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula.SubTotDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula newInstance() {
                      return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE newInstance() {
                  return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE.SetDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE newInstance() {
              return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.EnvioDTEDocument.EnvioDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.EnvioDTEDocument.EnvioDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.EnvioDTEDocument newInstance() {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.EnvioDTEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.EnvioDTEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.EnvioDTEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.EnvioDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
