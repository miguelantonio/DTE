/*
 * An XML document type.
 * Localname: RECEPCIONDTE
 * Namespace: http://www.sii.cl/SiiDte
 * Java type: cl.sii.siiDte.RECEPCIONDTEDocument
 *
 * Automatically generated - do not modify.
 */
package cl.sii.siiDte.impl;
/**
 * A document containing one RECEPCIONDTE(@http://www.sii.cl/SiiDte) element.
 *
 * This is a complex type.
 */
public class RECEPCIONDTEDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RECEPCIONDTEDocument
{
    private static final long serialVersionUID = 1L;
    
    public RECEPCIONDTEDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECEPCIONDTE$0 = 
        new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RECEPCIONDTE");
    
    
    /**
     * Gets the "RECEPCIONDTE" element
     */
    public cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE getRECEPCIONDTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE target = null;
            target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE)get_store().find_element_user(RECEPCIONDTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "RECEPCIONDTE" element
     */
    public void setRECEPCIONDTE(cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE recepciondte)
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE target = null;
            target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE)get_store().find_element_user(RECEPCIONDTE$0, 0);
            if (target == null)
            {
                target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE)get_store().add_element_user(RECEPCIONDTE$0);
            }
            target.set(recepciondte);
        }
    }
    
    /**
     * Appends and returns a new empty "RECEPCIONDTE" element
     */
    public cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE addNewRECEPCIONDTE()
    {
        synchronized (monitor())
        {
            check_orphaned();
            cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE target = null;
            target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE)get_store().add_element_user(RECEPCIONDTE$0);
            return target;
        }
    }
    /**
     * An XML RECEPCIONDTE(@http://www.sii.cl/SiiDte).
     *
     * This is a complex type.
     */
    public static class RECEPCIONDTEImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE
    {
        private static final long serialVersionUID = 1L;
        
        public RECEPCIONDTEImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RUTSENDER$0 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTSENDER");
        private static final javax.xml.namespace.QName RUTCOMPANY$2 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "RUTCOMPANY");
        private static final javax.xml.namespace.QName FILE$4 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "FILE");
        private static final javax.xml.namespace.QName TIMESTAMP$6 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TIMESTAMP");
        private static final javax.xml.namespace.QName STATUS$8 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "STATUS");
        private static final javax.xml.namespace.QName TRACKID$10 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "TRACKID");
        private static final javax.xml.namespace.QName DETAIL$12 = 
            new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "DETAIL");
        
        
        /**
         * Gets the "RUTSENDER" element
         */
        public java.lang.String getRUTSENDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTSENDER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RUTSENDER" element
         */
        public org.apache.xmlbeans.XmlString xgetRUTSENDER()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUTSENDER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RUTSENDER" element
         */
        public void setRUTSENDER(java.lang.String rutsender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTSENDER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTSENDER$0);
                }
                target.setStringValue(rutsender);
            }
        }
        
        /**
         * Sets (as xml) the "RUTSENDER" element
         */
        public void xsetRUTSENDER(org.apache.xmlbeans.XmlString rutsender)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUTSENDER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUTSENDER$0);
                }
                target.set(rutsender);
            }
        }
        
        /**
         * Gets the "RUTCOMPANY" element
         */
        public java.lang.String getRUTCOMPANY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTCOMPANY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RUTCOMPANY" element
         */
        public org.apache.xmlbeans.XmlString xgetRUTCOMPANY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUTCOMPANY$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "RUTCOMPANY" element
         */
        public void setRUTCOMPANY(java.lang.String rutcompany)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RUTCOMPANY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RUTCOMPANY$2);
                }
                target.setStringValue(rutcompany);
            }
        }
        
        /**
         * Sets (as xml) the "RUTCOMPANY" element
         */
        public void xsetRUTCOMPANY(org.apache.xmlbeans.XmlString rutcompany)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RUTCOMPANY$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RUTCOMPANY$2);
                }
                target.set(rutcompany);
            }
        }
        
        /**
         * Gets the "FILE" element
         */
        public java.lang.String getFILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "FILE" element
         */
        public org.apache.xmlbeans.XmlString xgetFILE()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "FILE" element
         */
        public void setFILE(java.lang.String file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FILE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FILE$4);
                }
                target.setStringValue(file);
            }
        }
        
        /**
         * Sets (as xml) the "FILE" element
         */
        public void xsetFILE(org.apache.xmlbeans.XmlString file)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FILE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FILE$4);
                }
                target.set(file);
            }
        }
        
        /**
         * Gets the "TIMESTAMP" element
         */
        public java.util.Calendar getTIMESTAMP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$6, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "TIMESTAMP" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetTIMESTAMP()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "TIMESTAMP" element
         */
        public void setTIMESTAMP(java.util.Calendar timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMESTAMP$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMESTAMP$6);
                }
                target.setCalendarValue(timestamp);
            }
        }
        
        /**
         * Sets (as xml) the "TIMESTAMP" element
         */
        public void xsetTIMESTAMP(org.apache.xmlbeans.XmlDateTime timestamp)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMESTAMP$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMESTAMP$6);
                }
                target.set(timestamp);
            }
        }
        
        /**
         * Gets the "STATUS" element
         */
        public int getSTATUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
                if (target == null)
                {
                    return 0;
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) the "STATUS" element
         */
        public org.apache.xmlbeans.XmlInt xgetSTATUS()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "STATUS" element
         */
        public void setSTATUS(int status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$8);
                }
                target.setIntValue(status);
            }
        }
        
        /**
         * Sets (as xml) the "STATUS" element
         */
        public void xsetSTATUS(org.apache.xmlbeans.XmlInt status)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(STATUS$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(STATUS$8);
                }
                target.set(status);
            }
        }
        
        /**
         * Gets array of all "TRACKID" elements
         */
        public int[] getTRACKIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRACKID$10, targetList);
                int[] result = new int[targetList.size()];
                for (int i = 0, len = targetList.size() ; i < len ; i++)
                    result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
                return result;
            }
        }
        
        /**
         * Gets ith "TRACKID" element
         */
        public int getTRACKIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target.getIntValue();
            }
        }
        
        /**
         * Gets (as xml) array of all "TRACKID" elements
         */
        public org.apache.xmlbeans.XmlInt[] xgetTRACKIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRACKID$10, targetList);
                org.apache.xmlbeans.XmlInt[] result = new org.apache.xmlbeans.XmlInt[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets (as xml) ith "TRACKID" element
         */
        public org.apache.xmlbeans.XmlInt xgetTRACKIDArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRACKID$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return (org.apache.xmlbeans.XmlInt)target;
            }
        }
        
        /**
         * Returns number of "TRACKID" element
         */
        public int sizeOfTRACKIDArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRACKID$10);
            }
        }
        
        /**
         * Sets array of all "TRACKID" element
         */
        public void setTRACKIDArray(int[] trackidArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(trackidArray, TRACKID$10);
            }
        }
        
        /**
         * Sets ith "TRACKID" element
         */
        public void setTRACKIDArray(int i, int trackid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRACKID$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.setIntValue(trackid);
            }
        }
        
        /**
         * Sets (as xml) array of all "TRACKID" element
         */
        public void xsetTRACKIDArray(org.apache.xmlbeans.XmlInt[]trackidArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(trackidArray, TRACKID$10);
            }
        }
        
        /**
         * Sets (as xml) ith "TRACKID" element
         */
        public void xsetTRACKIDArray(int i, org.apache.xmlbeans.XmlInt trackid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TRACKID$10, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(trackid);
            }
        }
        
        /**
         * Inserts the value as the ith "TRACKID" element
         */
        public void insertTRACKID(int i, int trackid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = 
                    (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(TRACKID$10, i);
                target.setIntValue(trackid);
            }
        }
        
        /**
         * Appends the value as the last "TRACKID" element
         */
        public void addTRACKID(int trackid)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRACKID$10);
                target.setIntValue(trackid);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TRACKID" element
         */
        public org.apache.xmlbeans.XmlInt insertNewTRACKID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().insert_element_user(TRACKID$10, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TRACKID" element
         */
        public org.apache.xmlbeans.XmlInt addNewTRACKID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlInt target = null;
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TRACKID$10);
                return target;
            }
        }
        
        /**
         * Removes the ith "TRACKID" element
         */
        public void removeTRACKID(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRACKID$10, i);
            }
        }
        
        /**
         * Gets array of all "DETAIL" elements
         */
        public cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL[] getDETAILArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(DETAIL$12, targetList);
                cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL[] result = new cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "DETAIL" element
         */
        public cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL getDETAILArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL target = null;
                target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL)get_store().find_element_user(DETAIL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "DETAIL" element
         */
        public int sizeOfDETAILArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DETAIL$12);
            }
        }
        
        /**
         * Sets array of all "DETAIL" element
         */
        public void setDETAILArray(cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL[] detailArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(detailArray, DETAIL$12);
            }
        }
        
        /**
         * Sets ith "DETAIL" element
         */
        public void setDETAILArray(int i, cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL detail)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL target = null;
                target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL)get_store().find_element_user(DETAIL$12, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(detail);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "DETAIL" element
         */
        public cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL insertNewDETAIL(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL target = null;
                target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL)get_store().insert_element_user(DETAIL$12, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "DETAIL" element
         */
        public cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL addNewDETAIL()
        {
            synchronized (monitor())
            {
                check_orphaned();
                cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL target = null;
                target = (cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL)get_store().add_element_user(DETAIL$12);
                return target;
            }
        }
        
        /**
         * Removes the ith "DETAIL" element
         */
        public void removeDETAIL(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DETAIL$12, i);
            }
        }
        /**
         * An XML DETAIL(@http://www.sii.cl/SiiDte).
         *
         * This is a complex type.
         */
        public static class DETAILImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements cl.sii.siiDte.RECEPCIONDTEDocument.RECEPCIONDTE.DETAIL
        {
            private static final long serialVersionUID = 1L;
            
            public DETAILImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ERROR$0 = 
                new javax.xml.namespace.QName("http://www.sii.cl/SiiDte", "ERROR");
            
            
            /**
             * Gets array of all "ERROR" elements
             */
            public java.lang.String[] getERRORArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ERROR$0, targetList);
                    java.lang.String[] result = new java.lang.String[targetList.size()];
                    for (int i = 0, len = targetList.size() ; i < len ; i++)
                        result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                    return result;
                }
            }
            
            /**
             * Gets ith "ERROR" element
             */
            public java.lang.String getERRORArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) array of all "ERROR" elements
             */
            public org.apache.xmlbeans.XmlString[] xgetERRORArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(ERROR$0, targetList);
                    org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets (as xml) ith "ERROR" element
             */
            public org.apache.xmlbeans.XmlString xgetERRORArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return (org.apache.xmlbeans.XmlString)target;
                }
            }
            
            /**
             * Returns number of "ERROR" element
             */
            public int sizeOfERRORArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ERROR$0);
                }
            }
            
            /**
             * Sets array of all "ERROR" element
             */
            public void setERRORArray(java.lang.String[] errorArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(errorArray, ERROR$0);
                }
            }
            
            /**
             * Sets ith "ERROR" element
             */
            public void setERRORArray(int i, java.lang.String error)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.setStringValue(error);
                }
            }
            
            /**
             * Sets (as xml) array of all "ERROR" element
             */
            public void xsetERRORArray(org.apache.xmlbeans.XmlString[]errorArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(errorArray, ERROR$0);
                }
            }
            
            /**
             * Sets (as xml) ith "ERROR" element
             */
            public void xsetERRORArray(int i, org.apache.xmlbeans.XmlString error)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERROR$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(error);
                }
            }
            
            /**
             * Inserts the value as the ith "ERROR" element
             */
            public void insertERROR(int i, java.lang.String error)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = 
                      (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ERROR$0, i);
                    target.setStringValue(error);
                }
            }
            
            /**
             * Appends the value as the last "ERROR" element
             */
            public void addERROR(java.lang.String error)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERROR$0);
                    target.setStringValue(error);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "ERROR" element
             */
            public org.apache.xmlbeans.XmlString insertNewERROR(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ERROR$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "ERROR" element
             */
            public org.apache.xmlbeans.XmlString addNewERROR()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERROR$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "ERROR" element
             */
            public void removeERROR(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ERROR$0, i);
                }
            }
        }
    }
}
