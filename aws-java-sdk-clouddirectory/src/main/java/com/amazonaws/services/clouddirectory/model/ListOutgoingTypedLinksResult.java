/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.clouddirectory.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/clouddirectory-2016-05-10/ListOutgoingTypedLinks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListOutgoingTypedLinksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a typed link specifier as output.
     * </p>
     */
    private java.util.List<TypedLinkSpecifier> typedLinkSpecifiers;
    /**
     * <p>
     * The pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Returns a typed link specifier as output.
     * </p>
     * 
     * @return Returns a typed link specifier as output.
     */

    public java.util.List<TypedLinkSpecifier> getTypedLinkSpecifiers() {
        return typedLinkSpecifiers;
    }

    /**
     * <p>
     * Returns a typed link specifier as output.
     * </p>
     * 
     * @param typedLinkSpecifiers
     *        Returns a typed link specifier as output.
     */

    public void setTypedLinkSpecifiers(java.util.Collection<TypedLinkSpecifier> typedLinkSpecifiers) {
        if (typedLinkSpecifiers == null) {
            this.typedLinkSpecifiers = null;
            return;
        }

        this.typedLinkSpecifiers = new java.util.ArrayList<TypedLinkSpecifier>(typedLinkSpecifiers);
    }

    /**
     * <p>
     * Returns a typed link specifier as output.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTypedLinkSpecifiers(java.util.Collection)} or {@link #withTypedLinkSpecifiers(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param typedLinkSpecifiers
     *        Returns a typed link specifier as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksResult withTypedLinkSpecifiers(TypedLinkSpecifier... typedLinkSpecifiers) {
        if (this.typedLinkSpecifiers == null) {
            setTypedLinkSpecifiers(new java.util.ArrayList<TypedLinkSpecifier>(typedLinkSpecifiers.length));
        }
        for (TypedLinkSpecifier ele : typedLinkSpecifiers) {
            this.typedLinkSpecifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns a typed link specifier as output.
     * </p>
     * 
     * @param typedLinkSpecifiers
     *        Returns a typed link specifier as output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksResult withTypedLinkSpecifiers(java.util.Collection<TypedLinkSpecifier> typedLinkSpecifiers) {
        setTypedLinkSpecifiers(typedLinkSpecifiers);
        return this;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @return The pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token.
     * </p>
     * 
     * @param nextToken
     *        The pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListOutgoingTypedLinksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTypedLinkSpecifiers() != null)
            sb.append("TypedLinkSpecifiers: ").append(getTypedLinkSpecifiers()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOutgoingTypedLinksResult == false)
            return false;
        ListOutgoingTypedLinksResult other = (ListOutgoingTypedLinksResult) obj;
        if (other.getTypedLinkSpecifiers() == null ^ this.getTypedLinkSpecifiers() == null)
            return false;
        if (other.getTypedLinkSpecifiers() != null && other.getTypedLinkSpecifiers().equals(this.getTypedLinkSpecifiers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypedLinkSpecifiers() == null) ? 0 : getTypedLinkSpecifiers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListOutgoingTypedLinksResult clone() {
        try {
            return (ListOutgoingTypedLinksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
