/*
 * An XML document type.
 * Localname: RespuestaDTE
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.RespuestaDTEDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * A document containing one RespuestaDTE(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface RespuestaDTEDocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.RespuestaDTEDocumentExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RespuestaDTEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("respuestadteb036doctype");
    
    /**
     * Gets the "RespuestaDTE" element
     */
    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE getRespuestaDTE();
    
    /**
     * Sets the "RespuestaDTE" element
     */
    void setRespuestaDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE respuestaDTE);
    
    /**
     * Appends and returns a new empty "RespuestaDTE" element
     */
    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE addNewRespuestaDTE();
    
    /**
     * An XML RespuestaDTE(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface RespuestaDTE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RespuestaDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("respuestadte29e7elemtype");
        
        /**
         * Gets the "Resultado" element
         */
        cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado getResultado();
        
        /**
         * Sets the "Resultado" element
         */
        void setResultado(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado resultado);
        
        /**
         * Appends and returns a new empty "Resultado" element
         */
        cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado addNewResultado();
        
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
         * An XML Resultado(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface Resultado extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Resultado.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resultado71ccelemtype");
            
            /**
             * Gets the "Caratula" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula getCaratula();
            
            /**
             * Sets the "Caratula" element
             */
            void setCaratula(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula caratula);
            
            /**
             * Appends and returns a new empty "Caratula" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula addNewCaratula();
            
            /**
             * Gets array of all "RecepcionEnvio" elements
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio[] getRecepcionEnvioArray();
            
            /**
             * Gets ith "RecepcionEnvio" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio getRecepcionEnvioArray(int i);
            
            /**
             * Returns number of "RecepcionEnvio" element
             */
            int sizeOfRecepcionEnvioArray();
            
            /**
             * Sets array of all "RecepcionEnvio" element
             */
            void setRecepcionEnvioArray(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio[] recepcionEnvioArray);
            
            /**
             * Sets ith "RecepcionEnvio" element
             */
            void setRecepcionEnvioArray(int i, cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio recepcionEnvio);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "RecepcionEnvio" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio insertNewRecepcionEnvio(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "RecepcionEnvio" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio addNewRecepcionEnvio();
            
            /**
             * Removes the ith "RecepcionEnvio" element
             */
            void removeRecepcionEnvio(int i);
            
            /**
             * Gets array of all "ResultadoDTE" elements
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE[] getResultadoDTEArray();
            
            /**
             * Gets ith "ResultadoDTE" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE getResultadoDTEArray(int i);
            
            /**
             * Returns number of "ResultadoDTE" element
             */
            int sizeOfResultadoDTEArray();
            
            /**
             * Sets array of all "ResultadoDTE" element
             */
            void setResultadoDTEArray(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE[] resultadoDTEArray);
            
            /**
             * Sets ith "ResultadoDTE" element
             */
            void setResultadoDTEArray(int i, cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE resultadoDTE);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ResultadoDTE" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE insertNewResultadoDTE(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ResultadoDTE" element
             */
            cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE addNewResultadoDTE();
            
            /**
             * Removes the ith "ResultadoDTE" element
             */
            void removeResultadoDTE(int i);
            
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
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caratula.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("caratulad46delemtype");
                
                /**
                 * Gets the "RutResponde" element
                 */
                java.lang.String getRutResponde();
                
                /**
                 * Gets (as xml) the "RutResponde" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde xgetRutResponde();
                
                /**
                 * Sets the "RutResponde" element
                 */
                void setRutResponde(java.lang.String rutResponde);
                
                /**
                 * Sets (as xml) the "RutResponde" element
                 */
                void xsetRutResponde(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde rutResponde);
                
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
                 * Gets the "IdRespuesta" element
                 */
                long getIdRespuesta();
                
                /**
                 * Gets (as xml) the "IdRespuesta" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta xgetIdRespuesta();
                
                /**
                 * Sets the "IdRespuesta" element
                 */
                void setIdRespuesta(long idRespuesta);
                
                /**
                 * Sets (as xml) the "IdRespuesta" element
                 */
                void xsetIdRespuesta(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta idRespuesta);
                
                /**
                 * Gets the "NroDetalles" element
                 */
                int getNroDetalles();
                
                /**
                 * Gets (as xml) the "NroDetalles" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles xgetNroDetalles();
                
                /**
                 * Sets the "NroDetalles" element
                 */
                void setNroDetalles(int nroDetalles);
                
                /**
                 * Sets (as xml) the "NroDetalles" element
                 */
                void xsetNroDetalles(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles nroDetalles);
                
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
                 * Gets the "TmstFirmaResp" element
                 */
                java.util.Calendar getTmstFirmaResp();
                
                /**
                 * Gets (as xml) the "TmstFirmaResp" element
                 */
                org.apache.xmlbeans.XmlDateTime xgetTmstFirmaResp();
                
                /**
                 * Sets the "TmstFirmaResp" element
                 */
                void setTmstFirmaResp(java.util.Calendar tmstFirmaResp);
                
                /**
                 * Sets (as xml) the "TmstFirmaResp" element
                 */
                void xsetTmstFirmaResp(org.apache.xmlbeans.XmlDateTime tmstFirmaResp);
                
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
                 * An XML RutResponde(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$Caratula$RutResponde.
                 */
                public interface RutResponde extends cl.sii.siiDte.RUTType
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RutResponde.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("rutresponde0a1aelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.RutResponde) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML IdRespuesta(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$Caratula$IdRespuesta.
                 */
                public interface IdRespuesta extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdRespuesta.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("idrespuestabfdeelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.IdRespuesta) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroDetalles(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$Caratula$NroDetalles.
                 */
                public interface NroDetalles extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroDetalles.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("nrodetalles2da0elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula.NroDetalles) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula newInstance() {
                      return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.Caratula) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML RecepcionEnvio(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface RecepcionEnvio extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecepcionEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recepcionenvio1a7delemtype");
                
                /**
                 * Gets the "NmbEnvio" element
                 */
                java.lang.String getNmbEnvio();
                
                /**
                 * Gets (as xml) the "NmbEnvio" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio xgetNmbEnvio();
                
                /**
                 * Sets the "NmbEnvio" element
                 */
                void setNmbEnvio(java.lang.String nmbEnvio);
                
                /**
                 * Sets (as xml) the "NmbEnvio" element
                 */
                void xsetNmbEnvio(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio nmbEnvio);
                
                /**
                 * Gets the "FchRecep" element
                 */
                java.util.Calendar getFchRecep();
                
                /**
                 * Gets (as xml) the "FchRecep" element
                 */
                org.apache.xmlbeans.XmlDateTime xgetFchRecep();
                
                /**
                 * Sets the "FchRecep" element
                 */
                void setFchRecep(java.util.Calendar fchRecep);
                
                /**
                 * Sets (as xml) the "FchRecep" element
                 */
                void xsetFchRecep(org.apache.xmlbeans.XmlDateTime fchRecep);
                
                /**
                 * Gets the "CodEnvio" element
                 */
                long getCodEnvio();
                
                /**
                 * Gets (as xml) the "CodEnvio" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio xgetCodEnvio();
                
                /**
                 * Sets the "CodEnvio" element
                 */
                void setCodEnvio(long codEnvio);
                
                /**
                 * Sets (as xml) the "CodEnvio" element
                 */
                void xsetCodEnvio(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio codEnvio);
                
                /**
                 * Gets the "EnvioDTEID" element
                 */
                java.lang.String getEnvioDTEID();
                
                /**
                 * Gets (as xml) the "EnvioDTEID" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID xgetEnvioDTEID();
                
                /**
                 * Sets the "EnvioDTEID" element
                 */
                void setEnvioDTEID(java.lang.String envioDTEID);
                
                /**
                 * Sets (as xml) the "EnvioDTEID" element
                 */
                void xsetEnvioDTEID(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID envioDTEID);
                
                /**
                 * Gets the "Digest" element
                 */
                byte[] getDigest();
                
                /**
                 * Gets (as xml) the "Digest" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetDigest();
                
                /**
                 * True if has "Digest" element
                 */
                boolean isSetDigest();
                
                /**
                 * Sets the "Digest" element
                 */
                void setDigest(byte[] digest);
                
                /**
                 * Sets (as xml) the "Digest" element
                 */
                void xsetDigest(org.apache.xmlbeans.XmlBase64Binary digest);
                
                /**
                 * Unsets the "Digest" element
                 */
                void unsetDigest();
                
                /**
                 * Gets the "RutEmisor" element
                 */
                java.lang.String getRutEmisor();
                
                /**
                 * Gets (as xml) the "RutEmisor" element
                 */
                cl.sii.siiDte.RUTType xgetRutEmisor();
                
                /**
                 * True if has "RutEmisor" element
                 */
                boolean isSetRutEmisor();
                
                /**
                 * Sets the "RutEmisor" element
                 */
                void setRutEmisor(java.lang.String rutEmisor);
                
                /**
                 * Sets (as xml) the "RutEmisor" element
                 */
                void xsetRutEmisor(cl.sii.siiDte.RUTType rutEmisor);
                
                /**
                 * Unsets the "RutEmisor" element
                 */
                void unsetRutEmisor();
                
                /**
                 * Gets the "RutReceptor" element
                 */
                java.lang.String getRutReceptor();
                
                /**
                 * Gets (as xml) the "RutReceptor" element
                 */
                cl.sii.siiDte.RUTType xgetRutReceptor();
                
                /**
                 * True if has "RutReceptor" element
                 */
                boolean isSetRutReceptor();
                
                /**
                 * Sets the "RutReceptor" element
                 */
                void setRutReceptor(java.lang.String rutReceptor);
                
                /**
                 * Sets (as xml) the "RutReceptor" element
                 */
                void xsetRutReceptor(cl.sii.siiDte.RUTType rutReceptor);
                
                /**
                 * Unsets the "RutReceptor" element
                 */
                void unsetRutReceptor();
                
                /**
                 * Gets the "EstadoRecepEnv" element
                 */
                int getEstadoRecepEnv();
                
                /**
                 * Gets (as xml) the "EstadoRecepEnv" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv xgetEstadoRecepEnv();
                
                /**
                 * Sets the "EstadoRecepEnv" element
                 */
                void setEstadoRecepEnv(int estadoRecepEnv);
                
                /**
                 * Sets (as xml) the "EstadoRecepEnv" element
                 */
                void xsetEstadoRecepEnv(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv estadoRecepEnv);
                
                /**
                 * Gets the "RecepEnvGlosa" element
                 */
                java.lang.String getRecepEnvGlosa();
                
                /**
                 * Gets (as xml) the "RecepEnvGlosa" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa xgetRecepEnvGlosa();
                
                /**
                 * Sets the "RecepEnvGlosa" element
                 */
                void setRecepEnvGlosa(java.lang.String recepEnvGlosa);
                
                /**
                 * Sets (as xml) the "RecepEnvGlosa" element
                 */
                void xsetRecepEnvGlosa(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa recepEnvGlosa);
                
                /**
                 * Gets the "NroDTE" element
                 */
                int getNroDTE();
                
                /**
                 * Gets (as xml) the "NroDTE" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE xgetNroDTE();
                
                /**
                 * True if has "NroDTE" element
                 */
                boolean isSetNroDTE();
                
                /**
                 * Sets the "NroDTE" element
                 */
                void setNroDTE(int nroDTE);
                
                /**
                 * Sets (as xml) the "NroDTE" element
                 */
                void xsetNroDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE nroDTE);
                
                /**
                 * Unsets the "NroDTE" element
                 */
                void unsetNroDTE();
                
                /**
                 * Gets array of all "RecepcionDTE" elements
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE[] getRecepcionDTEArray();
                
                /**
                 * Gets ith "RecepcionDTE" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE getRecepcionDTEArray(int i);
                
                /**
                 * Returns number of "RecepcionDTE" element
                 */
                int sizeOfRecepcionDTEArray();
                
                /**
                 * Sets array of all "RecepcionDTE" element
                 */
                void setRecepcionDTEArray(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE[] recepcionDTEArray);
                
                /**
                 * Sets ith "RecepcionDTE" element
                 */
                void setRecepcionDTEArray(int i, cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE recepcionDTE);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "RecepcionDTE" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE insertNewRecepcionDTE(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "RecepcionDTE" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE addNewRecepcionDTE();
                
                /**
                 * Removes the ith "RecepcionDTE" element
                 */
                void removeRecepcionDTE(int i);
                
                /**
                 * An XML NmbEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$NmbEnvio.
                 */
                public interface NmbEnvio extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NmbEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("nmbenvio3f49elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NmbEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CodEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$CodEnvio.
                 */
                public interface CodEnvio extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("codenvioddf4elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.CodEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML EnvioDTEID(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$EnvioDTEID.
                 */
                public interface EnvioDTEID extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EnvioDTEID.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("enviodteid6956elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EnvioDTEID) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML EstadoRecepEnv(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$EstadoRecepEnv.
                 */
                public interface EstadoRecepEnv extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EstadoRecepEnv.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("estadorecepenv1c71elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.EstadoRecepEnv) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RecepEnvGlosa(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$RecepEnvGlosa.
                 */
                public interface RecepEnvGlosa extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecepEnvGlosa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recepenvglosac52felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepEnvGlosa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML NroDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$NroDTE.
                 */
                public interface NroDTE extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NroDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("nrodte68e3elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.NroDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML RecepcionDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface RecepcionDTE extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecepcionDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recepciondte3deeelemtype");
                    
                    /**
                     * Gets the "TipoDTE" element
                     */
                    java.math.BigInteger getTipoDTE();
                    
                    /**
                     * Gets (as xml) the "TipoDTE" element
                     */
                    cl.sii.siiDte.DTEType xgetTipoDTE();
                    
                    /**
                     * Sets the "TipoDTE" element
                     */
                    void setTipoDTE(java.math.BigInteger tipoDTE);
                    
                    /**
                     * Sets (as xml) the "TipoDTE" element
                     */
                    void xsetTipoDTE(cl.sii.siiDte.DTEType tipoDTE);
                    
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
                     * Gets the "EstadoRecepDTE" element
                     */
                    int getEstadoRecepDTE();
                    
                    /**
                     * Gets (as xml) the "EstadoRecepDTE" element
                     */
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE xgetEstadoRecepDTE();
                    
                    /**
                     * Sets the "EstadoRecepDTE" element
                     */
                    void setEstadoRecepDTE(int estadoRecepDTE);
                    
                    /**
                     * Sets (as xml) the "EstadoRecepDTE" element
                     */
                    void xsetEstadoRecepDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE estadoRecepDTE);
                    
                    /**
                     * Gets the "RecepDTEGlosa" element
                     */
                    java.lang.String getRecepDTEGlosa();
                    
                    /**
                     * Gets (as xml) the "RecepDTEGlosa" element
                     */
                    cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa xgetRecepDTEGlosa();
                    
                    /**
                     * Sets the "RecepDTEGlosa" element
                     */
                    void setRecepDTEGlosa(java.lang.String recepDTEGlosa);
                    
                    /**
                     * Sets (as xml) the "RecepDTEGlosa" element
                     */
                    void xsetRecepDTEGlosa(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa recepDTEGlosa);
                    
                    /**
                     * An XML EstadoRecepDTE(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$RecepcionDTE$EstadoRecepDTE.
                     */
                    public interface EstadoRecepDTE extends org.apache.xmlbeans.XmlNonNegativeInteger
                    {
                      int getIntValue();
                      void setIntValue(int i);
                      /** @deprecated */
                      int intValue();
                      /** @deprecated */
                      void set(int i);
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EstadoRecepDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("estadorecepdtef392elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE newInstance() {
                          return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.EstadoRecepDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML RecepDTEGlosa(@http://www.sii.cl/SiiDte).
                     *
                     * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$RecepcionEnvio$RecepcionDTE$RecepDTEGlosa.
                     */
                    public interface RecepDTEGlosa extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RecepDTEGlosa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recepdteglosa49e4elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa newValue(java.lang.Object obj) {
                          return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa) type.newValue( obj ); }
                        
                        public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa newInstance() {
                          return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE.RecepDTEGlosa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio.RecepcionDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio newInstance() {
                      return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.RecepcionEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML ResultadoDTE(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface ResultadoDTE extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ResultadoDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resultadodteadeaelemtype");
                
                /**
                 * Gets the "TipoDTE" element
                 */
                java.math.BigInteger getTipoDTE();
                
                /**
                 * Gets (as xml) the "TipoDTE" element
                 */
                cl.sii.siiDte.DTEType xgetTipoDTE();
                
                /**
                 * Sets the "TipoDTE" element
                 */
                void setTipoDTE(java.math.BigInteger tipoDTE);
                
                /**
                 * Sets (as xml) the "TipoDTE" element
                 */
                void xsetTipoDTE(cl.sii.siiDte.DTEType tipoDTE);
                
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
                 * Gets the "CodEnvio" element
                 */
                long getCodEnvio();
                
                /**
                 * Gets (as xml) the "CodEnvio" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio xgetCodEnvio();
                
                /**
                 * Sets the "CodEnvio" element
                 */
                void setCodEnvio(long codEnvio);
                
                /**
                 * Sets (as xml) the "CodEnvio" element
                 */
                void xsetCodEnvio(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio codEnvio);
                
                /**
                 * Gets the "EstadoDTE" element
                 */
                int getEstadoDTE();
                
                /**
                 * Gets (as xml) the "EstadoDTE" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE xgetEstadoDTE();
                
                /**
                 * Sets the "EstadoDTE" element
                 */
                void setEstadoDTE(int estadoDTE);
                
                /**
                 * Sets (as xml) the "EstadoDTE" element
                 */
                void xsetEstadoDTE(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE estadoDTE);
                
                /**
                 * Gets the "EstadoDTEGlosa" element
                 */
                java.lang.String getEstadoDTEGlosa();
                
                /**
                 * Gets (as xml) the "EstadoDTEGlosa" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa xgetEstadoDTEGlosa();
                
                /**
                 * Sets the "EstadoDTEGlosa" element
                 */
                void setEstadoDTEGlosa(java.lang.String estadoDTEGlosa);
                
                /**
                 * Sets (as xml) the "EstadoDTEGlosa" element
                 */
                void xsetEstadoDTEGlosa(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa estadoDTEGlosa);
                
                /**
                 * Gets the "CodRchDsc" element
                 */
                int getCodRchDsc();
                
                /**
                 * Gets (as xml) the "CodRchDsc" element
                 */
                cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc xgetCodRchDsc();
                
                /**
                 * True if has "CodRchDsc" element
                 */
                boolean isSetCodRchDsc();
                
                /**
                 * Sets the "CodRchDsc" element
                 */
                void setCodRchDsc(int codRchDsc);
                
                /**
                 * Sets (as xml) the "CodRchDsc" element
                 */
                void xsetCodRchDsc(cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc codRchDsc);
                
                /**
                 * Unsets the "CodRchDsc" element
                 */
                void unsetCodRchDsc();
                
                /**
                 * An XML CodEnvio(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$CodEnvio.
                 */
                public interface CodEnvio extends org.apache.xmlbeans.XmlPositiveInteger
                {
                    long getLongValue();
                    void setLongValue(long l);
                    /** @deprecated */
                    long longValue();
                    /** @deprecated */
                    void set(long l);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodEnvio.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("codenvioe321elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodEnvio) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML EstadoDTE(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$EstadoDTE.
                 */
                public interface EstadoDTE extends org.apache.xmlbeans.XmlNonNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EstadoDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("estadodtec605elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML EstadoDTEGlosa(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$EstadoDTEGlosa.
                 */
                public interface EstadoDTEGlosa extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EstadoDTEGlosa.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("estadodteglosac00felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.EstadoDTEGlosa) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML CodRchDsc(@http://www.sii.cl/SiiDte).
                 *
                 * This is an atomic type that is a restriction of cl.sii.siiDte.RespuestaDTEDocument$RespuestaDTE$Resultado$ResultadoDTE$CodRchDsc.
                 */
                public interface CodRchDsc extends org.apache.xmlbeans.XmlNegativeInteger
                {
                    int getIntValue();
                    void setIntValue(int i);
                    /** @deprecated */
                    int intValue();
                    /** @deprecated */
                    void set(int i);
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CodRchDsc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("codrchdscaf6belemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc newValue(java.lang.Object obj) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc) type.newValue( obj ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc newInstance() {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE.CodRchDsc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE newInstance() {
                      return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado.ResultadoDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado newInstance() {
                  return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE.Resultado) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE newInstance() {
              return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.RespuestaDTEDocument.RespuestaDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.RespuestaDTEDocument newInstance() {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.RespuestaDTEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.RespuestaDTEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.RespuestaDTEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.RespuestaDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
