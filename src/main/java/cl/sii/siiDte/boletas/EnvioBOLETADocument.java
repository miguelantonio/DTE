/*
 * An XML document type.
 * Localname: EnvioBOLETA
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.boletas.EnvioBOLETADocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.boletas;


/**
 * A document containing one EnvioBOLETA(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface EnvioBOLETADocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.EnvioBOLETADocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioBOLETADocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("envioboleta4857doctype");
    
    /**
     * Gets the "EnvioBOLETA" element
     */
    cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA getEnvioBOLETA();
    
    /**
     * Sets the "EnvioBOLETA" element
     */
    void setEnvioBOLETA(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA envioBOLETA);
    
    /**
     * Appends and returns a new empty "EnvioBOLETA" element
     */
    cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA addNewEnvioBOLETA();
    
    /**
     * An XML EnvioBOLETA(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface EnvioBOLETA extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioBOLETA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("envioboleta87c5elemtype");
        
        /**
         * Gets the "SetDTE" element
         */
        cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE getSetDTE();
        
        /**
         * Sets the "SetDTE" element
         */
        void setSetDTE(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE setDTE);
        
        /**
         * Appends and returns a new empty "SetDTE" element
         */
        cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE addNewSetDTE();
        
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
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SetDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("setdteee56elemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula addNewCaratula();
            
            /**
             * Gets array of all "DTE" elements
             */
            cl.sii.siiDte.boletas.BOLETADefType[] getDTEArray();
            
            /**
             * Gets ith "DTE" element
             */
            cl.sii.siiDte.boletas.BOLETADefType getDTEArray(int i);
            
            /**
             * Returns number of "DTE" element
             */
            int sizeOfDTEArray();
            
            /**
             * Sets array of all "DTE" element
             */
            void setDTEArray(cl.sii.siiDte.boletas.BOLETADefType[] dteArray);
            
            /**
             * Sets ith "DTE" element
             */
            void setDTEArray(int i, cl.sii.siiDte.boletas.BOLETADefType dte);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DTE" element
             */
            cl.sii.siiDte.boletas.BOLETADefType insertNewDTE(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DTE" element
             */
            cl.sii.siiDte.boletas.BOLETADefType addNewDTE();
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("caratulaab15elemtype");
                
                /**
                 * Gets the "RutEmisor" element
                 */
                java.lang.String getRutEmisor();
                
                /**
                 * Gets (as xml) the "RutEmisor" element
                 */
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor xgetRutEmisor();
                
                /**
                 * Sets the "RutEmisor" element
                 */
                void setRutEmisor(java.lang.String rutEmisor);
                
                /**
                 * Sets (as xml) the "RutEmisor" element
                 */
                void xsetRutEmisor(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor rutEmisor);
                
                /**
                 * Gets the "RutEnvia" element
                 */
                java.lang.String getRutEnvia();
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                cl.sii.siiDte.boletas.RUTType xgetRutEnvia();
                
                /**
                 * Sets the "RutEnvia" element
                 */
                void setRutEnvia(java.lang.String rutEnvia);
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                void xsetRutEnvia(cl.sii.siiDte.boletas.RUTType rutEnvia);
                
                /**
                 * Gets the "RutReceptor" element
                 */
                java.lang.String getRutReceptor();
                
                /**
                 * Gets (as xml) the "RutReceptor" element
                 */
                cl.sii.siiDte.boletas.RUTType xgetRutReceptor();
                
                /**
                 * Sets the "RutReceptor" element
                 */
                void setRutReceptor(java.lang.String rutReceptor);
                
                /**
                 * Sets (as xml) the "RutReceptor" element
                 */
                void xsetRutReceptor(cl.sii.siiDte.boletas.RUTType rutReceptor);
                
                /**
                 * Gets the "FchResol" element
                 */
                java.util.Calendar getFchResol();
                
                /**
                 * Gets (as xml) the "FchResol" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchResol();
                
                /**
                 * Sets the "FchResol" element
                 */
                void setFchResol(java.util.Calendar fchResol);
                
                /**
                 * Sets (as xml) the "FchResol" element
                 */
                void xsetFchResol(org.apache.xmlbeans.XmlDate fchResol);
                
                /**
                 * Gets the "NroResol" element
                 */
                int getNroResol();
                
                /**
                 * Gets (as xml) the "NroResol" element
                 */
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol xgetNroResol();
                
                /**
                 * Sets the "NroResol" element
                 */
                void setNroResol(int nroResol);
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                void xsetNroResol(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol nroResol);
                
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
                 * Gets array of all "SubTotDTE" elements
                 */
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE[] getSubTotDTEArray();
                
                /**
                 * Gets ith "SubTotDTE" element
                 */
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE getSubTotDTEArray(int i);
                
                /**
                 * Returns number of "SubTotDTE" element
                 */
                int sizeOfSubTotDTEArray();
                
                /**
                 * Sets array of all "SubTotDTE" element
                 */
                void setSubTotDTEArray(cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE[] subTotDTEArray);
                
                /**
                 * Sets ith "SubTotDTE" element
                 */
                void setSubTotDTEArray(int i, cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE subTotDTE);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "SubTotDTE" element
                 */
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE insertNewSubTotDTE(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "SubTotDTE" element
                 */
                cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE addNewSubTotDTE();
                
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
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.EnvioBOLETADocument$EnvioBOLETA$SetDTE$Caratula$RutEmisor.
                 */
                public interface RutEmisor extends cl.sii.siiDte.boletas.RUTType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RutEmisor.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("rutemisord1e3elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor newInstance() {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.RutEmisor) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroResol(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.boletas.EnvioBOLETADocument$EnvioBOLETA$SetDTE$Caratula$NroResol.
                 */
                public interface NroResol extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroResol.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("nroresol4807elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol newInstance() {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.NroResol) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
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
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SubTotDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s651507627B1FA417CD9F62077346C0A1").resolveHandle("subtotdtec5adelemtype");
                    
                    /**
                     * Gets the "TpoDTE" element
                     */
                    java.math.BigInteger getTpoDTE();
                    
                    /**
                     * Gets (as xml) the "TpoDTE" element
                     */
                    cl.sii.siiDte.boletas.DTEType xgetTpoDTE();
                    
                    /**
                     * Sets the "TpoDTE" element
                     */
                    void setTpoDTE(java.math.BigInteger tpoDTE);
                    
                    /**
                     * Sets (as xml) the "TpoDTE" element
                     */
                    void xsetTpoDTE(cl.sii.siiDte.boletas.DTEType tpoDTE);
                    
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
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE newInstance() {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula.SubTotDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula newInstance() {
                      return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE newInstance() {
                  return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA.SetDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA newInstance() {
              return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.boletas.EnvioBOLETADocument.EnvioBOLETA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument newInstance() {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.boletas.EnvioBOLETADocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.boletas.EnvioBOLETADocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
