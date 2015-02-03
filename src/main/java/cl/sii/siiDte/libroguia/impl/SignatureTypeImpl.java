/*
 * XML Type:  SignatureType
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.libroguia.SignatureType
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.libroguia.impl;
/**
 * An XML SignatureType(@http://www.sii.cl/SiiDte).
 *
 * This is a complex type.
 */
public class SignatureTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType
{
    private static final long serialVersionUID = 1L;
    
    public SignatureTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIGNEDINFO$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SignedInfo");
    private static final javax.xml.namespace.QName SIGNATUREVALUE$2 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SignatureValue");
    private static final javax.xml.namespace.QName KEYINFO$4 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "KeyInfo");
    
    
    /**
     * Gets the "SignedInfo" element
     */
    public cl.sii.siiDte.libroguia.SignatureType.SignedInfo getSignedInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.SignatureType.SignedInfo target = null;
            target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo)get_store().find_element_user(SIGNEDINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "SignedInfo" element
     */
    public void setSignedInfo(cl.sii.siiDte.libroguia.SignatureType.SignedInfo signedInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.SignatureType.SignedInfo target = null;
            target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo)get_store().find_element_user(SIGNEDINFO$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo)get_store().add_element_user(SIGNEDINFO$0);
            }
            target.set(signedInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "SignedInfo" element
     */
    public cl.sii.siiDte.libroguia.SignatureType.SignedInfo addNewSignedInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.SignatureType.SignedInfo target = null;
            target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo)get_store().add_element_user(SIGNEDINFO$0);
            return target;
        }
    }
    
    /**
     * Gets the "SignatureValue" element
     */
    public byte[] getSignatureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREVALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "SignatureValue" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetSignatureValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SIGNATUREVALUE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SignatureValue" element
     */
    public void setSignatureValue(byte[] signatureValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIGNATUREVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIGNATUREVALUE$2);
            }
            target.setByteArrayValue(signatureValue);
        }
    }
    
    /**
     * Sets (as xml) the "SignatureValue" element
     */
    public void xsetSignatureValue(org.apache.xmlbeans.XmlBase64Binary signatureValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(SIGNATUREVALUE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(SIGNATUREVALUE$2);
            }
            target.set(signatureValue);
        }
    }
    
    /**
     * Gets the "KeyInfo" element
     */
    public cl.sii.siiDte.libroguia.SignatureType.KeyInfo getKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.SignatureType.KeyInfo target = null;
            target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo)get_store().find_element_user(KEYINFO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "KeyInfo" element
     */
    public void setKeyInfo(cl.sii.siiDte.libroguia.SignatureType.KeyInfo keyInfo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.SignatureType.KeyInfo target = null;
            target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo)get_store().find_element_user(KEYINFO$4, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo)get_store().add_element_user(KEYINFO$4);
            }
            target.set(keyInfo);
        }
    }
    
    /**
     * Appends and returns a new empty "KeyInfo" element
     */
    public cl.sii.siiDte.libroguia.SignatureType.KeyInfo addNewKeyInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.libroguia.SignatureType.KeyInfo target = null;
            target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo)get_store().add_element_user(KEYINFO$4);
            return target;
        }
    }
    /**
     * An XML SignedInfo(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class SignedInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo
    {
        private static final long serialVersionUID = 1L;
        
        public SignedInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CANONICALIZATIONMETHOD$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "CanonicalizationMethod");
        private static final javax.xml.namespace.QName SIGNATUREMETHOD$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "SignatureMethod");
        private static final javax.xml.namespace.QName REFERENCE$4 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Reference");
        
        
        /**
         * Gets the "CanonicalizationMethod" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod getCanonicalizationMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod)get_store().find_element_user(CANONICALIZATIONMETHOD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "CanonicalizationMethod" element
         */
        public void setCanonicalizationMethod(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod canonicalizationMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod)get_store().find_element_user(CANONICALIZATIONMETHOD$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod)get_store().add_element_user(CANONICALIZATIONMETHOD$0);
                }
                target.set(canonicalizationMethod);
            }
        }
        
        /**
         * Appends and returns a new empty "CanonicalizationMethod" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod addNewCanonicalizationMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod)get_store().add_element_user(CANONICALIZATIONMETHOD$0);
                return target;
            }
        }
        
        /**
         * Gets the "SignatureMethod" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod getSignatureMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod)get_store().find_element_user(SIGNATUREMETHOD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "SignatureMethod" element
         */
        public void setSignatureMethod(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod signatureMethod)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod)get_store().find_element_user(SIGNATUREMETHOD$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod)get_store().add_element_user(SIGNATUREMETHOD$2);
                }
                target.set(signatureMethod);
            }
        }
        
        /**
         * Appends and returns a new empty "SignatureMethod" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod addNewSignatureMethod()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod)get_store().add_element_user(SIGNATUREMETHOD$2);
                return target;
            }
        }
        
        /**
         * Gets the "Reference" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference getReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference)get_store().find_element_user(REFERENCE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "Reference" element
         */
        public void setReference(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference reference)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference)get_store().find_element_user(REFERENCE$4, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference)get_store().add_element_user(REFERENCE$4);
                }
                target.set(reference);
            }
        }
        
        /**
         * Appends and returns a new empty "Reference" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference addNewReference()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference)get_store().add_element_user(REFERENCE$4);
                return target;
            }
        }
        /**
         * An XML CanonicalizationMethod(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class CanonicalizationMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.CanonicalizationMethod
        {
            private static final long serialVersionUID = 1L;
            
            public CanonicalizationMethodImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ALGORITHM$0 = 
                new javax.xml.namespace.QName("", "Algorithm");
            
            
            /**
             * Gets the "Algorithm" attribute
             */
            public java.lang.String getAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALGORITHM$0);
                    }
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Algorithm" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(ALGORITHM$0);
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "Algorithm" attribute
             */
            public void setAlgorithm(java.lang.String algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.setStringValue(algorithm);
                }
            }
            
            /**
             * Sets (as xml) the "Algorithm" attribute
             */
            public void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.set(algorithm);
                }
            }
        }
        /**
         * An XML SignatureMethod(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class SignatureMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod
        {
            private static final long serialVersionUID = 1L;
            
            public SignatureMethodImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ALGORITHM$0 = 
                new javax.xml.namespace.QName("", "Algorithm");
            
            
            /**
             * Gets the "Algorithm" attribute
             */
            public java.lang.String getAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "Algorithm" attribute
             */
            public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm xgetAlgorithm()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm)get_store().find_attribute_user(ALGORITHM$0);
                    return target;
                }
            }
            
            /**
             * Sets the "Algorithm" attribute
             */
            public void setAlgorithm(java.lang.String algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.setStringValue(algorithm);
                }
            }
            
            /**
             * Sets (as xml) the "Algorithm" attribute
             */
            public void xsetAlgorithm(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm algorithm)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm)get_store().find_attribute_user(ALGORITHM$0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm)get_store().add_attribute_user(ALGORITHM$0);
                    }
                    target.set(algorithm);
                }
            }
            /**
             * An XML Algorithm(@).
             *
             * This is an atomic type that is a restriction of cl.sii.siiDte.libroguia.SignatureType$SignedInfo$SignatureMethod$Algorithm.
             */
            public static class AlgorithmImpl extends org.apache.xmlbeans.impl.values.JavaUriHolderEx implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.SignatureMethod.Algorithm
            {
                private static final long serialVersionUID = 1L;
                
                public AlgorithmImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected AlgorithmImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML Reference(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class ReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference
        {
            private static final long serialVersionUID = 1L;
            
            public ReferenceImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TRANSFORMS$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Transforms");
            private static final javax.xml.namespace.QName DIGESTMETHOD$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DigestMethod");
            private static final javax.xml.namespace.QName DIGESTVALUE$4 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DigestValue");
            private static final javax.xml.namespace.QName URI$6 = 
                new javax.xml.namespace.QName("", "URI");
            
            
            /**
             * Gets the "Transforms" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms getTransforms()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms)get_store().find_element_user(TRANSFORMS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "Transforms" element
             */
            public boolean isSetTransforms()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TRANSFORMS$0) != 0;
                }
            }
            
            /**
             * Sets the "Transforms" element
             */
            public void setTransforms(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms transforms)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms)get_store().find_element_user(TRANSFORMS$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms)get_store().add_element_user(TRANSFORMS$0);
                    }
                    target.set(transforms);
                }
            }
            
            /**
             * Appends and returns a new empty "Transforms" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms addNewTransforms()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms)get_store().add_element_user(TRANSFORMS$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "Transforms" element
             */
            public void unsetTransforms()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TRANSFORMS$0, 0);
                }
            }
            
            /**
             * Gets the "DigestMethod" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod getDigestMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod)get_store().find_element_user(DIGESTMETHOD$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "DigestMethod" element
             */
            public void setDigestMethod(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod digestMethod)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod)get_store().find_element_user(DIGESTMETHOD$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod)get_store().add_element_user(DIGESTMETHOD$2);
                    }
                    target.set(digestMethod);
                }
            }
            
            /**
             * Appends and returns a new empty "DigestMethod" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod addNewDigestMethod()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod)get_store().add_element_user(DIGESTMETHOD$2);
                    return target;
                }
            }
            
            /**
             * Gets the "DigestValue" element
             */
            public byte[] getDigestValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGESTVALUE$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "DigestValue" element
             */
            public org.apache.xmlbeans.XmlBase64Binary xgetDigestValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBase64Binary target = null;
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DIGESTVALUE$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "DigestValue" element
             */
            public void setDigestValue(byte[] digestValue)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGESTVALUE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIGESTVALUE$4);
                    }
                    target.setByteArrayValue(digestValue);
                }
            }
            
            /**
             * Sets (as xml) the "DigestValue" element
             */
            public void xsetDigestValue(org.apache.xmlbeans.XmlBase64Binary digestValue)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBase64Binary target = null;
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(DIGESTVALUE$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(DIGESTVALUE$4);
                    }
                    target.set(digestValue);
                }
            }
            
            /**
             * Gets the "URI" attribute
             */
            public java.lang.String getURI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$6);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "URI" attribute
             */
            public org.apache.xmlbeans.XmlAnyURI xgetURI()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$6);
                    return target;
                }
            }
            
            /**
             * Sets the "URI" attribute
             */
            public void setURI(java.lang.String uri)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(URI$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(URI$6);
                    }
                    target.setStringValue(uri);
                }
            }
            
            /**
             * Sets (as xml) the "URI" attribute
             */
            public void xsetURI(org.apache.xmlbeans.XmlAnyURI uri)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlAnyURI target = null;
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(URI$6);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(URI$6);
                    }
                    target.set(uri);
                }
            }
            /**
             * An XML Transforms(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class TransformsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms
            {
                private static final long serialVersionUID = 1L;
                
                public TransformsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName TRANSFORM$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Transform");
                
                
                /**
                 * Gets the "Transform" element
                 */
                public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform getTransform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform target = null;
                      target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform)get_store().find_element_user(TRANSFORM$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Transform" element
                 */
                public void setTransform(cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform transform)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform target = null;
                      target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform)get_store().find_element_user(TRANSFORM$0, 0);
                      if (target == null)
                      {
                        target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform)get_store().add_element_user(TRANSFORM$0);
                      }
                      target.set(transform);
                    }
                }
                
                /**
                 * Appends and returns a new empty "Transform" element
                 */
                public cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform addNewTransform()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform target = null;
                      target = (cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform)get_store().add_element_user(TRANSFORM$0);
                      return target;
                    }
                }
                /**
                 * An XML Transform(@http://www.sii.cl/SiiDte).
                 *
                 * This is a complex type.
                 */
                public static class TransformImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.Transforms.Transform
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TransformImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName ALGORITHM$0 = 
                      new javax.xml.namespace.QName("", "Algorithm");
                    
                    
                    /**
                     * Gets the "Algorithm" attribute
                     */
                    public java.lang.String getAlgorithm()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "Algorithm" attribute
                     */
                    public org.apache.xmlbeans.XmlAnyURI xgetAlgorithm()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlAnyURI target = null;
                        target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "Algorithm" attribute
                     */
                    public void setAlgorithm(java.lang.String algorithm)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
                        }
                        target.setStringValue(algorithm);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "Algorithm" attribute
                     */
                    public void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlAnyURI target = null;
                        target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ALGORITHM$0);
                        }
                        target.set(algorithm);
                      }
                    }
                }
            }
            /**
             * An XML DigestMethod(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class DigestMethodImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.SignedInfo.Reference.DigestMethod
            {
                private static final long serialVersionUID = 1L;
                
                public DigestMethodImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName ALGORITHM$0 = 
                    new javax.xml.namespace.QName("", "Algorithm");
                
                
                /**
                 * Gets the "Algorithm" attribute
                 */
                public java.lang.String getAlgorithm()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ALGORITHM$0);
                      }
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Algorithm" attribute
                 */
                public org.apache.xmlbeans.XmlAnyURI xgetAlgorithm()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlAnyURI target = null;
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(ALGORITHM$0);
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "Algorithm" attribute
                 */
                public void setAlgorithm(java.lang.String algorithm)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALGORITHM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALGORITHM$0);
                      }
                      target.setStringValue(algorithm);
                    }
                }
                
                /**
                 * Sets (as xml) the "Algorithm" attribute
                 */
                public void xsetAlgorithm(org.apache.xmlbeans.XmlAnyURI algorithm)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlAnyURI target = null;
                      target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(ALGORITHM$0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(ALGORITHM$0);
                      }
                      target.set(algorithm);
                    }
                }
            }
        }
    }
    /**
     * An XML KeyInfo(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class KeyInfoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.KeyInfo
    {
        private static final long serialVersionUID = 1L;
        
        public KeyInfoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEYVALUE$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "KeyValue");
        private static final javax.xml.namespace.QName X509DATA$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "X509Data");
        
        
        /**
         * Gets the "KeyValue" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue getKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue)get_store().find_element_user(KEYVALUE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "KeyValue" element
         */
        public void setKeyValue(cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue keyValue)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue)get_store().find_element_user(KEYVALUE$0, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue)get_store().add_element_user(KEYVALUE$0);
                }
                target.set(keyValue);
            }
        }
        
        /**
         * Appends and returns a new empty "KeyValue" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue addNewKeyValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue)get_store().add_element_user(KEYVALUE$0);
                return target;
            }
        }
        
        /**
         * Gets the "X509Data" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data getX509Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data)get_store().find_element_user(X509DATA$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "X509Data" element
         */
        public void setX509Data(cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data x509Data)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data)get_store().find_element_user(X509DATA$2, 0);
                if (target == null)
                {
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data)get_store().add_element_user(X509DATA$2);
                }
                target.set(x509Data);
            }
        }
        
        /**
         * Appends and returns a new empty "X509Data" element
         */
        public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data addNewX509Data()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data target = null;
                target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data)get_store().add_element_user(X509DATA$2);
                return target;
            }
        }
        /**
         * An XML KeyValue(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class KeyValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue
        {
            private static final long serialVersionUID = 1L;
            
            public KeyValueImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RSAKEYVALUE$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RSAKeyValue");
            private static final javax.xml.namespace.QName DSAKEYVALUE$2 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DSAKeyValue");
            
            
            /**
             * Gets the "RSAKeyValue" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue getRSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue)get_store().find_element_user(RSAKEYVALUE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "RSAKeyValue" element
             */
            public boolean isSetRSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RSAKEYVALUE$0) != 0;
                }
            }
            
            /**
             * Sets the "RSAKeyValue" element
             */
            public void setRSAKeyValue(cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue rsaKeyValue)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue)get_store().find_element_user(RSAKEYVALUE$0, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue)get_store().add_element_user(RSAKEYVALUE$0);
                    }
                    target.set(rsaKeyValue);
                }
            }
            
            /**
             * Appends and returns a new empty "RSAKeyValue" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue addNewRSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue)get_store().add_element_user(RSAKEYVALUE$0);
                    return target;
                }
            }
            
            /**
             * Unsets the "RSAKeyValue" element
             */
            public void unsetRSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RSAKEYVALUE$0, 0);
                }
            }
            
            /**
             * Gets the "DSAKeyValue" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue getDSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue)get_store().find_element_user(DSAKEYVALUE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "DSAKeyValue" element
             */
            public boolean isSetDSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DSAKEYVALUE$2) != 0;
                }
            }
            
            /**
             * Sets the "DSAKeyValue" element
             */
            public void setDSAKeyValue(cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue dsaKeyValue)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue)get_store().find_element_user(DSAKEYVALUE$2, 0);
                    if (target == null)
                    {
                      target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue)get_store().add_element_user(DSAKEYVALUE$2);
                    }
                    target.set(dsaKeyValue);
                }
            }
            
            /**
             * Appends and returns a new empty "DSAKeyValue" element
             */
            public cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue addNewDSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue target = null;
                    target = (cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue)get_store().add_element_user(DSAKEYVALUE$2);
                    return target;
                }
            }
            
            /**
             * Unsets the "DSAKeyValue" element
             */
            public void unsetDSAKeyValue()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DSAKEYVALUE$2, 0);
                }
            }
            /**
             * An XML RSAKeyValue(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class RSAKeyValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.RSAKeyValue
            {
                private static final long serialVersionUID = 1L;
                
                public RSAKeyValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName MODULUS$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Modulus");
                private static final javax.xml.namespace.QName EXPONENT$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Exponent");
                
                
                /**
                 * Gets the "Modulus" element
                 */
                public byte[] getModulus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODULUS$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Modulus" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetModulus()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(MODULUS$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Modulus" element
                 */
                public void setModulus(byte[] modulus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODULUS$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODULUS$0);
                      }
                      target.setByteArrayValue(modulus);
                    }
                }
                
                /**
                 * Sets (as xml) the "Modulus" element
                 */
                public void xsetModulus(org.apache.xmlbeans.XmlBase64Binary modulus)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(MODULUS$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(MODULUS$0);
                      }
                      target.set(modulus);
                    }
                }
                
                /**
                 * Gets the "Exponent" element
                 */
                public byte[] getExponent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPONENT$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Exponent" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetExponent()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(EXPONENT$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Exponent" element
                 */
                public void setExponent(byte[] exponent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXPONENT$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXPONENT$2);
                      }
                      target.setByteArrayValue(exponent);
                    }
                }
                
                /**
                 * Sets (as xml) the "Exponent" element
                 */
                public void xsetExponent(org.apache.xmlbeans.XmlBase64Binary exponent)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(EXPONENT$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(EXPONENT$2);
                      }
                      target.set(exponent);
                    }
                }
            }
            /**
             * An XML DSAKeyValue(@http://www.sii.cl/SiiDte).
             *
             * This is a complex type.
             */
            public static class DSAKeyValueImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.KeyInfo.KeyValue.DSAKeyValue
            {
                private static final long serialVersionUID = 1L;
                
                public DSAKeyValueImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName P$0 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "P");
                private static final javax.xml.namespace.QName Q$2 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Q");
                private static final javax.xml.namespace.QName G$4 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "G");
                private static final javax.xml.namespace.QName Y$6 = 
                    new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "Y");
                
                
                /**
                 * Gets the "P" element
                 */
                public byte[] getP()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(P$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "P" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetP()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(P$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "P" element
                 */
                public void setP(byte[] p)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(P$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(P$0);
                      }
                      target.setByteArrayValue(p);
                    }
                }
                
                /**
                 * Sets (as xml) the "P" element
                 */
                public void xsetP(org.apache.xmlbeans.XmlBase64Binary p)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(P$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(P$0);
                      }
                      target.set(p);
                    }
                }
                
                /**
                 * Gets the "Q" element
                 */
                public byte[] getQ()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Q$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Q" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetQ()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Q$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Q" element
                 */
                public void setQ(byte[] q)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Q$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Q$2);
                      }
                      target.setByteArrayValue(q);
                    }
                }
                
                /**
                 * Sets (as xml) the "Q" element
                 */
                public void xsetQ(org.apache.xmlbeans.XmlBase64Binary q)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Q$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(Q$2);
                      }
                      target.set(q);
                    }
                }
                
                /**
                 * Gets the "G" element
                 */
                public byte[] getG()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(G$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "G" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetG()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(G$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "G" element
                 */
                public void setG(byte[] g)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(G$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(G$4);
                      }
                      target.setByteArrayValue(g);
                    }
                }
                
                /**
                 * Sets (as xml) the "G" element
                 */
                public void xsetG(org.apache.xmlbeans.XmlBase64Binary g)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(G$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(G$4);
                      }
                      target.set(g);
                    }
                }
                
                /**
                 * Gets the "Y" element
                 */
                public byte[] getY()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getByteArrayValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "Y" element
                 */
                public org.apache.xmlbeans.XmlBase64Binary xgetY()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Y$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "Y" element
                 */
                public void setY(byte[] y)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(Y$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(Y$6);
                      }
                      target.setByteArrayValue(y);
                    }
                }
                
                /**
                 * Sets (as xml) the "Y" element
                 */
                public void xsetY(org.apache.xmlbeans.XmlBase64Binary y)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlBase64Binary target = null;
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(Y$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(Y$6);
                      }
                      target.set(y);
                    }
                }
            }
        }
        /**
         * An XML X509Data(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class X509DataImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.libroguia.SignatureType.KeyInfo.X509Data
        {
            private static final long serialVersionUID = 1L;
            
            public X509DataImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName X509CERTIFICATE$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "X509Certificate");
            
            
            /**
             * Gets the "X509Certificate" element
             */
            public byte[] getX509Certificate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X509CERTIFICATE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getByteArrayValue();
                }
            }
            
            /**
             * Gets (as xml) the "X509Certificate" element
             */
            public org.apache.xmlbeans.XmlBase64Binary xgetX509Certificate()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBase64Binary target = null;
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(X509CERTIFICATE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "X509Certificate" element
             */
            public void setX509Certificate(byte[] x509Certificate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(X509CERTIFICATE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(X509CERTIFICATE$0);
                    }
                    target.setByteArrayValue(x509Certificate);
                }
            }
            
            /**
             * Sets (as xml) the "X509Certificate" element
             */
            public void xsetX509Certificate(org.apache.xmlbeans.XmlBase64Binary x509Certificate)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBase64Binary target = null;
                    target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(X509CERTIFICATE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(X509CERTIFICATE$0);
                    }
                    target.set(x509Certificate);
                }
            }
        }
    }
}
