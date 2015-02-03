/*
 * An XML document type.
 * Localname: RESULTADO_ENVIO
 * Namespace: 
 * Java type: noNamespace.RESULTADOENVIODocument
 *
 * Automatically generated - do not modify.
 */
package noNamespace;


/**
 * A document containing one RESULTADO_ENVIO(@) element.
 *
 * This is a complex type.
 */
public interface RESULTADOENVIODocument extends org.apache.xmlbeans.XmlObject, cl.nic.dte.extension.DTEXMLExtension
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESULTADOENVIODocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resultadoenvio482adoctype");
    
    /**
     * Gets the "RESULTADO_ENVIO" element
     */
    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO getRESULTADOENVIO();
    
    /**
     * Sets the "RESULTADO_ENVIO" element
     */
    void setRESULTADOENVIO(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO resultadoenvio);
    
    /**
     * Appends and returns a new empty "RESULTADO_ENVIO" element
     */
    noNamespace.RESULTADOENVIODocument.RESULTADOENVIO addNewRESULTADOENVIO();
    
    /**
     * An XML RESULTADO_ENVIO(@).
     *
     * This is a complex type.
     */
    public interface RESULTADOENVIO extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RESULTADOENVIO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("resultadoenviodca9elemtype");
        
        /**
         * Gets the "IDENTIFICACION" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION getIDENTIFICACION();
        
        /**
         * Sets the "IDENTIFICACION" element
         */
        void setIDENTIFICACION(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION identificacion);
        
        /**
         * Appends and returns a new empty "IDENTIFICACION" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION addNewIDENTIFICACION();
        
        /**
         * Gets the "ESTADISTICA" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA getESTADISTICA();
        
        /**
         * True if has "ESTADISTICA" element
         */
        boolean isSetESTADISTICA();
        
        /**
         * Sets the "ESTADISTICA" element
         */
        void setESTADISTICA(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA estadistica);
        
        /**
         * Appends and returns a new empty "ESTADISTICA" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA addNewESTADISTICA();
        
        /**
         * Unsets the "ESTADISTICA" element
         */
        void unsetESTADISTICA();
        
        /**
         * Gets the "ERRORENVIO" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO getERRORENVIO();
        
        /**
         * True if has "ERRORENVIO" element
         */
        boolean isSetERRORENVIO();
        
        /**
         * Sets the "ERRORENVIO" element
         */
        void setERRORENVIO(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO errorenvio);
        
        /**
         * Appends and returns a new empty "ERRORENVIO" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO addNewERRORENVIO();
        
        /**
         * Unsets the "ERRORENVIO" element
         */
        void unsetERRORENVIO();
        
        /**
         * Gets the "REVISIONENVIO" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO getREVISIONENVIO();
        
        /**
         * True if has "REVISIONENVIO" element
         */
        boolean isSetREVISIONENVIO();
        
        /**
         * Sets the "REVISIONENVIO" element
         */
        void setREVISIONENVIO(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO revisionenvio);
        
        /**
         * Appends and returns a new empty "REVISIONENVIO" element
         */
        noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO addNewREVISIONENVIO();
        
        /**
         * Unsets the "REVISIONENVIO" element
         */
        void unsetREVISIONENVIO();
        
        /**
         * An XML IDENTIFICACION(@).
         *
         * This is a complex type.
         */
        public interface IDENTIFICACION extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IDENTIFICACION.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("identificacion8bd4elemtype");
            
            /**
             * Gets the "RUTEMISOR" element
             */
            java.lang.String getRUTEMISOR();
            
            /**
             * Gets (as xml) the "RUTEMISOR" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR xgetRUTEMISOR();
            
            /**
             * Sets the "RUTEMISOR" element
             */
            void setRUTEMISOR(java.lang.String rutemisor);
            
            /**
             * Sets (as xml) the "RUTEMISOR" element
             */
            void xsetRUTEMISOR(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR rutemisor);
            
            /**
             * Gets the "RUTENVIA" element
             */
            java.lang.String getRUTENVIA();
            
            /**
             * Gets (as xml) the "RUTENVIA" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA xgetRUTENVIA();
            
            /**
             * Sets the "RUTENVIA" element
             */
            void setRUTENVIA(java.lang.String rutenvia);
            
            /**
             * Sets (as xml) the "RUTENVIA" element
             */
            void xsetRUTENVIA(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA rutenvia);
            
            /**
             * Gets the "TRACKID" element
             */
            long getTRACKID();
            
            /**
             * Gets (as xml) the "TRACKID" element
             */
            noNamespace.EnteroType xgetTRACKID();
            
            /**
             * Sets the "TRACKID" element
             */
            void setTRACKID(long trackid);
            
            /**
             * Sets (as xml) the "TRACKID" element
             */
            void xsetTRACKID(noNamespace.EnteroType trackid);
            
            /**
             * Gets the "TMSTRECEPCION" element
             */
            java.lang.String getTMSTRECEPCION();
            
            /**
             * Gets (as xml) the "TMSTRECEPCION" element
             */
            org.apache.xmlbeans.XmlString xgetTMSTRECEPCION();
            
            /**
             * Sets the "TMSTRECEPCION" element
             */
            void setTMSTRECEPCION(java.lang.String tmstrecepcion);
            
            /**
             * Sets (as xml) the "TMSTRECEPCION" element
             */
            void xsetTMSTRECEPCION(org.apache.xmlbeans.XmlString tmstrecepcion);
            
            /**
             * Gets the "ESTADO" element
             */
            java.lang.String getESTADO();
            
            /**
             * Gets (as xml) the "ESTADO" element
             */
            org.apache.xmlbeans.XmlString xgetESTADO();
            
            /**
             * Sets the "ESTADO" element
             */
            void setESTADO(java.lang.String estado);
            
            /**
             * Sets (as xml) the "ESTADO" element
             */
            void xsetESTADO(org.apache.xmlbeans.XmlString estado);
            
            /**
             * An XML RUTEMISOR(@).
             *
             * This is an atomic type that is a restriction of noNamespace.RESULTADOENVIODocument$RESULTADOENVIO$IDENTIFICACION$RUTEMISOR.
             */
            public interface RUTEMISOR extends noNamespace.RUTType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RUTEMISOR.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("rutemisor8bb2elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR newValue(java.lang.Object obj) {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR) type.newValue( obj ); }
                    
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR newInstance() {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTEMISOR) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML RUTENVIA(@).
             *
             * This is an atomic type that is a restriction of noNamespace.RESULTADOENVIODocument$RESULTADOENVIO$IDENTIFICACION$RUTENVIA.
             */
            public interface RUTENVIA extends noNamespace.RUTType
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RUTENVIA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("rutenvia6e74elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA newValue(java.lang.Object obj) {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA) type.newValue( obj ); }
                    
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA newInstance() {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION.RUTENVIA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION newInstance() {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.IDENTIFICACION) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ESTADISTICA(@).
         *
         * This is a complex type.
         */
        public interface ESTADISTICA extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ESTADISTICA.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("estadistica6b2belemtype");
            
            /**
             * Gets array of all "SUBTOTAL" elements
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL[] getSUBTOTALArray();
            
            /**
             * Gets ith "SUBTOTAL" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL getSUBTOTALArray(int i);
            
            /**
             * Returns number of "SUBTOTAL" element
             */
            int sizeOfSUBTOTALArray();
            
            /**
             * Sets array of all "SUBTOTAL" element
             */
            void setSUBTOTALArray(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL[] subtotalArray);
            
            /**
             * Sets ith "SUBTOTAL" element
             */
            void setSUBTOTALArray(int i, noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL subtotal);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "SUBTOTAL" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL insertNewSUBTOTAL(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "SUBTOTAL" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL addNewSUBTOTAL();
            
            /**
             * Removes the ith "SUBTOTAL" element
             */
            void removeSUBTOTAL(int i);
            
            /**
             * An XML SUBTOTAL(@).
             *
             * This is a complex type.
             */
            public interface SUBTOTAL extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SUBTOTAL.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("subtotal5ebbelemtype");
                
                /**
                 * Gets the "TIPODOC" element
                 */
                java.math.BigInteger getTIPODOC();
                
                /**
                 * Gets (as xml) the "TIPODOC" element
                 */
                noNamespace.DTEType xgetTIPODOC();
                
                /**
                 * Sets the "TIPODOC" element
                 */
                void setTIPODOC(java.math.BigInteger tipodoc);
                
                /**
                 * Sets (as xml) the "TIPODOC" element
                 */
                void xsetTIPODOC(noNamespace.DTEType tipodoc);
                
                /**
                 * Gets the "INFORMADO" element
                 */
                long getINFORMADO();
                
                /**
                 * Gets (as xml) the "INFORMADO" element
                 */
                noNamespace.EnteroType xgetINFORMADO();
                
                /**
                 * Sets the "INFORMADO" element
                 */
                void setINFORMADO(long informado);
                
                /**
                 * Sets (as xml) the "INFORMADO" element
                 */
                void xsetINFORMADO(noNamespace.EnteroType informado);
                
                /**
                 * Gets the "RECHAZO" element
                 */
                long getRECHAZO();
                
                /**
                 * Gets (as xml) the "RECHAZO" element
                 */
                noNamespace.EnteroType xgetRECHAZO();
                
                /**
                 * True if has "RECHAZO" element
                 */
                boolean isSetRECHAZO();
                
                /**
                 * Sets the "RECHAZO" element
                 */
                void setRECHAZO(long rechazo);
                
                /**
                 * Sets (as xml) the "RECHAZO" element
                 */
                void xsetRECHAZO(noNamespace.EnteroType rechazo);
                
                /**
                 * Unsets the "RECHAZO" element
                 */
                void unsetRECHAZO();
                
                /**
                 * Gets the "REPARO" element
                 */
                long getREPARO();
                
                /**
                 * Gets (as xml) the "REPARO" element
                 */
                noNamespace.EnteroType xgetREPARO();
                
                /**
                 * True if has "REPARO" element
                 */
                boolean isSetREPARO();
                
                /**
                 * Sets the "REPARO" element
                 */
                void setREPARO(long reparo);
                
                /**
                 * Sets (as xml) the "REPARO" element
                 */
                void xsetREPARO(noNamespace.EnteroType reparo);
                
                /**
                 * Unsets the "REPARO" element
                 */
                void unsetREPARO();
                
                /**
                 * Gets the "ACEPTA" element
                 */
                long getACEPTA();
                
                /**
                 * Gets (as xml) the "ACEPTA" element
                 */
                noNamespace.EnteroType xgetACEPTA();
                
                /**
                 * True if has "ACEPTA" element
                 */
                boolean isSetACEPTA();
                
                /**
                 * Sets the "ACEPTA" element
                 */
                void setACEPTA(long acepta);
                
                /**
                 * Sets (as xml) the "ACEPTA" element
                 */
                void xsetACEPTA(noNamespace.EnteroType acepta);
                
                /**
                 * Unsets the "ACEPTA" element
                 */
                void unsetACEPTA();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL newInstance() {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA.SUBTOTAL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA newInstance() {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ESTADISTICA) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML ERRORENVIO(@).
         *
         * This is a complex type.
         */
        public interface ERRORENVIO extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ERRORENVIO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("errorenvio6b80elemtype");
            
            /**
             * Gets array of all "DETERRENVIO" elements
             */
            java.lang.String[] getDETERRENVIOArray();
            
            /**
             * Gets ith "DETERRENVIO" element
             */
            java.lang.String getDETERRENVIOArray(int i);
            
            /**
             * Gets (as xml) array of all "DETERRENVIO" elements
             */
            org.apache.xmlbeans.XmlString[] xgetDETERRENVIOArray();
            
            /**
             * Gets (as xml) ith "DETERRENVIO" element
             */
            org.apache.xmlbeans.XmlString xgetDETERRENVIOArray(int i);
            
            /**
             * Returns number of "DETERRENVIO" element
             */
            int sizeOfDETERRENVIOArray();
            
            /**
             * Sets array of all "DETERRENVIO" element
             */
            void setDETERRENVIOArray(java.lang.String[] deterrenvioArray);
            
            /**
             * Sets ith "DETERRENVIO" element
             */
            void setDETERRENVIOArray(int i, java.lang.String deterrenvio);
            
            /**
             * Sets (as xml) array of all "DETERRENVIO" element
             */
            void xsetDETERRENVIOArray(org.apache.xmlbeans.XmlString[] deterrenvioArray);
            
            /**
             * Sets (as xml) ith "DETERRENVIO" element
             */
            void xsetDETERRENVIOArray(int i, org.apache.xmlbeans.XmlString deterrenvio);
            
            /**
             * Inserts the value as the ith "DETERRENVIO" element
             */
            void insertDETERRENVIO(int i, java.lang.String deterrenvio);
            
            /**
             * Appends the value as the last "DETERRENVIO" element
             */
            void addDETERRENVIO(java.lang.String deterrenvio);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "DETERRENVIO" element
             */
            org.apache.xmlbeans.XmlString insertNewDETERRENVIO(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "DETERRENVIO" element
             */
            org.apache.xmlbeans.XmlString addNewDETERRENVIO();
            
            /**
             * Removes the ith "DETERRENVIO" element
             */
            void removeDETERRENVIO(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO newInstance() {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.ERRORENVIO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML REVISIONENVIO(@).
         *
         * This is a complex type.
         */
        public interface REVISIONENVIO extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(REVISIONENVIO.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("revisionenvio44ddelemtype");
            
            /**
             * Gets array of all "REVISIONDTE" elements
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE[] getREVISIONDTEArray();
            
            /**
             * Gets ith "REVISIONDTE" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE getREVISIONDTEArray(int i);
            
            /**
             * Returns number of "REVISIONDTE" element
             */
            int sizeOfREVISIONDTEArray();
            
            /**
             * Sets array of all "REVISIONDTE" element
             */
            void setREVISIONDTEArray(noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE[] revisiondteArray);
            
            /**
             * Sets ith "REVISIONDTE" element
             */
            void setREVISIONDTEArray(int i, noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE revisiondte);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "REVISIONDTE" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE insertNewREVISIONDTE(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "REVISIONDTE" element
             */
            noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE addNewREVISIONDTE();
            
            /**
             * Removes the ith "REVISIONDTE" element
             */
            void removeREVISIONDTE(int i);
            
            /**
             * An XML REVISIONDTE(@).
             *
             * This is a complex type.
             */
            public interface REVISIONDTE extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(REVISIONDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("revisiondte3653elemtype");
                
                /**
                 * Gets the "FOLIO" element
                 */
                long getFOLIO();
                
                /**
                 * Gets (as xml) the "FOLIO" element
                 */
                noNamespace.EnteroType xgetFOLIO();
                
                /**
                 * Sets the "FOLIO" element
                 */
                void setFOLIO(long folio);
                
                /**
                 * Sets (as xml) the "FOLIO" element
                 */
                void xsetFOLIO(noNamespace.EnteroType folio);
                
                /**
                 * Gets the "TIPODTE" element
                 */
                java.math.BigInteger getTIPODTE();
                
                /**
                 * Gets (as xml) the "TIPODTE" element
                 */
                noNamespace.DTEType xgetTIPODTE();
                
                /**
                 * Sets the "TIPODTE" element
                 */
                void setTIPODTE(java.math.BigInteger tipodte);
                
                /**
                 * Sets (as xml) the "TIPODTE" element
                 */
                void xsetTIPODTE(noNamespace.DTEType tipodte);
                
                /**
                 * Gets the "ESTADO" element
                 */
                java.lang.String getESTADO();
                
                /**
                 * Gets (as xml) the "ESTADO" element
                 */
                org.apache.xmlbeans.XmlString xgetESTADO();
                
                /**
                 * Sets the "ESTADO" element
                 */
                void setESTADO(java.lang.String estado);
                
                /**
                 * Sets (as xml) the "ESTADO" element
                 */
                void xsetESTADO(org.apache.xmlbeans.XmlString estado);
                
                /**
                 * Gets array of all "DETALLE" elements
                 */
                java.lang.String[] getDETALLEArray();
                
                /**
                 * Gets ith "DETALLE" element
                 */
                java.lang.String getDETALLEArray(int i);
                
                /**
                 * Gets (as xml) array of all "DETALLE" elements
                 */
                org.apache.xmlbeans.XmlString[] xgetDETALLEArray();
                
                /**
                 * Gets (as xml) ith "DETALLE" element
                 */
                org.apache.xmlbeans.XmlString xgetDETALLEArray(int i);
                
                /**
                 * Returns number of "DETALLE" element
                 */
                int sizeOfDETALLEArray();
                
                /**
                 * Sets array of all "DETALLE" element
                 */
                void setDETALLEArray(java.lang.String[] detalleArray);
                
                /**
                 * Sets ith "DETALLE" element
                 */
                void setDETALLEArray(int i, java.lang.String detalle);
                
                /**
                 * Sets (as xml) array of all "DETALLE" element
                 */
                void xsetDETALLEArray(org.apache.xmlbeans.XmlString[] detalleArray);
                
                /**
                 * Sets (as xml) ith "DETALLE" element
                 */
                void xsetDETALLEArray(int i, org.apache.xmlbeans.XmlString detalle);
                
                /**
                 * Inserts the value as the ith "DETALLE" element
                 */
                void insertDETALLE(int i, java.lang.String detalle);
                
                /**
                 * Appends the value as the last "DETALLE" element
                 */
                void addDETALLE(java.lang.String detalle);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "DETALLE" element
                 */
                org.apache.xmlbeans.XmlString insertNewDETALLE(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "DETALLE" element
                 */
                org.apache.xmlbeans.XmlString addNewDETALLE();
                
                /**
                 * Removes the ith "DETALLE" element
                 */
                void removeDETALLE(int i);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE newInstance() {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO.REVISIONDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO newInstance() {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO.REVISIONENVIO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO newInstance() {
              return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static noNamespace.RESULTADOENVIODocument.RESULTADOENVIO newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (noNamespace.RESULTADOENVIODocument.RESULTADOENVIO) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static noNamespace.RESULTADOENVIODocument newInstance() {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static noNamespace.RESULTADOENVIODocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static noNamespace.RESULTADOENVIODocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static noNamespace.RESULTADOENVIODocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RESULTADOENVIODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static noNamespace.RESULTADOENVIODocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (noNamespace.RESULTADOENVIODocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
