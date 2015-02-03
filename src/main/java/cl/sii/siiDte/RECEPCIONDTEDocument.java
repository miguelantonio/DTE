/*
 * An XML document type.
 * Localname: RECEPCIONDTE
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.RECEPCIONDTEDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte;


/**
 * A document containing one RECEPCIONDTE(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public interface RECEPCIONDTEDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RECEPCIONDTEDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recepciondte78f6doctype");
    
    /**
     * Gets the "RECEPCIONDTE" element
     */
    cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE getRECEPCIONDTE();
    
    /**
     * Sets the "RECEPCIONDTE" element
     */
    void setRECEPCIONDTE(cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE recepciondte);
    
    /**
     * Appends and returns a new empty "RECEPCIONDTE" element
     */
    cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE addNewRECEPCIONDTE();
    
    /**
     * An XML RECEPCIONDTE(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface RECEPCIONDTE extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RECEPCIONDTE.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("recepciondte91e7elemtype");
        
        /**
         * Gets the "RUTSENDER" element
         */
        java.lang.String getRUTSENDER();
        
        /**
         * Gets (as xml) the "RUTSENDER" element
         */
        org.apache.xmlbeans.XmlString xgetRUTSENDER();
        
        /**
         * Sets the "RUTSENDER" element
         */
        void setRUTSENDER(java.lang.String rutsender);
        
        /**
         * Sets (as xml) the "RUTSENDER" element
         */
        void xsetRUTSENDER(org.apache.xmlbeans.XmlString rutsender);
        
        /**
         * Gets the "RUTCOMPANY" element
         */
        java.lang.String getRUTCOMPANY();
        
        /**
         * Gets (as xml) the "RUTCOMPANY" element
         */
        org.apache.xmlbeans.XmlString xgetRUTCOMPANY();
        
        /**
         * Sets the "RUTCOMPANY" element
         */
        void setRUTCOMPANY(java.lang.String rutcompany);
        
        /**
         * Sets (as xml) the "RUTCOMPANY" element
         */
        void xsetRUTCOMPANY(org.apache.xmlbeans.XmlString rutcompany);
        
        /**
         * Gets the "FILE" element
         */
        java.lang.String getFILE();
        
        /**
         * Gets (as xml) the "FILE" element
         */
        org.apache.xmlbeans.XmlString xgetFILE();
        
        /**
         * Sets the "FILE" element
         */
        void setFILE(java.lang.String file);
        
        /**
         * Sets (as xml) the "FILE" element
         */
        void xsetFILE(org.apache.xmlbeans.XmlString file);
        
        /**
         * Gets the "TIMESTAMP" element
         */
        java.util.Calendar getTIMESTAMP();
        
        /**
         * Gets (as xml) the "TIMESTAMP" element
         */
        org.apache.xmlbeans.XmlDateTime xgetTIMESTAMP();
        
        /**
         * Sets the "TIMESTAMP" element
         */
        void setTIMESTAMP(java.util.Calendar timestamp);
        
        /**
         * Sets (as xml) the "TIMESTAMP" element
         */
        void xsetTIMESTAMP(org.apache.xmlbeans.XmlDateTime timestamp);
        
        /**
         * Gets the "STATUS" element
         */
        int getSTATUS();
        
        /**
         * Gets (as xml) the "STATUS" element
         */
        org.apache.xmlbeans.XmlInt xgetSTATUS();
        
        /**
         * Sets the "STATUS" element
         */
        void setSTATUS(int status);
        
        /**
         * Sets (as xml) the "STATUS" element
         */
        void xsetSTATUS(org.apache.xmlbeans.XmlInt status);
        
        /**
         * Gets array of all "TRACKID" elements
         */
        int[] getTRACKIDArray();
        
        /**
         * Gets ith "TRACKID" element
         */
        int getTRACKIDArray(int i);
        
        /**
         * Gets (as xml) array of all "TRACKID" elements
         */
        org.apache.xmlbeans.XmlInt[] xgetTRACKIDArray();
        
        /**
         * Gets (as xml) ith "TRACKID" element
         */
        org.apache.xmlbeans.XmlInt xgetTRACKIDArray(int i);
        
        /**
         * Returns number of "TRACKID" element
         */
        int sizeOfTRACKIDArray();
        
        /**
         * Sets array of all "TRACKID" element
         */
        void setTRACKIDArray(int[] trackidArray);
        
        /**
         * Sets ith "TRACKID" element
         */
        void setTRACKIDArray(int i, int trackid);
        
        /**
         * Sets (as xml) array of all "TRACKID" element
         */
        void xsetTRACKIDArray(org.apache.xmlbeans.XmlInt[] trackidArray);
        
        /**
         * Sets (as xml) ith "TRACKID" element
         */
        void xsetTRACKIDArray(int i, org.apache.xmlbeans.XmlInt trackid);
        
        /**
         * Inserts the value as the ith "TRACKID" element
         */
        void insertTRACKID(int i, int trackid);
        
        /**
         * Appends the value as the last "TRACKID" element
         */
        void addTRACKID(int trackid);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TRACKID" element
         */
        org.apache.xmlbeans.XmlInt insertNewTRACKID(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TRACKID" element
         */
        org.apache.xmlbeans.XmlInt addNewTRACKID();
        
        /**
         * Removes the ith "TRACKID" element
         */
        void removeTRACKID(int i);
        
        /**
         * Gets array of all "DETAIL" elements
         */
        cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL[] getDETAILArray();
        
        /**
         * Gets ith "DETAIL" element
         */
        cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL getDETAILArray(int i);
        
        /**
         * Returns number of "DETAIL" element
         */
        int sizeOfDETAILArray();
        
        /**
         * Sets array of all "DETAIL" element
         */
        void setDETAILArray(cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL[] detailArray);
        
        /**
         * Sets ith "DETAIL" element
         */
        void setDETAILArray(int i, cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL detail);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DETAIL" element
         */
        cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL insertNewDETAIL(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DETAIL" element
         */
        cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL addNewDETAIL();
        
        /**
         * Removes the ith "DETAIL" element
         */
        void removeDETAIL(int i);
        
        /**
         * An XML DETAIL(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface DETAIL extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DETAIL.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA26B1379B1D31AE435EE2913DE0FE235").resolveHandle("detailc85aelemtype");
            
            /**
             * Gets array of all "ERROR" elements
             */
            java.lang.String[] getERRORArray();
            
            /**
             * Gets ith "ERROR" element
             */
            java.lang.String getERRORArray(int i);
            
            /**
             * Gets (as xml) array of all "ERROR" elements
             */
            org.apache.xmlbeans.XmlString[] xgetERRORArray();
            
            /**
             * Gets (as xml) ith "ERROR" element
             */
            org.apache.xmlbeans.XmlString xgetERRORArray(int i);
            
            /**
             * Returns number of "ERROR" element
             */
            int sizeOfERRORArray();
            
            /**
             * Sets array of all "ERROR" element
             */
            void setERRORArray(java.lang.String[] errorArray);
            
            /**
             * Sets ith "ERROR" element
             */
            void setERRORArray(int i, java.lang.String error);
            
            /**
             * Sets (as xml) array of all "ERROR" element
             */
            void xsetERRORArray(org.apache.xmlbeans.XmlString[] errorArray);
            
            /**
             * Sets (as xml) ith "ERROR" element
             */
            void xsetERRORArray(int i, org.apache.xmlbeans.XmlString error);
            
            /**
             * Inserts the value as the ith "ERROR" element
             */
            void insertERROR(int i, java.lang.String error);
            
            /**
             * Appends the value as the last "ERROR" element
             */
            void addERROR(java.lang.String error);
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ERROR" element
             */
            org.apache.xmlbeans.XmlString insertNewERROR(int i);
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ERROR" element
             */
            org.apache.xmlbeans.XmlString addNewERROR();
            
            /**
             * Removes the ith "ERROR" element
             */
            void removeERROR(int i);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL newInstance() {
                  return (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE newInstance() {
              return (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.RECEPCIONDTEDocument newInstance() {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.RECEPCIONDTEDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.RECEPCIONDTEDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
