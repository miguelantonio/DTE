/*
 * XML Type:  SignatureType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroboletas.SignatureType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroboletas;


/**
 * An XML SignatureType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public interface SignatureType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignatureType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("signaturetype317btype");
    
    /**
     * Gets the "SignedInfo" element
     */
    cl.sii.siiDte.libroboletas.SignatureType.SignedInfo getSignedInfo();
    
    /**
     * Sets the "SignedInfo" element
     */
    void setSignedInfo(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo signedInfo);
    
    /**
     * Appends and returns a new empty "SignedInfo" element
     */
    cl.sii.siiDte.libroboletas.SignatureType.SignedInfo addNewSignedInfo();
    
    /**
     * Gets the "SignatureValue" element
     */
    byte[] getSignatureValue();
    
    /**
     * Gets (as xml) the "SignatureValue" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetSignatureValue();
    
    /**
     * Sets the "SignatureValue" element
     */
    void setSignatureValue(byte[] signatureValue);
    
    /**
     * Sets (as xml) the "SignatureValue" element
     */
    void xsetSignatureValue(org.apache.xmlbeans.XmlBase64Binary signatureValue);
    
    /**
     * Gets the "KeyInfo" element
     */
    cl.sii.siiDte.libroboletas.SignatureType.KeyInfo getKeyInfo();
    
    /**
     * Sets the "KeyInfo" element
     */
    void setKeyInfo(cl.sii.siiDte.libroboletas.SignatureType.KeyInfo keyInfo);
    
    /**
     * Appends and returns a new empty "KeyInfo" element
     */
    cl.sii.siiDte.libroboletas.SignatureType.KeyInfo addNewKeyInfo();
    
    /**
     * An XML SignedInfo(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface SignedInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignedInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("signedinfo4395elemtype");
        
        /**
         * Gets the "CanonicalizationMethod" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod getCanonicalizationMethod();
        
        /**
         * Sets the "CanonicalizationMethod" element
         */
        void setCanonicalizationMethod(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod canonicalizationMethod);
        
        /**
         * Appends and returns a new empty "CanonicalizationMethod" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod addNewCanonicalizationMethod();
        
        /**
         * Gets the "SignatureMethod" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod getSignatureMethod();
        
        /**
         * Sets the "SignatureMethod" element
         */
        void setSignatureMethod(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod signatureMethod);
        
        /**
         * Appends and returns a new empty "SignatureMethod" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod addNewSignatureMethod();
        
        /**
         * Gets the "Reference" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference getReference();
        
        /**
         * Sets the "Reference" element
         */
        void setReference(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference reference);
        
        /**
         * Appends and returns a new empty "Reference" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference addNewReference();
        
        /**
         * An XML CanonicalizationMethod(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface CanonicalizationMethod extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CanonicalizationMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("canonicalizationmethod4082elemtype");
            
            /**
             * Gets the "Algorithm" attribute
             */
            java.lang.String getAlgorithm();
            
            /**
             * Gets (as xml) the "Algorithm" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetAlgorithm();
            
            /**
             * Sets the "Algorithm" attribute
             */
            void setAlgorithm(java.lang.String algorithm);
            
            /**
             * Sets (as xml) the "Algorithm" attribute
             */
            void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod newInstance() {
                  return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.CanonicalizationMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML SignatureMethod(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface SignatureMethod extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SignatureMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("signaturemethod45daelemtype");
            
            /**
             * Gets the "Algorithm" attribute
             */
            java.lang.String getAlgorithm();
            
            /**
             * Gets (as xml) the "Algorithm" attribute
             */
            cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm xgetAlgorithm();
            
            /**
             * Sets the "Algorithm" attribute
             */
            void setAlgorithm(java.lang.String algorithm);
            
            /**
             * Sets (as xml) the "Algorithm" attribute
             */
            void xsetAlgorithm(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm algorithm);
            
            /**
             * An XML Algorithm(@).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.libroboletas.SignatureType$SignedInfo$SignatureMethod$Algorithm.
             */
            public interface Algorithm extends org.apache.xmlbeans.XmlAnyURI
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Algorithm.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("algorithm9291attrtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm newValue(java.lang.Object obj) {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm) type.newValue( obj ); }
                    
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm newInstance() {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod.Algorithm) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod newInstance() {
                  return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.SignatureMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML Reference(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface Reference extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Reference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("reference4decelemtype");
            
            /**
             * Gets the "Transforms" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms getTransforms();
            
            /**
             * True if has "Transforms" element
             */
            boolean isSetTransforms();
            
            /**
             * Sets the "Transforms" element
             */
            void setTransforms(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms transforms);
            
            /**
             * Appends and returns a new empty "Transforms" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms addNewTransforms();
            
            /**
             * Unsets the "Transforms" element
             */
            void unsetTransforms();
            
            /**
             * Gets the "DigestMethod" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod getDigestMethod();
            
            /**
             * Sets the "DigestMethod" element
             */
            void setDigestMethod(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod digestMethod);
            
            /**
             * Appends and returns a new empty "DigestMethod" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod addNewDigestMethod();
            
            /**
             * Gets the "DigestValue" element
             */
            byte[] getDigestValue();
            
            /**
             * Gets (as xml) the "DigestValue" element
             */
            org.apache.xmlbeans.XmlBase64Binary xgetDigestValue();
            
            /**
             * Sets the "DigestValue" element
             */
            void setDigestValue(byte[] digestValue);
            
            /**
             * Sets (as xml) the "DigestValue" element
             */
            void xsetDigestValue(org.apache.xmlbeans.XmlBase64Binary digestValue);
            
            /**
             * Gets the "URI" attribute
             */
            java.lang.String getURI();
            
            /**
             * Gets (as xml) the "URI" attribute
             */
            org.apache.xmlbeans.XmlAnyURI xgetURI();
            
            /**
             * Sets the "URI" attribute
             */
            void setURI(java.lang.String uri);
            
            /**
             * Sets (as xml) the "URI" attribute
             */
            void xsetURI(org.apache.xmlbeans.XmlAnyURI uri);
            
            /**
             * An XML Transforms(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface Transforms extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transforms.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("transforms7a6felemtype");
                
                /**
                 * Gets the "Transform" element
                 */
                cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform getTransform();
                
                /**
                 * Sets the "Transform" element
                 */
                void setTransform(cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform transform);
                
                /**
                 * Appends and returns a new empty "Transform" element
                 */
                cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform addNewTransform();
                
                /**
                 * An XML Transform(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public interface Transform extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Transform.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("transform65b7elemtype");
                    
                    /**
                     * Gets the "Algorithm" attribute
                     */
                    java.lang.String getAlgorithm();
                    
                    /**
                     * Gets (as xml) the "Algorithm" attribute
                     */
                    org.apache.xmlbeans.XmlAnyURI xgetAlgorithm();
                    
                    /**
                     * Sets the "Algorithm" attribute
                     */
                    void setAlgorithm(java.lang.String algorithm);
                    
                    /**
                     * Sets (as xml) the "Algorithm" attribute
                     */
                    void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm);
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform newInstance() {
                        return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms.Transform) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms newInstance() {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.Transforms) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML DigestMethod(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface DigestMethod extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DigestMethod.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("digestmethodda2delemtype");
                
                /**
                 * Gets the "Algorithm" attribute
                 */
                java.lang.String getAlgorithm();
                
                /**
                 * Gets (as xml) the "Algorithm" attribute
                 */
                org.apache.xmlbeans.XmlAnyURI xgetAlgorithm();
                
                /**
                 * Sets the "Algorithm" attribute
                 */
                void setAlgorithm(java.lang.String algorithm);
                
                /**
                 * Sets (as xml) the "Algorithm" attribute
                 */
                void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod newInstance() {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference.DigestMethod) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference newInstance() {
                  return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo.Reference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo newInstance() {
              return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.libroboletas.SignatureType.SignedInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.libroboletas.SignatureType.SignedInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML KeyInfo(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public interface KeyInfo extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyInfo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("keyinfod9a2elemtype");
        
        /**
         * Gets the "KeyValue" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue getKeyValue();
        
        /**
         * Sets the "KeyValue" element
         */
        void setKeyValue(cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue keyValue);
        
        /**
         * Appends and returns a new empty "KeyValue" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue addNewKeyValue();
        
        /**
         * Gets the "X509Data" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data getX509Data();
        
        /**
         * Sets the "X509Data" element
         */
        void setX509Data(cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data x509Data);
        
        /**
         * Appends and returns a new empty "X509Data" element
         */
        cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data addNewX509Data();
        
        /**
         * An XML KeyValue(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface KeyValue extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(KeyValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("keyvalueefd4elemtype");
            
            /**
             * Gets the "RSAKeyValue" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue getRSAKeyValue();
            
            /**
             * True if has "RSAKeyValue" element
             */
            boolean isSetRSAKeyValue();
            
            /**
             * Sets the "RSAKeyValue" element
             */
            void setRSAKeyValue(cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue rsaKeyValue);
            
            /**
             * Appends and returns a new empty "RSAKeyValue" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue addNewRSAKeyValue();
            
            /**
             * Unsets the "RSAKeyValue" element
             */
            void unsetRSAKeyValue();
            
            /**
             * Gets the "DSAKeyValue" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue getDSAKeyValue();
            
            /**
             * True if has "DSAKeyValue" element
             */
            boolean isSetDSAKeyValue();
            
            /**
             * Sets the "DSAKeyValue" element
             */
            void setDSAKeyValue(cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue dsaKeyValue);
            
            /**
             * Appends and returns a new empty "DSAKeyValue" element
             */
            cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue addNewDSAKeyValue();
            
            /**
             * Unsets the "DSAKeyValue" element
             */
            void unsetDSAKeyValue();
            
            /**
             * An XML RSAKeyValue(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface RSAKeyValue extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RSAKeyValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("rsakeyvaluef852elemtype");
                
                /**
                 * Gets the "Modulus" element
                 */
                byte[] getModulus();
                
                /**
                 * Gets (as xml) the "Modulus" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetModulus();
                
                /**
                 * Sets the "Modulus" element
                 */
                void setModulus(byte[] modulus);
                
                /**
                 * Sets (as xml) the "Modulus" element
                 */
                void xsetModulus(org.apache.xmlbeans.XmlBase64Binary modulus);
                
                /**
                 * Gets the "Exponent" element
                 */
                byte[] getExponent();
                
                /**
                 * Gets (as xml) the "Exponent" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetExponent();
                
                /**
                 * Sets the "Exponent" element
                 */
                void setExponent(byte[] exponent);
                
                /**
                 * Sets (as xml) the "Exponent" element
                 */
                void xsetExponent(org.apache.xmlbeans.XmlBase64Binary exponent);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue newInstance() {
                      return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.RSAKeyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML DSAKeyValue(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public interface DSAKeyValue extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DSAKeyValue.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("dsakeyvalue5644elemtype");
                
                /**
                 * Gets the "P" element
                 */
                byte[] getP();
                
                /**
                 * Gets (as xml) the "P" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetP();
                
                /**
                 * Sets the "P" element
                 */
                void setP(byte[] p);
                
                /**
                 * Sets (as xml) the "P" element
                 */
                void xsetP(org.apache.xmlbeans.XmlBase64Binary p);
                
                /**
                 * Gets the "Q" element
                 */
                byte[] getQ();
                
                /**
                 * Gets (as xml) the "Q" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetQ();
                
                /**
                 * Sets the "Q" element
                 */
                void setQ(byte[] q);
                
                /**
                 * Sets (as xml) the "Q" element
                 */
                void xsetQ(org.apache.xmlbeans.XmlBase64Binary q);
                
                /**
                 * Gets the "G" element
                 */
                byte[] getG();
                
                /**
                 * Gets (as xml) the "G" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetG();
                
                /**
                 * Sets the "G" element
                 */
                void setG(byte[] g);
                
                /**
                 * Sets (as xml) the "G" element
                 */
                void xsetG(org.apache.xmlbeans.XmlBase64Binary g);
                
                /**
                 * Gets the "Y" element
                 */
                byte[] getY();
                
                /**
                 * Gets (as xml) the "Y" element
                 */
                org.apache.xmlbeans.XmlBase64Binary xgetY();
                
                /**
                 * Sets the "Y" element
                 */
                void setY(byte[] y);
                
                /**
                 * Sets (as xml) the "Y" element
                 */
                void xsetY(org.apache.xmlbeans.XmlBase64Binary y);
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue newInstance() {
                      return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue.DSAKeyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue newInstance() {
                  return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.KeyValue) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML X509Data(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public interface X509Data extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(X509Data.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD324823B319BC1C7B63A5B8E6A610D95").resolveHandle("x509datad716elemtype");
            
            /**
             * Gets the "X509Certificate" element
             */
            byte[] getX509Certificate();
            
            /**
             * Gets (as xml) the "X509Certificate" element
             */
            org.apache.xmlbeans.XmlBase64Binary xgetX509Certificate();
            
            /**
             * Sets the "X509Certificate" element
             */
            void setX509Certificate(byte[] x509Certificate);
            
            /**
             * Sets (as xml) the "X509Certificate" element
             */
            void xsetX509Certificate(org.apache.xmlbeans.XmlBase64Binary x509Certificate);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data newInstance() {
                  return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo.X509Data) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo newInstance() {
              return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static cl.sii.siiDte.libroboletas.SignatureType.KeyInfo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (cl.sii.siiDte.libroboletas.SignatureType.KeyInfo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static cl.sii.siiDte.libroboletas.SignatureType newInstance() {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static cl.sii.siiDte.libroboletas.SignatureType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroboletas.SignatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static cl.sii.siiDte.libroboletas.SignatureType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (cl.sii.siiDte.libroboletas.SignatureType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
