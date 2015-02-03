/*
 * An XML document type.
 * Localname: ConsumoFolios
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.consumofolios.ConsumoFoliosDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.consumofolios;


/**
 * A document containing one ConsumoFolios(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface ConsumoFoliosDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.ConsumoFoliosDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsumoFoliosDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("consumofolios014ddoctype");
    
    /**
     * Gets the "ConsumoFolios" element
     */
    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios getConsumoFolios();
    
    /**
     * Sets the "ConsumoFolios" element
     */
    void setConsumoFolios(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios consumoFolios);
    
    /**
     * Appends and returns a new empty "ConsumoFolios" element
     */
    cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios addNewConsumoFolios();
    
    /**
     * An XML ConsumoFolios(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface ConsumoFolios extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ConsumoFolios.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("consumofoliosfe71elemtype");
        
        /**
         * Gets the "DocumentoConsumoFolios" element
         */
        cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios getDocumentoConsumoFolios();
        
        /**
         * Sets the "DocumentoConsumoFolios" element
         */
        void setDocumentoConsumoFolios(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios documentoConsumoFolios);
        
        /**
         * Appends and returns a new empty "DocumentoConsumoFolios" element
         */
        cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios addNewDocumentoConsumoFolios();
        
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
         * An XML DocumentoConsumoFolios(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface DocumentoConsumoFolios extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DocumentoConsumoFolios.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("documentoconsumofoliosc4f9elemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula addNewCaratula();
            
            /**
             * Gets array of all "Resumen" elements
             */
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen[] getResumenArray();
            
            /**
             * Gets ith "Resumen" element
             */
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen getResumenArray(int i);
            
            /**
             * Returns number of "Resumen" element
             */
            int sizeOfResumenArray();
            
            /**
             * Sets array of all "Resumen" element
             */
            void setResumenArray(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen[] resumenArray);
            
            /**
             * Sets ith "Resumen" element
             */
            void setResumenArray(int i, cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen resumen);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Resumen" element
             */
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen insertNewResumen(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Resumen" element
             */
            cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen addNewResumen();
            
            /**
             * Removes the ith "Resumen" element
             */
            void removeResumen(int i);
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("caratulaac38elemtype");
                
                /**
                 * Gets the "RutEmisor" element
                 */
                java.lang.String getRutEmisor();
                
                /**
                 * Gets (as xml) the "RutEmisor" element
                 */
                cl.sii.siiDte.consumofolios.RUTType xgetRutEmisor();
                
                /**
                 * Sets the "RutEmisor" element
                 */
                void setRutEmisor(java.lang.String rutEmisor);
                
                /**
                 * Sets (as xml) the "RutEmisor" element
                 */
                void xsetRutEmisor(cl.sii.siiDte.consumofolios.RUTType rutEmisor);
                
                /**
                 * Gets the "RutEnvia" element
                 */
                java.lang.String getRutEnvia();
                
                /**
                 * Gets (as xml) the "RutEnvia" element
                 */
                cl.sii.siiDte.consumofolios.RUTType xgetRutEnvia();
                
                /**
                 * Sets the "RutEnvia" element
                 */
                void setRutEnvia(java.lang.String rutEnvia);
                
                /**
                 * Sets (as xml) the "RutEnvia" element
                 */
                void xsetRutEnvia(cl.sii.siiDte.consumofolios.RUTType rutEnvia);
                
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
                cl.sii.siiDte.consumofolios.NroResolType xgetNroResol();
                
                /**
                 * Sets the "NroResol" element
                 */
                void setNroResol(int nroResol);
                
                /**
                 * Sets (as xml) the "NroResol" element
                 */
                void xsetNroResol(cl.sii.siiDte.consumofolios.NroResolType nroResol);
                
                /**
                 * Gets the "FchInicio" element
                 */
                java.util.Calendar getFchInicio();
                
                /**
                 * Gets (as xml) the "FchInicio" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchInicio();
                
                /**
                 * Sets the "FchInicio" element
                 */
                void setFchInicio(java.util.Calendar fchInicio);
                
                /**
                 * Sets (as xml) the "FchInicio" element
                 */
                void xsetFchInicio(org.apache.xmlbeans.XmlDate fchInicio);
                
                /**
                 * Gets the "FchFinal" element
                 */
                java.util.Calendar getFchFinal();
                
                /**
                 * Gets (as xml) the "FchFinal" element
                 */
                org.apache.xmlbeans.XmlDate xgetFchFinal();
                
                /**
                 * Sets the "FchFinal" element
                 */
                void setFchFinal(java.util.Calendar fchFinal);
                
                /**
                 * Sets (as xml) the "FchFinal" element
                 */
                void xsetFchFinal(org.apache.xmlbeans.XmlDate fchFinal);
                
                /**
                 * Gets the "Correlativo" element
                 */
                int getCorrelativo();
                
                /**
                 * Gets (as xml) the "Correlativo" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo xgetCorrelativo();
                
                /**
                 * True if has "Correlativo" element
                 */
                boolean isSetCorrelativo();
                
                /**
                 * Sets the "Correlativo" element
                 */
                void setCorrelativo(int correlativo);
                
                /**
                 * Sets (as xml) the "Correlativo" element
                 */
                void xsetCorrelativo(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo correlativo);
                
                /**
                 * Unsets the "Correlativo" element
                 */
                void unsetCorrelativo();
                
                /**
                 * Gets the "SecEnvio" element
                 */
                int getSecEnvio();
                
                /**
                 * Gets (as xml) the "SecEnvio" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio xgetSecEnvio();
                
                /**
                 * Sets the "SecEnvio" element
                 */
                void setSecEnvio(int secEnvio);
                
                /**
                 * Sets (as xml) the "SecEnvio" element
                 */
                void xsetSecEnvio(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio secEnvio);
                
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
                 * An XML Correlativo(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Caratula$Correlativo.
                 */
                public interface Correlativo extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Correlativo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("correlativoe690elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.Correlativo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML SecEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Caratula$SecEnvio.
                 */
                public interface SecEnvio extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SecEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("secenviodb3aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula.SecEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula newInstance() {
                      return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML Resumen(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Resumen extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resumen.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("resumenfde6elemtype");
                
                /**
                 * Gets the "TipoDocumento" element
                 */
                java.math.BigInteger getTipoDocumento();
                
                /**
                 * Gets (as xml) the "TipoDocumento" element
                 */
                cl.sii.siiDte.consumofolios.TipoConsumoType xgetTipoDocumento();
                
                /**
                 * Sets the "TipoDocumento" element
                 */
                void setTipoDocumento(java.math.BigInteger tipoDocumento);
                
                /**
                 * Sets (as xml) the "TipoDocumento" element
                 */
                void xsetTipoDocumento(cl.sii.siiDte.consumofolios.TipoConsumoType tipoDocumento);
                
                /**
                 * Gets the "MntNeto" element
                 */
                long getMntNeto();
                
                /**
                 * Gets (as xml) the "MntNeto" element
                 */
                cl.sii.siiDte.consumofolios.MontoType xgetMntNeto();
                
                /**
                 * True if has "MntNeto" element
                 */
                boolean isSetMntNeto();
                
                /**
                 * Sets the "MntNeto" element
                 */
                void setMntNeto(long mntNeto);
                
                /**
                 * Sets (as xml) the "MntNeto" element
                 */
                void xsetMntNeto(cl.sii.siiDte.consumofolios.MontoType mntNeto);
                
                /**
                 * Unsets the "MntNeto" element
                 */
                void unsetMntNeto();
                
                /**
                 * Gets the "MntIva" element
                 */
                long getMntIva();
                
                /**
                 * Gets (as xml) the "MntIva" element
                 */
                cl.sii.siiDte.consumofolios.MontoType xgetMntIva();
                
                /**
                 * True if has "MntIva" element
                 */
                boolean isSetMntIva();
                
                /**
                 * Sets the "MntIva" element
                 */
                void setMntIva(long mntIva);
                
                /**
                 * Sets (as xml) the "MntIva" element
                 */
                void xsetMntIva(cl.sii.siiDte.consumofolios.MontoType mntIva);
                
                /**
                 * Unsets the "MntIva" element
                 */
                void unsetMntIva();
                
                /**
                 * Gets the "TasaIVA" element
                 */
                java.math.BigDecimal getTasaIVA();
                
                /**
                 * Gets (as xml) the "TasaIVA" element
                 */
                cl.sii.siiDte.consumofolios.PctType xgetTasaIVA();
                
                /**
                 * True if has "TasaIVA" element
                 */
                boolean isSetTasaIVA();
                
                /**
                 * Sets the "TasaIVA" element
                 */
                void setTasaIVA(java.math.BigDecimal tasaIVA);
                
                /**
                 * Sets (as xml) the "TasaIVA" element
                 */
                void xsetTasaIVA(cl.sii.siiDte.consumofolios.PctType tasaIVA);
                
                /**
                 * Unsets the "TasaIVA" element
                 */
                void unsetTasaIVA();
                
                /**
                 * Gets the "MntExento" element
                 */
                long getMntExento();
                
                /**
                 * Gets (as xml) the "MntExento" element
                 */
                cl.sii.siiDte.consumofolios.MontoType xgetMntExento();
                
                /**
                 * True if has "MntExento" element
                 */
                boolean isSetMntExento();
                
                /**
                 * Sets the "MntExento" element
                 */
                void setMntExento(long mntExento);
                
                /**
                 * Sets (as xml) the "MntExento" element
                 */
                void xsetMntExento(cl.sii.siiDte.consumofolios.MontoType mntExento);
                
                /**
                 * Unsets the "MntExento" element
                 */
                void unsetMntExento();
                
                /**
                 * Gets the "MntTotal" element
                 */
                long getMntTotal();
                
                /**
                 * Gets (as xml) the "MntTotal" element
                 */
                cl.sii.siiDte.consumofolios.MontoType xgetMntTotal();
                
                /**
                 * Sets the "MntTotal" element
                 */
                void setMntTotal(long mntTotal);
                
                /**
                 * Sets (as xml) the "MntTotal" element
                 */
                void xsetMntTotal(cl.sii.siiDte.consumofolios.MontoType mntTotal);
                
                /**
                 * Gets the "FoliosEmitidos" element
                 */
                int getFoliosEmitidos();
                
                /**
                 * Gets (as xml) the "FoliosEmitidos" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos xgetFoliosEmitidos();
                
                /**
                 * Sets the "FoliosEmitidos" element
                 */
                void setFoliosEmitidos(int foliosEmitidos);
                
                /**
                 * Sets (as xml) the "FoliosEmitidos" element
                 */
                void xsetFoliosEmitidos(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos foliosEmitidos);
                
                /**
                 * Gets the "FoliosAnulados" element
                 */
                int getFoliosAnulados();
                
                /**
                 * Gets (as xml) the "FoliosAnulados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados xgetFoliosAnulados();
                
                /**
                 * Sets the "FoliosAnulados" element
                 */
                void setFoliosAnulados(int foliosAnulados);
                
                /**
                 * Sets (as xml) the "FoliosAnulados" element
                 */
                void xsetFoliosAnulados(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados foliosAnulados);
                
                /**
                 * Gets the "FoliosUtilizados" element
                 */
                int getFoliosUtilizados();
                
                /**
                 * Gets (as xml) the "FoliosUtilizados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados xgetFoliosUtilizados();
                
                /**
                 * Sets the "FoliosUtilizados" element
                 */
                void setFoliosUtilizados(int foliosUtilizados);
                
                /**
                 * Sets (as xml) the "FoliosUtilizados" element
                 */
                void xsetFoliosUtilizados(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados foliosUtilizados);
                
                /**
                 * Gets array of all "RangoUtilizados" elements
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados[] getRangoUtilizadosArray();
                
                /**
                 * Gets ith "RangoUtilizados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados getRangoUtilizadosArray(int i);
                
                /**
                 * Returns number of "RangoUtilizados" element
                 */
                int sizeOfRangoUtilizadosArray();
                
                /**
                 * Sets array of all "RangoUtilizados" element
                 */
                void setRangoUtilizadosArray(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados[] rangoUtilizadosArray);
                
                /**
                 * Sets ith "RangoUtilizados" element
                 */
                void setRangoUtilizadosArray(int i, cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados rangoUtilizados);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RangoUtilizados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados insertNewRangoUtilizados(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RangoUtilizados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados addNewRangoUtilizados();
                
                /**
                 * Removes the ith "RangoUtilizados" element
                 */
                void removeRangoUtilizados(int i);
                
                /**
                 * Gets array of all "RangoAnulados" elements
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados[] getRangoAnuladosArray();
                
                /**
                 * Gets ith "RangoAnulados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados getRangoAnuladosArray(int i);
                
                /**
                 * Returns number of "RangoAnulados" element
                 */
                int sizeOfRangoAnuladosArray();
                
                /**
                 * Sets array of all "RangoAnulados" element
                 */
                void setRangoAnuladosArray(cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados[] rangoAnuladosArray);
                
                /**
                 * Sets ith "RangoAnulados" element
                 */
                void setRangoAnuladosArray(int i, cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados rangoAnulados);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RangoAnulados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados insertNewRangoAnulados(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RangoAnulados" element
                 */
                cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados addNewRangoAnulados();
                
                /**
                 * Removes the ith "RangoAnulados" element
                 */
                void removeRangoAnulados(int i);
                
                /**
                 * An XML FoliosEmitidos(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Resumen$FoliosEmitidos.
                 */
                public interface FoliosEmitidos extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FoliosEmitidos.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("foliosemitidosadbeelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosEmitidos) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FoliosAnulados(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Resumen$FoliosAnulados.
                 */
                public interface FoliosAnulados extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FoliosAnulados.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("foliosanulados9677elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosAnulados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML FoliosUtilizados(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.consumofolios.ConsumoFoliosDocument$ConsumoFolios$DocumentoConsumoFolios$Resumen$FoliosUtilizados.
                 */
                public interface FoliosUtilizados extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FoliosUtilizados.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("foliosutilizadosdb26elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.FoliosUtilizados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RangoUtilizados(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface RangoUtilizados extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangoUtilizados.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("rangoutilizadosc5d3elemtype");
                    
                    /**
                     * Gets the "Inicial" element
                     */
                    long getInicial();
                    
                    /**
                     * Gets (as xml) the "Inicial" element
                     */
                    cl.sii.siiDte.consumofolios.FolioType xgetInicial();
                    
                    /**
                     * Sets the "Inicial" element
                     */
                    void setInicial(long inicial);
                    
                    /**
                     * Sets (as xml) the "Inicial" element
                     */
                    void xsetInicial(cl.sii.siiDte.consumofolios.FolioType inicial);
                    
                    /**
                     * Gets the "Final" element
                     */
                    long getFinal();
                    
                    /**
                     * Gets (as xml) the "Final" element
                     */
                    cl.sii.siiDte.consumofolios.FolioType xgetFinal();
                    
                    /**
                     * Sets the "Final" element
                     */
                    void setFinal(long xfinal);
                    
                    /**
                     * Sets (as xml) the "Final" element
                     */
                    void xsetFinal(cl.sii.siiDte.consumofolios.FolioType xfinal);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoUtilizados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RangoAnulados(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface RangoAnulados extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RangoAnulados.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sECEC57E883272AC66973C4BE710C88C3").resolveHandle("rangoanulados4864elemtype");
                    
                    /**
                     * Gets the "Inicial" element
                     */
                    long getInicial();
                    
                    /**
                     * Gets (as xml) the "Inicial" element
                     */
                    cl.sii.siiDte.consumofolios.FolioType xgetInicial();
                    
                    /**
                     * Sets the "Inicial" element
                     */
                    void setInicial(long inicial);
                    
                    /**
                     * Sets (as xml) the "Inicial" element
                     */
                    void xsetInicial(cl.sii.siiDte.consumofolios.FolioType inicial);
                    
                    /**
                     * Gets the "Final" element
                     */
                    long getFinal();
                    
                    /**
                     * Gets (as xml) the "Final" element
                     */
                    cl.sii.siiDte.consumofolios.FolioType xgetFinal();
                    
                    /**
                     * True if has "Final" element
                     */
                    boolean isSetFinal();
                    
                    /**
                     * Sets the "Final" element
                     */
                    void setFinal(long xfinal);
                    
                    /**
                     * Sets (as xml) the "Final" element
                     */
                    void xsetFinal(cl.sii.siiDte.consumofolios.FolioType xfinal);
                    
                    /**
                     * Unsets the "Final" element
                     */
                    void unsetFinal();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados newInstance() {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen.RangoAnulados) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen newInstance() {
                      return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios.Resumen) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios newInstance() {
                  return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios.DocumentoConsumoFolios) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios newInstance() {
              return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument.ConsumoFolios) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument newInstance() {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.consumofolios.ConsumoFoliosDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.consumofolios.ConsumoFoliosDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
